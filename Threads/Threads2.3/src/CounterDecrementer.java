public class CounterDecrementer implements Runnable
{
  private Counter2 counter;
  private int updates;

  public CounterDecrementer(Counter2 counter, int updates)
  {
    this.updates = updates;
    this.counter = counter;
  }

  @Override
  public void run()
  {
    for (int i = 0; i < updates; i++)
    {
      counter.decrement();
    }
    System.out.println(Thread.currentThread().getName() + " har finished, count is: " + counter.getValue());
  }
}