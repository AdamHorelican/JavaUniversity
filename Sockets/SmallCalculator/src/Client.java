import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int number1;
    String operation;
    int number2;

    try {
      Socket socket = new Socket("localhost", 2556);

      ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
      outToServer.flush();
      ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());

      while (true){

        System.out.println(inFromServer.readObject());
        number1 = keyboard.nextInt();
        keyboard.nextLine();

        outToServer.writeObject(number1);

        System.out.println(inFromServer.readObject());
        operation = keyboard.nextLine();
        outToServer.writeObject(operation);

        System.out.println(inFromServer.readObject());
        number2 = keyboard.nextInt();
        outToServer.writeObject(number2);

        System.out.println(inFromServer.readObject());
      }
    }
    catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
}
