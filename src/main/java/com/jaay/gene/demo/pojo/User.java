package com.jaay.gene.demo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
@SuppressWarnings("serial")
public class User implements Serializable {
    private Long id;
    private String userName;
    private String userAge;
    private String userSex;
    private UserDetail userDetail;

}
