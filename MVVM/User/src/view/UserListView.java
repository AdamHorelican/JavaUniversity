package view;

import javafx.fxml.FXML;

import javafx.scene.control.ListView;
import model.User;
import viewModel.UserListViewModel;

public class UserListView
{
  @FXML
  private ListView<User> userListView;

  private UserListViewModel userListViewModel;

  public UserListView(UserListViewModel createUserViewModel)
  {
    this.userListViewModel = createUserViewModel;
  }

  public void initialize()
  {
    userListView.setItems(userListViewModel.getUsers());
  }

  public void onRefreshButtonPressed()
  {
    userListViewModel.refresh();
  }
}
