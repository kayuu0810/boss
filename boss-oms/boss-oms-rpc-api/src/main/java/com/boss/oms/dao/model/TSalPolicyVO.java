package com.boss.oms.dao.model;

import com.boss.oms.dao.model.base.BaseVO;

import java.io.Serializable;

/**
 * 保单VO
 * Created by Kayuu on 2017/3/5.
 */
public class TSalPolicyVO extends BaseVO implements Serializable{
    private Long id;
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 保单号
     */
    private String policyCode;
    /**
     * 业务员姓名
     */
    private String agentName;

    /**
     * 车牌号
     */
    private String licenseNo;

    /**
     * 投保人
     */
    private String holderName;

    /**
     * 被保人
     */
    private String insuredName;

    /**
     * 实际支付金额
     */
    private double padAmount;


    /**
     * 支付金额
     */
    private double payAmount;

    /**
     * 车主
     */
    private String carOwner;

    /**
     * 保险公司
     */
    private String insuranceCompany;

    /**
     * 支付时间
     */
    private String payTime;

    /**
     * 保险公司名
     */
    private String insuranceName;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public double getPadAmount() {
        return padAmount;
    }

    public void setPadAmount(double padAmount) {
        this.padAmount = padAmount;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }
}
