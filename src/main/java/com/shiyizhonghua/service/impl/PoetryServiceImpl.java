package com.shiyizhonghua.service.impl;

import com.shiyizhonghua.bean.Poetry;
import com.shiyizhonghua.repository.PoetryRepository;
import com.shiyizhonghua.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: PoetryServiceImpl
 * @Description: TODO add a description
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

public class PoetryServiceImpl implements PoetryService {

    @Autowired
    private PoetryRepository poetryRepository;

    @Override
    public Poetry findOne() {
        poetryRepository.findById("");
        return null;
    }
}
