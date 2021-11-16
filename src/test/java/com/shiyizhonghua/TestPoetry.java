package com.shiyizhonghua;

import com.shiyizhonghua.bean.Poetry;
import com.shiyizhonghua.repository.PoetryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: TestPoetry
 * @Description: TODO add a description
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPoetry {

    @Autowired
    private PoetryRepository poetryRepository;

    @Test
    public void testFindOne() {
        Poetry poetry = poetryRepository.findById("619364cb168d866536127538").get();

        System.out.println(poetry);
    }
}
