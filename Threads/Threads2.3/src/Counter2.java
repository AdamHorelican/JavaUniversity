public class Counter2
{
  private long value;
  private long max;
  private long min;

  public Counter2(int min, int max){
    this.value = 0;
    this.max = max;
    this.min = min;
  }
  public synchronized void increment(){
    while (value >= max){
      try
      {
        wait();
      }
      catch (InterruptedException e){
        e.printStackTrace();
      }
    }
    value++;
    System.out.println(value + ": " + Thread.currentThread().getName());
    notifyAll();
  }

  public synchronized void decrement()
  {
    while(value <= min)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    value--;
    System.out.println(value + ": " + Thread.currentThread().getName());
    notifyAll();
  }
  public synchronized long getValue(){
    return value;
  }
}
