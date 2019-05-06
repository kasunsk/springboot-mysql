package com.anton.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class UserEntity extends AbstractTrackableEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    Long userId;

    @Column(name = "USER_NAME", nullable = false)
    String username;

    @Column(name = "USER_ADDRESS", nullable = false)
    String address;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
