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
        view.updateBoardView(board.getBoardOfCells());
    }

    public void clearBoard(){
        this.board = new Board();
        view.updateBoardView(board.getBoardOfCells());
    }

    public void createGosperGliderGun(){
        board.CreateGosperGliderGun();
        view.updateBoardView(board.getBoardOfCells());
    }

    public void setUpOnMouseEvents(){
        CellView[][] cellViewArray = this.view.getCellViewArray();
        for(int y = 0; y < board.getNumberOfRows(); y++){
            for (int x = 0; x < board.getNumberOfColumns(); x++){
                int finalY = y;
                int finalX = x;
                cellViewArray[y][x].getCellGraphicRepresentation().setOnMouseClicked(event -> handleClickedCell(finalX, finalY));
            }
        }
    }

    private void handleClickedCell(int x, int y){
        if(board.getBoardOfCells()[y][x].isAlive()){
            board.getBoardOfCells()[y][x].setAlive(false);
            view.getCellViewArray()[y][x].makeCellDead();
        } else {
            board.getBoardOfCells()[y][x].setAlive(true);
            view.getCellViewArray()[y][x].makeCellAlive();
        }
    }
}
