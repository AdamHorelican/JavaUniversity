import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    PersonDatabase realDatabase = new PersonDatabase();
    PersonCollection collection = new CachedPersonCollection(realDatabase);

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("\nEnter name to search (or 'quit' to exit): ");
      String input = scanner.nextLine();

      if (input.equalsIgnoreCase("quit")) break;

      long startTime = System.currentTimeMillis();
      Person result = collection.getPersonWithName(input);
      long elapsed = System.currentTimeMillis() - startTime;

      if (result != null) {
        System.out.println("Result: " + result);
      } else {
        System.out.println("No person found with name: " + input);
      }
      System.out.println("Search took: " + elapsed + "ms");
    }

    scanner.close();
  }
}
