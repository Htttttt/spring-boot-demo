package com.facebank.springMybatis.Mapper;

import com.facebank.springMybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    /*查询所有*/
    @Select("select * from User")
    List<User> findAllUser();

    /*更改信息*/
    @Update("update user Set name=#{name},age=#{age} where id=#{id}")
    int updateUser(User user);
}
