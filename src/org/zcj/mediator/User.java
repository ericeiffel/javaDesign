package org.zcj.mediator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
