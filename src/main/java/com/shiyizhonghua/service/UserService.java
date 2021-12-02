package com.shiyizhonghua.service;

import com.shiyizhonghua.bean.User;
import com.shiyizhonghua.dto.LoginDTO;
import com.shiyizhonghua.dto.RegisterDTO;
import com.shiyizhonghua.util.Result;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: 用户服务层
 * @Author: zhuaowei
 * @Date: 2021/11/1
 * @Version: 1.0
 */

public interface UserService {

    /**
     * 创建用户
     * @param username 用户名
     * @param nickname 用户昵称
     * @param salt 盐值
     * @param password 密码
     * @return 返回创建的用户实体对象
     */
    User createUser(String id, String username, String nickname, String salt, String password);

    /**
     * 更新用户信息
     * @param id 要更新的用户id
     * @param username 用户的新用户名
     * @param nickname 用户的新昵称
     * @param password 用户的新密码
     * @return 返回更新后的实体对象
     */
    User updateUser(Integer id, String username, String nickname, String password);

    /**
     * 根据用户的id查询用户实体对象
     * @param id 用户的id
     * @return 返回用户实体对象
     */
    User getById(Integer id);

    /**
     *  获取所有用户的用户名
     * @return 返回一个列表，存储所有用户的用户名
     */
    List<String> getAllUsername();

    /**
     *  登录业务接口
     * @param loginDto
     * @return Result
     */
    Result login(LoginDTO loginDto);

    /**
     * 注册业务接口
     * @param registerDto
     * @return
     */
    Result register(RegisterDTO registerDto);
}
