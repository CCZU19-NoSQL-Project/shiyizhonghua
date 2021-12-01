package com.shiyizhonghua.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Result
 * @Description: 统一前后端的交互数据格式
 * @Author: qshh
 * @Date: 2021/11/16 23:45
 * @Version: 1.0
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    /** 状态码 从枚举类型Status类中获取 */
    private int code;
    /** 返回信息 从枚举类型Status类中获取*/
    private String mes;
    /** 返回数据 */
    private Object data;


    public static Result makeResult(Status status, Object data){
        return new Result(status.getCode(),status.getMes(),data);
    }


    public static Result success(){
        return makeResult(Status.SUCCESS,null);
    }

    public static Result success(Object data){
        return makeResult(Status.SUCCESS, data);
    }

    public static Result error(){
        return makeResult(Status.ERROR,null);
    }

    public static Result error(int code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMes(msg);
        result.setData(null);
        return result;
    }

    public static Result noUserName(){
        return makeResult(Status.NO_USERNAME, null);
    }

    public static Result noPassword(){
        return makeResult(Status.NO_PASSWORD, null);
    }

    public static Result noNickName(){
        return makeResult(Status.NO_NICKNAME, null);
    }

    public static Result noUser(){
        return makeResult(Status.NO_USER, null);
    }

    public static Result wrongPass(){
        return makeResult(Status.WRONG_PASSWORD, null);
    }

    public static Result registerError(){
        return makeResult(Status.REGISTER_ERROR, null);
    }

    public static Result registerSuccess(){
        return makeResult(Status.REGISTER_SUCCESS, null);
    }

    public static Result registerSuccess(Object data){
        return makeResult(Status.REGISTER_SUCCESS, data);
    }

    public static Result userExists(){
        return makeResult(Status.USER_EXISTS, null);
    }
}
