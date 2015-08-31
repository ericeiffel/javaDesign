package org.zcj.adapter;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
