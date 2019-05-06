package com.anton.demo.dao;

import com.anton.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDao extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);

    @Query("SELECT u FROM UserEntity u WHERE u.username =:username")
    UserEntity retrieveByName(@Param("username") String username);

}
