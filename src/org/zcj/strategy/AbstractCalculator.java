package org.zcj.strategy;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class AbstractCalculator {
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}