package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TWxAccount implements Serializable {
    /**
     * 自增ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 公众号原始ID
     *
     * @mbg.generated
     */
    private String accountOriginid;

    /**
     * 公众帐号名称
     *
     * @mbg.generated
     */
    private String accountName;

    /**
     * 公众帐号TOKEN
     *
     * @mbg.generated
     */
    private String accountToken;

    /**
     * 公众微信号
     *
     * @mbg.generated
     */
    private String accountNumber;

    /**
     * 公众号类型 1:订阅号,2:服务号,3:企业号
     *
     * @mbg.generated
     */
    private String accountType;

    /**
     * 电子邮箱
     *
     * @mbg.generated
     */
    private String accountEmail;

    /**
     * 公众帐号描述
     *
     * @mbg.generated
     */
    private String accountDesc;

    /**
     * 公众帐号APPID
     *
     * @mbg.generated
     */
    private String accountAppid;

    /**
     * 公众帐号APPSECRET
     *
     * @mbg.generated
     */
    private String accountAppsecret;

    /**
     * 公众号头像URL
     *
     * @mbg.generated
     */
    private String headImgUrl;

    /**
     * 二维码URL
     *
     * @mbg.generated
     */
    private String qrcodePicUrl;

    /**
     * 微信消息接口接收地址
     *
     * @mbg.generated
     */
    private String serverUrl;

    /**
     * 加密AESKEY
     *
     * @mbg.generated
     */
    private String aesKey;

    /**
     * 消息加解密方式 1:明文模式,2兼容模式，3：加密模式
     *
     * @mbg.generated
     */
    private String encryptionMode;

    /**
     * 返回国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语
     *
     * @mbg.generated
     */
    private String language;

    /**
     * 服务器域名
     *
     * @mbg.generated
     */
    private String httpDomainNonssl;

    /**
     * 添加时间
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 状态 0失效  1有效
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 1:世纪通宝 帐号来源
     *
     * @mbg.generated
     */
    private String source;

    private String appKey;

    private String mchId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountOriginid() {
        return accountOriginid;
    }

    public void setAccountOriginid(String accountOriginid) {
        this.accountOriginid = accountOriginid;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountToken() {
        return accountToken;
    }

    public void setAccountToken(String accountToken) {
        this.accountToken = accountToken;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc;
    }

    public String getAccountAppid() {
        return accountAppid;
    }

    public void setAccountAppid(String accountAppid) {
        this.accountAppid = accountAppid;
    }

    public String getAccountAppsecret() {
        return accountAppsecret;
    }

    public void setAccountAppsecret(String accountAppsecret) {
        this.accountAppsecret = accountAppsecret;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getQrcodePicUrl() {
        return qrcodePicUrl;
    }

    public void setQrcodePicUrl(String qrcodePicUrl) {
        this.qrcodePicUrl = qrcodePicUrl;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getAesKey() {
        return aesKey;
    }

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public String getEncryptionMode() {
        return encryptionMode;
    }

    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHttpDomainNonssl() {
        return httpDomainNonssl;
    }

    public void setHttpDomainNonssl(String httpDomainNonssl) {
        this.httpDomainNonssl = httpDomainNonssl;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountOriginid=").append(accountOriginid);
        sb.append(", accountName=").append(accountName);
        sb.append(", accountToken=").append(accountToken);
        sb.append(", accountNumber=").append(accountNumber);
        sb.append(", accountType=").append(accountType);
        sb.append(", accountEmail=").append(accountEmail);
        sb.append(", accountDesc=").append(accountDesc);
        sb.append(", accountAppid=").append(accountAppid);
        sb.append(", accountAppsecret=").append(accountAppsecret);
        sb.append(", headImgUrl=").append(headImgUrl);
        sb.append(", qrcodePicUrl=").append(qrcodePicUrl);
        sb.append(", serverUrl=").append(serverUrl);
        sb.append(", aesKey=").append(aesKey);
        sb.append(", encryptionMode=").append(encryptionMode);
        sb.append(", language=").append(language);
        sb.append(", httpDomainNonssl=").append(httpDomainNonssl);
        sb.append(", createDate=").append(createDate);
        sb.append(", status=").append(status);
        sb.append(", source=").append(source);
        sb.append(", appKey=").append(appKey);
        sb.append(", mchId=").append(mchId);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TWxAccount other = (TWxAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountOriginid() == null ? other.getAccountOriginid() == null : this.getAccountOriginid().equals(other.getAccountOriginid()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getAccountToken() == null ? other.getAccountToken() == null : this.getAccountToken().equals(other.getAccountToken()))
            && (this.getAccountNumber() == null ? other.getAccountNumber() == null : this.getAccountNumber().equals(other.getAccountNumber()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getAccountEmail() == null ? other.getAccountEmail() == null : this.getAccountEmail().equals(other.getAccountEmail()))
            && (this.getAccountDesc() == null ? other.getAccountDesc() == null : this.getAccountDesc().equals(other.getAccountDesc()))
            && (this.getAccountAppid() == null ? other.getAccountAppid() == null : this.getAccountAppid().equals(other.getAccountAppid()))
            && (this.getAccountAppsecret() == null ? other.getAccountAppsecret() == null : this.getAccountAppsecret().equals(other.getAccountAppsecret()))
            && (this.getHeadImgUrl() == null ? other.getHeadImgUrl() == null : this.getHeadImgUrl().equals(other.getHeadImgUrl()))
            && (this.getQrcodePicUrl() == null ? other.getQrcodePicUrl() == null : this.getQrcodePicUrl().equals(other.getQrcodePicUrl()))
            && (this.getServerUrl() == null ? other.getServerUrl() == null : this.getServerUrl().equals(other.getServerUrl()))
            && (this.getAesKey() == null ? other.getAesKey() == null : this.getAesKey().equals(other.getAesKey()))
            && (this.getEncryptionMode() == null ? other.getEncryptionMode() == null : this.getEncryptionMode().equals(other.getEncryptionMode()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getHttpDomainNonssl() == null ? other.getHttpDomainNonssl() == null : this.getHttpDomainNonssl().equals(other.getHttpDomainNonssl()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getAppKey() == null ? other.getAppKey() == null : this.getAppKey().equals(other.getAppKey()))
            && (this.getMchId() == null ? other.getMchId() == null : this.getMchId().equals(other.getMchId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountOriginid() == null) ? 0 : getAccountOriginid().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getAccountToken() == null) ? 0 : getAccountToken().hashCode());
        result = prime * result + ((getAccountNumber() == null) ? 0 : getAccountNumber().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getAccountEmail() == null) ? 0 : getAccountEmail().hashCode());
        result = prime * result + ((getAccountDesc() == null) ? 0 : getAccountDesc().hashCode());
        result = prime * result + ((getAccountAppid() == null) ? 0 : getAccountAppid().hashCode());
        result = prime * result + ((getAccountAppsecret() == null) ? 0 : getAccountAppsecret().hashCode());
        result = prime * result + ((getHeadImgUrl() == null) ? 0 : getHeadImgUrl().hashCode());
        result = prime * result + ((getQrcodePicUrl() == null) ? 0 : getQrcodePicUrl().hashCode());
        result = prime * result + ((getServerUrl() == null) ? 0 : getServerUrl().hashCode());
        result = prime * result + ((getAesKey() == null) ? 0 : getAesKey().hashCode());
        result = prime * result + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getHttpDomainNonssl() == null) ? 0 : getHttpDomainNonssl().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getAppKey() == null) ? 0 : getAppKey().hashCode());
        result = prime * result + ((getMchId() == null) ? 0 : getMchId().hashCode());
        return result;
    }
}