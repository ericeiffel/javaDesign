package org.zcj.builder;

import java.util.ArrayList;
import java.util.*;
/**
 * Created by hzzhichenjiao on 2015/8/31.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }

    public void buildfunc(){

        for(Sender ls:list){
            ls.Send();
        }
    }
}
