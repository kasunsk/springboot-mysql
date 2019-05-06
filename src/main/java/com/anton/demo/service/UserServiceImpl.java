package com.anton.demo.service;

import com.anton.demo.dao.UserDao;
import com.anton.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean createUser(UserEntity userEntity) {
        return false;
    }

    @Override
    public boolean deleteUser(String userId) {
        return false;
    }

    @Override
    public String getAddressById(String id) {
        return null;
    }

    @Transactional
    @Override
    public UserEntity getUserByUsername(String username) {

        UserEntity userEntity = userDao.findByUsername(username);
        if (userEntity == null) {
            throw new RuntimeException("User not found");
        }
        return userEntity;
    }
}
