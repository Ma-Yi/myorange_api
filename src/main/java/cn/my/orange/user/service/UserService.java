package cn.my.orange.user.service;

import cn.my.orange.user.entity.User;

public interface UserService {

    /**
     * 根据id获取用户
     * @param id 用户id
     * @return 用户信息
     */
    User getById(Long id);
}
