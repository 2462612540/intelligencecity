package com.ShanghaiUniversity.pojo;

import java.util.Date;

public class Administratoruser {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userPhone;

    private Date createTime;

    private String otherMessage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOtherMessage() {
        return otherMessage;
    }

    public void setOtherMessage(String otherMessage) {
        this.otherMessage = otherMessage == null ? null : otherMessage.trim();
    }
}