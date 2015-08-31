package org.zcj.bridge;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
