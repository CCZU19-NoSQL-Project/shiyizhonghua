package com.shiyizhonghua.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: 这是一个测试controller类，用于测试接口是否能正常运行
 * @Author: zhuaowei
 * @Date: 2021/10/29
 * @Version: 1.0
 */

@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 测试api，测试应用程序是否能正常运行，接口能否正常访问
     * 访问路由：/test/index
     * 请求方式：GET
     * 请求参数：无
     */
    @GetMapping("index")
    public String index() {
        return "Test API from Spring Boot!!!";
    }
}
