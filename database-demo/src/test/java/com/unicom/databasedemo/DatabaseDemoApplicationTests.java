package com.unicom.databasedemo;

import com.unicom.databasedemo.dao.UserDao;
import com.unicom.databasedemo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseDemoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("sjf");
        user.setAddress("SH");
        userDao.save(user);
        userDao.setAddressForUser("fdhsafdsa", 1);
       // System.out.println(userDao.findUsersByAddressEquals("SH"));
    }

    @Test
    public void testExample() {
        Example<User> userExample = Example.of(new User());
//        userExample.
    }
}
