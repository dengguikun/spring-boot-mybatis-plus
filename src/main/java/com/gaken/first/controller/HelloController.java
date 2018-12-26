package com.gaken.first.controller;

import com.gaken.first.entity.User;
import com.gaken.first.mapper.UserMapper;
import com.gaken.first.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName HelloController
 * @Description 用户信息前端控制器
 * @Author dengguikun
 * @Date 2018-12-26 09:46
 **/
@RestController
@RequestMapping(value = "hello")
public class HelloController {


    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String hello(){
    return "hello ~~~ i am hello method!";
    }

    @RequestMapping(value = "mybatisPlus",method = RequestMethod.GET)
    public List<User> mybatisPlus(){
        return iUserService.selectList();
    }

    @RequestMapping(value = "mybatisPlusXml",method = RequestMethod.GET)
    public User mybatisPlus(@Param("id") Long id){
        return iUserService.selectByXmlId(id);
    }
}
