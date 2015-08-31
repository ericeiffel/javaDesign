package org.zcj.templatemethod;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class TemplateTest {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
