package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TBizShouldCommissionFlow implements Serializable {
    private Long id;

    /**
     * 订单ID
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 保单ID
     *
     * @mbg.generated
     */
    private Long policyId;

    /**
     * 扣税级数ID
     *
     * @mbg.generated
     */
    private Long taxLevelId;

    /**
     * 02:交强险 01:商业险
     *
     * @mbg.generated
     */
    private String policyType;

    /**
     * 保单承保日
     *
     * @mbg.generated
     */
    private Date acceptDate;

    /**
     * 保单退保日
     *
     * @mbg.generated
     */
    private Date cancelDate;

    /**
     * 保费
     *
     * @mbg.generated
     */
    private BigDecimal premium;

    /**
     * 代理人ID
     *
     * @mbg.generated
     */
    private Long agentId;

    /**
     * 推广费费率
     *
     * @mbg.generated
     */
    private BigDecimal promitionalRate;

    /**
     * 10:发放、20:扣除
     *
     * @mbg.generated
     */
    private String promitionalType;

    /**
     * 1: 待缴，2:交清 3:代扣 4:已扣
     *
     * @mbg.generated
     */
    private String promotionStatus;

    /**
     * 应纳税所得额
     *
     * @mbg.generated
     */
    private BigDecimal payableAmount;

    /**
     * 扣税级数
     *
     * @mbg.generated
     */
    private String taxLevel;

    /**
     * 扣税金额
     *
     * @mbg.generated
     */
    private BigDecimal deductionAmount;

    /**
     * 重复扣税额
     *
     * @mbg.generated
     */
    private BigDecimal rrpeatedtaxCost;

    /**
     * 实结金额
     *
     * @mbg.generated
     */
    private BigDecimal paidAmount;

    /**
     * 创建日期
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getTaxLevelId() {
        return taxLevelId;
    }

    public void setTaxLevelId(Long taxLevelId) {
        this.taxLevelId = taxLevelId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public BigDecimal getPromitionalRate() {
        return promitionalRate;
    }

    public void setPromitionalRate(BigDecimal promitionalRate) {
        this.promitionalRate = promitionalRate;
    }

    public String getPromitionalType() {
        return promitionalType;
    }

    public void setPromitionalType(String promitionalType) {
        this.promitionalType = promitionalType;
    }

    public String getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(String promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getTaxLevel() {
        return taxLevel;
    }

    public void setTaxLevel(String taxLevel) {
        this.taxLevel = taxLevel;
    }

    public BigDecimal getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(BigDecimal deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public BigDecimal getRrpeatedtaxCost() {
        return rrpeatedtaxCost;
    }

    public void setRrpeatedtaxCost(BigDecimal rrpeatedtaxCost) {
        this.rrpeatedtaxCost = rrpeatedtaxCost;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", policyId=").append(policyId);
        sb.append(", taxLevelId=").append(taxLevelId);
        sb.append(", policyType=").append(policyType);
        sb.append(", acceptDate=").append(acceptDate);
        sb.append(", cancelDate=").append(cancelDate);
        sb.append(", premium=").append(premium);
        sb.append(", agentId=").append(agentId);
        sb.append(", promitionalRate=").append(promitionalRate);
        sb.append(", promitionalType=").append(promitionalType);
        sb.append(", promotionStatus=").append(promotionStatus);
        sb.append(", payableAmount=").append(payableAmount);
        sb.append(", taxLevel=").append(taxLevel);
        sb.append(", deductionAmount=").append(deductionAmount);
        sb.append(", rrpeatedtaxCost=").append(rrpeatedtaxCost);
        sb.append(", paidAmount=").append(paidAmount);
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
        TBizShouldCommissionFlow other = (TBizShouldCommissionFlow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPolicyId() == null ? other.getPolicyId() == null : this.getPolicyId().equals(other.getPolicyId()))
            && (this.getTaxLevelId() == null ? other.getTaxLevelId() == null : this.getTaxLevelId().equals(other.getTaxLevelId()))
            && (this.getPolicyType() == null ? other.getPolicyType() == null : this.getPolicyType().equals(other.getPolicyType()))
            && (this.getAcceptDate() == null ? other.getAcceptDate() == null : this.getAcceptDate().equals(other.getAcceptDate()))
            && (this.getCancelDate() == null ? other.getCancelDate() == null : this.getCancelDate().equals(other.getCancelDate()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getPromitionalRate() == null ? other.getPromitionalRate() == null : this.getPromitionalRate().equals(other.getPromitionalRate()))
            && (this.getPromitionalType() == null ? other.getPromitionalType() == null : this.getPromitionalType().equals(other.getPromitionalType()))
            && (this.getPromotionStatus() == null ? other.getPromotionStatus() == null : this.getPromotionStatus().equals(other.getPromotionStatus()))
            && (this.getPayableAmount() == null ? other.getPayableAmount() == null : this.getPayableAmount().equals(other.getPayableAmount()))
            && (this.getTaxLevel() == null ? other.getTaxLevel() == null : this.getTaxLevel().equals(other.getTaxLevel()))
            && (this.getDeductionAmount() == null ? other.getDeductionAmount() == null : this.getDeductionAmount().equals(other.getDeductionAmount()))
            && (this.getRrpeatedtaxCost() == null ? other.getRrpeatedtaxCost() == null : this.getRrpeatedtaxCost().equals(other.getRrpeatedtaxCost()))
            && (this.getPaidAmount() == null ? other.getPaidAmount() == null : this.getPaidAmount().equals(other.getPaidAmount()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        result = prime * result + ((getTaxLevelId() == null) ? 0 : getTaxLevelId().hashCode());
        result = prime * result + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        result = prime * result + ((getAcceptDate() == null) ? 0 : getAcceptDate().hashCode());
        result = prime * result + ((getCancelDate() == null) ? 0 : getCancelDate().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getPromitionalRate() == null) ? 0 : getPromitionalRate().hashCode());
        result = prime * result + ((getPromitionalType() == null) ? 0 : getPromitionalType().hashCode());
        result = prime * result + ((getPromotionStatus() == null) ? 0 : getPromotionStatus().hashCode());
        result = prime * result + ((getPayableAmount() == null) ? 0 : getPayableAmount().hashCode());
        result = prime * result + ((getTaxLevel() == null) ? 0 : getTaxLevel().hashCode());
        result = prime * result + ((getDeductionAmount() == null) ? 0 : getDeductionAmount().hashCode());
        result = prime * result + ((getRrpeatedtaxCost() == null) ? 0 : getRrpeatedtaxCost().hashCode());
        result = prime * result + ((getPaidAmount() == null) ? 0 : getPaidAmount().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}