package com.shiyizhonghua.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: HomeController
 * @Description: 主页控制类，加载主页面
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

    @GetMapping("/l")
    public ModelAndView loginInterface() {
        return new ModelAndView("user/login.html");
    }

    @GetMapping("/r")
    public ModelAndView registerInterface() {
        return new ModelAndView("user/register.html");
    }

    @GetMapping("/phone")
    public ModelAndView phoneLoginInterface() {
        return new ModelAndView("user/phonelogin.html");
    }

    @GetMapping("/tang")
    public ModelAndView jumpToTangshi() {
        return new ModelAndView("secondPage/tangshi.html");
    }

    @GetMapping("/yuan")
    public ModelAndView jumpToYuanqu() {
        return new ModelAndView("secondPage/yuanqu.html");
    }

    @GetMapping("/song")
    public ModelAndView jumpToSongci() {
        return new ModelAndView("secondPage/songci.html");
    }

    @GetMapping("/sishu")
    public ModelAndView jumpToSishuwujing() {
        return new ModelAndView("secondPage/sishuwujing.html");
    }

    @GetMapping("/qita")
    public ModelAndView jumpToQita() {
        return new ModelAndView("secondPage/qita.html");
    }

    @GetMapping("/lunyu")
    public ModelAndView jumpToLunyu() {
        return new ModelAndView("secondPage/lunyu.html");
    }
}
