package com.gaken.first.service;

import com.baomidou.mybatisplus.service.IService;
import com.gaken.first.entity.User;

import java.util.List;

/**
 * @ClassName IUserService
 * @Description 用户信息 服务类
 * @Author dengguikun
 * @Date 2018-12-26 12:08
 **/
public interface IUserService extends IService<User> {

    /**
     * 通过id获取用户信息
     * @author: dengguikun
     * @date: 2018-12-26
     * @param id
     * @return: com.gaken.first.entity.User
     */
    List<User> selectList();

    /**
     * 通过id获取用户信息xml方式
     * @author: dengguikun
     * @date: 2018-12-26
     * @param id
     * @return: com.gaken.first.entity.User
     */
    User selectByXmlId(Long id);
}
