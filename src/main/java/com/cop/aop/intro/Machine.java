package com.cop.aop.intro;

/**
 * Created by surfgod on 17/02/17.
 */
public class Machine implements IMachine {
    public void start(int delay) {
        System.out.println("Machine starting with delay of " + delay);
    }
}
