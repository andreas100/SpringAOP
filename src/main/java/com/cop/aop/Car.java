package com.cop.aop;

import org.springframework.stereotype.Component;

/**
 * Created by surfgod on 17/02/17.
 */
@Component
public class Car {

    public void start() {
        System.out.println("Car starting");
    }
}
