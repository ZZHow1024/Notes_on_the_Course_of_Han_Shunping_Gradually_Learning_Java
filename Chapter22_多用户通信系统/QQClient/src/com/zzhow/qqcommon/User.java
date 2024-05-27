package com.zzhow.qqcommon;

import java.io.Serial;
import java.io.Serializable;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @version 1.0
 * 用户信息
 */
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String userID; //用户名
    private String password; //密码

    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
