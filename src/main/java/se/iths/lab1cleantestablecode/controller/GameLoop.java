package se.iths.lab1cleantestablecode.controller;

import javafx.application.Platform;
import javafx.scene.control.Button;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameLoop {

    private boolean isRunning = false;
    private final BoardController controller;
    private int speed = 100;
    private ScheduledExecutorService service;

    public GameLoop(BoardController controller){
        this.controller = controller;
    }

    public void handleStartBtn(Button startBtn){
        if(isRunning){
            stopGame();
            startBtn.setText("Start");
        } else {
            startGame();
            startBtn.setText("Stop");
        }
    }

    public void handleClearBtn(){
        if(isRunning){
            stopGame();
        }
    }

    public void changeLoopSpeed(int newSpeed){
        if(isRunning){
            stopGame();
            this.speed = newSpeed;
            startGame(newSpeed);
        } else {
            this.speed = newSpeed;
        }
    }

    private void startGame(){
        startLoop();
        this.isRunning = true;
    }

    private void startGame(int newSpeed){
        startLoop(newSpeed);
        this.isRunning = true;
    }

    private void stopGame(){
        service.shutdown();
        this.isRunning = false;
    }

    private void startLoop(){
        service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(oneStep(), 0, speed, TimeUnit.MILLISECONDS);
    }

    private void startLoop(int newSpeed){
        service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(oneStep(), newSpeed, speed, TimeUnit.MILLISECONDS);
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
