package io.khasang.incubator.xo.model;

public class SimpleFigure implements Figure {
    private String shape;

    public SimpleFigure(String shape) {
        this.shape = shape;
    }

    @Override
    public String getShape() {
        return shape;
    }
}
