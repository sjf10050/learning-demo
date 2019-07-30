package com.unicom.databasedemo.dao;

import com.unicom.databasedemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    @Transactional
    @Modifying
    @Query("update User u set u.address = ?1 where u.userId = ?2")
    int setAddressForUser(String address, Integer userId);

    List<User> findUsersByAddressEquals(String address);
}
