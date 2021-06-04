package com.example.demo.mapper;


import com.example.demo.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {


    List<User> listUser(@Param("userName") String userName);


    void insertUser(User user);

    void delete(@Param("userId")String userId);

    void update(User user);
}
