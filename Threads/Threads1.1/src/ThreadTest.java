public class ThreadTest
{
  public static void main(String[] args)
  {
    Thread thread1 = new Thread(new Letters());
    Thread thread2 = new Thread(new Numbers());

    thread1.start();
    thread2.start();
  }
}
