package se.iths.lab1cleantestablecode.model;

public class Board {

    private Cell[][] boardOfCells;
    private int numberOfRows;
    private int numberOfColumns;

    public Cell[][] getBoardOfCells() {
        return boardOfCells;
    }

    public void newGeneration() {
        for (int y = 0; y < numberOfRows; y++){
            for (int x =0; x < numberOfColumns; x++){
            }
        }
    }

    public void countNeighboursForCell(int i, int i1) {
    }
}
