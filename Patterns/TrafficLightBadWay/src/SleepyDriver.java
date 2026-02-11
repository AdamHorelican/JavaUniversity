public class SleepyDriver
{
  private int id;

  public SleepyDriver(int id)
  {
    this.id = id;
  }

  public void setLight(String currentLight)
  {
    if("GREEN".equals(currentLight))
    {
      System.out.println("SleepyDriver " + id + " turns engine on");
      System.out.println("SleepyDriver " + id + " drives");
    }
    else if("YELLOW".equals(currentLight))
    {
      System.out.println("SleepyDriver " + id + " slows down");
    }
    else if("RED".equals(currentLight))
    {
      System.out.println("SleepyDriver " + id + " stops");
    }
    else if("RED_AND_YELLOW".equals(currentLight))
    {
      //Do nothing
    }
    else
    {
      System.out.println("Traffic signal broken...");
    }
  }
}