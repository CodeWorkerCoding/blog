package com.nchu.blog.action;

import com.nchu.blog.model.FamousQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Thymeleaf 模板页面控制器
 * @author fujianjian
 * @project blog
 * @date 2017/10/25 15:42
 */
@Controller
@RequestMapping("/thymeleaf/")
public class ThymeleafAction {

    @GetMapping("geet")
    public String thymeleafGeet(Model model) {
        model.addAttribute("msg", "this is my first thymeleaf page");
        return "/thymeleaf/geet";
    }

    @GetMapping("list")
    public String thymeleafList(Model model) {
        List<FamousQuotes> list = new ArrayList<FamousQuotes>(){{
            add(new FamousQuotes("1", "jianjian"));
            add(new FamousQuotes("2", "xxccc"));
            add(new FamousQuotes("3", "杰伦"));
            add(new FamousQuotes("4", "尹相杰"));
        }};
        model.addAttribute("list", list);
        return "/thymeleaf/list";
    }

}
