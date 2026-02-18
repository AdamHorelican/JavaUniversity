public class Door
{
  private DoorInterface currentState;

  public Door(){
    currentState = new Closed();
  }
  public void push(){
    currentState.push(this);
  }
  void setCurrentState(DoorInterface newState){
    currentState = newState;
  }

  public String getCurrentState()
  {
    return currentState.getText();
  }
}
