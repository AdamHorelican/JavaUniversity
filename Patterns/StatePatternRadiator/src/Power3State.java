public class Power3State implements RadiatorState
{

  private final static int POWER = 3;
  private Thread turnDownAfter10Seconds;


  public Power3State(Radiator radiator){
    turnDownAfter10Seconds = new Thread(() -> turnDownAfter10(radiator));
    turnDownAfter10Seconds.setDaemon(true);
    turnDownAfter10Seconds.start();
  }
  @Override public void turnUp(Radiator radiator)
  {
    //nothing
  }

  private void turnDownAfter10(Radiator radiator){
    try {
      Thread.sleep(1000);
      radiator.setPowerState(new Power2State());
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }

  @Override public void turDown(Radiator radiator)
  {
    radiator.setPowerState(new Power2State());
    turnDownAfter10Seconds.interrupt();
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
