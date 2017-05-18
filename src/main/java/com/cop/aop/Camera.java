package com.cop.aop;

import org.springframework.stereotype.Component;

/**
 * Created by surfgod on 16/02/17.
 */
@Component("camera")
public class Camera implements PhotoSnapper, Machine {

//    public Camera() {
//        System.out.println("Hello from Camera constructor");
//    }

    @Deprecated
    public void snap() {
        System.out.println("SNAP!!!");
    }

    public void snap(int exposure) {
        System.out.println("SNAP with " + exposure);
    }

    public void snap(double aperture) {
        System.out.println("SNAP with " + aperture);
    }

    public void snap(int exposure, double aperture) {
        System.out.println("SNAP with " + exposure + " and shutter of "+aperture);
    }

    public String snap(String name) {
        System.out.println("SNAP with " + name);
        return name;
    }

    public void snapCar(Car car, String name) {
        System.out.println("Snapping car named: " + name + "...");
    }

}
