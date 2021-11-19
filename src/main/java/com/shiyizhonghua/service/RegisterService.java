/**
 * @author qshh
 * @date 2021/11/18 11:52
 */
package com.shiyizhonghua.service;

import com.shiyizhonghua.dto.RegisterDto;
import com.shiyizhonghua.utils.Result;

/**
 * @ClassName: RegisterService
 * @Description: TODO
 * @Author: qshh
 * @Date: 2021/11/18 11:52
 * @Version: 1.0
 **/
public interface RegisterService {

    /**
     * 注册业务接口
     * @param registerDto
     * @return
     */
    public Result register(RegisterDto registerDto);
}
