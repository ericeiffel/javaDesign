package org.zcj.command;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Invoker{

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }

}
