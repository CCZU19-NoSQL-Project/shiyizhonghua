package com.shiyizhonghua.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shiyizhonghua.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserRepository
 * @Description: 用户实体类数据持久层
 * @Author: zhuaowei
 * @Date: 2021/11/1
 * @Version: 1.0
 */

@Repository
public interface UserRepository extends BaseMapper<User> {

    /**\
     * 获取所有用户的用户名
     * @return 返回用户名列表
     */
    @Select("select username from user")
    List<String> getAllUsername();
}
