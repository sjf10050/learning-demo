package com.unicom.demopostgresql.entity.dao;

import com.unicom.demopostgresql.entity.UserEntity;

public interface UserRepository {
    void saveUser(UserEntity userEntity);

    UserEntity findUserByUserName(String userName);

    long updateUser(UserEntity user);

    void deleteUserById(Long id);
}
