package org.zcj.visitor;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }

}
