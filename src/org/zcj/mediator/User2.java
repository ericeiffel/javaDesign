package org.zcj.mediator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class User2 extends User {
    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
