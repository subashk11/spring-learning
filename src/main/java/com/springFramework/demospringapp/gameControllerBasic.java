package com.springFramework.demospringapp;

import com.springFramework.game.GameRunner;
import com.springFramework.game.MarioGame;
import com.springFramework.game.PacMan;
import com.springFramework.game.SuperContra;

public class gameControllerBasic {

    public static void main(String[] args) {

        //her the GameRunner does not depend on the game class as the game changes the gameRunner class is independent of the game.
        System.out.println("first game : mario game");
        var game = new MarioGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

        System.out.println("\nSecond game : supercontra game");
        var game2 = new SuperContra();
        gameRunner = new GameRunner(game2);
        gameRunner.run();

        System.out.println("\nthird game : pac-man game");
        var game3 = new PacMan();
        gameRunner = new GameRunner(game3);
        gameRunner.run();
    }
}
