package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSalOrder implements Serializable {
    private Long id;

    /**
     * 交易流水号
     *
     * @mbg.generated
     */
    private String transNo;

    /**
     * 订单号
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     * CORE的订单号
     *
     * @mbg.generated
     */
    private String coreOrderNo;

    /**
     * 保险公司订单号
     *
     * @mbg.generated
     */
    private String insOrderNo;

    /**
     * 录单代理人ID
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * 录单用户OPEN_ID（不一定是代理人）
     *
     * @mbg.generated
     */
    private String openId;

    /**
     * 录单用户OPEN_ID
     *
     * @mbg.generated
     */
    private String customerOpenId;

    /**
     * 城市来源
     *
     * @mbg.generated
     */
    private String fromCity;

    /**
     * 订单金额
     *
     * @mbg.generated
     */
    private BigDecimal payAmount;

    /**
     * 是否配送纸质保单(1-配送  0-不配送)
     *
     * @mbg.generated
     */
    private String paperPolicyDispatchFlag;

    /**
     * 是否配送发票(1-配送  0-不配送)
     *
     * @mbg.generated
     */
    private String invoiceDispatchFlag;

    /**
     * 订单状态(10-初创建  15-待支付  20-已支付  25-已完成  30-作废)
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 订单创建人
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * 订单创建时间
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 订单取消人
     *
     * @mbg.generated
     */
    private String cancelUser;

    /**
     * 订单取消时间
     *
     * @mbg.generated
     */
    private Date cancelDate;

    /**
     * 订单取消原因
     *
     * @mbg.generated
     */
    private String cancelReason;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

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

    /**
     * 逻辑删除（1：已删除 0：未删除）
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     * 渠道 100:车车 200 通宝自身
     *
     * @mbg.generated
     */
    private String fromChannel;

    /**
     * 对账状态
     *
     * @mbg.generated
     */
    private String balanceState;

    private String routeCode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCoreOrderNo() {
        return coreOrderNo;
    }

    public void setCoreOrderNo(String coreOrderNo) {
        this.coreOrderNo = coreOrderNo;
    }

    public String getInsOrderNo() {
        return insOrderNo;
    }

    public void setInsOrderNo(String insOrderNo) {
        this.insOrderNo = insOrderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getCustomerOpenId() {
        return customerOpenId;
    }

    public void setCustomerOpenId(String customerOpenId) {
        this.customerOpenId = customerOpenId;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getPaperPolicyDispatchFlag() {
        return paperPolicyDispatchFlag;
    }

    public void setPaperPolicyDispatchFlag(String paperPolicyDispatchFlag) {
        this.paperPolicyDispatchFlag = paperPolicyDispatchFlag;
    }

    public String getInvoiceDispatchFlag() {
        return invoiceDispatchFlag;
    }

    public void setInvoiceDispatchFlag(String invoiceDispatchFlag) {
        this.invoiceDispatchFlag = invoiceDispatchFlag;
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

    public String getCancelUser() {
        return cancelUser;
    }

    public void setCancelUser(String cancelUser) {
        this.cancelUser = cancelUser;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getFromChannel() {
        return fromChannel;
    }

    public void setFromChannel(String fromChannel) {
        this.fromChannel = fromChannel;
    }

    public String getBalanceState() {
        return balanceState;
    }

    public void setBalanceState(String balanceState) {
        this.balanceState = balanceState;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", transNo=").append(transNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", coreOrderNo=").append(coreOrderNo);
        sb.append(", insOrderNo=").append(insOrderNo);
        sb.append(", userId=").append(userId);
        sb.append(", openId=").append(openId);
        sb.append(", customerOpenId=").append(customerOpenId);
        sb.append(", fromCity=").append(fromCity);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", paperPolicyDispatchFlag=").append(paperPolicyDispatchFlag);
        sb.append(", invoiceDispatchFlag=").append(invoiceDispatchFlag);
        sb.append(", status=").append(status);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", cancelUser=").append(cancelUser);
        sb.append(", cancelDate=").append(cancelDate);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", remark=").append(remark);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", fromChannel=").append(fromChannel);
        sb.append(", balanceState=").append(balanceState);
        sb.append(", routeCode=").append(routeCode);
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
        TSalOrder other = (TSalOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTransNo() == null ? other.getTransNo() == null : this.getTransNo().equals(other.getTransNo()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getCoreOrderNo() == null ? other.getCoreOrderNo() == null : this.getCoreOrderNo().equals(other.getCoreOrderNo()))
            && (this.getInsOrderNo() == null ? other.getInsOrderNo() == null : this.getInsOrderNo().equals(other.getInsOrderNo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getCustomerOpenId() == null ? other.getCustomerOpenId() == null : this.getCustomerOpenId().equals(other.getCustomerOpenId()))
            && (this.getFromCity() == null ? other.getFromCity() == null : this.getFromCity().equals(other.getFromCity()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getPaperPolicyDispatchFlag() == null ? other.getPaperPolicyDispatchFlag() == null : this.getPaperPolicyDispatchFlag().equals(other.getPaperPolicyDispatchFlag()))
            && (this.getInvoiceDispatchFlag() == null ? other.getInvoiceDispatchFlag() == null : this.getInvoiceDispatchFlag().equals(other.getInvoiceDispatchFlag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCancelUser() == null ? other.getCancelUser() == null : this.getCancelUser().equals(other.getCancelUser()))
            && (this.getCancelDate() == null ? other.getCancelDate() == null : this.getCancelDate().equals(other.getCancelDate()))
            && (this.getCancelReason() == null ? other.getCancelReason() == null : this.getCancelReason().equals(other.getCancelReason()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getLastUpdateUser() == null ? other.getLastUpdateUser() == null : this.getLastUpdateUser().equals(other.getLastUpdateUser()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getFromChannel() == null ? other.getFromChannel() == null : this.getFromChannel().equals(other.getFromChannel()))
            && (this.getBalanceState() == null ? other.getBalanceState() == null : this.getBalanceState().equals(other.getBalanceState()))
            && (this.getRouteCode() == null ? other.getRouteCode() == null : this.getRouteCode().equals(other.getRouteCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTransNo() == null) ? 0 : getTransNo().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getCoreOrderNo() == null) ? 0 : getCoreOrderNo().hashCode());
        result = prime * result + ((getInsOrderNo() == null) ? 0 : getInsOrderNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getCustomerOpenId() == null) ? 0 : getCustomerOpenId().hashCode());
        result = prime * result + ((getFromCity() == null) ? 0 : getFromCity().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getPaperPolicyDispatchFlag() == null) ? 0 : getPaperPolicyDispatchFlag().hashCode());
        result = prime * result + ((getInvoiceDispatchFlag() == null) ? 0 : getInvoiceDispatchFlag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCancelUser() == null) ? 0 : getCancelUser().hashCode());
        result = prime * result + ((getCancelDate() == null) ? 0 : getCancelDate().hashCode());
        result = prime * result + ((getCancelReason() == null) ? 0 : getCancelReason().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getFromChannel() == null) ? 0 : getFromChannel().hashCode());
        result = prime * result + ((getBalanceState() == null) ? 0 : getBalanceState().hashCode());
        result = prime * result + ((getRouteCode() == null) ? 0 : getRouteCode().hashCode());
        return result;
    }
}