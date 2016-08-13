package io.khasang.incubator.xo.model;

public interface Field {
    Figure getFigure(final Point point);

    boolean setFigure(final Figure figure, final Point point);

    Point getMinPoint();

    Point getMaxPoint();
}
