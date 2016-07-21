package com.spring.cloud.service.dao;

import com.spring.cloud.service.model.User;

import java.util.List;

/**
 * Created by Tima on 7/20/16.
 */
public interface UserDao {

    List<User> findAll();
}
