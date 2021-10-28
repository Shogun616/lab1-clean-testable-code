package se.iths.lab1cleantestablecode.view;

import se.iths.lab1cleantestablecode.model.Cell;

public class BoardView {

    private final CellView[][] cellViewArray;
    private final int numberOfRows;
    private final int numberOfColmuns;

    public BoardView(int numberOfRows, int numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColmuns = numberOfColumns;
        cellViewArray = new CellView[numberOfRows][numberOfColumns];
    }


    public CellView[][] getCellViewArray() {
        return cellViewArray();
    }

    public void upDateBoardView(Cell[][] boarOfCells) {
    }
}
