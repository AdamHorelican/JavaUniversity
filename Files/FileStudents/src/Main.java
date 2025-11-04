import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {

    String filename = "students.txt";
    File file = new File(filename);

    if (file.getParentFile() == null){
      file = new File("outputs", filename);
    }


    StudentList studentList = new StudentList();
    try (Scanner in = new Scanner(file)){
      while (in.hasNextLine()){
        String line = in.nextLine();
        String[] array = line.split(",");

        int group = Integer.parseInt(array[0]);
        int study = Integer.parseInt(array[1]);
        String name = array[2];
        String nat = array[3];
        int day   = Integer.parseInt(array[4]);
        int month = Integer.parseInt(array[5]);
        int year  = Integer.parseInt(array[6]);
        if (year<100){
          year += 1900;
        }

        Student s = new Student(name, study, nat, group, new MyDate(day, month, year));
        studentList.add(s);
      }
      System.out.println(studentList);


    }
    catch (FileNotFoundException e){
      System.out.println("File not found " + e.getMessage());
    }
  }
}
