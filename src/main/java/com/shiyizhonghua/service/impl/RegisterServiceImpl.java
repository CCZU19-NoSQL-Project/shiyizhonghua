package com.shiyizhonghua.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiyizhonghua.bean.User;
import com.shiyizhonghua.dto.RegisterDTO;
import com.shiyizhonghua.repository.UserRepository;
import com.shiyizhonghua.service.RegisterService;
import com.shiyizhonghua.util.Result;
import com.shiyizhonghua.util.UUIdUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @ClassName: RegisterServiceImpl
 * @Description: 注册业务实现
 * @Author: qshh
 * @Date: 2021/11/18 11:54
 * @Version: 1.0
 **/

@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    UserRepository userRepository;

    @Resource
    UserServiceImpl userServiceImpl;

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
        //User user = userServiceImpl.createUser(id, username, nickname, salt, md5Pass);


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
