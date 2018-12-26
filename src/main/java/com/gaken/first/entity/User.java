package com.gaken.first.entity;

import lombok.Data;

/**
 * @ClassName User
 * @Description 用户表
 * @Author dengguikun
 * @Date 2018-12-26 10:33
 **/
@Data
public class User {
    /**
     * ID
     */
    private Long id;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 年龄
     */
    private int age;
    /**
     * 微信
     */
    private String weChat;
    /**
     * QQ
     */
    private String qq;
    /**
     * 职业
     */
    private String profession;
}
