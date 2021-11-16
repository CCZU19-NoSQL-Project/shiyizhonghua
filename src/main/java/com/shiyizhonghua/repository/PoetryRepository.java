package com.shiyizhonghua.repository;

import com.shiyizhonghua.bean.Poetry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: PoetryRepository
 * @Description: poetry 数据持久层，继承 ElasticSearch 持久化方法
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@Repository
public interface PoetryRepository extends MongoRepository<Poetry, String> {
}
