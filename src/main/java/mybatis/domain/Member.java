/*
 * Copyright (c) 2005 Infoservice, Inc. All  Rights Reserved.
 * This software is published under the terms of the Infoservice Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * CreateDate : 2017-08-11 17:08:57
 * CreateBy   : Administrator
 * Comment    : generate by com.infoservice.po.POGen
 */

package mybatis.domain;

import java.util.Date;


@SuppressWarnings("serial")
public class Member {

    private String orgName;
    private Date createTime;
    private String supCode;
    private String sysTag;
    private String certNo;
    private String emailConfirmStatus;
    private String remark;
    private Integer createBy;
    private String isAdmin;
    private String status;
    private String memberCode;
    private String phone;
    private String bindTag;
    private String isOption;
    private String onlineStatus;
    private Integer updateBy;
    private String sex;
    private String memberName;
    private String jobTitelType;
    private Integer id;
    private String memberType;
    private String email;
    private String password;
    private Date mobileConfirmTime;
    private Date birthday;
    private Integer loginCustId;
    private Date updateTime;
    private Date emialConfirmTime;
    private String mobile;
    private String haveAcc;
    private String openId;
    private String mobileConfirmStatus;
    private Integer defaultChainStoresId;
    private String isShopManager;
    private String isConsignor;
    private String isFinanceManager;
    private String canLoginPc;
    private String isSupportPersonalTrainer;
    private String picUrl;
    private String introduceInfo;
    /**
     * 允许POS查询未兑换的券
     */
    private String canQueryExc;
    /**
     * 允许使用POS
     */
    private String canLoginPos;

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public String getSupCode() {
        return this.supCode;
    }

    public void setSysTag(String sysTag) {
        this.sysTag = sysTag;
    }

    public String getSysTag() {
        return this.sysTag;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertNo() {
        return this.certNo;
    }

    public void setEmailConfirmStatus(String emailConfirmStatus) {
        this.emailConfirmStatus = emailConfirmStatus;
    }

    public String getEmailConfirmStatus() {
        return this.emailConfirmStatus;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getCreateBy() {
        return this.createBy;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getIsAdmin() {
        return this.isAdmin;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberCode() {
        return this.memberCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setBindTag(String bindTag) {
        this.bindTag = bindTag;
    }

    public String getBindTag() {
        return this.bindTag;
    }

    public void setIsOption(String isOption) {
        this.isOption = isOption;
    }

    public String getIsOption() {
        return this.isOption;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getOnlineStatus() {
        return this.onlineStatus;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getUpdateBy() {
        return this.updateBy;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setJobTitelType(String jobTitelType) {
        this.jobTitelType = jobTitelType;
    }

    public String getJobTitelType() {
        return this.jobTitelType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberType() {
        return this.memberType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setMobileConfirmTime(Date mobileConfirmTime) {
        this.mobileConfirmTime = mobileConfirmTime;
    }

    public Date getMobileConfirmTime() {
        return this.mobileConfirmTime;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setLoginCustId(Integer loginCustId) {
        this.loginCustId = loginCustId;
    }

    public Integer getLoginCustId() {
        return this.loginCustId;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setEmialConfirmTime(Date emialConfirmTime) {
        this.emialConfirmTime = emialConfirmTime;
    }

    public Date getEmialConfirmTime() {
        return this.emialConfirmTime;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setHaveAcc(String haveAcc) {
        this.haveAcc = haveAcc;
    }

    public String getHaveAcc() {
        return this.haveAcc;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setMobileConfirmStatus(String mobileConfirmStatus) {
        this.mobileConfirmStatus = mobileConfirmStatus;
    }

    public String getMobileConfirmStatus() {
        return this.mobileConfirmStatus;
    }



    public Integer getDefaultChainStoresId() {
        return defaultChainStoresId;
    }

    public void setDefaultChainStoresId(Integer defaultChainStoresId) {
        this.defaultChainStoresId = defaultChainStoresId;
    }

    public String getIsShopManager() {
        return isShopManager;
    }

    public void setIsShopManager(String isShopManager) {
        this.isShopManager = isShopManager;
    }

    public String getIsConsignor() {
        return isConsignor;
    }

    public void setIsConsignor(String isConsignor) {
        this.isConsignor = isConsignor;
    }

    public String getCanLoginPc() {
        return canLoginPc;
    }

    public void setCanLoginPc(String canLoginPc) {
        this.canLoginPc = canLoginPc;
    }

    public String getIsFinanceManager() {
        return isFinanceManager;
    }

    public void setIsFinanceManager(String isFinanceManager) {
        this.isFinanceManager = isFinanceManager;
    }

    public String getIsSupportPersonalTrainer() {
        return isSupportPersonalTrainer;
    }

    public void setIsSupportPersonalTrainer(String isSupportPersonalTrainer) {
        this.isSupportPersonalTrainer = isSupportPersonalTrainer;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getIntroduceInfo() {
        return introduceInfo;
    }

    public void setIntroduceInfo(String introduceInfo) {
        this.introduceInfo = introduceInfo;
    }

    public String getCanQueryExc() {
        return canQueryExc;
    }

    public void setCanQueryExc(String canQueryExc) {
        this.canQueryExc = canQueryExc;
    }

    public String getCanLoginPos() {
        return canLoginPos;
    }

    public void setCanLoginPos(String canLoginPos) {
        this.canLoginPos = canLoginPos;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mobile='" + mobile + '\'' +
                '}';
    }
}