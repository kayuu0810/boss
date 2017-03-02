package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TBizSalesmanTeam implements Serializable {
    private Long id;

    /**
     * 团队长openId
     *
     * @mbg.generated
     */
    private String captainOpenId;

    /**
     * 业务员关系链中最顶端的业务员，但不一定是团队长
     *
     * @mbg.generated
     */
    private String rootOpenId;

    /**
     * 上级openId
     *
     * @mbg.generated
     */
    private String upperOpenId;

    /**
     * 扫码注册代理人openId
     *
     * @mbg.generated
     */
    private String salesmanOpenId;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaptainOpenId() {
        return captainOpenId;
    }

    public void setCaptainOpenId(String captainOpenId) {
        this.captainOpenId = captainOpenId;
    }

    public String getRootOpenId() {
        return rootOpenId;
    }

    public void setRootOpenId(String rootOpenId) {
        this.rootOpenId = rootOpenId;
    }

    public String getUpperOpenId() {
        return upperOpenId;
    }

    public void setUpperOpenId(String upperOpenId) {
        this.upperOpenId = upperOpenId;
    }

    public String getSalesmanOpenId() {
        return salesmanOpenId;
    }

    public void setSalesmanOpenId(String salesmanOpenId) {
        this.salesmanOpenId = salesmanOpenId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        sb.append(", captainOpenId=").append(captainOpenId);
        sb.append(", rootOpenId=").append(rootOpenId);
        sb.append(", upperOpenId=").append(upperOpenId);
        sb.append(", salesmanOpenId=").append(salesmanOpenId);
        sb.append(", createDate=").append(createDate);
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
        TBizSalesmanTeam other = (TBizSalesmanTeam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCaptainOpenId() == null ? other.getCaptainOpenId() == null : this.getCaptainOpenId().equals(other.getCaptainOpenId()))
            && (this.getRootOpenId() == null ? other.getRootOpenId() == null : this.getRootOpenId().equals(other.getRootOpenId()))
            && (this.getUpperOpenId() == null ? other.getUpperOpenId() == null : this.getUpperOpenId().equals(other.getUpperOpenId()))
            && (this.getSalesmanOpenId() == null ? other.getSalesmanOpenId() == null : this.getSalesmanOpenId().equals(other.getSalesmanOpenId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCaptainOpenId() == null) ? 0 : getCaptainOpenId().hashCode());
        result = prime * result + ((getRootOpenId() == null) ? 0 : getRootOpenId().hashCode());
        result = prime * result + ((getUpperOpenId() == null) ? 0 : getUpperOpenId().hashCode());
        result = prime * result + ((getSalesmanOpenId() == null) ? 0 : getSalesmanOpenId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}