import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TrafficLight
{
    private PropertyChangeSupport support;
    private String [] lights = {"GREEN", "YELLOW", "RED", "RED_AND_YELLOW"};
    private int index = 2;
    private String currentLight;

    public TrafficLight(){
      currentLight = lights[2];
      this.support = new PropertyChangeSupport(this);
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

    public void addPropertyChangeListener(PropertyChangeListener listener){
      support.addPropertyChangeListener(listener);
    }

  private void lightChanged()
  {
    support.firePropertyChange("LightChanged", null, currentLight);
  }
}
