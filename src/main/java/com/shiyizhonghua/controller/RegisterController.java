package com.shiyizhonghua.controller;/**
 * @Description:
 * @Author qshh
 * @Date 2021/11/18 11:59
 */

import com.shiyizhonghua.dto.RegisterDto;
import com.shiyizhonghua.service.RegisterService;
import com.shiyizhonghua.service.impl.RegisterServiceImpl;
import com.shiyizhonghua.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: RegisterController
 * @Description: TODO
 * @Author: qshh
 * @Date: 2021/11/18 11:59
 * @Version: 1.0
 **/
@RestController
public class RegisterController {

    @Resource
    RegisterServiceImpl registerServiceImpl;

    @PostMapping("/api/register")
    public Result register(@RequestBody RegisterDto registerDto){
        return registerServiceImpl.register(registerDto);
    }
}
