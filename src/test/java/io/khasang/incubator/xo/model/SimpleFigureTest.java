package io.khasang.incubator.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleFigureTest {
    @Test
    public void getShape() throws Exception {
        Figure figure = new SimpleFigure("X");
        assertNotNull("Object Init");
        assertEquals("Same Shape", "X", figure.getShape());
    }
}