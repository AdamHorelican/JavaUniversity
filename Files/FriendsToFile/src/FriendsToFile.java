import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FriendsToFile
{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Type filename: ");
    String filename = keyboard.nextLine().trim();

    if (filename.isEmpty()) {
      System.out.println("No filename provided. Exiting.");
      return;
    }

    File file = new File(filename);
    if (file.getParentFile() == null) {
      file = new File("outputs", filename); // -> outputs/filename
    }

    try (PrintWriter out = new PrintWriter(file);){

      while (true){

          System.out.println("Type yours friend name: ");
          String name = keyboard.nextLine();
          if (name.equals("QUIT")){
            break;
          }
          out.println(name);
          out.flush();

      }
      out.close();
    }
    catch (FileNotFoundException e){
      System.out.println("Could not open file" + e.getMessage());
      return;
    }

    System.out.println("Your file: " + file.getAbsoluteFile());



  }
}
