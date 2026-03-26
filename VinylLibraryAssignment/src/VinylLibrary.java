import java.util.ArrayList;
import java.util.List;

public class VinylLibrary
{
  private List<Vinyl> vinyls;

  public VinylLibrary(){
    this.vinyls = new ArrayList<>();
  }

  public void addVinyl(String title, String artist, int releaseYear){
    vinyls.add(new Vinyl(title, artist, releaseYear));
    System.out.println("Vinyl added: title:" + title + " artist: " + artist + " releaseYear: " + releaseYear);
  }

  public void removeVinyl(Vinyl vinyl){
    if (vinyl.getCurrentState() instanceof AvailableState){
      vinyls.remove(vinyls);
    }
    else{
      vinyl.remove();
    }
  }
  public void borrowVinyl(Vinyl vinyl, String userId){
    vinyl.borrow(userId);
  }

  public void reserverVinyl(Vinyl vinyl, String userId){
    vinyl.reserve(userId);
  }
  public void returnVinyl(Vinyl vinyl){
    vinyl.returnVinyl();
  }
  public List<Vinyl> getVinyls()
  {
    return vinyls;
  }
}
