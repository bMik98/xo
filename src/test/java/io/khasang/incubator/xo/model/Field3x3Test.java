package io.khasang.incubator.xo.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class Field3x3Test {
    private Field field;

    @Before
    public void setUp() throws Exception {
        field = new Field3x3();
    }

    @Test
    public void getSetFigureTest() {
        Point point0 = new Point(0, 0);
        Figure figure = field.getFigure(point0);
        assertNull("Get Empty Cell From the New Field", figure);
        boolean result = field.setFigure(new SimpleFigure("X"), point0);
        assertTrue("set was successful", result);
        assertEquals("check Shape", "X", field.getFigure(point0).getShape());
        result = field.setFigure(new SimpleFigure("O"), point0);
        assertFalse("set have to be rejected", result);
        assertNotEquals("is not set", "O", field.getFigure(point0).getShape());
    }
}