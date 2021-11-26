package com.shiyizhonghua.service;

import com.shiyizhonghua.dto.RegisterDTO;
import com.shiyizhonghua.util.Result;

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
     Result register(RegisterDTO registerDto);
}
