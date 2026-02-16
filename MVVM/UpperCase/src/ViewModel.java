import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewModel
{
  private Model model;
  private StringProperty inputTextProperty, outputTextProperty;

  public ViewModel(Model model)
  {
    this.model = model;
    inputTextProperty = new SimpleStringProperty();
    outputTextProperty = new SimpleStringProperty();
  }

  public void convert()
  {
    String result = model.uppercase(inputTextProperty.get());
    outputTextProperty.set(result);
  }

  public StringProperty inputTextProperty()
  {
    return inputTextProperty;
  }

  public StringProperty outputTextProperty()
  {
    return outputTextProperty;
  }
}