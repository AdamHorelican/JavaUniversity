public class Counter
{
  private int count;
  private final Object lock = new Object();

  public Counter(){
    this.count = 0;
  }

  public void incrementCount(){
    synchronized (lock){
      count++;
    }

  }
  public int getCount(){
    synchronized (lock){
      return count;
    }
  }
}
