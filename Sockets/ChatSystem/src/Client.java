
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    try
    {
      System.out.println("Enter your name: ");
      String name = scanner.nextLine();


      Socket socket = new Socket("localhost", 2910);
      ClientConnection clientConnection = new ClientConnection(socket);
      new Thread(clientConnection).start();

      while(true)
      {
        System.out.println("Enter a message: ");
        String messageContent = scanner.nextLine();
        Message message = new Message(name, messageContent);
        clientConnection.send(message);
      }
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
  }
}