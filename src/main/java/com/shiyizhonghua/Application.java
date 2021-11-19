package com.shiyizhonghua;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: Application
 * @Description: 启动类
 * @Author: zhuaowei
 * @Date: 2021/10/29
 * @Version: 1.0
 */

@MapperScan("com.shiyizhonghua.repository")
@SpringBootApplication
public class Application {

    /**
     * springboot启动main方法
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
