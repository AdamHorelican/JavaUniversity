public class Open implements DoorInterface
{

  private final Thread autoCloseThread;

  public Open(Door door)
  {
    autoCloseThread = new Thread(() -> autoCloseAfter5s(door));
    autoCloseThread.setDaemon(true);
    autoCloseThread.start();
  }


  @Override public void push(Door door)
  {
    autoCloseThread.interrupt();
    door.setCurrentState(new Closing(door));
  }

  private void autoCloseAfter5s(Door door)
  {
    try {
      Thread.sleep(5000);
      door.setCurrentState(new Closing(door));
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

  @Override public String getText()
  {
    return "OPEN";
  }
}
