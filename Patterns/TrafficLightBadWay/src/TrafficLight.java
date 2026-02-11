import java.util.ArrayList;
import java.util.List;

public class TrafficLight
{
    List<FamilyCar2> familyCar2s;
    List<Taxi> taxis;
    List<SleepyDriver> sleepyDrivers;
    List<Pedestrian> pedestrians;

    private String [] lights = {"GREEN", "YELLOW", "RED", "RED_AND_YELLOW"};
    private int index = 2;
    private String currentLight;

    public TrafficLight(){
      currentLight = lights[2];
      familyCar2s = new ArrayList<>();
      taxis = new ArrayList<>();
      sleepyDrivers = new ArrayList<>();
      pedestrians = new ArrayList<>();
    }

    public void addCar(FamilyCar2 familyCar2){
      this.familyCar2s.add(familyCar2);
      familyCar2.setLight(currentLight);
    }

    public void addTaxi(Taxi taxi)
    {
      taxis.add(taxi);
      taxi.setLight(currentLight);
    }

    public void addSleepyDriver(SleepyDriver sleepyDriver)
    {
      sleepyDrivers.add(sleepyDriver);
      sleepyDriver.setLight(currentLight);
    }

    public void addPedestrian(Pedestrian pedestrian)
    {
      pedestrians.add(pedestrian);
      pedestrian.setLight(currentLight);
    }

    public void start() throws InterruptedException
    {
      for (int i = 0; i < 10; i++)
      {
        Thread.sleep(2000);
        index = (index+1) % 4;
        currentLight = lights[index];
        System.out.println("Light is " + currentLight);

        lightChanged();
      }
    }

  private void lightChanged()
  {
    for (FamilyCar2 familyCar2 : familyCar2s){
      familyCar2.setLight(currentLight);
    }
    for (Taxi taxi : taxis)
    {
      taxi.setLight(currentLight);
    }
    for (SleepyDriver sleepyDriver : sleepyDrivers)
    {
      sleepyDriver.setLight(currentLight);
    }
    for (Pedestrian pedestrian : pedestrians)
    {
      pedestrian.setLight(currentLight);
    }
  }
}
