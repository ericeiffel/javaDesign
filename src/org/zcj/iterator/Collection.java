package org.zcj.iterator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public interface Collection {

    public Iterator iterator();

    /*ȡ�ü���Ԫ��*/
    public Object get(int i);

    /*ȡ�ü��ϴ�С*/
    public int size();
}
