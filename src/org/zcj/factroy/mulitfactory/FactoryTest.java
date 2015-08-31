package org.zcj.factroy.mulitfactory;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}
