package se.iths.lab1cleantestablecode.model;

public class Board {

    private final Cell[][] boardOfCells;
    private final int numberOfRows = 45;
    private final int numberOfColums = 45;

    public Board() {
        boardOfCells = new Cell[numberOfRows][numberOfColums];
    }

    public Cell[][] getBoardOfCells() {
        return boardOfCells;
    }

    public void newGeneration() {
    }
}
