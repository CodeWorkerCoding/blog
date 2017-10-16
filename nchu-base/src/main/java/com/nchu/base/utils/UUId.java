package com.nchu.base.utils;

import java.util.UUID;

/**
 * UUId工具类
 * Created by fujianjian on 2017/10/16.
 */
public final class UUId {

    public static String getUUId() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }
}
