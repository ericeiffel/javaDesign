package org.zcj.builder;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
        builder.buildfunc();
    }
}
