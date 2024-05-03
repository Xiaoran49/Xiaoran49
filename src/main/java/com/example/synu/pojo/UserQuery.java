package com.example.synu.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserQuery{

    private Integer userId;
    private String userNickName;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userPhoneNumber;
    private String userSex;
    private String userIntroduce;
    private String userRegTime;
    private Integer userAge;

}