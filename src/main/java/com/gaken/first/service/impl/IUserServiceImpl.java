package com.gaken.first.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gaken.first.entity.User;
import com.gaken.first.mapper.UserMapper;
import com.gaken.first.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description 用户信息信息 服务实现类
 * @Author dengguikun
 * @Date 2018-12-26 12:10
 **/
@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return userList;
    }

    @Override
    public User selectByXmlId(Long id) {
        return userMapper.selectByXmlId(id);
    }
}
