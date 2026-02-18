public class Opening implements DoorInterface
{

  private final Thread openThread;

  public Opening(Door door){
    openThread = new Thread(() -> completedOpening2Sec(door));
    openThread.setDaemon(true);
    openThread.start();
  }

  private void completedOpening2Sec(Door door)
  {
    try {
      Thread.sleep(2000);
      door.setCurrentState(new Open(door));
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

  @Override public void push(Door door)
  {
    openThread.interrupt();
    door.setCurrentState(new Closing(door));
  }

  @Override public String getText()
  {
    return "OPENING";
  }
}
