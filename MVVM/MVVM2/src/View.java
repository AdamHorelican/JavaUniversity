import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class View
{
  @FXML
  TextField textFieldA;
  @FXML
  TextField textFieldB;

  ViewModel viewModel;

  public View(ViewModel viewModel)
  {
    this.viewModel = viewModel;
  }

  public void initialize()
  {
    textFieldA.textProperty().bindBidirectional(viewModel.simpleTextPropertyProperty());
    textFieldB.textProperty().bindBidirectional(viewModel.simpleTextPropertyProperty());
  }
}