import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    File file = new File("outputs/students.txt");
    StudentList studentList = new StudentList();

    try (Scanner in = new Scanner(file, "UTF-8");){
      while (in.hasNextLine()) {
        String line = in.nextLine().trim();
        if (line.isEmpty()) continue;
        String[] a = line.split("\\s*,\\s*");
        if (a.length < 7) continue;

        int group = Integer.parseInt(a[0]);
        int study = Integer.parseInt(a[1]);
        String name = a[2];
        String nat  = a[3];
        int day     = Integer.parseInt(a[4]);
        int month   = Integer.parseInt(a[5]);
        int year    = Integer.parseInt(a[6]);
        if (year < 100) year += 1900;

        Student s = new Student(name, study, nat, group, new MyDate(day, month, year));
        studentList.add(s);
      }
      System.out.println(studentList);
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + file.getAbsolutePath());
    }
  }
}
