public class CounterIncDecreTest
{
  public static void main(String[] args)
  {
    Counter2 counter = new Counter2(0,100);

    CounterIncrementer counterIncrementer1 = new CounterIncrementer(counter, 400);
    CounterIncrementer counterIncrementer2 = new CounterIncrementer(counter, 400);

    CounterDecrementer counterDecrementer1 = new CounterDecrementer(counter, 400);
    CounterDecrementer counterDecrementer2 = new CounterDecrementer(counter, 400);

    Thread counterIncrementerThread1 = new Thread(counterIncrementer1);
    Thread counterIncrementerThread2 = new Thread(counterIncrementer2);
    Thread counterDecrementerThread1 = new Thread(counterDecrementer1);
    Thread counterDecrementerThread2 = new Thread(counterDecrementer2);

    counterIncrementerThread1.setName("Incrementer 1");
    counterIncrementerThread2.setName("Incrementer 2");
    counterDecrementerThread1.setName("Decrementer 1");
    counterDecrementerThread2.setName("Decrementer 2");

    counterIncrementerThread1.start();
    counterIncrementerThread2.start();
    counterDecrementerThread1.start();
    counterDecrementerThread2.start();
  }
}
