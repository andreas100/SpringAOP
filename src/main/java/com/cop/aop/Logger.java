package com.cop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by surfgod on 16/02/17.
 */
@Aspect
@Component("logger")
public class Logger {

    @Pointcut("args(exposure, aperture)")
    public void somePointcut(int exposure, double aperture) {
    }

    @Pointcut("target(com.cop.aop.Camera)")
    public void targetCamera() {
    }

    @Pointcut("within(com.cop.aop.*) && @annotation(Deprecated)")
    public void targetCombinedAdvice() {
    }

    @Before("targetCamera() && somePointcut(exposure, aperture))")
    public void withinDemoAdvice(int exposure, double aperture) {
        System.out.println("Before Advice");
        System.out.printf("Exposure %d, aperture %.2f\n", exposure, aperture);
    }

//    @After("within(com.cop.aop.*) && @annotation(Deprecated)")
//    public void someAfterAdvice() {
//        System.out.println("After advice running!!!!!!!!!!!");
//    }
}
