package com.springFramework.game;

public class GameRunner {

    //call the marioGame

    MarioGame game;

    //constructor to run the game
    public GameRunner(MarioGame game) {
        this.game = game;
    }

    //method to run the game
    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
