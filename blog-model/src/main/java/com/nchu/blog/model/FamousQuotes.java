package com.nchu.blog.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 名人名言
 *
 * @author fujianjian
 * @project blog
 * @date 2017/10/25 15:31
 */
@Getter
@Setter
public class FamousQuotes extends BaseEntity {

    /**
     * 作者
     */
    private String authorName;

    /***
     * 作者编号
     */
    private String authorId;

    /**
     * 名言
     */
    private String quotes;

    /**
     * 点赞数
     */
    private Integer thumbup;

    public FamousQuotes() {
    }

    public FamousQuotes(String authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

}
