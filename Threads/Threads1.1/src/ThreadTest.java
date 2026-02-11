public class ThreadTest
{
  public static void main(String[] args) throws InterruptedException
  {
    // Thread thread1 = new Thread(new Letters());
    //Thread thread2 = new Thread(new Numbers());

    //thread1.start();
    //thread2.start();


    //WaitPrinter waitPrinter = new WaitPrinter(10);
    //Thread thread3 = new Thread(waitPrinter);
    //thread3.start();

    //Thread waitLambda = new Thread(() -> {
      //for (int i = 0; i < 10; i++)
      //{
     //   System.out.println(i);
     //   try{
     //     Thread.sleep(1000);
     //   }
    //    catch (InterruptedException e){
    //     e.printStackTrace();
    //    }
    //  }
   // });
  //  waitLambda.start();

    Thread range1 = new Thread(new PrintingBetweenIntegers(0, 250000));
    Thread range2 = new Thread(new PrintingBetweenIntegers(250000, 50000));
    Thread range3 = new Thread(new PrintingBetweenIntegers(500000, 1000000));
    Thread range4 = new Thread(new PrintingBetweenIntegers(1000000, 1250000));

    range1.start();
    range1.join();
    range2.start();
    range2.join();
    range3.start();
    range3.join();
    range4.start();
    range4.join();

  }
}
