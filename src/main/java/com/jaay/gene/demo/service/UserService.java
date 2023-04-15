package com.jaay.gene.demo.service;

import com.jaay.gene.demo.mapper.UserDetailMapper;
import com.jaay.gene.demo.mapper.UserMapper;
import com.jaay.gene.demo.pojo.User;
import com.jaay.gene.demo.pojo.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    UserDetailMapper userDetailMapper;

    public void addUser(User user) {

        userMapper.add(user);
        UserDetail userDetail = user.getUserDetail();
        userDetail.setUserId(user.getId());
        userDetailMapper.add(userDetail);

    }

}
