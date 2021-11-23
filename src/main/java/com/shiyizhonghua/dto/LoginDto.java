package com.shiyizhonghua.dto;/**
 * @Description:
 * @Author qshh
 * @Date 2021/11/16 23:57
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: LoginDto
 * @Description: 登录业务实体类
 * @Author: qshh
 * @Date: 2021/11/16 23:57
 * @Version: 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    private String userName;
    private String password;
}
