package application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class TransactionCellController {
	@FXML private Label dateLabel;
	@FXML private Label categoryLabel;
	@FXML private Label descriptionLabel;
	@FXML private Label amountLabel;
	
	public void setTransactionDetails(String date, String category, String description, String amount) {
		dateLabel.setText(date);
		categoryLabel.setText(category);
		descriptionLabel.setText(description);
		amountLabel.setText("$" + amount);
	}

}
