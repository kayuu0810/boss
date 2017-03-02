package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSalPolicyRisk implements Serializable {
    private Long id;

    /**
     * 保单ID
     *
     * @mbg.generated
     */
    private Long policyId;

    /**
     * OPEN返回的险种CODE
     *
     * @mbg.generated
     */
    private String riskCode;

    /**
     * 险种名称（由CORE接口返回）
     *
     * @mbg.generated
     */
    private String riskName;

    private String riskPlanName;

    /**
     * 险种简介（冗余）
     *
     * @mbg.generated
     */
    private String riskDesc;

    /**
     * OPEN返回的险种方案CODE
     *
     * @mbg.generated
     */
    private String riskPlanCode;

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
     * 折扣比例
     *
     * @mbg.generated
     */
    private BigDecimal rebateRatio;

    /**
     * 折扣保费
     *
     * @mbg.generated
     */
    private BigDecimal rebatePremium;

    /**
     * 状态（1-有效  0-无效）
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * 创建日期
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 最后修改人
     *
     * @mbg.generated
     */
    private String lastUpdateUser;

    /**
     * 最后修改日期
     *
     * @mbg.generated
     */
    private Date lastUpdateDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public String getRiskPlanName() {
        return riskPlanName;
    }

    public void setRiskPlanName(String riskPlanName) {
        this.riskPlanName = riskPlanName;
    }

    public String getRiskDesc() {
        return riskDesc;
    }

    public void setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc;
    }

    public String getRiskPlanCode() {
        return riskPlanCode;
    }

    public void setRiskPlanCode(String riskPlanCode) {
        this.riskPlanCode = riskPlanCode;
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

    public BigDecimal getRebateRatio() {
        return rebateRatio;
    }

    public void setRebateRatio(BigDecimal rebateRatio) {
        this.rebateRatio = rebateRatio;
    }

    public BigDecimal getRebatePremium() {
        return rebatePremium;
    }

    public void setRebatePremium(BigDecimal rebatePremium) {
        this.rebatePremium = rebatePremium;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", policyId=").append(policyId);
        sb.append(", riskCode=").append(riskCode);
        sb.append(", riskName=").append(riskName);
        sb.append(", riskPlanName=").append(riskPlanName);
        sb.append(", riskDesc=").append(riskDesc);
        sb.append(", riskPlanCode=").append(riskPlanCode);
        sb.append(", amount=").append(amount);
        sb.append(", premium=").append(premium);
        sb.append(", rebateRatio=").append(rebateRatio);
        sb.append(", rebatePremium=").append(rebatePremium);
        sb.append(", status=").append(status);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
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
        TSalPolicyRisk other = (TSalPolicyRisk) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPolicyId() == null ? other.getPolicyId() == null : this.getPolicyId().equals(other.getPolicyId()))
            && (this.getRiskCode() == null ? other.getRiskCode() == null : this.getRiskCode().equals(other.getRiskCode()))
            && (this.getRiskName() == null ? other.getRiskName() == null : this.getRiskName().equals(other.getRiskName()))
            && (this.getRiskPlanName() == null ? other.getRiskPlanName() == null : this.getRiskPlanName().equals(other.getRiskPlanName()))
            && (this.getRiskDesc() == null ? other.getRiskDesc() == null : this.getRiskDesc().equals(other.getRiskDesc()))
            && (this.getRiskPlanCode() == null ? other.getRiskPlanCode() == null : this.getRiskPlanCode().equals(other.getRiskPlanCode()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getRebateRatio() == null ? other.getRebateRatio() == null : this.getRebateRatio().equals(other.getRebateRatio()))
            && (this.getRebatePremium() == null ? other.getRebatePremium() == null : this.getRebatePremium().equals(other.getRebatePremium()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastUpdateUser() == null ? other.getLastUpdateUser() == null : this.getLastUpdateUser().equals(other.getLastUpdateUser()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        result = prime * result + ((getRiskCode() == null) ? 0 : getRiskCode().hashCode());
        result = prime * result + ((getRiskName() == null) ? 0 : getRiskName().hashCode());
        result = prime * result + ((getRiskPlanName() == null) ? 0 : getRiskPlanName().hashCode());
        result = prime * result + ((getRiskDesc() == null) ? 0 : getRiskDesc().hashCode());
        result = prime * result + ((getRiskPlanCode() == null) ? 0 : getRiskPlanCode().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getRebateRatio() == null) ? 0 : getRebateRatio().hashCode());
        result = prime * result + ((getRebatePremium() == null) ? 0 : getRebatePremium().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return result;
    }
}