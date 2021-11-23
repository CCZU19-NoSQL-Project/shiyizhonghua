package com.shiyizhonghua;

import com.shiyizhonghua.bean.Poetry;
import com.shiyizhonghua.repository.PoetryRepository;
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

    @Test
    public void testFindOne() {
        Pageable pageable = PageRequest.of(1, 10);
        Page<Poetry> poetries = poetryRepository.findAll(pageable);
        for (Poetry poetry : poetries.getContent()) {
            System.out.println("poetry = " + poetry);
        }
    }
}
