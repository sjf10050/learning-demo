package com.unicom.demopostgresql.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "user") //指定写入的Collection
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private Long id;
    private String userName;
    private String passWord;
}
