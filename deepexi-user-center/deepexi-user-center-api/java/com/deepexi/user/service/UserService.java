package com.deepexi.user.service;

import com.deepexi.user.domain.eo.Cuser;
import com.deepexi.util.pageHelper.PageBean;

public interface UserService {

    PageBean getUserList(Integer page, Integer size);

    Object getUserById(String id);

    boolean createUser(Cuser user);

    boolean deleteUserById(String id);

    boolean updateUser(String id, Cuser user);

}
