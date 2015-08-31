package org.zcj.memento;

/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
