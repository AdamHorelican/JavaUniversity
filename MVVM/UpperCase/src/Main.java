import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
    ViewModel viewModel = new ViewModel(model);

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UpperCase.fxml"));
    fxmlLoader.setControllerFactory(controllerClass -> new View(viewModel));

    Scene scene = new Scene(fxmlLoader.load());
    primaryStage.setTitle("View");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}