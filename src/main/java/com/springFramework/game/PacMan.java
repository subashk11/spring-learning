package com.springFramework.game;

//implementing the controls from the interface for loose coupling.
public class PacMan implements GamingControls{
    public void up(){
        System.out.println("moving up!");
    }

    public void down(){
        System.out.println("moving down!");
    }

    public void left(){
        System.out.println("moving left!");
    }

    public void right(){
        System.out.println("moving right!");
    }
}
