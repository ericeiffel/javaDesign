package org.zcj.visitor;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
