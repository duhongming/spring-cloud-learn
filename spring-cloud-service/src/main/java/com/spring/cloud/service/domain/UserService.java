package com.spring.cloud.service.domain;

/**
 * Created by Tima on 7/20/16.
 */
import java.util.List;

import com.spring.cloud.service.dao.UserDao;
import com.spring.cloud.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {


    @Autowired
    private UserDao userMapper;

    public List<User> searchAll(){
        List<User> list = userMapper.findAll();
        return list;
    }
}