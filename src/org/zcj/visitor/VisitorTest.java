package org.zcj.visitor;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class VisitorTest {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
