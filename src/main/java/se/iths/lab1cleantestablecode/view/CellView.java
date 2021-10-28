package se.iths.lab1cleantestablecode.view;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CellView {
    private final Rectangle cellGraphicRepresentation = new Rectangle();
    private final Color alive = Color.BLACK;
    private final Color dead = Color.WHITE;

    public Rectangle getCellGraphicRepresentation() {
        return cellGraphicRepresentation;
    }

    public CellView(){
        this.cellGraphicRepresentation.setHeight(10);
        this.cellGraphicRepresentation.setWidth(10);
        this.makeCellDead();
    }

    public void makeCellAlive() {
        this.cellGraphicRepresentation.setFill(alive);
    }

    public void makeCellDead() {
        this.cellGraphicRepresentation.setFill(dead);
    }
}
