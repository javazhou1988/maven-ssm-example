package com.css.service.impl;

import com.css.mapper.UserMapper;
import com.css.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.css.service.UserService;

import java.util.List;

/**
 * @Author: javazhou
 * @Date: 2020/3/11 011
 * @Description: service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {

        this.userMapper.insertUser(user);
    }

    @Override
    public List<User> selectUserAll() {
        return this.userMapper.selectUserAll();
    }
}
