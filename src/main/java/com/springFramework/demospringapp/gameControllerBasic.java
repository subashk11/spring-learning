package com.springFramework.demospringapp;

import com.springFramework.game.GameRunner;
import com.springFramework.game.MarioGame;

public class gameControllerBasic {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);

        gameRunner.run();
    }
}
