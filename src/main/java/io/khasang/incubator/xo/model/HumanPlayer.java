package io.khasang.incubator.xo.model;

public class HumanPlayer implements Player {
    private String name;
    private Figure figure;

    public HumanPlayer(String name, Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Figure getFigure() {
        return figure;
    }
}
