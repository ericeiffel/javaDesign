package org.zcj.adapter;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
