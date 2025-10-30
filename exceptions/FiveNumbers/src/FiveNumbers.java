import java.util.InputMismatchException;
import java.util.Scanner;

public class FiveNumbers
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    int[] array = new int[5];
    int i = 0;

    while (i<array.length){
      System.out.println("Type an integer on " + (i+1) + " place, in range 10-99");
      try{
        int number = keyboard.nextInt();

        if (number >= 10 && number <= 100){
          array[i] = number;
          i++;
        }
        else{
          System.out.println("the number is not in the range!");
        }
      }
      catch (InputMismatchException e){
        System.out.println("Input provided is not integer!");
        keyboard.next();
      }
    }
    System.out.println("Your list");
    for (int j = 0; j < array.length; j++)
    {
      System.out.println(array[j]);
    }

  }
}
