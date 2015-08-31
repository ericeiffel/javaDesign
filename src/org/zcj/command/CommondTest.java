package org.zcj.command;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class CommondTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
