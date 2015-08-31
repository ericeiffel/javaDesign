package org.zcj.adapter;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class AdapterTest_New {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
