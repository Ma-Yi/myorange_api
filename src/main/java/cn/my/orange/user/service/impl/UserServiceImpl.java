package cn.my.orange.user.service.impl;

import cn.my.orange.user.dao.UserMapper;
import cn.my.orange.user.entity.User;
import cn.my.orange.user.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User getById(Long id) {
        return userMapper.getById(id);
    }
}
