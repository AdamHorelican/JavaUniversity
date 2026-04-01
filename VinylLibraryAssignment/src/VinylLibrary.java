import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;


public class VinylLibrary
{
  private List<Vinyl> vinyls;
  private PropertyChangeSupport support;

  public VinylLibrary(){
    this.vinyls = new ArrayList<>();
    support = new PropertyChangeSupport(this);
  }

  public void addPropertyChangeListener(PropertyChangeListener listener){
    support.addPropertyChangeListener(listener);
  }

  public synchronized void addVinyl(String title, String artist, int releaseYear){
    vinyls.add(new Vinyl(title, artist, releaseYear));
    System.out.println("Vinyl added: title:" + title + " artist: " + artist + " releaseYear: " + releaseYear);
    support.firePropertyChange("vinyls", null, vinyls);
  }

  public synchronized void removeVinyl(Vinyl vinyl){
    if (vinyl.getCurrentState() instanceof AvailableState){
      vinyls.remove(vinyl);
      support.firePropertyChange("vinyls", null, vinyls);
    }
    else{
      vinyl.remove();
      support.firePropertyChange("vinyls", null, vinyls);
    }
  }
  public synchronized  void borrowVinyl(Vinyl vinyl, String userId){
    vinyl.borrow(userId);
    support.firePropertyChange("vinyls", null, vinyls);
  }

  public synchronized void reserveVinyl(Vinyl vinyl, String userId){
    vinyl.reserve(userId);
    support.firePropertyChange("vinyls", null, vinyls);
  }
  public synchronized void returnVinyl(Vinyl vinyl, String userId){
    vinyl.returnVinyl(userId);
    if (vinyl.getMarkedFlag() && vinyl.getCurrentState() instanceof AvailableState){
      vinyls.remove(vinyl);
    }
    support.firePropertyChange("vinyls", null, vinyls);

  }
  public List<Vinyl> getVinyls()
  {
    return vinyls;
  }
}
