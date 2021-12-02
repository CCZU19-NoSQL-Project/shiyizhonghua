package com.shiyizhonghua;/**
 * @Description:
 * @Author qshh
 * @Date 2021/11/18 19:29
 */

import com.shiyizhonghua.dto.RegisterDTO;
import com.shiyizhonghua.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName: RegisterTest
 * @Description: TODO
 * @Author: qshh
 * @Date: 2021/11/18 19:29
 * @Version: 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegisterTest {

    @Resource
    private UserServiceImpl userServiceImpl;

    @Test
    public void testRegister(){
        RegisterDTO registerDto = new RegisterDTO("qshh", "hhxx", "qyh443012");
        System.out.println(userServiceImpl.register(registerDto));
    }
}
