package se.iths.lab1cleantestablecode.controller;

import se.iths.lab1cleantestablecode.model.Board;

public class BoardController {

    private Board board;

    public BoardController(){
        this.board = new Board();
    }

    public void newGeneration(){
        board.newGeneration();
    }

    public void clearBoard(){
        this.board = new Board();
    }

    public void createGosperGliderGun(){
        board.CreateGosperGliderGun();
    }

    public void setUpOnMouseEvents(){

    }

    private void handleClickedCell(){

    }
}
