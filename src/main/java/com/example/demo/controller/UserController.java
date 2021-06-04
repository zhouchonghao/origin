package com.example.demo.controller;


import com.example.demo.models.ResponseData;
import com.example.demo.models.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseData delete(@RequestParam String userId) {
        return userService.delete(userId);

    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData update(User user) {
        return userService.update(user);

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseData insert(User user) {
        return userService.insertUser(user);
    }

    @RequestMapping(value ="/listUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData listUser(@RequestParam(required =false,defaultValue = "5") int pageSize
            ,@RequestParam(required = false,defaultValue = "1") int pageIndex,@RequestParam(required = false) String userName) {
        return userService.listUser(pageSize,pageIndex,userName);
    }

}
