package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML private TextField txt_euro;
    @FXML private TextField txt_dollar;

    public void showMessage(){
        System.out.println("Euro Wert: "+txt_euro.getText());
        txt_dollar.setText(txt_euro.getText());
    }
}
