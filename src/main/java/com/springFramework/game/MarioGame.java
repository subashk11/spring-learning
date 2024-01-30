package com.springFramework.game;


//implementing the controls from the interface for loose coupling.
public class MarioGame implements GamingControls{

    //add standard game actions

    public void up(){
        System.out.println("jumping");
    }

    public void down(){
        System.out.println("into the secret room");
    }

    public void left(){
        System.out.println("turning left");
    }

    public void right(){
        System.out.println("turning right");
    }
}
