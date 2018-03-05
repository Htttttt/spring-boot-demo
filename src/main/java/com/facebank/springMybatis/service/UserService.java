package com.facebank.springMybatis.service;

import com.facebank.springMybatis.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
    int updateUser(User user);
}
