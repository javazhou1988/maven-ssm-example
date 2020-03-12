package com.css.mapper;

import com.css.model.User;

import java.util.List;

/**
 * @Author: javazhou
 * @Date: 2020/3/10 010
 * @Description: com.css.mapper
 * @version: 1.0
 */
public interface UserMapper {
    void insertUser(User user);

    List<User> selectUserAll();
}
