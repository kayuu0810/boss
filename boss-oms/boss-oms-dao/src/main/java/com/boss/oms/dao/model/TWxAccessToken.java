package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TWxAccessToken implements Serializable {
    /**
     * 自增ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * token
     *
     * @mbg.generated
     */
    private String accessToken;

    /**
     * 过期时间
     *
     * @mbg.generated
     */
    private Integer expiresIn;

    /**
     * 下次更新时间
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * 原始公众号ID
     *
     * @mbg.generated
     */
    private String accountOriginid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAccountOriginid() {
        return accountOriginid;
    }

    public void setAccountOriginid(String accountOriginid) {
        this.accountOriginid = accountOriginid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", expiresIn=").append(expiresIn);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", accountOriginid=").append(accountOriginid);
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
        TWxAccessToken other = (TWxAccessToken) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccessToken() == null ? other.getAccessToken() == null : this.getAccessToken().equals(other.getAccessToken()))
            && (this.getExpiresIn() == null ? other.getExpiresIn() == null : this.getExpiresIn().equals(other.getExpiresIn()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getAccountOriginid() == null ? other.getAccountOriginid() == null : this.getAccountOriginid().equals(other.getAccountOriginid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        result = prime * result + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getAccountOriginid() == null) ? 0 : getAccountOriginid().hashCode());
        return result;
    }
}