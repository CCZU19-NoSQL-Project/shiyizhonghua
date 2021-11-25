package com.shiyizhonghua.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: Status
 * @Description: 定义状态码的枚举类型
 * @Author: qshh
 * @Date: 2021/11/17 00:14
 * @Version: 1.0
 **/

@Getter
@AllArgsConstructor
public enum Status {
    /**/
    SUCCESS(2000,"登录成功"),
    ERROR(5000,"登录失败"),
    NO_USERNAME(4000,"用户名不能为空"),
    NO_PASSWORD(4001,"密码不能为空"),
    NO_NICKNAME(4002,"昵称不能为空"),
    ACCOUNT_NOT_EXIST(4003,"账户不存在"),
    NO_USER(4004,"用户不存在"),
    WRONG_PASSWORD(4005, "密码不匹配"),
    REGISTER_ERROR(5001, "注册失败"),
    REGISTER_SUCCESS(2001, "注册成功"),
    USER_EXISTS(5002, "用户名已存在"),
    //我不理解...
    VALID_FAILE(2535,"");


    private int code;
    private String mes;

    public void setMes(String mes){
        VALID_FAILE.mes = mes;
    }
}
