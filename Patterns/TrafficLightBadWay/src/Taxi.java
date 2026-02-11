public class Taxi
{
  private int id;

  public Taxi(int id){
    this.id = id;
  }
  public void setLight(String currentLight)
  {
    if("GREEN".equals(currentLight))
    {
      System.out.println("Taxi " + id + " drives");
    }
    else if("YELLOW".equals(currentLight))
    {
      System.out.println("Taxi " + id + " drives");
    }
    else if("RED".equals(currentLight))
    {
      System.out.println("Taxi " + id + " stops");
    }
    else if("RED_AND_YELLOW".equals(currentLight))
    {
      System.out.println("Taxi " + id + " drives");
    }
    else
    {
      System.out.println("Traffic signal broken...");
    }
  }
}
