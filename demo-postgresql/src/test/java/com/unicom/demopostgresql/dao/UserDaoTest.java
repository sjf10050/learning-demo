package com.unicom.demopostgresql.dao;

import com.unicom.demopostgresql.entity.UserEntity;
import com.unicom.demopostgresql.entity.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserRepository useRepository;

    @Test
    public void testSaveUser() {
        UserEntity user = new UserEntity();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        useRepository.saveUser(user);
    }

    @Test
    public void findUserByUserName() {
        UserEntity user = useRepository.findUserByUserName("小明");
        System.out.println("user is " + user);
    }

    @Test
    public void updateUser() {
        UserEntity user = new UserEntity();
        user.setId(2l);
        user.setUserName("天空");
        user.setPassWord("fffxxxx");
        useRepository.updateUser(user);
    }

    @Test
    public void deleteUserById() {
        useRepository.deleteUserById(1l);
    }
}
