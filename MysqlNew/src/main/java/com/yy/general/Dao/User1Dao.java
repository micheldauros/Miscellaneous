package com.yy.general.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.general.Entity.User1;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

//@Mapper
public interface User1Dao extends BaseMapper<User1> {
    @Results(id="userMap",value = {
            @Result(property = "username",column = "name")
    })
    @Select("""
                select * from user
            """)
    public User1[] getAllUser();

    @Select("""
                select * from user
                    where id=#{id}
            """)
    @ResultMap("userMap")
    public User1 getUser(@Param("id")Integer id);
//    public User1 getUserBy(Integer id);
//    public void insertUser1(User1 user1);
}
