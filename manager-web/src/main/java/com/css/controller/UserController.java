package com.css.controller;

import com.css.model.User;
import com.css.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: javazhou
 * @Date: 2020/3/11 011
 * @Description: com.css.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user) {
        userService.addUser(user);
        return "ok";
    }

    @RequestMapping(value = "/doGet/{userId}", method = RequestMethod.GET)
    public String doGet(@PathVariable String userId) {
        System.out.println("doGet..." + userId);
        return "ok";
    }

    @RequestMapping(value = "/doPost", method = RequestMethod.POST)
    public String doPost(User user) {
        System.out.println("doPost..." + user);
        return "ok";
    }

    @RequestMapping(value = "/doDelete", method = RequestMethod.DELETE)
    public String doDelete(String userId) {
        System.out.println("doDelete ..." + userId);
        return "ok";
    }

    @RequestMapping(value = "/doPut", method = RequestMethod.PUT)
    public String doPut(User user) {
        System.out.println("doPut..." + user);
        return "ok";
    }
}
