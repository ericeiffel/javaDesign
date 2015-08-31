package org.zcj.proxy;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
