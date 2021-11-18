package com.shiyizhonghua;

import com.shiyizhonghua.dto.LoginDto;
import com.shiyizhonghua.service.impl.LoginServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName: TestLogin
 * @Description: 登录业务测试类
 * @Author: qshh
 * @Date: 2021/11/18 0:35
 * @Version: 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLogin {

    @Resource
    LoginServiceImpl loginServiceImpl;

    LoginDto loginDto = new LoginDto("qshh", "123456");

    @Test
    public void LoginTest(){
        System.out.println(loginServiceImpl.login(loginDto));
    }

}
