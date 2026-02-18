public class Power1State implements RadiatorState
{

  private final static int POWER = 1;

  @Override public void turnUp(Radiator radiator)
  {
    radiator.setPowerState(new Power2State());
  }

  @Override public void turDown(Radiator radiator)
  {
    radiator.setPowerState(new OffState());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
