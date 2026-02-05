public class ListContainerTest
{
  public static void main(String[] args) throws InterruptedException
  {
    //create 2 threads to run two instances of your Runnable class, referencing the same ListContainer.
    ListContainer listContainer = new ListContainer();
    Inserter inserter1 = new Inserter(listContainer);
    Inserter inserter2 = new Inserter(listContainer);

    Thread inserterThread1 = new Thread(inserter1);
    Thread inserterThread2 = new Thread(inserter2);

    inserterThread1.start();
    inserterThread2.start();

    inserterThread1.join();
    inserterThread2.join();

    System.out.println("Final length: " + listContainer.getSize());
  }
}
