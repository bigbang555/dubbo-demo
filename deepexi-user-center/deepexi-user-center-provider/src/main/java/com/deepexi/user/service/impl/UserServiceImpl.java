package com.deepexi.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.user.domain.eo.User;
import com.deepexi.user.mapper.UserMapper;
import com.deepexi.user.service.UserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUsers();
    }
}
