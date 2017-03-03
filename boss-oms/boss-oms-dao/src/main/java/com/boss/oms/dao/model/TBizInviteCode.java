package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TBizInviteCode implements Serializable {
    private Integer id;

    /**
     * 邀请码
     *
     * @mbg.generated
     */
    private String inviteCode;

    /**
     * 使用人
     *
     * @mbg.generated
     */
    private String beUsedBy;

    /**
     * 使用日期
     *
     * @mbg.generated
     */
    private Date beUsedDate;

    /**
     * 是否可用
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 创建日期
     *
     * @mbg.generated
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getBeUsedBy() {
        return beUsedBy;
    }

    public void setBeUsedBy(String beUsedBy) {
        this.beUsedBy = beUsedBy;
    }

    public Date getBeUsedDate() {
        return beUsedDate;
    }

    public void setBeUsedDate(Date beUsedDate) {
        this.beUsedDate = beUsedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", beUsedBy=").append(beUsedBy);
        sb.append(", beUsedDate=").append(beUsedDate);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
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
        TBizInviteCode other = (TBizInviteCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInviteCode() == null ? other.getInviteCode() == null : this.getInviteCode().equals(other.getInviteCode()))
            && (this.getBeUsedBy() == null ? other.getBeUsedBy() == null : this.getBeUsedBy().equals(other.getBeUsedBy()))
            && (this.getBeUsedDate() == null ? other.getBeUsedDate() == null : this.getBeUsedDate().equals(other.getBeUsedDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInviteCode() == null) ? 0 : getInviteCode().hashCode());
        result = prime * result + ((getBeUsedBy() == null) ? 0 : getBeUsedBy().hashCode());
        result = prime * result + ((getBeUsedDate() == null) ? 0 : getBeUsedDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }
}