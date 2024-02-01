package com.springFramework.springApplicationBasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBasics {

    public static void main(String[] args) {
        //1.Create the configuration for the spring application and declared the beans

        //2.Create the context for the configuration file
        var context = new AnnotationConfigApplicationContext(Configuration.class);

        //3.To get the bean values from the context
        System.out.println(context.getBean("name"));

        //to get the record values
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

        //Multiple ways to call a bean
        // 1. by the name of type.
        System.out.println(context.getBean(Profile.class));
        System.out.println(context.getBean(Address.class));

        // 2. by the custom name of the bean
        System.out.println(context.getBean("person", Profile.class));
        System.out.println(context.getBean("address", Address.class));


        //To set the values of a record by passing values as an arguments
        // Example: for calling a bean by a custom name.
        System.out.println(context.getBean("customName"));

        //To set the values of a record by using exisitng bean values
        System.out.println(context.getBean("person2"));

        //4.To close the context
        context.close();
    }
}
