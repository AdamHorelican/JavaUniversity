import java.util.InputMismatchException;
import java.util.Scanner;

public class MathOperation
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int count = 0;

    while (true){
      System.out.println("Write how many numbers do you want to add: ");
      try {
        count = keyboard.nextInt();
        keyboard.nextLine();
        if (count>=2){
          break;
        }
        System.out.println("At least 2 numbers!");
      }
      catch (Exception e){
        System.out.println("Integer required!");
        keyboard.nextLine();
      }
    }


    int[] nums = new int[count];

    for (int i = 0; i < count; i++)
    {
      while (true){
        try {
          System.out.println("Add number on " + i + " index:");
          nums[i] = keyboard.nextInt();
          keyboard.nextLine();
          break;
        }
        catch (InputMismatchException e){
          System.out.println("Integer required!");
          keyboard.nextLine();
        }
      }
    }
    for (int n : nums){
      System.out.println(n + "");
    }


    int numberOne = 0;
    while (true){
      System.out.println("Pick your number from list!");
      try{
        numberOne = keyboard.nextInt();
        keyboard.nextLine();

        boolean exist = false;

        for (int n : nums){
          if (numberOne == n){
            exist = true;
            break;
          }
        }
        if (exist){
          break;
        }
        System.out.println("Not in the list!");
      }
      catch (InputMismatchException e){
        System.out.println("Only integer required!");
        keyboard.nextLine();
      }
    }

    int numberTwo= 0;
    while (true){
      System.out.println("Pick your number from list!");
      try{
        numberTwo = keyboard.nextInt();
        keyboard.nextLine();

        boolean exist = false;

        for (int n : nums){
          if (numberTwo == n){
            exist = true;
            break;
          }
        }
        if (exist){
          break;
        }
        System.out.println("Not in the list!");
      }
      catch (InputMismatchException e){
        System.out.println("Only integer required!");
        keyboard.nextLine();
      }
    }

    String mathOperation = "";
    while (true){
      System.out.println("Which mathematical operation do you want to perform on those 2 numbers? (add, subtract, divide, multiply)");
      mathOperation = keyboard.nextLine();

      try{
        switch (mathOperation.toLowerCase().trim()){
          case "add" -> System.out.println(numberOne+numberTwo);
          case "subtract" -> System.out.println(numberOne-numberTwo);
          case "divide" -> System.out.println(numberOne/numberTwo);
          case "multiply" -> System.out.println(numberOne*numberTwo);
          default -> {
            System.out.println("Inavalid input!");
            continue;
          }
        }
        break;
      }

      catch (ArithmeticException e){
        System.out.println("You cant divide by 0!");

      }
    }

  }
}
