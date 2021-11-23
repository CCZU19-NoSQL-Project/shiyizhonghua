package com.shiyizhonghua;/**
 * @Description:
 * @Author qshh
 * @Date 2021/11/18 19:29
 */

import com.shiyizhonghua.dto.RegisterDto;
import com.shiyizhonghua.service.impl.RegisterServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName: TestRegister
 * @Description: TODO
 * @Author: qshh
 * @Date: 2021/11/18 19:29
 * @Version: 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRegister {

    @Resource
    RegisterServiceImpl registerServiceImpl;

    @Test
    public void TestRegister(){
        RegisterDto registerDto = new RegisterDto("qshh", "hhxx", "qyh443012");
        System.out.println(registerServiceImpl.register(registerDto));
    }
}
