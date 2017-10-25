package com.nchu.blog.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 博文模型
 * Created by fujianjian on 2017/10/16.
 */
@Getter
@Setter
public class Blog extends BaseEntity {

    private String blogName;

    private String blogPath;
}
