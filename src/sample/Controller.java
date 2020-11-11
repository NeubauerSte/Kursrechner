package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/*****************************
 Name: Stefan Neubauer
 Erstellt am: 10.11.2020
 Beschreibung: Erstes JavaFX Programm mit Scenebuilder
 Währungsrechner mit JavaFX (USD-EUR)
 ****************************/

public class Controller {

    @FXML private TextField txt_euro;
    @FXML private TextField txt_dollar;

    double kurs = 1.18;

    public void showMessage(){
        System.out.println("Euro Wert: "+txt_euro.getText());
        System.out.println("Dollar Wert: "+txt_dollar.getText());
    }

    public void calculateDollars(){

        double euro= Double.parseDouble(txt_euro.getText());
        double dollar = euro*kurs;

        txt_dollar.setText(dollar + "$");
        txt_euro.setText(euro + "€");

        showMessage();
    }
}
