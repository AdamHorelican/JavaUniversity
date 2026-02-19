package application;

import application.ViewModelFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.CreateUserView;
import view.UserListView;

import java.io.IOException;

public class ViewFactory
{
  private ViewModelFactory viewModelFactory;
  private UserListView userListView;
  private CreateUserView createUserView;

  private final Stage primaryStage;
  private FXMLLoader fxmlLoader;


  public ViewFactory(ViewModelFactory viewModelFactory, Stage primaryStage)
  {
    this.viewModelFactory = viewModelFactory;
    this.primaryStage = primaryStage;
  }

  public UserListView getUserListView() throws IOException
  {
    if(userListView == null)
    {
      fxmlLoader = new FXMLLoader(getClass().getResource("/view/UserListView.fxml"));
      fxmlLoader.setControllerFactory(controllerClass -> new UserListView(viewModelFactory.getUserListViewModel()));

      Scene createUserScene = new Scene(fxmlLoader.load());
      primaryStage.setTitle("View Users");
      primaryStage.setScene(createUserScene);
      primaryStage.show();
      userListView = fxmlLoader.getController();
    }
    return userListView;
  }

  public CreateUserView getCreateUserView() throws IOException
  {
    if(createUserView == null)
    {
      fxmlLoader = new FXMLLoader(getClass().getResource("/view/CreateUserView.fxml"));
      fxmlLoader.setControllerFactory(controllerClass -> new CreateUserView(viewModelFactory.getCreateUserViewModel()));

      Scene userListScene = new Scene(fxmlLoader.load());
      Stage secondaryStage = new Stage();
      secondaryStage.setTitle("Create User");
      secondaryStage.setScene(userListScene);
      secondaryStage.show();
      createUserView = fxmlLoader.getController();
    }
    return createUserView;
  }
}