public class FamilyCar2
{
  private int id;

  public FamilyCar2(int id){
    this.id = id;
  }
  public void setLight(String currentLight){
    if("GREEN".equals(currentLight))
    {
      System.out.println("Car " + id + " drives");
    }
    else if("YELLOW".equals(currentLight))
    {
      System.out.println("Car " + id + " drives");
    }
    else if("RED".equals(currentLight))
    {
      System.out.println("Car " + id + " stops");
    }
    else if("RED_AND_YELLOW".equals(currentLight))
    {
      System.out.println("Car " + id + " drives");
    }
    else
    {
      System.out.println("Traffic signal broken...");
    }
  }
}
