package com.shiyizhonghua.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: User
 * @Description: 用户信息实体类
 * @Author: zhuaowei
 * @Date: 2021/11/1
 * @Version: 1.0
 */

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

    /** 用户id */
    @Id
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
