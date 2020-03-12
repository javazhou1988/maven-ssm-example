package com.css.service;

import com.css.model.User;

import java.util.List;

/**
 * @Author: javazhou
 * @Date: 2020/3/11 011
 * @Description: service
 * @version: 1.0
 */
public interface UserService {

    void addUser(User user);

    List<User> selectUserAll();
}
