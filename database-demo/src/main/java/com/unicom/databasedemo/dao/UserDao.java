package com.unicom.databasedemo.dao;

import com.unicom.databasedemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
