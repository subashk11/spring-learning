package com.springFramework.demospringapp;

public class gameControllerBasic {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);

        gameRunner.run();
    }
}
