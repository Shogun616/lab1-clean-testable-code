package se.iths.lab1cleantestablecode.controller;

import se.iths.lab1cleantestablecode.model.Board;
import se.iths.lab1cleantestablecode.view.BoardView;
import se.iths.lab1cleantestablecode.view.CellView;

public class BoardController {

    private Board board;
    private final BoardView view;

    public BoardController(){
        this.board = new Board();
        this.view = new BoardView(board.getNumberOfRows(), board.getNumberOfColumns());
        setUpOnMouseEvents();
    }

    public void newGeneration(){
        board.newGeneration();
        view.upDateBoardView(board.getBoarOfCells());
    }

    public void clearBoard(){
        this.board = new Board();
        view.upDateBoardView(board.getBoarOfCells());
    }

    public void createGosperGliderGun(){
        board.CreateGosperGliderGun();
        view.upDateBoardView(board.getBoarOfCells());
    }

    public void setUpOnMouseEvents(){
        CellView[][] cellVireArray = this.view.getCellViewArray();
    }

    private void handleClickedCell(int x, int y){
        if(board.getBoarOfCells()[y][x].isAlive()){
            board.getBoarOfCells()[y][x].setAlive(false);
            view.getCellViewArray()[y][x].makeCellAlive();
        } else {
            board.getBoarOfCells()[y][x].setAlive(true);
            view.getCellViewArray()[y][x].makeCellAlive();
        }
    }
}
