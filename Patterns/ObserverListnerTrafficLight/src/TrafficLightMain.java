public class TrafficLightMain
{
  public static void main(String[] args)
  {
    TrafficLight trafficLight = new TrafficLight();

    FamilyCar2 car1 = new FamilyCar2(1);
    Taxi taxi1 = new Taxi(1);
    SleepyDriver sleepyDriver1 = new SleepyDriver(1);
    Pedestrian pedestrian1 = new Pedestrian(1);

    trafficLight.addPropertyChangeListener(car1);
    trafficLight.addPropertyChangeListener(taxi1);
    trafficLight.addPropertyChangeListener(sleepyDriver1);
    trafficLight.addPropertyChangeListener(pedestrian1);

    try
    {
      trafficLight.start();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
