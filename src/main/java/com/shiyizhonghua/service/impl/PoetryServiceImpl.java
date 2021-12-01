package com.shiyizhonghua.service.impl;

import com.shiyizhonghua.bean.Poetry;
import com.shiyizhonghua.repository.PoetryRepository;
import com.shiyizhonghua.service.PoetryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: PoetryServiceImpl
 * @Description: 诗词服务接口的一个实现类
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@Service
public class PoetryServiceImpl implements PoetryService {

    /** poetryRepository */
    @Resource
    private PoetryRepository poetryRepository;

    @Override
    public Page<Poetry> listByKeywords(String[] keywords, int page, int limit) {
        return null;
    }

    @Override
    public Poetry getById(String id) {
        Poetry poetry = poetryRepository.findById(id).get();
        return poetry;
    }

    @Override
    public Page<Poetry> listByType(String keyword, int page, int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<Poetry> poetryPage = poetryRepository.findAllByType(keyword, pageable);
        return poetryPage;
    }

    @Override
    public Page<Poetry> listByAuthorName(String keyword, int page, int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<Poetry> poetryPage = poetryRepository.findAllByAuthorName(keyword, pageable);
        return poetryPage;
    }

    @Override
    public Page<Poetry> listByAuthorTime(String keyword, int page, int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<Poetry> poetryPage = poetryRepository.findAllByAuthorTime(keyword, pageable);
        return poetryPage;
    }

    @Override
    public Page<Poetry> listByContent(String keyword, int page, int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<Poetry> poetryPage = poetryRepository.findAllByContent(keyword, pageable);
        return poetryPage;
    }
}
