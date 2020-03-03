package com.example.springbootmybatis.service;

import com.example.springbootmybatis.model.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);

}
