package com.css.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: javazhou
 * @Date: 2020/3/11 011
 * @Description: com.css.controller
 * @version: 1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String index(@PathVariable("page") String page){
        return page;
    }
}
