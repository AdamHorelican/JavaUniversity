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
    String text = null;
    String text2 = null;

    try
    {
      Socket socket = new Socket("localhost", 2910);

      ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
      outToServer.flush();
      ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());

      while (true){

        System.out.println(inFromServer.readObject());
        text = keyboard.nextLine();

        if (text.equals("EXIT")){
          outToServer.writeObject("STOP");
          break;
        }

        outToServer.writeObject(text);

        System.out.println("Now write the text: ");
        text2 = keyboard.nextLine();
        outToServer.writeObject(text2);

        String o = (String) inFromServer.readObject();
        System.out.println(o);
      }
    }
    catch (IOException | ClassNotFoundException e)
    {
      throw new RuntimeException(e);
    }
  }
}