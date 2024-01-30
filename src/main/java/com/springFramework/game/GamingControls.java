package com.springFramework.game;

public interface GamingControls {

    //create a common interface and all the games can implement their own controls from here.
    void up();
    void down();
    void left();
    void right();
}
