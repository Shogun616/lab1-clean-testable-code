package se.iths.lab1cleantestablecode.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class BoardTest {

    private Board board;

    @BeforeEach
    void init(){
        board = new Board();
    }

    @Test
    @DisplayName("Check the first generation of glider.")
    void oneCellTest(){
        board.getBoardOfCells()[2][3].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[2][3].isAlive());
    }

    @Test
    @DisplayName("Check the second generation of glider.")
    void twoCellTest() {
        board.getBoardOfCells()[2][3].setAlive(true);
        board.getBoardOfCells()[3][4].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[2][3].isAlive());
        assertFalse(board.getBoardOfCells()[3][4].isAlive());
    }

    @Test
    @DisplayName("Count the neighbouring cell.")
    void countNeighbourTest(){

        board.countNeighboursForCell(1, 2);
    }
}
