package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable {

    @FXML
    private Text hello;

    @FXML Text actualTimer;

    public int secCounter = 0;


       Timer timer = new Timer();

    TimerTask task = new TimerTask() {

        @Override
        public void run() {
            secCounter++;
            actualTimer.setText("Seconds: " + secCounter);
        }
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timer.schedule(task, 1000L, 1000L);

    }

}




