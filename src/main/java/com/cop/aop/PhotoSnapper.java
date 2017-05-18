package com.cop.aop;

/**
 * Created by surfgod on 17/02/17.
 */
public interface PhotoSnapper {

    void snap();

    void snap(int exposure);

    String snap(String name);
}
