public class YellowState implements TrafficLightState
{
  private final Thread toRedThread;

  public YellowState(TrafficLight light){
    this.toRedThread = new Thread(() -> switchToRedAfter3(light));
    toRedThread.setDaemon(true);
    toRedThread.start();


  }

  private void switchToRedAfter3(TrafficLight light)
  {
    try {
      Thread.sleep(4000);
      light.setCurrentState(new RedState());
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }

  @Override public void next(TrafficLight trafficLight)
  {
    //nothing
  }

  @Override public String getColour()
  {
    return "YELLOW";
  }
}
