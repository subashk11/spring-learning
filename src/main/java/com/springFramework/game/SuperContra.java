package com.springFramework.game;

//implementing the controls from the interface for loose coupling.
public class SuperContra implements GamingControls{
    public void up(){
        System.out.println("climb up");
    }

    public void down(){
        System.out.println("dodge down");
    }

    public void left(){
        System.out.println("turn back");
    }

    public void right(){
        System.out.println("shooot");
    }
}
