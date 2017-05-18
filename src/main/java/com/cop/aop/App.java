package com.cop.aop;

import com.cop.aop.utils.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by surfgod on 16/02/17.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-context.xml");

        Camera camera = (Camera) context.getBean("camera");
        Car car = (Car) context.getBean("car");

        camera.snap();
        camera.snap(9);
        camera.snap(9.3);
        camera.snap(5,9.3);
        camera.snap("Andrew Martin");

        camera.snapCar(car, "andy's car");

        car.start();


        context.close();
    }
}
