package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TPdtRiskPlan implements Serializable {
    private Integer id;

    /**
     * 险种CODE
     *
     * @mbg.generated
     */
    private String riskCode;

    /**
     * 险种方案名称
     *
     * @mbg.generated
     */
    private String planName;

    /**
     * 保额
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * 保费
     *
     * @mbg.generated
     */
    private BigDecimal premium;

    /**
     * 状态（1：可用 0：不可用）
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 有效期起
     *
     * @mbg.generated
     */
    private Date effectDateStart;

    /**
     * 有效期止
     *
     * @mbg.generated
     */
    private Date effectDateEnd;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 最后修改人
     *
     * @mbg.generated
     */
    private String lastUpdateBy;

    /**
     * 最后修改日期
     *
     * @mbg.generated
     */
    private Date lastUpdateTime;

    /**
     * 逻辑删除（1：已删除 0：未删除）
     *
     * @mbg.generated
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getEffectDateStart() {
        return effectDateStart;
    }

    public void setEffectDateStart(Date effectDateStart) {
        this.effectDateStart = effectDateStart;
    }

    public Date getEffectDateEnd() {
        return effectDateEnd;
    }

    public void setEffectDateEnd(Date effectDateEnd) {
        this.effectDateEnd = effectDateEnd;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", riskCode=").append(riskCode);
        sb.append(", planName=").append(planName);
        sb.append(", amount=").append(amount);
        sb.append(", premium=").append(premium);
        sb.append(", status=").append(status);
        sb.append(", effectDateStart=").append(effectDateStart);
        sb.append(", effectDateEnd=").append(effectDateEnd);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", isDelete=").append(isDelete);
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
        TPdtRiskPlan other = (TPdtRiskPlan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRiskCode() == null ? other.getRiskCode() == null : this.getRiskCode().equals(other.getRiskCode()))
            && (this.getPlanName() == null ? other.getPlanName() == null : this.getPlanName().equals(other.getPlanName()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEffectDateStart() == null ? other.getEffectDateStart() == null : this.getEffectDateStart().equals(other.getEffectDateStart()))
            && (this.getEffectDateEnd() == null ? other.getEffectDateEnd() == null : this.getEffectDateEnd().equals(other.getEffectDateEnd()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRiskCode() == null) ? 0 : getRiskCode().hashCode());
        result = prime * result + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEffectDateStart() == null) ? 0 : getEffectDateStart().hashCode());
        result = prime * result + ((getEffectDateEnd() == null) ? 0 : getEffectDateEnd().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}