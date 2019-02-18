package com.deepexi.user.domain.eo;

import com.deepexi.util.mapper.SuperEntity;

public class User extends SuperEntity {

    /**
     * 用户id
     */
    private String userNumber;
    /**
     * 昵称
     */
    private String nickName;

    /**
    *  邮箱
    * */
    private String email;

    public User() {
    }

    public User(String userNumber, String nickName, String email) {
        this.userNumber = userNumber;
        this.nickName = nickName;
        this.email = email;
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
