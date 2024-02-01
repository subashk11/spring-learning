package com.springFramework.caculatorExcercise.calculate;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CalculateController {

    DataService dataService;

    public CalculateController(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.getData()).max().orElse(0);
    }
}
