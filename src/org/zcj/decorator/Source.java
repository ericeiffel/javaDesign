package org.zcj.decorator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
