package se.iths.lab1cleantestablecode.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    }
}
