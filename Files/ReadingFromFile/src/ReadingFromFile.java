import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile
{
  public static void main(String[] args)
  {

    String filename = "test.txt";
    File file = new File(filename);

    if (file.getParentFile() == null) {
      file = new File("outputs", filename);
    }

    try (Scanner in = new Scanner(file, "UTF-8");){
      while (in.hasNextLine()){
        System.out.println(in.nextLine());
      }
    }
    catch (FileNotFoundException e){
      System.out.println("File not found " + e.getMessage());
    }

    System.out.println("Path "+file.getAbsoluteFile());

  }
}
