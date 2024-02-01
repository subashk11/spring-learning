package com.springFramework.caculatorExcercise.calculate;

import org.springframework.stereotype.Component;

@Component
public class mongoDbData implements DataService{

    public int[] getData(){
        return new int[]{1,2,3};
    }
}
