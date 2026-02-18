public class Closing implements DoorInterface
{

  private final Thread closeThread;

  public Closing(Door door)
  {
    closeThread = new Thread(() -> completeClosingAfter2s(door));
    closeThread.setDaemon(true);
    closeThread.start();
  }

  private void completeClosingAfter2s(Door door)
  {
    try {
      Thread.sleep(2000);
      door.setCurrentState(new Closed());
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

  @Override public void push(Door door)
  {
    closeThread.interrupt();
    door.setCurrentState(new Opening(door));
  }

  @Override public String getText()
  {
    return "CLOSING";
  }
}
