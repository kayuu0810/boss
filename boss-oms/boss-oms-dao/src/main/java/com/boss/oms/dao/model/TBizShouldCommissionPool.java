package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TBizShouldCommissionPool implements Serializable {
    private Long id;

    /**
     * 订单号
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 保单号
     *
     * @mbg.generated
     */
    private Long policyId;

    /**
     * 44:退保 88:待发佣
     *
     * @mbg.generated
     */
    private String type;

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
     * 车辆表ID
     *
     * @mbg.generated
     */
    private Long licenceId;

    /**
     * t_base_insurance_code 表中的ID
     *
     * @mbg.generated
     */
    private Long insuranceId;

    /**
     * 承保地区
     *
     * @mbg.generated
     */
    private String acceptArea;

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
     * 渠道服务费率
     *
     * @mbg.generated
     */
    private BigDecimal channelCommissionRate;

    /**
     * 渠道服务费
     *
     * @mbg.generated
     */
    private BigDecimal channelCommission;

    /**
     * 渠道服务费状态 1:待缴、3:缴清、5:待扣、7:已扣
     *
     * @mbg.generated
     */
    private String channelCommissionStatus;

    /**
     * 渠道服务费结算日期
     *
     * @mbg.generated
     */
    private Date channelCommissionSettledate;

    /**
     * 渠道服务费扣除日期
     *
     * @mbg.generated
     */
    private Date channelCommissionDeductdate;

    /**
     * 推广费费率
     *
     * @mbg.generated
     */
    private BigDecimal promotionRate;

    /**
     * 推广费
     *
     * @mbg.generated
     */
    private BigDecimal promotion;

    /**
     * 推广费状态 1:待缴、3:缴清、5:待扣、7:已扣
     *
     * @mbg.generated
     */
    private String promotionStatus;

    /**
     * 推广费缴清日期
     *
     * @mbg.generated
     */
    private Date promotionSettledate;

    /**
     * 推广费扣除日期
     *
     * @mbg.generated
     */
    private Date promotionRepossessdate;

    /**
     * 创建日期
     *
     * @mbg.generated
     */
    private Date createDate;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Long getLicenceId() {
        return licenceId;
    }

    public void setLicenceId(Long licenceId) {
        this.licenceId = licenceId;
    }

    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getAcceptArea() {
        return acceptArea;
    }

    public void setAcceptArea(String acceptArea) {
        this.acceptArea = acceptArea;
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

    public BigDecimal getChannelCommissionRate() {
        return channelCommissionRate;
    }

    public void setChannelCommissionRate(BigDecimal channelCommissionRate) {
        this.channelCommissionRate = channelCommissionRate;
    }

    public BigDecimal getChannelCommission() {
        return channelCommission;
    }

    public void setChannelCommission(BigDecimal channelCommission) {
        this.channelCommission = channelCommission;
    }

    public String getChannelCommissionStatus() {
        return channelCommissionStatus;
    }

    public void setChannelCommissionStatus(String channelCommissionStatus) {
        this.channelCommissionStatus = channelCommissionStatus;
    }

    public Date getChannelCommissionSettledate() {
        return channelCommissionSettledate;
    }

    public void setChannelCommissionSettledate(Date channelCommissionSettledate) {
        this.channelCommissionSettledate = channelCommissionSettledate;
    }

    public Date getChannelCommissionDeductdate() {
        return channelCommissionDeductdate;
    }

    public void setChannelCommissionDeductdate(Date channelCommissionDeductdate) {
        this.channelCommissionDeductdate = channelCommissionDeductdate;
    }

    public BigDecimal getPromotionRate() {
        return promotionRate;
    }

    public void setPromotionRate(BigDecimal promotionRate) {
        this.promotionRate = promotionRate;
    }

    public BigDecimal getPromotion() {
        return promotion;
    }

    public void setPromotion(BigDecimal promotion) {
        this.promotion = promotion;
    }

    public String getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(String promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public Date getPromotionSettledate() {
        return promotionSettledate;
    }

    public void setPromotionSettledate(Date promotionSettledate) {
        this.promotionSettledate = promotionSettledate;
    }

    public Date getPromotionRepossessdate() {
        return promotionRepossessdate;
    }

    public void setPromotionRepossessdate(Date promotionRepossessdate) {
        this.promotionRepossessdate = promotionRepossessdate;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", policyId=").append(policyId);
        sb.append(", type=").append(type);
        sb.append(", acceptDate=").append(acceptDate);
        sb.append(", cancelDate=").append(cancelDate);
        sb.append(", licenceId=").append(licenceId);
        sb.append(", insuranceId=").append(insuranceId);
        sb.append(", acceptArea=").append(acceptArea);
        sb.append(", premium=").append(premium);
        sb.append(", agentId=").append(agentId);
        sb.append(", channelCommissionRate=").append(channelCommissionRate);
        sb.append(", channelCommission=").append(channelCommission);
        sb.append(", channelCommissionStatus=").append(channelCommissionStatus);
        sb.append(", channelCommissionSettledate=").append(channelCommissionSettledate);
        sb.append(", channelCommissionDeductdate=").append(channelCommissionDeductdate);
        sb.append(", promotionRate=").append(promotionRate);
        sb.append(", promotion=").append(promotion);
        sb.append(", promotionStatus=").append(promotionStatus);
        sb.append(", promotionSettledate=").append(promotionSettledate);
        sb.append(", promotionRepossessdate=").append(promotionRepossessdate);
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
        TBizShouldCommissionPool other = (TBizShouldCommissionPool) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPolicyId() == null ? other.getPolicyId() == null : this.getPolicyId().equals(other.getPolicyId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getAcceptDate() == null ? other.getAcceptDate() == null : this.getAcceptDate().equals(other.getAcceptDate()))
            && (this.getCancelDate() == null ? other.getCancelDate() == null : this.getCancelDate().equals(other.getCancelDate()))
            && (this.getLicenceId() == null ? other.getLicenceId() == null : this.getLicenceId().equals(other.getLicenceId()))
            && (this.getInsuranceId() == null ? other.getInsuranceId() == null : this.getInsuranceId().equals(other.getInsuranceId()))
            && (this.getAcceptArea() == null ? other.getAcceptArea() == null : this.getAcceptArea().equals(other.getAcceptArea()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getChannelCommissionRate() == null ? other.getChannelCommissionRate() == null : this.getChannelCommissionRate().equals(other.getChannelCommissionRate()))
            && (this.getChannelCommission() == null ? other.getChannelCommission() == null : this.getChannelCommission().equals(other.getChannelCommission()))
            && (this.getChannelCommissionStatus() == null ? other.getChannelCommissionStatus() == null : this.getChannelCommissionStatus().equals(other.getChannelCommissionStatus()))
            && (this.getChannelCommissionSettledate() == null ? other.getChannelCommissionSettledate() == null : this.getChannelCommissionSettledate().equals(other.getChannelCommissionSettledate()))
            && (this.getChannelCommissionDeductdate() == null ? other.getChannelCommissionDeductdate() == null : this.getChannelCommissionDeductdate().equals(other.getChannelCommissionDeductdate()))
            && (this.getPromotionRate() == null ? other.getPromotionRate() == null : this.getPromotionRate().equals(other.getPromotionRate()))
            && (this.getPromotion() == null ? other.getPromotion() == null : this.getPromotion().equals(other.getPromotion()))
            && (this.getPromotionStatus() == null ? other.getPromotionStatus() == null : this.getPromotionStatus().equals(other.getPromotionStatus()))
            && (this.getPromotionSettledate() == null ? other.getPromotionSettledate() == null : this.getPromotionSettledate().equals(other.getPromotionSettledate()))
            && (this.getPromotionRepossessdate() == null ? other.getPromotionRepossessdate() == null : this.getPromotionRepossessdate().equals(other.getPromotionRepossessdate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAcceptDate() == null) ? 0 : getAcceptDate().hashCode());
        result = prime * result + ((getCancelDate() == null) ? 0 : getCancelDate().hashCode());
        result = prime * result + ((getLicenceId() == null) ? 0 : getLicenceId().hashCode());
        result = prime * result + ((getInsuranceId() == null) ? 0 : getInsuranceId().hashCode());
        result = prime * result + ((getAcceptArea() == null) ? 0 : getAcceptArea().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getChannelCommissionRate() == null) ? 0 : getChannelCommissionRate().hashCode());
        result = prime * result + ((getChannelCommission() == null) ? 0 : getChannelCommission().hashCode());
        result = prime * result + ((getChannelCommissionStatus() == null) ? 0 : getChannelCommissionStatus().hashCode());
        result = prime * result + ((getChannelCommissionSettledate() == null) ? 0 : getChannelCommissionSettledate().hashCode());
        result = prime * result + ((getChannelCommissionDeductdate() == null) ? 0 : getChannelCommissionDeductdate().hashCode());
        result = prime * result + ((getPromotionRate() == null) ? 0 : getPromotionRate().hashCode());
        result = prime * result + ((getPromotion() == null) ? 0 : getPromotion().hashCode());
        result = prime * result + ((getPromotionStatus() == null) ? 0 : getPromotionStatus().hashCode());
        result = prime * result + ((getPromotionSettledate() == null) ? 0 : getPromotionSettledate().hashCode());
        result = prime * result + ((getPromotionRepossessdate() == null) ? 0 : getPromotionRepossessdate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }
}