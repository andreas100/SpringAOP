package com.cop.aop.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by surfgod on 17/02/17.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-context.xml");

        Blender blender = (Blender) context.getBean("blender");
        blender.blend();

        ((IMachine)blender).start(5);

        Fan fan = (Fan) context.getBean("fan");
        fan.activate(5);

        ((IMachine)fan).start(10);

        context.close();
    }
}
