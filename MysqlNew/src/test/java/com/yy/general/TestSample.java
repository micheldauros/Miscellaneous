package com.yy.general;

import com.yy.general.Dao.User1Dao;
import com.yy.general.Entity.User1;
import com.yy.general.Service.User1ServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
public class TestSample {
    @Autowired
    private User1Dao user1Dao;
    @Autowired
    private User1ServiceImpl user1Service;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User1> userList = user1Dao.selectList(null);
        Assertions.assertEquals(3, userList.size());
        userList.forEach(System.out::println);
        List<User1> userList2 = List.of(user1Dao.getAllUser());
        User1 user=user1Dao.getUser(2);
        System.out.println(user+"呵呵");
        userList2.forEach(System.out::println);
        user1Service.list().forEach(System.out::println);
//        user1Dao.
        /*String sql= """
                select * from user
                    where id =1""";*/
        String sql="select * from user";
        List<User1> user1 = jdbcTemplate.query(sql,new BeanPropertyRowMapper<User1>(User1.class));
        System.out.println(user1);
    }
}
