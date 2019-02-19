package com.deepexi.user.domain.eo;

import com.deepexi.util.mapper.SuperEntity;

public class Cuser extends SuperEntity {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户编号
     */
    private String userNumber;
    /**
     * 昵称
     */
    private String nickName;

    /**
     * 邮箱
     */
    private String email;

    public Cuser() {
    }

    public Cuser(String userName, String userNumber, String nickName, String email) {
        this.userName = userName;
        this.userNumber = userNumber;
        this.nickName = nickName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
