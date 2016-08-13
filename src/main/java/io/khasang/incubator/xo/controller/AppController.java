package io.khasang.incubator.xo.controller;

import io.khasang.incubator.xo.model.HumanPlayer;
import io.khasang.incubator.xo.model.Player;
import io.khasang.incubator.xo.view.ConsoleGameView;
import io.khasang.incubator.xo.view.GameView;

public class AppController {
    public static void main(String[] args) {
        new AppController().run();
    }

    public void run() {
        GameView gameView = new ConsoleGameView();
        //Player player1 = new HumanPlayer();
    }
}
