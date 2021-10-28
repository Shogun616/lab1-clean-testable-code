package se.iths.lab1cleantestablecode.view;

import javafx.scene.layout.GridPane;
import se.iths.lab1cleantestablecode.controller.GameController;
import se.iths.lab1cleantestablecode.model.Cell;

public class BoardView {

    private final CellView[][] cellViewArray;
    private final int numberOfRows;
    private final int numberOfColmuns;
    private GridPane gridPane = new GridPane();

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

    private void setUpGrid(){
        gridPane.setStyle();
        gridPane.setHgap();
        gridPane.setVgap();
        gridPane.setAlignment();
        gridPane.setPadding();
        GameController.StaticMainStage.setCenter(gridPane);
    }
}
