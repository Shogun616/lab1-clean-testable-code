package se.iths.lab1cleantestablecode.controller;

import javafx.application.Platform;
import javafx.scene.control.Button;

import java.util.concurrent.ScheduledExecutorService;

public class GameLoop {

    private boolean isRunning = false;
    private final BoardController controller;
    private int speed = 100;
    private ScheduledExecutorService service;

    public GameLoop(BoardController controller){
        this.controller = BoardController;
    }

    public void handleStartBtn(Button startBtn){
        if(isRunning){

        } else {

        }
    }

    private Runnable oneStep(){
        return () -> {
            try {
                Platform.runLater(controller::newGeneration);
            } catch (Exception e){
                try {
                    throw new Exception(e);
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        };
    }
}
