package com.shiyizhonghua.utils;/**
 * @Description:
 * @Author qshh
 * @Date 2021/11/16 23:45
 */

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

    public static Result noUserName(){
        return makeResult(Status.NO_USERNAME, null);
    }

    public static Result noPassword(){
        return makeResult(Status.NO_PASSWORD, null);
    }
    public static Result noUser(){
        return makeResult(Status.NO_USER, null);
    }

}
