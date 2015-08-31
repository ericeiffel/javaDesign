package org.zcj.decorator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class DecoratorTest {

    public static void main(String[] args){
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
