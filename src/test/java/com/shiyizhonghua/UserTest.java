package com.shiyizhonghua;

import com.shiyizhonghua.bean.User;
import com.shiyizhonghua.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * @ClassName: UserTest
 * @Description: TODO
 * @Author: qshh
 * @Date: 2021/11/16 22:27
 * @Version: 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void testFindAll(){
        List<User> users = userRepository.selectList(null);
        for (User user : users){
            System.out.println(user);
        }
    }
}
