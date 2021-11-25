package com.shiyizhonghua.controller;

import com.shiyizhonghua.dto.LoginDTO;
import com.shiyizhonghua.dto.RegisterDTO;
import com.shiyizhonghua.service.LoginService;
import com.shiyizhonghua.service.impl.RegisterServiceImpl;
import com.shiyizhonghua.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: UserController
 * @Description: 用户控制类，包括用户登录、注册等
 * @Author: qshh
 * @Date: 2021/11/24 10:38
 * @Version: 1.0
 **/

@RestController
public class UserController {

    @Resource
    LoginService loginService;

    @Resource
    RegisterServiceImpl registerServiceImpl;

    @PostMapping("/api/login")
    public Result login(@RequestBody LoginDTO loginDto){
        return loginService.login(loginDto);
    }

    @PostMapping("/api/register")
    public Result register(@RequestBody RegisterDTO registerDto){
        return registerServiceImpl.register(registerDto);
    }
}
