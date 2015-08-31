package org.zcj.mediator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class User1 extends User {
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
