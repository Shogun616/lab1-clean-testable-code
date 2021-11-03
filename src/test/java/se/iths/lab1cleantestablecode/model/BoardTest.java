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
    @DisplayName("Check that one cell has no neighbour.")
    void oneCellTest() {
        board.getBoardOfCells()[2][3].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[2][3].isAlive());
    }

    @Test
    @DisplayName("Check that two cell has no neighbour.")
    void twoCellTest() {
        board.getBoardOfCells()[3][4].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[3][4].isAlive());
    }

    @Test
    @DisplayName("Check that three cell has no neighbour.")
    void threeCellTest() {
        board.getBoardOfCells()[4][2].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[4][2].isAlive());
    }

    @Test
    @DisplayName("Check that four cell has no neighbour.")
    void fourCellTest() {
        board.getBoardOfCells()[4][3].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[4][3].isAlive());
    }

    @Test
    @DisplayName("Check that five cell has no neighbour.")
    void fiveCellTest() {
        board.getBoardOfCells()[4][4].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[4][4].isAlive());
    }

    @Test
    @DisplayName("Check that five cell has no neighbour.")
    void sixCellTest() {
        board.getBoardOfCells()[5][3].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[5][3].isAlive());
    }

    @Test
    @DisplayName("Check that five cell has no neighbour.")
    void sevenCellTest() {
        board.getBoardOfCells()[3][2].setAlive(true);

        board.newGeneration();

        assertFalse(board.getBoardOfCells()[3][2].isAlive());
    }

    @Test
    @DisplayName("Check neighbour position.")
    void countNeighbourTest(){
        board.getBoardOfCells()[1][2].setAlive(true);

        board.newGeneration();

        board.countNeighboursForCell(1, 2);

        assertFalse(board.getBoardOfCells()[1][2].isAlive());
    }

}
