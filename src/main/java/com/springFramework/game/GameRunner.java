package com.springFramework.game;

public class GameRunner {

    //call the marioGame

    GamingControls game;

    //constructor to set the game
    //now the constructor can set the game based on the interface.
    public GameRunner(GamingControls game) {
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
