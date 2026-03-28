import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.converter.NumberStringConverter;

public class VinylController {

    @FXML private TableView<Vinyl> vinylTable;
    @FXML private TableColumn<Vinyl, String> titleColumn;
    @FXML private TableColumn<Vinyl, String> artistColumn;
    @FXML private TableColumn<Vinyl, Integer> yearColumn;
    @FXML private TableColumn<Vinyl, String> stateColumn;

    @FXML private TextField userIdField;
    @FXML private TextField titleField;
    @FXML private TextField artistField;
    @FXML private TextField yearField;

    private VinylViewModel viewModel;

    public VinylController(VinylViewModel viewModel) {
      this.viewModel = viewModel;
    }

    @FXML
    public void initialize() {
      titleColumn.setCellValueFactory(cellData ->
          new SimpleStringProperty(cellData.getValue().getTitle()));
      artistColumn.setCellValueFactory(cellData ->
          new SimpleStringProperty(cellData.getValue().getArtist()));
      yearColumn.setCellValueFactory(cellData ->
          new SimpleIntegerProperty(cellData.getValue().getReleaseYear()).asObject());
      stateColumn.setCellValueFactory(cellData ->
          new SimpleStringProperty(cellData.getValue().getCurrentState().getClass().getSimpleName()));
      vinylTable.setItems(viewModel.getVinyls());

      titleField.textProperty().bindBidirectional(viewModel.titleProperty());
      artistField.textProperty().bindBidirectional(viewModel.artistProperty());
      yearField.textProperty().bindBidirectional(
          viewModel.yearProperty(), new NumberStringConverter());
      userIdField.textProperty().bindBidirectional(viewModel.userIdProperty());


    }

    @FXML
    public void onReserveClicked() {
      Vinyl selected = vinylTable.getSelectionModel().getSelectedItem();
      if (selected != null && !viewModel.userIdProperty().get().isEmpty()){
        viewModel.reserve(selected);
      }
    }

    @FXML
    public void onBorrowClicked() {
      Vinyl selected = vinylTable.getSelectionModel().getSelectedItem();
      if (selected != null && !viewModel.userIdProperty().get().isEmpty()){
        viewModel.borrow(selected);
      }
    }

    @FXML
    public void onReturnClicked() {
      Vinyl selected = vinylTable.getSelectionModel().getSelectedItem();
      if (selected != null && !viewModel.userIdProperty().get().isEmpty()){
        viewModel.returnVinyl(selected);
      }
    }

    @FXML
    public void onRemoveClicked() {
      Vinyl selected = vinylTable.getSelectionModel().getSelectedItem();
      if (selected != null && !viewModel.userIdProperty().get().isEmpty()){
        viewModel.remove(selected);
      }
    }

    @FXML
    public void onAddVinylClicked() {
        viewModel.addVinyl();
    }
  }