package org.zcj.factroy.mulitfactory;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
