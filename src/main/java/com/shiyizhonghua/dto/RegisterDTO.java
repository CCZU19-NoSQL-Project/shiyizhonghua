package com.shiyizhonghua.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: RegisterDTO
 * @Description: 注册业务实体类
 * @Author: qshh
 * @Date: 2021/11/18 11:42
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {

    private String username;
    private String nickname;
    private String password;

}
