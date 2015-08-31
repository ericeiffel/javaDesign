package org.zcj.factroy.staticfactory;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
