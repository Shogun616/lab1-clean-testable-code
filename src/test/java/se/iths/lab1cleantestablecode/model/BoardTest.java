package se.iths.lab1cleantestablecode.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @DisplayName("Check the third generation of glider.")
    void threeCellTest() {
        board.getBoardOfCells()[2][3].setAlive(true);
        board.getBoardOfCells()[3][4].setAlive(true);
        board.getBoardOfCells()[4][2].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[2][3].isAlive());
        assertFalse(board.getBoardOfCells()[3][4].isAlive());
        assertFalse(board.getBoardOfCells()[4][2].isAlive());
    }

    @Test
    @DisplayName("Check the fourth generation of glider.")
    void fourCellTest() {
        board.getBoardOfCells()[2][3].setAlive(true);
        board.getBoardOfCells()[3][4].setAlive(true);
        board.getBoardOfCells()[4][2].setAlive(true);
        board.getBoardOfCells()[4][3].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[2][3].isAlive());
        assertTrue(board.getBoardOfCells()[3][4].isAlive());
        assertFalse(board.getBoardOfCells()[4][2].isAlive());
        assertTrue(board.getBoardOfCells()[4][3].isAlive());
    }

    @Test
    @DisplayName("Check the fifth generation of glider.")
    void fiveCellTest() {
        board.getBoardOfCells()[2][3].setAlive(true);
        board.getBoardOfCells()[3][4].setAlive(true);
        board.getBoardOfCells()[4][2].setAlive(true);
        board.getBoardOfCells()[4][3].setAlive(true);
        board.getBoardOfCells()[4][4].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[2][3].isAlive());
        assertTrue(board.getBoardOfCells()[3][4].isAlive());
        assertFalse(board.getBoardOfCells()[4][2].isAlive());
        assertTrue(board.getBoardOfCells()[4][3].isAlive());
        assertTrue(board.getBoardOfCells()[4][4].isAlive());
    }

    @Test
    @DisplayName("Check the sixth generation of glider.")
    void sixCellTest() {
        board.getBoardOfCells()[2][3].setAlive(true);
        board.getBoardOfCells()[3][4].setAlive(true);
        board.getBoardOfCells()[4][2].setAlive(true);
        board.getBoardOfCells()[4][3].setAlive(true);
        board.getBoardOfCells()[4][4].setAlive(true);
        board.getBoardOfCells()[5][3].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[2][3].isAlive());
        assertTrue(board.getBoardOfCells()[3][4].isAlive());
        assertTrue(board.getBoardOfCells()[4][2].isAlive());
        assertFalse(board.getBoardOfCells()[4][3].isAlive());
        assertTrue(board.getBoardOfCells()[4][4].isAlive());
        assertTrue(board.getBoardOfCells()[5][3].isAlive());
        assertTrue(board.getBoardOfCells()[3][2].isAlive());
    }

    @Test
    @DisplayName("Check the seventh generation of glider.")
    void sevenCellTest() {
        board.getBoardOfCells()[2][3].setAlive(true);
        board.getBoardOfCells()[3][4].setAlive(true);
        board.getBoardOfCells()[4][2].setAlive(true);
        board.getBoardOfCells()[4][3].setAlive(true);
        board.getBoardOfCells()[4][4].setAlive(true);
        board.getBoardOfCells()[5][3].setAlive(true);
        board.getBoardOfCells()[3][2].setAlive(true);

        board.newGeneration();

        assertTrue(board.getBoardOfCells()[2][3].isAlive());
        assertTrue(board.getBoardOfCells()[3][4].isAlive());
        assertTrue(board.getBoardOfCells()[4][2].isAlive());
        assertFalse(board.getBoardOfCells()[4][3].isAlive());
        assertTrue(board.getBoardOfCells()[4][4].isAlive());
        assertTrue(board.getBoardOfCells()[5][3].isAlive());
        assertTrue(board.getBoardOfCells()[3][2].isAlive());
    }

    @Test
    @DisplayName("Count the neighbouring cell.")
    void countNeighbourTest(){
        board.countNeighboursForCell(1, 2);
        board.countNeighboursForCell(2, 3);

        assertFalse(board.getBoardOfCells()[1][2].isAlive());
    }
}
