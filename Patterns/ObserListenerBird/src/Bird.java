import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class Bird
{
    private PropertyChangeSupport support;

    public Bird(){
      support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(String name, PropertyChangeListener listener){
      support.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(String name, PropertyChangeListener listener){
      support.removePropertyChangeListener(listener);
    }

  public void start()
  {
    Random random = new Random();
    while(true)
    {
      if(random.nextInt(100) < 50)
      {
        System.out.println("Bird is flapping wings");
        support.firePropertyChange("Flapping", null, null);
      }
      else
      {
        System.out.println("Bird is singing a song");
        support.firePropertyChange("Singing", null, null);
      }
      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}
