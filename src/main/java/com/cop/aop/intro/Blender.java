package com.cop.aop.intro;

import org.springframework.stereotype.Component;

/**
 * Created by surfgod on 17/02/17.
 */
@Component
public class Blender {
    public void blend() {
        System.out.println("Blending");
    }
}
