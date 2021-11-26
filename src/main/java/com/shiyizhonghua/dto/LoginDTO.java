package com.shiyizhonghua.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: LoginDTO
 * @Description: 登录业务实体类
 * @Author: qshh
 * @Date: 2021/11/16 23:57
 * @Version: 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {

    private String username;
    private String password;
}
