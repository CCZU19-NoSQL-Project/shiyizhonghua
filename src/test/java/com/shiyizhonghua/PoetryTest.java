package com.shiyizhonghua;

import com.shiyizhonghua.bean.Poetry;
import com.shiyizhonghua.repository.PoetryRepository;
import com.shiyizhonghua.service.PoetryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: TestPoetry
 * @Description: 诗词测试类
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PoetryTest {

    @Autowired
    private PoetryRepository poetryRepository;

    @Autowired
    private PoetryService poetryService;

    @Test
    public void testPage() {
        Pageable pageable = PageRequest.of(1, 10);
        Page<Poetry> poetryPage = poetryRepository.findAll(pageable);
        for (Poetry poetry : poetryPage.getContent()) {
            System.out.println("poetry = " + poetry);
        }
    }

    @Test
    public void testSearchAuthor() {
        Page<Poetry> poetryPage = poetryRepository.findAllByAuthorName("lb", PageRequest.of(0, 10));
        for (Poetry poetry : poetryPage.getContent()) {
            System.out.println("poetry = " + poetry);
        }
    }

    @Test
    public void testSearchContent() {
        Page<Poetry> poetryPage = poetryRepository.findAllByContent("月", PageRequest.of(0, 10));
        for (Poetry poetry : poetryPage.getContent()) {
            System.out.println("poetry = " + poetry);
        }
    }

    @Test
    public void testSearchKeywords() {
        String[] keywords = {"李白", "蜀道难"};
        Page<Poetry> poetryPage = poetryService.listByKeywords(keywords, 0, 10);
        for (Poetry poetry : poetryPage.getContent()) {
            System.out.println("poetry = " + poetry);
        }
    }
}
