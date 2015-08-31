package org.zcj.observer;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
