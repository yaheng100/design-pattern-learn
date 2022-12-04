package com.lyh.responsibilitychain;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/1 22:12
 */
public class RegisterUser {

    private String mobile;

    private String name;

    private String smsCode;

    private String idCard;



    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
