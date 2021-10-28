package se.iths.lab1cleantestablecode.controller;

import javafx.application.Platform;

public class GameLoop {

    private final BoardController controller;

    public GameLoop(BoardController controller){
        this.controller = BoardController;
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
