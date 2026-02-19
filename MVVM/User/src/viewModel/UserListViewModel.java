package viewModel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Model;
import model.User;

public class UserListViewModel
{
  private Model model;
  private ObservableList<User> users;

  public UserListViewModel(Model model)
  {
    this.model = model;
    users = FXCollections.observableArrayList();
    refresh();
  }

  public ObservableList<User> getUsers()
  {
    return users;
  }

  public void refresh()
  {
    users.clear();
    users.addAll(model.getUsers());
  }
}