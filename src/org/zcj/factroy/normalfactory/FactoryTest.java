package org.zcj.factroy.normalfactory;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
