package com.shiyizhonghua;

import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * @ClassName: ElasticSearchTest
 * @Description: elastic search 测试类
 * @Author: zhuaowei
 * @Date: 2021/11/23
 * @Version: 1.0
 */

@SpringBootTest
public class ElasticSearchTest {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    void testCreateIndex() throws IOException {

    }
}
