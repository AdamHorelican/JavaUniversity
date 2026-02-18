public class Power2State implements RadiatorState
{
  private final static int POWER = 2;
  @Override public void turnUp(Radiator radiator)
  {
    radiator.setPowerState(new Power3State(radiator));
  }

  @Override public void turDown(Radiator radiator)
  {
    radiator.setPowerState(new Power1State());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
