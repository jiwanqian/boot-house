package com.etoak.service;

import com.etoak.bean.User;

public interface UserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
