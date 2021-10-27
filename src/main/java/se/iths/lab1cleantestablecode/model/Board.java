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

    public void newGeneration() {
        for (int y = 0; y < numberOfRows; y++){
            for (int x = 0; x < numberOfColumns; x++){
                countNeighboursForCell(x, y);
            }
        }
        for (int y = 0; y < numberOfRows; y++){
            for (int x = 0; x < numberOfColumns; x++){
                Cell actualCell = boardOfCells[y][x];

                if(!actualCell.isAlive() || (actualCell.getNeighbours() != 2 && actualCell.getNeighbours() != 3)){
                    actualCell.setAlive(!actualCell.isAlive() && actualCell.getNeighbours() == 3);
                }
            }
        }
    }

    private void countNeighboursForCell(int x, int y) {
        Cell actualCell = boardOfCells[y][x];
        int neighbours = 0;

        for (int i = -1; i <= 1; i++){
            for (int j = -1; j <= 1; j++){
                if (y + i >= 0 && y + i < numberOfRows && x + j >= 0 && x +j < numberOfColumns){
                    Cell neighboursCell = boardOfCells[y + i][x + j];
                    if (neighboursCell.isAlive() && neighboursCell != actualCell){
                        neighbours++;
                    }
                }
            }
        }
        actualCell.setNeighbours(neighbours);
    }
}
