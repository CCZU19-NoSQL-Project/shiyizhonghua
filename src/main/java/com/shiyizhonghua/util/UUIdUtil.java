package com.shiyizhonghua.util;

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
