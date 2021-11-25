package com.shiyizhonghua.controller;

import com.shiyizhonghua.bean.Poetry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName: PoetryController
 * @Description: 诗词控制类，涉及诗词的查询，修改删除等等
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@Controller
@RequestMapping("poetry")
public class PoetryController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("search")
    public List<Poetry> findPoetry(String keyword) {
        List<Poetry> poetryList = mongoTemplate.findAll(Poetry.class, keyword);
        return poetryList;
    }
}
