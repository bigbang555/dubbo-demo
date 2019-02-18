package com.deepexi.user.domain.eo;

import com.deepexi.util.mapper.SuperEntity;

public class User extends SuperEntity {

    /**
     * 用户id
     */
    private String userNumer;
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

    public User(String userNumer, String nickName, String email) {
        this.userNumer = userNumer;
        this.nickName = nickName;
        this.email = email;
    }

    public String getUserNumer() {
        return userNumer;
    }

    public void setUserNumer(String userNumer) {
        this.userNumer = userNumer;
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
