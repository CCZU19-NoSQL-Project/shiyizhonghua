package com.shiyizhonghua.repository;

import com.shiyizhonghua.bean.Poetry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: PoetryRepository
 * @Description: poetry 数据持久层，继承 ElasticSearch 持久化方法
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@Repository
public interface PoetryRepository extends ElasticsearchRepository<Poetry, String> {

    /**\
     * 按诗词类型分页查找
     * @param type 诗词类型
     * @param pageable 分页条件
     * @return 返回诗词分页对象
     */
    Page<Poetry> findAllByType(String type, Pageable pageable);

    /**\
     * 按作者名字分页查询
     * @param authorName 作者名字
     * @param pageable 分页条件
     * @return 返回诗词分页对象
     */
    Page<Poetry> findAllByAuthorName(String authorName, Pageable pageable);

    /**\
     * 按作者朝代查询
     * @param time 朝代
     * @param pageable 分页条件
     * @return 返回诗词分页对象
     */
    Page<Poetry> findAllByAuthorTime(String time, Pageable pageable);

    /**\
     * 按内容查找
     * @param content 朝代
     * @param pageable 分页条件
     * @return 返回诗词分页对象
     */
    Page<Poetry> findAllByContent(String content, Pageable pageable);
}
