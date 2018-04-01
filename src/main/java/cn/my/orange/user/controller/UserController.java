package cn.my.orange.user.controller;

import cn.my.orange.user.entity.User;
import cn.my.orange.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/RequestTest")
    public String TestString(){
        return "this is a test string. Time:2017-10-29 20:42:00";
    }

    @RequestMapping(value = "/{id}", method= RequestMethod.GET)
    public User getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }
}
