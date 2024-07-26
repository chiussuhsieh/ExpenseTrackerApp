package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import java.io.IOException;


public class AddExpenseController {
	@FXML
    TextField amountField;
	@FXML
	TextField categoryField;
	@FXML 
	TextField dateField;
    @FXML
    TextField descriptionField;
    @FXML
    Button addButton;
    @FXML
    VBox transactionListContainer;

//    @FXML
//    private void initialize() {
//        // Initialization code, if needed
//    }
    public void handleAddButtonClick(ActionEvent event) {
        String amount = amountField.getText();
        String category = categoryField.getText();
        String date = dateField.getText();
        String description = descriptionField.getText();
        // Handle the logic to add the expense
        try {
        	addTransactionCell(date, category, description, amount);
        	clearInputFields();
        } catch (IOException e) {
        	e.printStackTrace();
        }
//        System.out.println("Amount: " + amount);
//        System.out.println("Description: " + description);
    }   



private void addTransactionCell(String date, String category, String description, String amount)throws IOException {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("TransactionCell.fxml"));
	Node transactionCell = loader.load();
	
	TransactionCellController controller = loader.getController();
	if(controller == null) {System.err.println("TransactionCellController is null!");
	return;
	}
	controller.setTransactionDetails(date, category, description, amount);
	
	if (transactionListContainer == null) {
		System.err.println("transactionListContainer is null!");
		return;
	}
	transactionListContainer.getChildren().add(transactionCell);
	
}


private void clearInputFields() {
	amountField.clear();
	categoryField.clear();
	dateField.clear();
	descriptionField.clear();
 }

}
