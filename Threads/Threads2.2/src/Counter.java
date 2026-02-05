public class Counter
{
  private int count;

  public Counter(){
    this.count = 0;
  }

  public void incrementCount(){
    synchronized (this){
      count++;
    }

  }
  public int getCount(){
    synchronized (this){
      return count;
    }
  }
}
