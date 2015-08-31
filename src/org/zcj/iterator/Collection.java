package org.zcj.iterator;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public interface Collection {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
