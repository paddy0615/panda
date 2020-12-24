package com.example.panda.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回前端类
 */
@Getter
@Setter
public class RestResultModule {
    private Map obj;
    private String msg;
    private String attributes;
    private boolean success;

    public RestResultModule(){
        this.success = true;
        this.msg = "";
        this.attributes = "";
        obj = new HashMap<String, Object>();
    }

    public void putObj(String key, Object value){
        obj.put(key, value);
    }

    public void removeObj(String key){
        obj.remove(key);
    }

}
