package com.wlh.cloud.api.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class R<T> implements Serializable {

    private String msg;
    private int code;
    private T data;

    public R() {}


    public static <T> R<T> success(T t) {
        R<T> r = new R<>();
        r.code = 200;
        r.data = t;
        r.msg = "success";
        return r;
    }

    public static <T> R<T> success(T t, String msg) {
        R<T> r = new R<>();
        r.code = 200;
        r.data = t;
        r.msg = msg;
        return r;
    }

    public static R fail(String msg) {
        R r = new R();
        r.code = 200;
        r.msg = msg;
        return r;
    }

    public static R fail() {
        R r = new R();
        r.code = 200;
        r.msg = "failed";
        return r;
    }



}
