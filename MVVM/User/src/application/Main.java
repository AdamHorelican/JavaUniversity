package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;
import view.CreateUserView;
import view.UserListView;
import viewModel.CreateUserViewModel;
import viewModel.UserListViewModel;

public class Main extends Application
{
  public static void main(String[] args)
  {
    launch();
  }

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Model model = new Model();
    CreateUserViewModel createUserViewModel = new CreateUserViewModel(model);
    UserListViewModel userListViewModel = new UserListViewModel(model);

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/CreateUserView.fxml"));
    fxmlLoader.setControllerFactory(controllerClass -> new CreateUserView(createUserViewModel));

    Scene createUserScene = new Scene(fxmlLoader.load());
    primaryStage.setTitle("Create model.User");
    primaryStage.setScene(createUserScene);
    primaryStage.show();

    fxmlLoader = new FXMLLoader(getClass().getResource("/view/UserListView.fxml"));
    fxmlLoader.setControllerFactory(controllerClass -> new UserListView(userListViewModel));

    Scene userListScene = new Scene(fxmlLoader.load());
    Stage secondaryStage = new Stage();
    secondaryStage.setTitle("View Users");
    secondaryStage.setScene(userListScene);
    secondaryStage.show();
  }
}