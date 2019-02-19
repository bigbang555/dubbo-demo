package com.deepexi.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.user.domain.eo.Cuser;
import com.deepexi.user.mapper.UserMapper;
import com.deepexi.user.service.UserService;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public PageBean getUserList(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Cuser> userTasks = userMapper.getUserList();
        return new PageBean<>(userTasks);
    }

    @Override
    public Object getUserById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public boolean createUser(Cuser user) {
        return userMapper.insert(user) > 0 ? true : false;
    }

    @Override
    public boolean deleteUserById(String id) {
        return userMapper.deleteById(id) > 0 ? true : false;
    }

    @Override
    public boolean updateUser(String id, Cuser user) {
        Cuser originUser = userMapper.selectById(id);
        if (user.getEmail() != null) {
            originUser.setEmail(user.getEmail());
        }
        if (user.getNickName() != null) {
            originUser.setNickName(user.getNickName());
        }
        if (user.getUserNumber() != null) {
            originUser.setUserNumber(user.getUserNumber());
        }
        if (user.getUserName() != null) {
            originUser.setUserName(user.getUserName());
        }
        return userMapper.updateById(originUser) > 0 ? true : false;
    }

}
