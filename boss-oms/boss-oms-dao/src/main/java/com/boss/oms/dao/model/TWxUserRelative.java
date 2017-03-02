package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TWxUserRelative implements Serializable {
    /**
     * ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 扫描二维码用户
     *
     * @mbg.generated
     */
    private String fromOpenId;

    /**
     * 二维码生成用户
     *
     * @mbg.generated
     */
    private String toOpenId;

    /**
     * 原始公众id
     *
     * @mbg.generated
     */
    private String accountOriginid;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    private String type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromOpenId() {
        return fromOpenId;
    }

    public void setFromOpenId(String fromOpenId) {
        this.fromOpenId = fromOpenId;
    }

    public String getToOpenId() {
        return toOpenId;
    }

    public void setToOpenId(String toOpenId) {
        this.toOpenId = toOpenId;
    }

    public String getAccountOriginid() {
        return accountOriginid;
    }

    public void setAccountOriginid(String accountOriginid) {
        this.accountOriginid = accountOriginid;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fromOpenId=").append(fromOpenId);
        sb.append(", toOpenId=").append(toOpenId);
        sb.append(", accountOriginid=").append(accountOriginid);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", type=").append(type);
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
        TWxUserRelative other = (TWxUserRelative) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFromOpenId() == null ? other.getFromOpenId() == null : this.getFromOpenId().equals(other.getFromOpenId()))
            && (this.getToOpenId() == null ? other.getToOpenId() == null : this.getToOpenId().equals(other.getToOpenId()))
            && (this.getAccountOriginid() == null ? other.getAccountOriginid() == null : this.getAccountOriginid().equals(other.getAccountOriginid()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFromOpenId() == null) ? 0 : getFromOpenId().hashCode());
        result = prime * result + ((getToOpenId() == null) ? 0 : getToOpenId().hashCode());
        result = prime * result + ((getAccountOriginid() == null) ? 0 : getAccountOriginid().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}