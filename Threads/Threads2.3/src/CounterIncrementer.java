public class CounterIncrementer implements Runnable
{
  private int updates;
  private Counter2 counter;

  public CounterIncrementer(Counter2 counter, int updates){
    this.updates = updates;
    this.counter = counter;
  }

  @Override public void run()
  {
    for (int i = 0; i < updates; i++)
    {
      counter.increment();
    }
    System.out.println(Thread.currentThread().getName() + " har finished, count is: " + counter.getValue());
  }
}
