package com.shiyizhonghua.controller;

import com.shiyizhonghua.dto.LoginDto;
import com.shiyizhonghua.service.LoginService;
import com.shiyizhonghua.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: LoginController
 * @Description: 登录业务控制层
 * @Author: qshh
 * @Date: 2021/11/16 23:59
 * @Version: 1.0
 **/
@RestController
public class LoginController {

    @Resource
    LoginService loginService;

    @PostMapping("/api/login")
    public Result login(@RequestBody LoginDto loginDto){
        return loginService.login(loginDto);
    }

    //public Result login(@RequestParam String username, String password){
    //    LoginDto loginDto = new LoginDto(username, password);
    //    return loginService.login(loginDto);
    //}

}
