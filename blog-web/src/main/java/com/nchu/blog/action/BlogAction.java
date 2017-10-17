package com.nchu.blog.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fujianjian on 2017/10/17.
 */
@Controller
@RequestMapping("/blog/")
public class BlogAction {

    @GetMapping("list")
    public String list() {
        return "/blog/list";
    }
}
