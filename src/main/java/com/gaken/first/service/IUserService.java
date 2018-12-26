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
     *
     * @param id
     * @author: dengguikun
     * @date: 2018-12-26
     * @return: com.gaken.first.entity.User
     */
    List<User> selectList();

    /**
     * 通过id获取用户信息xml方式
     *
     * @param id
     * @author: dengguikun
     * @date: 2018-12-26
     * @return: com.gaken.first.entity.User
     */
    User selectByXmlId(Long id);

    /**
     * 添加用户信息(测试事务)
     *
     * @param user
     * @author: dengguikun
     * @date: 2018-12-26
     * @return: int
     */
    int save(User user);
}
