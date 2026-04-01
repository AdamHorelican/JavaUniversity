import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    VinylLibrary vinylLibrary = new VinylLibrary();
    vinylLibrary.addVinyl("Dark Side of the Moon", "Pink Floyd", 1973);
    vinylLibrary.addVinyl("Abbey Road", "Beatles", 1969);

    VinylViewModel viewModel = new VinylViewModel(vinylLibrary);

    FXMLLoader loader = new FXMLLoader(getClass().getResource("/VinylListView.fxml"));
    loader.setControllerFactory(c -> new VinylController(viewModel));

    Scene scene = new Scene(loader.load());
    stage.setTitle("Vinyl Library");
    stage.setScene(scene);
    stage.show();

    VinylSimulator simulator = new VinylSimulator(vinylLibrary);
    Thread thread = new Thread(simulator);
    thread.setDaemon(true);
    thread.start();
  }

  public static void main(String[] args) {
    launch(args);
  }
}