package se.iths.lab1cleantestablecode.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    public static BorderPane StaticMainStage;
    public BorderPane MainStage;
    public Slider speedSlider;

    public Button startBtn;
    public Button clearBtn;
    public Button quitBtn;
    public Button gosperGliderGunBtn;

    private BoardController controller;
    private GameLoop loop;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        StaticMainStage = this.MainStage;
        this.controller = new BoardController();
        this.loop = new GameLoop(this.controller);
        addListenerToSpeedSlider();
    }

    private void addListenerToSpeedSlider() {
        speedSlider.valueProperty().addListener((observable, oldValue, newValue) ->{
            int newSpeed = 1000 / newValue.intValue();
            loop.changeLoopSpeed(newSpeed);
        });
    }

    @FXML
    void handleStartBtn(){
        this.loop.handleStartBtn(startBtn);
    }

    @FXML
    void handleClearBtn(){
        this.controller.clearBoard();
        this.loop.handleClearBtn();
        this.startBtn.setText("Start");
    }

    @FXML
    void handleGosperGliderGunBtn(){
        this.controller.createGosperGliderGun();
    }

    @FXML
    void handleQuitBtn(){
        System.exit(0);
    }
}
