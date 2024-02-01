package com.springFramework.demospringapp;


import com.springFramework.game.GameRunner;
import com.springFramework.game.GamingControls;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Rename the gameController class as a spring configuration clas
@Configuration
@ComponentScan("com.springFramework.game")
public class gameControllerBasic {
    public static void main(String[] args) {

        //create the context for the spring
        var context = new AnnotationConfigApplicationContext(gameControllerBasic.class);

        //call the bean
        //context.getBean(GamingControls.class).up();
        context.getBean(GameRunner.class).run();
    }
}
