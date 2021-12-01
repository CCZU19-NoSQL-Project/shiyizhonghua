package com.shiyizhonghua.service;

import com.shiyizhonghua.bean.Poetry;
import org.springframework.data.domain.Page;

/**
 * @ClassName: PoetryService
 * @Description: 诗词服务接口
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

public interface PoetryService {

    /**\
     * 按关键字查询
     * @param keywords 查询关键字列表
     * @param page 分页开始页码
     * @param limit 分页大小
     * @return 返回诗词的分页对象
     */
    Page<Poetry> listByKeywords(String[] keywords, int page, int limit);

    /**\
     * 根据id获取诗词
     * @param id 诗词的id
     * @return 返回诗词对象
     */
    Poetry getById(String id);

    /**\
     * 按诗词类型查询
     * @param keyword 诗词类型
     * @param page 分页开始页码
     * @param limit 分页大小
     * @return 返回诗词的分页对象
     */
    Page<Poetry> listByType(String keyword, int page, int limit);

    /**\
     * 按作者查询
     * @param keyword 作者名字
     * @param page 分页开始页码
     * @param limit 分页大小
     * @return 返回诗词的分页对象
     */
    Page<Poetry> listByAuthorName(String keyword, int page, int limit);

    /**\
     * 按朝代查询
     * @param keyword 作者朝代
     * @param page 分页开始页码
     * @param limit 分页大小
     * @return 返回诗词的分页对象
     */
    Page<Poetry> listByAuthorTime(String keyword, int page, int limit);

    /**\
     * 按诗词内容查询
     * @param keyword 诗词内容
     * @param page 分页开始页码
     * @param limit 分页大小
     * @return 返回诗词的分页对象
     */
    Page<Poetry> listByContent(String keyword, int page, int limit);
}
