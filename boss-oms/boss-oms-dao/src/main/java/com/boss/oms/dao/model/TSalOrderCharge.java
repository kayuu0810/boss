package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSalOrderCharge implements Serializable {
    private Long id;

    /**
     * 支付链接
     *
     * @mbg.generated
     */
    private String payUrl;

    /**
     * 支付业务流水号
     *
     * @mbg.generated
     */
    private String payBusinessCode;

    /**
     * 订单ID
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 支付方式
     *
     * @mbg.generated
     */
    private String payMethod;

    /**
     * 支付金额
     *
     * @mbg.generated
     */
    private BigDecimal payAmount;

    /**
     * 支付流水号
     *
     * @mbg.generated
     */
    private String payCode;

    /**
     * 收款方(通道编码)
     *
     * @mbg.generated
     */
    private String receiver;

    /**
     * 实际支付时间
     *
     * @mbg.generated
     */
    private Date realityPayTime;

    /**
     * 支付状态 (10-处理中  15-成功  20-失败  25-作废)
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

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getPayBusinessCode() {
        return payBusinessCode;
    }

    public void setPayBusinessCode(String payBusinessCode) {
        this.payBusinessCode = payBusinessCode;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Date getRealityPayTime() {
        return realityPayTime;
    }

    public void setRealityPayTime(Date realityPayTime) {
        this.realityPayTime = realityPayTime;
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
        sb.append(", payUrl=").append(payUrl);
        sb.append(", payBusinessCode=").append(payBusinessCode);
        sb.append(", orderId=").append(orderId);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", payCode=").append(payCode);
        sb.append(", receiver=").append(receiver);
        sb.append(", realityPayTime=").append(realityPayTime);
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
        TSalOrderCharge other = (TSalOrderCharge) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPayUrl() == null ? other.getPayUrl() == null : this.getPayUrl().equals(other.getPayUrl()))
            && (this.getPayBusinessCode() == null ? other.getPayBusinessCode() == null : this.getPayBusinessCode().equals(other.getPayBusinessCode()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPayMethod() == null ? other.getPayMethod() == null : this.getPayMethod().equals(other.getPayMethod()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getPayCode() == null ? other.getPayCode() == null : this.getPayCode().equals(other.getPayCode()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getRealityPayTime() == null ? other.getRealityPayTime() == null : this.getRealityPayTime().equals(other.getRealityPayTime()))
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
        result = prime * result + ((getPayUrl() == null) ? 0 : getPayUrl().hashCode());
        result = prime * result + ((getPayBusinessCode() == null) ? 0 : getPayBusinessCode().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPayMethod() == null) ? 0 : getPayMethod().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getPayCode() == null) ? 0 : getPayCode().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getRealityPayTime() == null) ? 0 : getRealityPayTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return result;
    }
}