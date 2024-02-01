package com.springFramework.springApplicationBasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

//Reacords are used to manage the current state/value of the object to store and retrieve it
record Profile(String name, int age){};
record Address(String district, int pinCode){};

//configuration is used to configure the container for the spring application.
@org.springframework.context.annotation.Configuration
public class Configuration {

    //beans are used to set the methods/objects that are maintained by the spring container.
    @Bean
    public String name(){
        return "user1";
    }

    @Bean
    public int age(){
        return 23;
    }

    @Bean
    public Address address(){
        var address = new Address("123, 2nd Street", 101011);
        return address;
    }

    //@primary is used to mark a bean as a default bean to be used
    // when there are multiple beans with similar name
    @Bean
    @Primary
    public Profile person(){
        var person = new Profile("test1", 20);
        return person;
    }

    //TO name a bean with custom name
    @Bean(name= "customName")
    public Profile person1(String name, int age){
        var person = new Profile(name, age);
        return person;
    }

    //to set the record values we can pass it through the existing beans
    @Bean
    public Profile person2(){
        var person = new Profile(name(), age());
        return person;
    }
}
