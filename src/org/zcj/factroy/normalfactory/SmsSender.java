package org.zcj.factroy.normalfactory;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
