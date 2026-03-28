
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class VinylViewModel
{
  private VinylLibrary vinylLibrary;
  private ObservableList<Vinyl> vinyls;

  private StringProperty titleProperty = new SimpleStringProperty();
  private StringProperty artistProperty = new SimpleStringProperty();
  private IntegerProperty yearProperty = new SimpleIntegerProperty();
  private StringProperty userIdProperty = new SimpleStringProperty();


  public VinylViewModel(VinylLibrary vinylLibrary)
  {
    this.vinylLibrary = vinylLibrary;
    this.vinyls = FXCollections.observableArrayList();
    refresh();
  }

  public ObservableList<Vinyl> getVinyls()
  {
    return vinyls;
  }

  public void refresh()
  {
    vinyls.clear();
    vinyls.addAll(vinylLibrary.getVinyls());
  }

  public StringProperty titleProperty() { return titleProperty; }
  public StringProperty artistProperty() { return artistProperty; }
  public IntegerProperty yearProperty() { return yearProperty; }
  public StringProperty userIdProperty() { return userIdProperty; }


  public void reserve(Vinyl vinyl) {
    vinylLibrary.reserveVinyl(vinyl, userIdProperty.get());
    refresh();
  }
  public void remove(Vinyl vinyl){
    vinylLibrary.removeVinyl(vinyl);
    refresh();
  }
  public void borrow(Vinyl vinyl){
    vinylLibrary.borrowVinyl(vinyl, userIdProperty.get());
    refresh();
  }
  public void returnVinyl(Vinyl vinyl){
    vinylLibrary.returnVinyl(vinyl, userIdProperty.get());
    refresh();
}
  public void addVinyl(){
    String title = titleProperty.get();
    String artist = artistProperty.get();
    int releaseYear = yearProperty.get();
    vinylLibrary.addVinyl(title, artist, releaseYear);
    refresh();
  }
}
