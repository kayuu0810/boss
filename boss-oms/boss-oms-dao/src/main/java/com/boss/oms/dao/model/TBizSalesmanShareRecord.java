package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TBizSalesmanShareRecord implements Serializable {
    private Long id;

    /**
     * 业务员ID
     *
     * @mbg.generated
     */
    private Long salesmanId;

    /**
     * 业务员OPEN_ID
     *
     * @mbg.generated
     */
    private String salesmanOpenId;

    /**
     * 客户OPEN_ID
     *
     * @mbg.generated
     */
    private String customerOpenId;

    /**
     * 冗余
     *
     * @mbg.generated
     */
    private String type;

    /**
     * 是否有效
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Long salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getSalesmanOpenId() {
        return salesmanOpenId;
    }

    public void setSalesmanOpenId(String salesmanOpenId) {
        this.salesmanOpenId = salesmanOpenId;
    }

    public String getCustomerOpenId() {
        return customerOpenId;
    }

    public void setCustomerOpenId(String customerOpenId) {
        this.customerOpenId = customerOpenId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", salesmanId=").append(salesmanId);
        sb.append(", salesmanOpenId=").append(salesmanOpenId);
        sb.append(", customerOpenId=").append(customerOpenId);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
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
        TBizSalesmanShareRecord other = (TBizSalesmanShareRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSalesmanId() == null ? other.getSalesmanId() == null : this.getSalesmanId().equals(other.getSalesmanId()))
            && (this.getSalesmanOpenId() == null ? other.getSalesmanOpenId() == null : this.getSalesmanOpenId().equals(other.getSalesmanOpenId()))
            && (this.getCustomerOpenId() == null ? other.getCustomerOpenId() == null : this.getCustomerOpenId().equals(other.getCustomerOpenId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSalesmanId() == null) ? 0 : getSalesmanId().hashCode());
        result = prime * result + ((getSalesmanOpenId() == null) ? 0 : getSalesmanOpenId().hashCode());
        result = prime * result + ((getCustomerOpenId() == null) ? 0 : getCustomerOpenId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}