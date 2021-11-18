package com.shiyizhonghua.utils;/**
 * @Description:
 * @Author qshh
 * @Date 2021/11/18 12:12
 */

import java.util.UUID;

/**
 * @ClassName: UUIdUtil
 * @Description: uuid生成唯一id
 * @Author: qshh
 * @Date: 2021/11/18 12:12
 * @Version: 1.0
 **/

public class UUIdUtil {

    public static String getUUid(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
