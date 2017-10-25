package com.nchu.blog.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 博文标签模型
 * Created by fujianjian on 2017/10/16.
 */
@Setter
@Getter
public class BlogTag extends BaseEntity {

    private String tagName;

    private String tagCode;

}
