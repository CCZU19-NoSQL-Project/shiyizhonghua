package com.shiyizhonghua.service;

import com.shiyizhonghua.dto.LoginDTO;
import com.shiyizhonghua.util.Result;

/**
 * @ClassName: LoginService
 * @Description: TODO
 * @Author: qshh
 * @Date: 2021/11/17 0:01
 * @Version: 1.0
 **/

public interface LoginService {

    /**
     *  登录业务接口
     * @param loginDto
     * @return Result
     */
     Result login(LoginDTO loginDto);
}
