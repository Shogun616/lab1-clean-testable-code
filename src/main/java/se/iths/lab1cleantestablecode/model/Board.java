package se.iths.lab1cleantestablecode.model;

public class Board {

    private final int numberOfRows = 45;
    private final int numberOfColumns = 45;
    private final Cell[][] boardOfCells;

    public Board() {
        boardOfCells = new Cell[numberOfRows][numberOfColumns];
        fillBoardWithCells();
    }

    public Cell[][] getBoarOfCells() {
        return boardOfCells;
    }

    public int getNumberOfRows(){
        return numberOfRows;
    }

    public int getNumberOfColumns(){
        return numberOfColumns;
    }

    private void fillBoardWithCells() {
        for (int y = 0; y < numberOfRows; y++){
            for (int x = 0; x < numberOfColumns; x++){
                boardOfCells[y][x] = new Cell();
            }
        }
    }
}
