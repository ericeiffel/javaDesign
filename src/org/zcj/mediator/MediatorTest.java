package org.zcj.mediator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
