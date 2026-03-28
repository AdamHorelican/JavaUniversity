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

  public void addVinyl(String title, String artist, int releaseYear){
    vinyls.add(new Vinyl(title, artist, releaseYear));
    System.out.println("Vinyl added: title:" + title + " artist: " + artist + " releaseYear: " + releaseYear);
    support.firePropertyChange("vinyls", null, vinyls);
  }

  public void removeVinyl(Vinyl vinyl){
    if (vinyl.getCurrentState() instanceof AvailableState){
      vinyls.remove(vinyl);
    }
    else{
      vinyl.remove();
    }
  }
  public void borrowVinyl(Vinyl vinyl, String userId){
    vinyl.borrow(userId);
  }

  public void reserveVinyl(Vinyl vinyl, String userId){
    vinyl.reserve(userId);
  }
  public void returnVinyl(Vinyl vinyl, String userId){
    vinyl.returnVinyl(userId);
    if (vinyl.getMarkedFlag() && vinyl.getCurrentState() instanceof AvailableState){
      vinyls.remove(vinyl);
    }

  }
  public List<Vinyl> getVinyls()
  {
    return vinyls;
  }
}
