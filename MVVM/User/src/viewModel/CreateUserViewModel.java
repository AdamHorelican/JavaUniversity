package viewModel;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Model;

public class CreateUserViewModel
{
  private Model model;
  private StringProperty username, password, passwordRepeat;
  private IntegerProperty age;

  public CreateUserViewModel(Model model)
  {
    this.model = model;
    username = new SimpleStringProperty();
    password = new SimpleStringProperty();
    passwordRepeat = new SimpleStringProperty();
    age = new SimpleIntegerProperty();
  }

  public void addUser()
  {
    if (!password.get().equals(passwordRepeat.get())){
      System.out.println("Passwords do not match!");
      return;
    }
    model.addUser(username.get(), password.get(), age.get());
  }

  public StringProperty usernameProperty()
  {
    return username;
  }

  public StringProperty passwordProperty()
  {
    return password;
  }

  public IntegerProperty ageProperty()
  {
    return age;
  }

  public StringProperty passwordRepeatProperty()
  {
    return passwordRepeat;
  }
}