package org.zcj.observer;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class MySubject extends AbstractSubject{
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
