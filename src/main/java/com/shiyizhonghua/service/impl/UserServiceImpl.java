package com.shiyizhonghua.service.impl;

import com.shiyizhonghua.bean.User;
import com.shiyizhonghua.repository.UserRepository;
import com.shiyizhonghua.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO add a description
 * @Author: zhuaowei
 * @Date: 2021/11/12
 * @Version: 1.0
 */

public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User createUser(String username, String nickname, String salt, String password) {
        User user = new User();
        user.setUsername(username);
        user.setNickname(nickname);
        user.setSalt(salt);
        user.setPassword(password);

        // 默认信息，有效，创建时间和更新时间
        user.setValid(true);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        int index = userRepository.insert(user);
        User createdUser = userRepository.selectById(index);

        // 根据返回的id查询实体对象
        return createdUser;
    }

    @Override
    @Transactional
    public User updateUser(Integer id, String username, String nickname, String password) {
        User user = userRepository.selectById(id);
        user.setUsername(username);
        user.setNickname(nickname);
        user.setPassword(password);

        user.setUpdateTime(new Date());
        int index = userRepository.updateById(user);
        return userRepository.selectById(index);
    }

    @Override
    public User getById(Integer id) {
        return userRepository.selectById(id);
    }

    @Override
    public List<String> getAllUsername() {
        List<String> allUsername = userRepository.getAllUsername();
        return allUsername;
    }
}
