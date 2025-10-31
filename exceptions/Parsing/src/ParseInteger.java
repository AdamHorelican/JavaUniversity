import java.util.Scanner;

public class ParseInteger
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    int sum = 0;
    int count = 0;
    String s = "";
    while (true) {
      System.out.println("Write integer: ");

      try{
        s = keyboard.nextLine().trim();
        int n = Integer.parseInt(s);
        sum += n;
        count++;
      }
      catch (NumberFormatException e){
        if (s.equalsIgnoreCase("end")) break;
        System.out.println("Write an integer!");
      }
    }
    System.out.println("The sum is " + sum + " and the count is "+count);
  }
}
