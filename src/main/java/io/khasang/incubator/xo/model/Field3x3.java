package io.khasang.incubator.xo.model;

public class Field3x3 implements Field {
    private Figure[][] figures;
    private final Point maxPoint;
    private final Point minPoint;
    public static final int MAX = 3;


    public Field3x3() {
        this.figures = new SimpleFigure[MAX][MAX];
        maxPoint = new Point(MAX - 1, MAX - 1);
        minPoint = new Point(0, 0);
    }

    @Override
    public Figure getFigure(Point p) {
        return figures[p.getX()][p.getY()];
    }

    @Override
    public boolean setFigure(final Figure figure, final Point point) {
        if (getFigure(point) != null) {
            return false;
        }
        figures[point.getX()][point.getY()] = figure;
        return true;
    }

    @Override
    public Point getMinPoint() {
        return minPoint;
    }

    @Override
    public Point getMaxPoint() {
        return maxPoint;
    }
}
