package com.shiyizhonghua;

import com.shiyizhonghua.dto.LoginDTO;
import com.shiyizhonghua.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName: LoginTest
 * @Description: 登录业务测试类
 * @Author: qshh
 * @Date: 2021/11/18 0:35
 * @Version: 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginTest {

    @Resource
    private UserServiceImpl userServiceImpl;


    LoginDTO loginDto = new LoginDTO("qshh", "qyh443012");

    @Test
    public void testLogin(){
        System.out.println(userServiceImpl.login(loginDto));
    }

}
