package com.shiyizhonghua.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiyizhonghua.bean.User;
import com.shiyizhonghua.dto.LoginDTO;
import com.shiyizhonghua.dto.RegisterDTO;
import com.shiyizhonghua.repository.UserRepository;
import com.shiyizhonghua.service.UserService;
import com.shiyizhonghua.util.Result;
import com.shiyizhonghua.util.UUIdUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户服务接口的一个实现类
 * @Author: zhuaowei
 * @Date: 2021/11/12
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserServiceImpl userServiceImpl;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User createUser(String id, String username, String nickname, String salt, String password) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setNickname(nickname);
        user.setSalt(salt);
        user.setPassword(password);

        // 默认信息，有效，创建时间和更新时间
        user.setValid(true);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userRepository.insert(user);
        User createdUser = userRepository.selectById(id);

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

    @Override
    public Result login(LoginDTO loginDto) {
        // 判断前端传入的用户名是否为空
        if (StringUtils.isEmpty(loginDto.getUsername())) {
            return Result.noUserName();
        }
        if (StringUtils.isEmpty(loginDto.getPassword())) {
            return Result.noPassword();
        }

        //通过登录名查询用户记录
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("username", loginDto.getUsername());
        User user = userRepository.selectOne(wrapper);

        //判断用户密码+salt 经过md5加密后是否与user记录相同
        String encryPass = DigestUtils.md5DigestAsHex((loginDto.getPassword() + user.getSalt()).getBytes());
        System.out.println("md5Pass:" + encryPass);

        if (user == null) {
            return Result.noUser();
        } else if ((encryPass.equals(user.getPassword()))) {
            return Result.success(user);
        } else if (!(encryPass.equals(user.getPassword()))) {
            return Result.wrongPass();
        }
        return Result.error();
    }

    @Override
    public Result register(RegisterDTO registerDto) {
        // 获取随机32位id
        String id = UUIdUtil.getUUid();
        String username = registerDto.getUsername();
        String nickname = registerDto.getNickname();
        // 随机获取10位长度字符串，作为盐值
        String salt = RandomStringUtils.randomAlphanumeric(10);
        // 对用户密码进行md5加密
        String md5Pass = DigestUtils.md5DigestAsHex((registerDto.getPassword() + salt).getBytes());

        // 判断前端传入的用户名是否为空
        if(StringUtils.isEmpty(registerDto.getUsername())){
            return Result.noUserName();
        }
        if (StringUtils.isEmpty(registerDto.getPassword())){
            return Result.noPassword();
        }
        if (StringUtils.isEmpty(registerDto.getNickname())){
            return Result.noNickName();
        }

        //通过登录名查询用户记录
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("username", registerDto.getUsername());
        User user1 = userRepository.selectOne(wrapper);

        //用户名已经存在
        if(user1 != null){
            return Result.userExists();
        }
        //创建用户
        User user = userServiceImpl.createUser(id, username, nickname, salt, md5Pass);
        //System.out.println("user:====" + user);
        if(user != null){
            return Result.registerSuccess(user);
        }

        return Result.registerError();
    }
}
