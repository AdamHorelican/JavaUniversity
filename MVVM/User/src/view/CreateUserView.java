package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.NumberStringConverter;
import viewModel.CreateUserViewModel;

public class CreateUserView
{
  @FXML
  TextField usernameField;
  @FXML
  TextField passwordField;
  @FXML
  TextField passwordRepeatField;
  @FXML
  TextField ageField;


  private CreateUserViewModel viewModel;

  public CreateUserView(CreateUserViewModel viewModel)
  {
    this.viewModel = viewModel;
  }

  public void initialize()
  {
    usernameField.textProperty().bindBidirectional(viewModel.usernameProperty());
    passwordField.textProperty().bindBidirectional(viewModel.passwordProperty());
    passwordRepeatField.textProperty().bindBidirectional(viewModel.passwordRepeatProperty());
    ageField.textProperty().bindBidirectional(viewModel.ageProperty(), new NumberStringConverter());
    ageField.setTextFormatter(new TextFormatter<Integer>(change -> {
      String newText = change.getControlNewText();
      if (newText.matches("\\d*")) {
        return change;
      }
      return null;
    }));
    usernameField.setTextFormatter(new TextFormatter<String>(change -> {
      String newText = change.getControlNewText();
      if (newText.length() <= 10) {
        return change;
      }
      return null;
    }));
  }

  public void onAddButtonPressed()
  {

    viewModel.addUser();
  }
}