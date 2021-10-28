package se.iths.lab1cleantestablecode.view;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class CellView {
    private Rectangle cellGraphicRepresentation;
    private Color alive = Color.BLACK;
    private Color dead = Color.WHITE;

    public void makeCellAlive() {
        this.cellGraphicRepresentation.setFill(alive);
    }

    public Rectangle getCellGraphicRepresentation() {
        return cellGraphicRepresentation;
    }

    public CellView(){
        this.cellGraphicRepresentation.setHeight(10);
        this.cellGraphicRepresentation.setWidth(10);
        this.makeCellDead();
    }

    public void makeCellDead() {
        this.cellGraphicRepresentation.setFill(dead);
    }
}
