package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TWxSubscribeInfo implements Serializable {
    /**
     * 自增ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 用户openID
     *
     * @mbg.generated
     */
    private String openId;

    /**
     * 操作行为：1关注，0取消关注
     *
     * @mbg.generated
     */
    private String actionType;

    /**
     * 公众帐号名称
     *
     * @mbg.generated
     */
    private String accountOriginid;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getAccountOriginid() {
        return accountOriginid;
    }

    public void setAccountOriginid(String accountOriginid) {
        this.accountOriginid = accountOriginid;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openId=").append(openId);
        sb.append(", actionType=").append(actionType);
        sb.append(", accountOriginid=").append(accountOriginid);
        sb.append(", updateDate=").append(updateDate);
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
        TWxSubscribeInfo other = (TWxSubscribeInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getActionType() == null ? other.getActionType() == null : this.getActionType().equals(other.getActionType()))
            && (this.getAccountOriginid() == null ? other.getAccountOriginid() == null : this.getAccountOriginid().equals(other.getAccountOriginid()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getActionType() == null) ? 0 : getActionType().hashCode());
        result = prime * result + ((getAccountOriginid() == null) ? 0 : getAccountOriginid().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}