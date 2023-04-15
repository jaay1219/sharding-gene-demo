package com.jaay.gene.demo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
@SuppressWarnings("serial")
public class UserDetail implements Serializable {
    private Long userId;
    private Long id;
    private String email;
    private String address;
    private String phoneNo;

}
