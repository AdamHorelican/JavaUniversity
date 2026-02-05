public class Counter
{
  private int count;

  public Counter(){
    this.count = 0;
  }

  public synchronized void incrementCount(){
    count++;
  }
  public synchronized int getCount(){
    return count;
  }
}
