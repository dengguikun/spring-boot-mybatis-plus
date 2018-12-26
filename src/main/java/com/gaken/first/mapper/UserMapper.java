package com.gaken.first.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.gaken.first.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description 用户信息mapper
 * @Author dengguikun
 * @Date 2018-12-26 10:37
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * xml 方式通过id获取用户信息
     *
     * @param id
     * @author: dengguikun
     * @date: 2018-12-26
     * @return: com.gaken.first.entity.User
     */
    User selectByXmlId(@Param("id") Long id);

}