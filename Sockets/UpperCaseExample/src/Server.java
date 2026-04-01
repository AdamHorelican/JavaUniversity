import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
  public static void main(String[] args)
  {
    System.out.println("Starting server...");
    try
    {
      ServerSocket welcomeSocket = new ServerSocket(2910);
      while (true)
      {
        Socket socket = welcomeSocket.accept();
        System.out.println("Client connected");

        ObjectOutputStream outToClient = new ObjectOutputStream(socket.getOutputStream());
        outToClient.flush();
        ObjectInputStream inFromClient = new ObjectInputStream(socket.getInputStream());


        while (true){
          outToClient.writeObject("LowerCase or UpperCase?");

          String answerFromClient = (String) inFromClient.readObject();

          if (answerFromClient.equals("STOP")){
            socket.close();
            break;
          }
          if ("uppercase".equals(answerFromClient)){
            String o = (String) inFromClient.readObject();
            outToClient.writeObject(o.toUpperCase());
          }

          if ("lowercase".equals(answerFromClient)){
            String o = (String) inFromClient.readObject();
            outToClient.writeObject(o.toLowerCase());
          }
        }
      }
    }
    catch (IOException | ClassNotFoundException e)
    {
      throw new RuntimeException(e);
    }
  }
}