package com.springFramework.caculatorExcercise.calculate;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class mySqlData implements DataService{

    public int[] getData(){
        return new int[]{11,22,33};
    }
}
