package com.shiyizhonghua.service.impl;

/**
 * @Description:
 * @Author qshh
 * @Date 2021/11/17 0:01
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiyizhonghua.bean.User;
import com.shiyizhonghua.dto.LoginDto;
import com.shiyizhonghua.repository.UserRepository;
import com.shiyizhonghua.service.LoginService;
import com.shiyizhonghua.utils.Result;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @ClassName: LoginServiceImpl
 * @Description: TODO
 * @Author: qshh
 * @Date: 2021/11/17 0:01
 * @Version: 1.0
 **/

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    UserRepository userRepository;

    @Override
    public Result login(LoginDto loginDto) {

        // 判断前端传入的用户名是否为空
        if(StringUtils.isEmpty(loginDto.getUserName())){
            return Result.noUserName();
        }
        if (StringUtils.isEmpty(loginDto.getPassword())){
            return Result.noPassword();
        }

        //通过登录名查询用户记录
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("username", loginDto.getUserName());
        User user = userRepository.selectOne(wrapper);

        //判断用户密码+salt 经过md5加密后是否与user记录相同
        String encryPass = DigestUtils.md5DigestAsHex((loginDto.getPassword() + user.getSalt()).getBytes());
        System.out.println("md5Pass:" + encryPass);
        if(user == null){
            return Result.noUser();
        }else if((encryPass.equals(user.getPassword()))){
            //return new Result(200, true, "", user);
            System.out.println("result:----" + Result.success(user));
            return Result.success(user);
        }else if(!(encryPass.equals(user.getPassword()))){
            return Result.wrongPass();
        }
        return Result.error();
    }
}
