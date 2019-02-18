package com.deepexi.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.user.domain.eo.User;
import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> getAllUsers();

}
