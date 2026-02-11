public class WaitPrinter implements Runnable
{

  private int number;

  public WaitPrinter(int number){
    this.number = number;
  }

  @Override
  public void run(){
    for (int i = 0; i < number; i++)
    {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}
