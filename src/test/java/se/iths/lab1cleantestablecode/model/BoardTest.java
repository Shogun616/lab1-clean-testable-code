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
    @DisplayName("Check the next generation of gliders.")
    void newGenerationForGliderTest(){
        board.getBoarOfCells()[2][3].setAlive(true);
        board.getBoarOfCells()[3][4].setAlive(true);
        board.getBoarOfCells()[4][2].setAlive(true);
        board.getBoarOfCells()[4][3].setAlive(true);
        board.getBoarOfCells()[4][4].setAlive(true);

        board.newGeneration();
    }
}
