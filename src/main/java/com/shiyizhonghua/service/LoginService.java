/**
 * @author qshh
 * @date 2021/11/17 0:01
 */
package com.shiyizhonghua.service;

import com.shiyizhonghua.dto.LoginDto;
import com.shiyizhonghua.utils.Result;

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
    public Result login(LoginDto loginDto);
}
