package org.zcj.observer;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public interface Subject {
    /*���ӹ۲���*/
    public void add(Observer observer);

    /*ɾ���۲���*/
    public void del(Observer observer);

    /*֪ͨ���еĹ۲���*/
    public void notifyObservers();

    /*����Ĳ���*/
    public void operation();
}
