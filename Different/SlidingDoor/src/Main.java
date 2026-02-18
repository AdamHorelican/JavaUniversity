public class Main {
  public static void main(String[] args) throws InterruptedException {
    Door door = new Door();

    System.out.println(door.getCurrentState());

    door.push();
    System.out.println(door.getCurrentState());

    Thread.sleep(1000);
    door.push();
    System.out.println(door.getCurrentState());

    Thread.sleep(500);
    door.push();
    System.out.println(door.getCurrentState());

    Thread.sleep(2500);
    System.out.println(door.getCurrentState());

    for (int i = 1; i <= 8; i++) {
      Thread.sleep(1000);
      System.out.println(i + "s: " + door.getCurrentState());
    }
  }
}
