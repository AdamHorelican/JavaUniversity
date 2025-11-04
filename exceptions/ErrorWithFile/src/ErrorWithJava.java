import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorWithJava
{
  public void openFile(String filename)
  {
    File file = new File(filename + ".txt");
    try (Scanner scanner = new Scanner(file);)
    {

    }
    catch (FileNotFoundException e){
      System.out.println("Could not find file: " + file.getAbsolutePath());
    }
  }
}
