package se.iths.lab1cleantestablecode.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.lab1cleantestablecode.view.BoardView;

public class BoardControllerTest {

    private BoardController controller;
    private BoardView boardView;

    @BeforeEach
    void init(){
        controller = new BoardController();
    }


}
