package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TBizPaidFlow implements Serializable {
    private Long id;

    /**
     * 保单id
     *
     * @mbg.generated
     */
    private Long policyId;

    /**
     * 商户订单号，需保持唯一性
     *
     * @mbg.generated
     */
    private String partnerTradeNo;

    /**
     * 用户openid
     *
     * @mbg.generated
     */
    private String openId;

    /**
     * 收款用户姓名
     *
     * @mbg.generated
     */
    private String reUserName;

    /**
     * 微信订单号
     *
     * @mbg.generated
     */
    private String paymentNo;

    /**
     * 企业付款成功时间
     *
     * @mbg.generated
     */
    private Date paymentTime;

    /**
     * 企业付款金额，单位为分
     *
     * @mbg.generated
     */
    private Integer amount;

    /**
     * 企业付款操作说明信息。必填。
     *
     * @mbg.generated
     */
    private String describe;

    /**
     * 调用接口的机器Ip地址
     *
     * @mbg.generated
     */
    private String spbillCreateIp;

    /**
     * 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     *
     * @mbg.generated
     */
    private String returnCode;

    /**
     * 返回信息，如非空，为错误原因
     *
     * @mbg.generated
     */
    private String returnMsg;

    /**
     * SUCCESS/FAIL
     *
     * @mbg.generated
     */
    private String resultCode;

    /**
     * 错误码信息
     *
     * @mbg.generated
     */
    private String errCode;

    /**
     * 结果信息描述
     *
     * @mbg.generated
     */
    private String errCodeDes;

    /**
     * 创建时间
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

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPartnerTradeNo() {
        return partnerTradeNo;
    }

    public void setPartnerTradeNo(String partnerTradeNo) {
        this.partnerTradeNo = partnerTradeNo;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getReUserName() {
        return reUserName;
    }

    public void setReUserName(String reUserName) {
        this.reUserName = reUserName;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
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
        sb.append(", policyId=").append(policyId);
        sb.append(", partnerTradeNo=").append(partnerTradeNo);
        sb.append(", openId=").append(openId);
        sb.append(", reUserName=").append(reUserName);
        sb.append(", paymentNo=").append(paymentNo);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", amount=").append(amount);
        sb.append(", describe=").append(describe);
        sb.append(", spbillCreateIp=").append(spbillCreateIp);
        sb.append(", returnCode=").append(returnCode);
        sb.append(", returnMsg=").append(returnMsg);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", errCode=").append(errCode);
        sb.append(", errCodeDes=").append(errCodeDes);
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
        TBizPaidFlow other = (TBizPaidFlow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPolicyId() == null ? other.getPolicyId() == null : this.getPolicyId().equals(other.getPolicyId()))
            && (this.getPartnerTradeNo() == null ? other.getPartnerTradeNo() == null : this.getPartnerTradeNo().equals(other.getPartnerTradeNo()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getReUserName() == null ? other.getReUserName() == null : this.getReUserName().equals(other.getReUserName()))
            && (this.getPaymentNo() == null ? other.getPaymentNo() == null : this.getPaymentNo().equals(other.getPaymentNo()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDescribe() == null ? other.getDescribe() == null : this.getDescribe().equals(other.getDescribe()))
            && (this.getSpbillCreateIp() == null ? other.getSpbillCreateIp() == null : this.getSpbillCreateIp().equals(other.getSpbillCreateIp()))
            && (this.getReturnCode() == null ? other.getReturnCode() == null : this.getReturnCode().equals(other.getReturnCode()))
            && (this.getReturnMsg() == null ? other.getReturnMsg() == null : this.getReturnMsg().equals(other.getReturnMsg()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getErrCodeDes() == null ? other.getErrCodeDes() == null : this.getErrCodeDes().equals(other.getErrCodeDes()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        result = prime * result + ((getPartnerTradeNo() == null) ? 0 : getPartnerTradeNo().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getReUserName() == null) ? 0 : getReUserName().hashCode());
        result = prime * result + ((getPaymentNo() == null) ? 0 : getPaymentNo().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDescribe() == null) ? 0 : getDescribe().hashCode());
        result = prime * result + ((getSpbillCreateIp() == null) ? 0 : getSpbillCreateIp().hashCode());
        result = prime * result + ((getReturnCode() == null) ? 0 : getReturnCode().hashCode());
        result = prime * result + ((getReturnMsg() == null) ? 0 : getReturnMsg().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getErrCodeDes() == null) ? 0 : getErrCodeDes().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }
}