package com.CIDP.Mapper;

import com.CIDP.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper  {
    @Select("select * from user")
    List<User> SelectAll();
}
