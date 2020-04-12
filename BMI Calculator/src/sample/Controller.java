package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private Button SubmitButton;
    @FXML TextField HeightTextField, WeightTextField;
    @FXML Label CategoryLabel;

    Person bmiperson = new Person();

    public void initialize() {
        SubmitButton.setOnAction((event -> {
                bmiperson.setHeight(Double.parseDouble(HeightTextField.getText()));
                bmiperson.setWeight(Double.parseDouble(WeightTextField.getText()));
                CategoryLabel.setText(bmiperson.calculateCategory(bmiperson.weight, bmiperson.height));
        }));


    }
}
