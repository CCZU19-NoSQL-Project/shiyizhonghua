package com.shiyizhonghua.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: HomeController
 * @Description: TODO add a description
 * @Author: zhuaowei
 * @Date: 2021/10/29
 * @Version: 1.0
 */

@RestController
public class HomeController {

    @GetMapping("index")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
