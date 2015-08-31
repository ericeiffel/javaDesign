package org.zcj.factroy.abstractfactory;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
