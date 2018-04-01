package cn.my.orange.user.dao;

import cn.my.orange.user.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    User getById(Long id);
}
