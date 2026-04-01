import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
  public static void main(String[] args)
  {
    System.out.println("Server Starting...");
    try {
      ServerSocket serverSocket = new ServerSocket(2556);

      while (true){
        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        ObjectOutputStream outToClient = new ObjectOutputStream(socket.getOutputStream());
        outToClient.flush();
        ObjectInputStream inFromClient = new ObjectInputStream(socket.getInputStream());

        while (true){

          outToClient.writeObject("Write your first number of equation (-1 to Stop): ");
          int firstNumber = (int) inFromClient.readObject();

          if (firstNumber==-1){
            socket.close();
            break;
          }

          outToClient.writeObject("Write operation you want: ");
          String operation = (String) inFromClient.readObject();

          outToClient.writeObject("Write your second number of equation: ");
          int secondNumber = (int) inFromClient.readObject();

          int answer = switch (operation){
            case "-" -> firstNumber - secondNumber;
            case "+" -> firstNumber + secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> 0;
          };
          System.out.println("The answer is: ");
          outToClient.writeObject(answer);
        }
      }
    }
    catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
}
