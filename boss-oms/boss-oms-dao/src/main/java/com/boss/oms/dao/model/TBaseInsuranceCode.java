package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TBaseInsuranceCode implements Serializable {
    private Integer id;

    /**
     * 保险公司代码
     *
     * @mbg.generated
     */
    private String insuranceCode;

    /**
     * 保险公司名称
     *
     * @mbg.generated
     */
    private String insuranceName;

    /**
     * 保险公司json配置文件地址
     *
     * @mbg.generated
     */
    private String insuranceProperty;

    /**
     * 是否可用（1：可用 0：不可用）
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

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     * 最后更新时间
     *
     * @mbg.generated
     */
    private Date lastUpdateTime;

    /**
     * 最后更新人
     *
     * @mbg.generated
     */
    private String lastUpdateBy;

    private String insuranceBudgets;

    private String insurancePromtions;

    private String insuranceOrder;

    private String insuranceBudgetDetail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceProperty() {
        return insuranceProperty;
    }

    public void setInsuranceProperty(String insuranceProperty) {
        this.insuranceProperty = insuranceProperty;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getInsuranceBudgets() {
        return insuranceBudgets;
    }

    public void setInsuranceBudgets(String insuranceBudgets) {
        this.insuranceBudgets = insuranceBudgets;
    }

    public String getInsurancePromtions() {
        return insurancePromtions;
    }

    public void setInsurancePromtions(String insurancePromtions) {
        this.insurancePromtions = insurancePromtions;
    }

    public String getInsuranceOrder() {
        return insuranceOrder;
    }

    public void setInsuranceOrder(String insuranceOrder) {
        this.insuranceOrder = insuranceOrder;
    }

    public String getInsuranceBudgetDetail() {
        return insuranceBudgetDetail;
    }

    public void setInsuranceBudgetDetail(String insuranceBudgetDetail) {
        this.insuranceBudgetDetail = insuranceBudgetDetail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", insuranceCode=").append(insuranceCode);
        sb.append(", insuranceName=").append(insuranceName);
        sb.append(", insuranceProperty=").append(insuranceProperty);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", insuranceBudgets=").append(insuranceBudgets);
        sb.append(", insurancePromtions=").append(insurancePromtions);
        sb.append(", insuranceOrder=").append(insuranceOrder);
        sb.append(", insuranceBudgetDetail=").append(insuranceBudgetDetail);
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
        TBaseInsuranceCode other = (TBaseInsuranceCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInsuranceCode() == null ? other.getInsuranceCode() == null : this.getInsuranceCode().equals(other.getInsuranceCode()))
            && (this.getInsuranceName() == null ? other.getInsuranceName() == null : this.getInsuranceName().equals(other.getInsuranceName()))
            && (this.getInsuranceProperty() == null ? other.getInsuranceProperty() == null : this.getInsuranceProperty().equals(other.getInsuranceProperty()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getInsuranceBudgets() == null ? other.getInsuranceBudgets() == null : this.getInsuranceBudgets().equals(other.getInsuranceBudgets()))
            && (this.getInsurancePromtions() == null ? other.getInsurancePromtions() == null : this.getInsurancePromtions().equals(other.getInsurancePromtions()))
            && (this.getInsuranceOrder() == null ? other.getInsuranceOrder() == null : this.getInsuranceOrder().equals(other.getInsuranceOrder()))
            && (this.getInsuranceBudgetDetail() == null ? other.getInsuranceBudgetDetail() == null : this.getInsuranceBudgetDetail().equals(other.getInsuranceBudgetDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInsuranceCode() == null) ? 0 : getInsuranceCode().hashCode());
        result = prime * result + ((getInsuranceName() == null) ? 0 : getInsuranceName().hashCode());
        result = prime * result + ((getInsuranceProperty() == null) ? 0 : getInsuranceProperty().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getInsuranceBudgets() == null) ? 0 : getInsuranceBudgets().hashCode());
        result = prime * result + ((getInsurancePromtions() == null) ? 0 : getInsurancePromtions().hashCode());
        result = prime * result + ((getInsuranceOrder() == null) ? 0 : getInsuranceOrder().hashCode());
        result = prime * result + ((getInsuranceBudgetDetail() == null) ? 0 : getInsuranceBudgetDetail().hashCode());
        return result;
    }
}