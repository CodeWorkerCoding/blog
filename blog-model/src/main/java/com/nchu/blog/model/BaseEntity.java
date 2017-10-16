package com.nchu.blog.model;

import java.util.Date;

/**
 * 基础模型类
 * Created by fujianjian on 2017/10/16.
 */
public abstract class BaseEntity {

    private String id;

    private Date createdTime;

    private Date modifiedTime;

    private String createUser;

    private String updateUser;
}
