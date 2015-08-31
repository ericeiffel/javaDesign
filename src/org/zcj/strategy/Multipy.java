package org.zcj.strategy;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Multipy extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
