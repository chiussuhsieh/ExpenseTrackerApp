package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
    	loader.setController(new AddExpenseController());
    	Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Add Expense");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}