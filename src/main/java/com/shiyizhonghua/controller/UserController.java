package com.shiyizhonghua.controller;

import com.shiyizhonghua.dto.LoginDTO;
import com.shiyizhonghua.dto.RegisterDTO;
import com.shiyizhonghua.service.impl.UserServiceImpl;
import com.shiyizhonghua.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: UserController
 * @Description: 用户控制类，包括用户登录、注册等
 * @Author: qshh
 * @Date: 2021/11/24 10:38
 * @Version: 1.0
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    // session字段名
    public static final String SESSION_NAME = null;


    @Resource
    private UserServiceImpl userServiceImpl;

    @PostMapping("login")
    public Result login(@RequestBody LoginDTO loginDto, HttpServletRequest request) {

        Result result = userServiceImpl.login(loginDto);
        //登录成功，将用户数据写入session
        if (result.getData() != null) {
            request.getSession().setAttribute(SESSION_NAME, result.getData());
        }
        return result;
    }

    @PostMapping("register")
    public Result register(@RequestBody RegisterDTO registerDto) {

        return userServiceImpl.register(registerDto);
    }


}
