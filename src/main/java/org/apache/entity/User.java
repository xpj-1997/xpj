package org.apache.entity;

import java.io.Serializable;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.entity
 * @ClassName: User
 * @Author: xpj
 * @Date: 2021/3/24 下午 4:43
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
public class User implements Serializable {
    private String account;//账号
    private String password;//密码
    private String email;//邮箱

    public User(String account, String password, String email) {
        this.account = account;
        this.password = password;
        this.email = email;
    }

    public User() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
