package com.CIDP.Service;

import com.CIDP.Mapper.UserMapper;
import com.CIDP.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> SelectAll() {
        return userMapper.SelectAll();
    }
}
