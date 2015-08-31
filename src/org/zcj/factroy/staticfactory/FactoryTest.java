package org.zcj.factroy.staticfactory;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail(); ;
        sender.Send();
    }
}
