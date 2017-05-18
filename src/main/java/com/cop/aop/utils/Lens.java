package com.cop.aop.utils;

import org.springframework.stereotype.Component;

/**
 * Created by surfgod on 16/02/17.
 */
@Component("lens")
public class Lens {

    public void zoom(int factor) {
        System.out.println("Zooming by factor: " + factor);
    }

}
