import java.util.InputMismatchException;
import java.util.Scanner;


public class GradeListTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    GradeList gradeList = new GradeList();

    while (gradeList.getSize() < 4)
    {
      System.out.println("Write courseName: ");
      String courseName = keyboard.nextLine();
      boolean greenCard = false;

        while (!greenCard){
          try {
            System.out.println("Write a grade for " + courseName);
            int grade = keyboard.nextInt();
            keyboard.nextLine();
            Grade gradeToAdd = new Grade(courseName, grade);
            greenCard = true;
            gradeList.addGrade(gradeToAdd);
          }
          catch (IllegalArgumentException e){
            System.out.println("Invalid grade!");
          }
          catch (InputMismatchException e){
            System.out.println("Grade has to be a number!");
            keyboard.nextLine();
          }
        }
    }
  }
}
