package com.unicom.databasedemo.dao;

import com.unicom.databasedemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserDao extends JpaRepository<User, Integer> {
    @Transactional
    @Modifying
    @Query("update user set username=?1 where id=?2")
    public int modifyName(String name,Integer id);
}
