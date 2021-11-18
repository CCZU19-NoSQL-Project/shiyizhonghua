package com.shiyizhonghua.dto;/**
 * @Description:
 * @Author qshh
 * @Date 2021/11/18 11:42
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: RegisterDto
 * @Description: 注册业务实体类
 * @Author: qshh
 * @Date: 2021/11/18 11:42
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {

    private String username;
    private String nickname;
    private String password;

}
