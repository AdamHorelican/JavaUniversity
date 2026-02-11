public class ThreadTest
{
  public static void main(String[] args)
  {
    // Thread thread1 = new Thread(new Letters());
    //Thread thread2 = new Thread(new Numbers());

    //thread1.start();
    //thread2.start();


    //WaitPrinter waitPrinter = new WaitPrinter(10);
    //Thread thread3 = new Thread(waitPrinter);
    //thread3.start();

    Thread waitLambda = new Thread(() -> {
      for (int i = 0; i < 10; i++)
      {
        System.out.println(i);
        try{
          Thread.sleep(1000);
        }
        catch (InterruptedException e){
          e.printStackTrace();
        }
      }
    });
    waitLambda.start();

  }
}
