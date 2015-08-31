package org.zcj.factroy.abstractfactory;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
