package com.shiyizhonghua.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @ClassName: User
 * @Description: TODO add a description
 * @Author: zhuaowei
 * @Date: 2021/11/1
 * @Version: 1.0
 */

@TableName("user")
@Data
public class User {

    /** 用户id */
    @TableId
    private String id;

    /** 用户名，登录名 */
    private String username;

    /** 昵称 */
    private String nickname;

    /** 盐值 */
    private String salt;

    /** 密码 */
    private String password;

    /** 是否有效 */
    private Boolean valid;

    /** 创建时间 */
    private Date createTime;

    /** 上次修改时间 */
    private Date updateTime;
}
