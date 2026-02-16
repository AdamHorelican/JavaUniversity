import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewModel
{
  private StringProperty simpleTextProperty;

  public ViewModel()
  {
    simpleTextProperty = new SimpleStringProperty();
  }

  public StringProperty simpleTextPropertyProperty()
  {
    return simpleTextProperty;
  }
}