package org.zcj.prototype;

import java.io.*;
import java.io.Serializable;


/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Prototype implements Cloneable,Serializable {


    private static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject obj;

    /* ǳ���� */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /* ��� */
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* д�뵱ǰ����Ķ������� */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* �������������������¶��� */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}

