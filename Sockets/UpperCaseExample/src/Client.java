import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
  public static void main(String[] args)
  {

    Scanner keyboard = new Scanner(System.in);

    try
    {
      Socket socket = new Socket("localhost", 2910);
      System.out.println("write message that wants to be capitalized.");
      String text = keyboard.nextLine();
      ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
      outToServer.writeObject(text);

      ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());
      String o = (String) inFromServer.readObject();

      System.out.println(o);
    }
    catch (IOException | ClassNotFoundException e)
    {
      throw new RuntimeException(e);
    }
  }
}