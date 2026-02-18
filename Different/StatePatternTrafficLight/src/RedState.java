public class RedState implements TrafficLightState
{
  @Override public void next(TrafficLight trafficLight)
  {
    trafficLight.setCurrentState(new GreenState());
  }

  @Override public String getColour()
  {
    return "RED";
  }
}
