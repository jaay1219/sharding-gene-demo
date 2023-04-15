package com.jaay.gene.demo.service;

import com.jaay.gene.demo.mapper.UserDetailMapper;
import com.jaay.gene.demo.pojo.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailService {

    @Autowired
    private UserDetailMapper userDetailMapper;

    public void addDetail(UserDetail userDetail){

        userDetailMapper.add(userDetail);

    }

}
