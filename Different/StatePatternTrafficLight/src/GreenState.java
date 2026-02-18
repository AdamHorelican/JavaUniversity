public class GreenState implements TrafficLightState
{
  @Override public void next(TrafficLight trafficLight)
  {
    trafficLight.setCurrentState(new YellowState(trafficLight));
  }

  @Override public String getColour()
  {
    return "GREEN";
  }
}
