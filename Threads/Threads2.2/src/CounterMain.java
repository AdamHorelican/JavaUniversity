public class CounterMain
{
  public static void main(String[] args)
  {
    Counter counter = new Counter();
    CountIncrementer counterIncrementer1 = new CountIncrementer(counter);
    CountIncrementer counterIncrementer2 = new CountIncrementer(counter);
    Thread counterThread1 = new Thread(counterIncrementer1);
    Thread counterThread2 = new Thread(counterIncrementer2);
    counterThread1.start();
    counterThread2.start();
  }
}
