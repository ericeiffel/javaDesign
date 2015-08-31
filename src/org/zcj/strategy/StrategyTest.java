package org.zcj.strategy;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
