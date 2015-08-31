package org.zcj.chainofresponsibility;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
