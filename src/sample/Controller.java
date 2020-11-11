package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Popup;
import javafx.stage.PopupWindow;

import java.text.DecimalFormat;

/*****************************
 Name: Stefan Neubauer
 Erstellt am: 10.11.2020
 Beschreibung: Erstes JavaFX Programm mit Scenebuilder
 Währungsrechner mit JavaFX (USD-EUR)
 ****************************/

public class Controller {

    @FXML private TextField txt_euro;
    @FXML private TextField txt_dollar;

    float dollar, euro , kurs=(float) 1.18;
    DecimalFormat df = new DecimalFormat("#0.00");

    public void showMessage(){
        System.out.println("Euro Wert: "+txt_euro.getText()+"€");
        System.out.println("Dollar Wert: "+txt_dollar.getText()+"$");
    }

    public void calculateDollars(){
        try{
            euro=Float.parseFloat(txt_euro.getText());
            dollar=euro*kurs;
        } catch (RuntimeException rte){ System.out.println("Bitte Wert in Euro eintragen!"); }

        txt_dollar.setText(String.valueOf(df.format(dollar)));
        txt_euro.setText(String.valueOf(df.format(euro)));

        showMessage();
    }
}
