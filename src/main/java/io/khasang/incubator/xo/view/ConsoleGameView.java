package io.khasang.incubator.xo.view;

import java.util.Scanner;

public class ConsoleGameView implements GameView {
    @Override
    public String enterName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
