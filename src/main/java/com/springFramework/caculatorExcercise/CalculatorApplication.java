package com.springFramework.caculatorExcercise;

import com.springFramework.caculatorExcercise.calculate.CalculateController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//making this as a configuration.
@Configuration
@ComponentScan("com.springFramework.caculatorExcercise.calculate")
public class CalculatorApplication {
    public static void main(String[] args) {

        //1.Create a context for the application.
        var context = new AnnotationConfigApplicationContext(CalculatorApplication.class);

        //call the bean from the caculaterunner component.
        System.out.println(context.getBean(CalculateController.class).findMax());
    }
}
