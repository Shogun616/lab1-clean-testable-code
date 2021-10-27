package se.iths.lab1cleantestablecode.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    private Cell cell;

    @BeforeEach
    void init(){
        cell = new Cell();
    }

    @Test
    @DisplayName("The new cell is dead.")
    void isAliveTest(){
        assertFalse(cell.isAlive(), "The new cell should be dead.");
    }

}
