public class Main
{
  public static void main(String[] args) throws InterruptedException
  {
    TrafficLight light = new TrafficLight();

    System.out.println("Start: " + light.getColour()); // RED

    light.next();
    System.out.println("After next: " + light.getColour()); // GREEN

    light.next();
    System.out.println("After next: " + light.getColour()); // YELLOW

    // teraz čakáme a sledujeme, že sa to samo prepne
    for (int i = 1; i <= 5; i++) {
      Thread.sleep(1000);
      System.out.println(i + "s later: " + light.getColour());
    }
  }
}
