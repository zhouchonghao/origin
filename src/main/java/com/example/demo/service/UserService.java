package com.example.demo.service;


import com.example.demo.mapper.UserMapper;
import com.example.demo.models.ResponseData;
import com.example.demo.models.User;

import com.example.demo.requestModel.PageResponse;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public ResponseData insertUser(User user) {
        String userId=(UUID.randomUUID().toString());
        user.setUserId(userId);
        userMapper.insertUser(user);
        return new ResponseData();
    }

    public ResponseData listUser(int pageSize,int pageIndex,String name){
        ResponseData responseData = new ResponseData();
        PageHelper.startPage(pageIndex, pageSize);
        List<User> users = userMapper.listUser(name);
        PageInfo pageInfo = new PageInfo(users);
        responseData.setData(pageInfo.getList());
        responseData.setTotal(pageInfo.getTotal());
        responseData.setPageNumber(pageIndex);
        return responseData;
    }

    public ResponseData update(User user){
        userMapper.update(user);
        return new ResponseData();
    }

    public ResponseData delete(String userId){
        userMapper.delete(userId);
        return new ResponseData();
    }

}