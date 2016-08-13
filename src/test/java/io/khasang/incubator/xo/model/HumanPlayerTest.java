package io.khasang.incubator.xo.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanPlayerTest {
    private HumanPlayer humanPlayer;
    public static final String NAME = "Name";
    public static final String SHAPE = "X";

    @Before
    public void init() {
        humanPlayer = new HumanPlayer(HumanPlayerTest.NAME, new SimpleFigure(HumanPlayerTest.SHAPE));
    }

    @Test
    public void getName() throws Exception {
        assertNotNull("Object creation", humanPlayer);
        assertEquals("Same Name", HumanPlayerTest.NAME, humanPlayer.getName());
    }

    @Test
    public void getFigure() throws Exception {
        assertNotNull("Object creation", humanPlayer);
        assertEquals("Same Figure Shape", HumanPlayerTest.SHAPE, humanPlayer.getFigure().getShape());
    }
}