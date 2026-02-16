import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class View
{
  @FXML
  TextField outputTextField;
  @FXML
  TextField inputTextField;

  private ViewModel viewModel;

  public View(ViewModel viewModel)
  {
    this.viewModel = viewModel;
  }

  public void initialize()
  {
    outputTextField.textProperty().bindBidirectional(viewModel.outputTextProperty());
    inputTextField.textProperty().bindBidirectional(viewModel.inputTextProperty());
  }

  public void onConvertButtonPressed()
  {
    viewModel.convert();
  }
}