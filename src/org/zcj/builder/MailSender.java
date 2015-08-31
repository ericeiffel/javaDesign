package org.zcj.builder;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
