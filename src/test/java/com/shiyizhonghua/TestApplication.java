package com.shiyizhonghua;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: TestApplication
 * @Description: Spring Boot 测试类
 * @Author: zhuaowei
 * @Date: 2021/10/29
 * @Version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplication {

    /**
     * 测试demo，用于测试测试。。。
     */
    @Test
    public void test() {
        System.out.println("Spring Boot Test!!!");
    }
}
