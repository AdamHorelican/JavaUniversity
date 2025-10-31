import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MathOperation
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int input = 0;

    while (true){
      try{
        System.out.println("Write an integer: ");
        input = keyboard.nextInt();

        break;
      }
      catch (InputMismatchException e){
        System.out.println("Integer is required!");
        keyboard.nextLine();
      }
    }


    int[] arrayOfNumbers = new int[input];
    int number = 0;


    for (int i = 0; i < input; i++)
    {
      System.out.println("Write number at " + i + " position");
      while (true){
        try {
          arrayOfNumbers[i] = keyboard.nextInt();
          keyboard.nextLine();
          break;
        }
        catch(InputMismatchException e){
          System.out.println("Write only integer!");
          keyboard.nextLine();
        }
      }

    }
    System.out.println("Choose 2 numbers from this list: ");
    for (int i = 0; i < arrayOfNumbers.length; i++)
    {
      System.out.print(arrayOfNumbers[i] + " ");
    }

    int numberOne = 0;
    int numberTwo = 0;


    while (true) {
      try {
        int temp = keyboard.nextInt();
        boolean found = false;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
          if (arrayOfNumbers[i] == temp) {
            numberOne = arrayOfNumbers[i];
            found = true;
            break;
          }
        }

        if (!found) {
          throw new Exception("Not in the list!");
        }

        break; // úspech -> skonči while
      } catch (Exception e) {
        System.out.println("Number not in the list!");
        keyboard.nextLine();
      }
    }






    while (true)
    {
      try
      {
        numberTwo = keyboard.nextInt();
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
          if (numberTwo == arrayOfNumbers[i])
          {
            break;
          }
        }

      }
      catch (Exception e)
      {
        System.out.println("Number not in the list!");
        keyboard.nextLine();
      }
    }

  }
}
