package com.shiyizhonghua.service.impl;

import com.shiyizhonghua.repository.PoetryRepository;
import com.shiyizhonghua.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: PoetryServiceImpl
 * @Description: 诗词服务接口的一个实现类
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

public class PoetryServiceImpl implements PoetryService {

    /** poetryRepository */
    @Autowired
    private PoetryRepository poetryRepository;
}
