import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pedestrian implements PropertyChangeListener
{
  private int id;

  public Pedestrian(int id)
  {
    this.id = id;
  }

  public void setLight(String currentLight)
  {
    if("GREEN".equals(currentLight))
    {
      System.out.println("Pedestrian " + id + " waits");
    }
    else if("YELLOW".equals(currentLight))
    {
      System.out.println("Pedestrian " + id + " gets ready to cross the road");
    }
    else if("RED".equals(currentLight))
    {
      System.out.println("Pedestrian " + id + " walks accross the road");
    }
    else if("RED_AND_YELLOW".equals(currentLight))
    {
      System.out.println("Pedestrian " + id + " walks fast accross the road");
    }
    else
    {
      System.out.println("Traffic signal broken...");
    }
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    setLight((String) evt.getNewValue());
  }
}