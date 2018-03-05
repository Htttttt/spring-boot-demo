package com.facebank.springMybatis.serviceimpl;

import com.facebank.springMybatis.Mapper.UserMapper;
import com.facebank.springMybatis.domain.User;
import com.facebank.springMybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
