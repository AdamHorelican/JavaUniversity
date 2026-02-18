public class Radiator
{
  private RadiatorState currentState;

  public Radiator(){
    currentState = new OffState();
  }


  public void turnUp(){
    currentState.turnUp(this);
  }

  public void turnDown(){
    currentState.turnUp(this);
  }
  public int getPower(){
    return currentState.getPower();
  }
   void setPowerState(RadiatorState newState){
    currentState = newState;
  }
}
