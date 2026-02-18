public class OffState implements RadiatorState
{

  private static final int POWER = 0;

  @Override public void turnUp(Radiator radiator)
  {
    radiator.setPowerState(new Power1State());
  }

  @Override public void turDown(Radiator radiator)
  {
    radiator.turnUp();
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
