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
    ModelFactory modelFactory = new ModelFactory();
    ViewModelFactory viewModelFactory = new ViewModelFactory(modelFactory);
    ViewFactory viewFactory = new ViewFactory(viewModelFactory, primaryStage);

    viewFactory.getCreateUserView();
    viewFactory.getUserListView();
  }
}