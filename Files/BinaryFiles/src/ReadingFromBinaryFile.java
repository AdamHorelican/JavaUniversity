import java.io.*;

public class ReadingFromBinaryFile
{
  public static void main(String[] args)
  {
    File file = new File("Outputs/test.bin");

    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
      int n = in.readInt();
      for (int i = 0; i < n; i++)
      {
        System.out.println(in.readUTF());
      }
    }
    catch (IOException e){
      e.printStackTrace();
    }
  }
}
