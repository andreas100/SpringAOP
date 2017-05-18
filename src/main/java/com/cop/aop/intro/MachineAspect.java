package com.cop.aop.intro;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by surfgod on 17/02/17.
 */
@Component
@Aspect
public class MachineAspect {

    @DeclareParents(value = "com.cop.aop.intro.*", defaultImpl = com.cop.aop.intro.Machine.class)
    private IMachine machine;

    @Around("within(com.cop.aop..*)")
    public void runMachine(ProceedingJoinPoint jp) {

        System.out.println("Running...");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("...Completed");
    }
}
