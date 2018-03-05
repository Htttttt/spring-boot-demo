package com.facebank.springMybatis.controller;

import com.facebank.springMybatis.domain.User;
import com.facebank.springMybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/findAllUser")
    @ResponseBody
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @PutMapping("/updateUser")
    @ResponseBody
    public String updateUser(User user){
        int row=userService.updateUser(user);
        if(row>0){
            return "更新成功";
        }else{
            return "更新失败";
        }
    }
}
