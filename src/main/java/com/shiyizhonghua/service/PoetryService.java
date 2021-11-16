package com.shiyizhonghua.service;

import com.shiyizhonghua.bean.Poetry;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PoetryService
 * @Description: TODO add a description
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@Service
public interface PoetryService {

    /**\
     * 查找第一个
     * @return 返回一个poetry对象
     */
    Poetry findOne();
}
