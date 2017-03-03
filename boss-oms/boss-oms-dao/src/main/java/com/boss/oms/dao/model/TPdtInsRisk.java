package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TPdtInsRisk implements Serializable {
    private Integer id;

    /**
     * 保险公司代码
     *
     * @mbg.generated
     */
    private String insCode;

    /**
     * 险种代码
     *
     * @mbg.generated
     */
    private String riskCode;

    /**
     * 生效日起
     *
     * @mbg.generated
     */
    private Date effectiveTimeStart;

    /**
     * 生效日止
     *
     * @mbg.generated
     */
    private Date effectiveTimeEnd;

    /**
     * 是否默认
     *
     * @mbg.generated
     */
    private String isDefault;

    /**
     * 是否可用（1：可用 0：不可用）
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

    /**
     * 更新日期
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     * 更新日期
     *
     * @mbg.generated
     */
    private Date lastUpdateDate;

    private String lastUpdateBy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInsCode() {
        return insCode;
    }

    public void setInsCode(String insCode) {
        this.insCode = insCode;
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public Date getEffectiveTimeStart() {
        return effectiveTimeStart;
    }

    public void setEffectiveTimeStart(Date effectiveTimeStart) {
        this.effectiveTimeStart = effectiveTimeStart;
    }

    public Date getEffectiveTimeEnd() {
        return effectiveTimeEnd;
    }

    public void setEffectiveTimeEnd(Date effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", insCode=").append(insCode);
        sb.append(", riskCode=").append(riskCode);
        sb.append(", effectiveTimeStart=").append(effectiveTimeStart);
        sb.append(", effectiveTimeEnd=").append(effectiveTimeEnd);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
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
        TPdtInsRisk other = (TPdtInsRisk) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInsCode() == null ? other.getInsCode() == null : this.getInsCode().equals(other.getInsCode()))
            && (this.getRiskCode() == null ? other.getRiskCode() == null : this.getRiskCode().equals(other.getRiskCode()))
            && (this.getEffectiveTimeStart() == null ? other.getEffectiveTimeStart() == null : this.getEffectiveTimeStart().equals(other.getEffectiveTimeStart()))
            && (this.getEffectiveTimeEnd() == null ? other.getEffectiveTimeEnd() == null : this.getEffectiveTimeEnd().equals(other.getEffectiveTimeEnd()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInsCode() == null) ? 0 : getInsCode().hashCode());
        result = prime * result + ((getRiskCode() == null) ? 0 : getRiskCode().hashCode());
        result = prime * result + ((getEffectiveTimeStart() == null) ? 0 : getEffectiveTimeStart().hashCode());
        result = prime * result + ((getEffectiveTimeEnd() == null) ? 0 : getEffectiveTimeEnd().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        return result;
    }
}