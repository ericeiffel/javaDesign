package org.zcj.iterator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public interface Iterator {
    //ǰ��
    public Object previous();

    //����
    public Object next();
    public boolean hasNext();

    //ȡ�õ�һ��Ԫ��
    public Object first();
}
