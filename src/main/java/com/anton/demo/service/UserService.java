package com.anton.demo.service;

import com.anton.demo.entity.UserEntity;

public interface UserService {
    boolean createUser(UserEntity userEntity);
    boolean deleteUser(String userId);
    String getAddressById(String id);
    UserEntity getUserByUsername(String username);
}
