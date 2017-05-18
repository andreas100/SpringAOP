package com.cop.aop.intro;

import org.springframework.stereotype.Component;

/**
 * Created by surfgod on 17/02/17.
 */
@Component
public class Fan {
    public void activate(int level) {
        System.out.println("Fan running at level " + level);
    }
}
