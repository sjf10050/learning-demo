package com.unicom.demopostgresql.entity.dao;


import com.unicom.demopostgresql.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepositroy extends MongoRepository<UserEntity, String> {
}
