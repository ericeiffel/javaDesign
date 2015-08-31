package org.zcj.visitor;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject:"+sub.getSubject());
    }
}
