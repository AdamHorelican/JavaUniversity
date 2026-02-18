public class TrafficLight
{
  private TrafficLightState currentState;

  public TrafficLight(){
    currentState = new RedState();
  }

  public void next(){
    currentState.next(this);
  }

  public String getColour(){
    return currentState.getColour();
  }
  void setCurrentState(TrafficLightState newState){
    currentState = newState;
  }
}
