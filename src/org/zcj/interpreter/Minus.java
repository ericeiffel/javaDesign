package org.zcj.interpreter;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
