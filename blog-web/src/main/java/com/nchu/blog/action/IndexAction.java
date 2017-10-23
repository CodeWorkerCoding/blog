package com.nchu.blog.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 主控制器
 * @author fujianjian
 * @project blog
 * @date 2017/10/17 20:45
 */
@Controller
public class IndexAction {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
