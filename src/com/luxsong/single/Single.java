package com.luxsong.single;

import com.luxsong.utils.DataPool;

public class Single {
    public volatile static DataPool dataPool = null;
    public static DataPool getDataPoolInstance(){
        if(null == dataPool){
            synchronized(Single.class){
                if(null == dataPool){
                    dataPool = new DataPool();
                }
            }
        }
        return dataPool;
    }
}
