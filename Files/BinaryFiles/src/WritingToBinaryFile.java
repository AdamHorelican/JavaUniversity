import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class WritingToBinaryFile {
  public static void main(String[] args) {
    File file = new File("Outputs/test.bin");

    String[] text = {"Michael; 35; 95", "Adam; 19; 85", "David; 21; 78"};

    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
      out.writeInt(text.length);
      for (String s : text) {
        out.writeUTF(s);
      }
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
