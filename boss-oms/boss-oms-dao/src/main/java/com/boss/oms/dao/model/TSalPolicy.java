package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSalPolicy implements Serializable {
    private Long id;

    /**
     * 订单ID
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 车辆ID-vehicleDetailID
     *
     * @mbg.generated
     */
    private Long vehicleId;

    /**
     * 保单号
     *
     * @mbg.generated
     */
    private String policyCode;

    /**
     * 投保单号
     *
     * @mbg.generated
     */
    private String applyCode;

    /**
     * 保单类别（ 02-交强险保单  03-商业险保单 99-其他）
     *
     * @mbg.generated
     */
    private String policyType;

    /**
     * 承保时间
     *
     * @mbg.generated
     */
    private Date underwriteTime;

    /**
     * 保单来源（冗余-未来可能会分公众号、APP）
     *
     * @mbg.generated
     */
    private String policySource;

    /**
     * 保险公司(存保险公司编码)
     *
     * @mbg.generated
     */
    private String fromInsurer;

    /**
     * 保单服务机构
     *
     * @mbg.generated
     */
    private String serverAgency;

    /**
     * 销售人员代码
     *
     * @mbg.generated
     */
    private String salesCode;

    /**
     * 销售人员名称
     *
     * @mbg.generated
     */
    private String salesName;

    /**
     * 缴费期间类型 0无关 1趸交 2按年限交 3按年交至某确定年龄 4终生交费 5不定期交 6按月交
     *
     * @mbg.generated
     */
    private String chargeType;

    /**
     * 缴费期间
     *
     * @mbg.generated
     */
    private Integer chargePeriod;

    /**
     * 第一次缴费日期
     *
     * @mbg.generated
     */
    private Date fristChargeDate;

    /**
     * 最后一次缴费日期
     *
     * @mbg.generated
     */
    private Date lastChargeDate;

    /**
     * 下次缴费日期
     *
     * @mbg.generated
     */
    private Date nextChargeDate;

    /**
     * 缴费方式 (1 趸交 2 月交 3 季交  4半年缴 5 年交)
     *
     * @mbg.generated
     */
    private String chargeWay;

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
     * 投保日期 (交单日)
     *
     * @mbg.generated
     */
    private Date orderDate;

    /**
     * 生效日期
     *
     * @mbg.generated
     */
    private Date effectDate;

    /**
     * 保险起期
     *
     * @mbg.generated
     */
    private Date startDate;

    /**
     * 保险止期
     *
     * @mbg.generated
     */
    private Date endDate;

    /**
     * 保险期类型(0无关1保终身2按年限保3保至某确定年龄4按月保5按天保)
     *
     * @mbg.generated
     */
    private String coverageType;

    /**
     * 保险期
     *
     * @mbg.generated
     */
    private Integer coveragePeriod;

    /**
     * 是否续保（0-否  1-是）
     *
     * @mbg.generated
     */
    private String isCharge;

    /**
     * 车船税
     *
     * @mbg.generated
     */
    private Double vehicleTax;

    /**
     * 协议URL
     *
     * @mbg.generated
     */
    private String noticeUrl;

    /**
     * 保单状态(10-保单初创建  15-核保中  16-核保成功  17-核保失败  18-二次核保成功  19-二次核保失败  20-拒保  25-承保成功  30-承保失败  35-已退保  40-终止  45-作废)  
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

    /**
     * 逻辑删除（1：已删除 0：未删除）
     *
     * @mbg.generated
     */
    private Integer isDelete;

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

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Date getUnderwriteTime() {
        return underwriteTime;
    }

    public void setUnderwriteTime(Date underwriteTime) {
        this.underwriteTime = underwriteTime;
    }

    public String getPolicySource() {
        return policySource;
    }

    public void setPolicySource(String policySource) {
        this.policySource = policySource;
    }

    public String getFromInsurer() {
        return fromInsurer;
    }

    public void setFromInsurer(String fromInsurer) {
        this.fromInsurer = fromInsurer;
    }

    public String getServerAgency() {
        return serverAgency;
    }

    public void setServerAgency(String serverAgency) {
        this.serverAgency = serverAgency;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getChargePeriod() {
        return chargePeriod;
    }

    public void setChargePeriod(Integer chargePeriod) {
        this.chargePeriod = chargePeriod;
    }

    public Date getFristChargeDate() {
        return fristChargeDate;
    }

    public void setFristChargeDate(Date fristChargeDate) {
        this.fristChargeDate = fristChargeDate;
    }

    public Date getLastChargeDate() {
        return lastChargeDate;
    }

    public void setLastChargeDate(Date lastChargeDate) {
        this.lastChargeDate = lastChargeDate;
    }

    public Date getNextChargeDate() {
        return nextChargeDate;
    }

    public void setNextChargeDate(Date nextChargeDate) {
        this.nextChargeDate = nextChargeDate;
    }

    public String getChargeWay() {
        return chargeWay;
    }

    public void setChargeWay(String chargeWay) {
        this.chargeWay = chargeWay;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public Integer getCoveragePeriod() {
        return coveragePeriod;
    }

    public void setCoveragePeriod(Integer coveragePeriod) {
        this.coveragePeriod = coveragePeriod;
    }

    public String getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(String isCharge) {
        this.isCharge = isCharge;
    }

    public Double getVehicleTax() {
        return vehicleTax;
    }

    public void setVehicleTax(Double vehicleTax) {
        this.vehicleTax = vehicleTax;
    }

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", vehicleId=").append(vehicleId);
        sb.append(", policyCode=").append(policyCode);
        sb.append(", applyCode=").append(applyCode);
        sb.append(", policyType=").append(policyType);
        sb.append(", underwriteTime=").append(underwriteTime);
        sb.append(", policySource=").append(policySource);
        sb.append(", fromInsurer=").append(fromInsurer);
        sb.append(", serverAgency=").append(serverAgency);
        sb.append(", salesCode=").append(salesCode);
        sb.append(", salesName=").append(salesName);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", chargePeriod=").append(chargePeriod);
        sb.append(", fristChargeDate=").append(fristChargeDate);
        sb.append(", lastChargeDate=").append(lastChargeDate);
        sb.append(", nextChargeDate=").append(nextChargeDate);
        sb.append(", chargeWay=").append(chargeWay);
        sb.append(", premium=").append(premium);
        sb.append(", rebateRatio=").append(rebateRatio);
        sb.append(", rebatePremium=").append(rebatePremium);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", effectDate=").append(effectDate);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", coverageType=").append(coverageType);
        sb.append(", coveragePeriod=").append(coveragePeriod);
        sb.append(", isCharge=").append(isCharge);
        sb.append(", vehicleTax=").append(vehicleTax);
        sb.append(", noticeUrl=").append(noticeUrl);
        sb.append(", status=").append(status);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
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
        TSalPolicy other = (TSalPolicy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()))
            && (this.getPolicyCode() == null ? other.getPolicyCode() == null : this.getPolicyCode().equals(other.getPolicyCode()))
            && (this.getApplyCode() == null ? other.getApplyCode() == null : this.getApplyCode().equals(other.getApplyCode()))
            && (this.getPolicyType() == null ? other.getPolicyType() == null : this.getPolicyType().equals(other.getPolicyType()))
            && (this.getUnderwriteTime() == null ? other.getUnderwriteTime() == null : this.getUnderwriteTime().equals(other.getUnderwriteTime()))
            && (this.getPolicySource() == null ? other.getPolicySource() == null : this.getPolicySource().equals(other.getPolicySource()))
            && (this.getFromInsurer() == null ? other.getFromInsurer() == null : this.getFromInsurer().equals(other.getFromInsurer()))
            && (this.getServerAgency() == null ? other.getServerAgency() == null : this.getServerAgency().equals(other.getServerAgency()))
            && (this.getSalesCode() == null ? other.getSalesCode() == null : this.getSalesCode().equals(other.getSalesCode()))
            && (this.getSalesName() == null ? other.getSalesName() == null : this.getSalesName().equals(other.getSalesName()))
            && (this.getChargeType() == null ? other.getChargeType() == null : this.getChargeType().equals(other.getChargeType()))
            && (this.getChargePeriod() == null ? other.getChargePeriod() == null : this.getChargePeriod().equals(other.getChargePeriod()))
            && (this.getFristChargeDate() == null ? other.getFristChargeDate() == null : this.getFristChargeDate().equals(other.getFristChargeDate()))
            && (this.getLastChargeDate() == null ? other.getLastChargeDate() == null : this.getLastChargeDate().equals(other.getLastChargeDate()))
            && (this.getNextChargeDate() == null ? other.getNextChargeDate() == null : this.getNextChargeDate().equals(other.getNextChargeDate()))
            && (this.getChargeWay() == null ? other.getChargeWay() == null : this.getChargeWay().equals(other.getChargeWay()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getRebateRatio() == null ? other.getRebateRatio() == null : this.getRebateRatio().equals(other.getRebateRatio()))
            && (this.getRebatePremium() == null ? other.getRebatePremium() == null : this.getRebatePremium().equals(other.getRebatePremium()))
            && (this.getOrderDate() == null ? other.getOrderDate() == null : this.getOrderDate().equals(other.getOrderDate()))
            && (this.getEffectDate() == null ? other.getEffectDate() == null : this.getEffectDate().equals(other.getEffectDate()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getCoverageType() == null ? other.getCoverageType() == null : this.getCoverageType().equals(other.getCoverageType()))
            && (this.getCoveragePeriod() == null ? other.getCoveragePeriod() == null : this.getCoveragePeriod().equals(other.getCoveragePeriod()))
            && (this.getIsCharge() == null ? other.getIsCharge() == null : this.getIsCharge().equals(other.getIsCharge()))
            && (this.getVehicleTax() == null ? other.getVehicleTax() == null : this.getVehicleTax().equals(other.getVehicleTax()))
            && (this.getNoticeUrl() == null ? other.getNoticeUrl() == null : this.getNoticeUrl().equals(other.getNoticeUrl()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastUpdateUser() == null ? other.getLastUpdateUser() == null : this.getLastUpdateUser().equals(other.getLastUpdateUser()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getVehicleId() == null) ? 0 : getVehicleId().hashCode());
        result = prime * result + ((getPolicyCode() == null) ? 0 : getPolicyCode().hashCode());
        result = prime * result + ((getApplyCode() == null) ? 0 : getApplyCode().hashCode());
        result = prime * result + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        result = prime * result + ((getUnderwriteTime() == null) ? 0 : getUnderwriteTime().hashCode());
        result = prime * result + ((getPolicySource() == null) ? 0 : getPolicySource().hashCode());
        result = prime * result + ((getFromInsurer() == null) ? 0 : getFromInsurer().hashCode());
        result = prime * result + ((getServerAgency() == null) ? 0 : getServerAgency().hashCode());
        result = prime * result + ((getSalesCode() == null) ? 0 : getSalesCode().hashCode());
        result = prime * result + ((getSalesName() == null) ? 0 : getSalesName().hashCode());
        result = prime * result + ((getChargeType() == null) ? 0 : getChargeType().hashCode());
        result = prime * result + ((getChargePeriod() == null) ? 0 : getChargePeriod().hashCode());
        result = prime * result + ((getFristChargeDate() == null) ? 0 : getFristChargeDate().hashCode());
        result = prime * result + ((getLastChargeDate() == null) ? 0 : getLastChargeDate().hashCode());
        result = prime * result + ((getNextChargeDate() == null) ? 0 : getNextChargeDate().hashCode());
        result = prime * result + ((getChargeWay() == null) ? 0 : getChargeWay().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getRebateRatio() == null) ? 0 : getRebateRatio().hashCode());
        result = prime * result + ((getRebatePremium() == null) ? 0 : getRebatePremium().hashCode());
        result = prime * result + ((getOrderDate() == null) ? 0 : getOrderDate().hashCode());
        result = prime * result + ((getEffectDate() == null) ? 0 : getEffectDate().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getCoverageType() == null) ? 0 : getCoverageType().hashCode());
        result = prime * result + ((getCoveragePeriod() == null) ? 0 : getCoveragePeriod().hashCode());
        result = prime * result + ((getIsCharge() == null) ? 0 : getIsCharge().hashCode());
        result = prime * result + ((getVehicleTax() == null) ? 0 : getVehicleTax().hashCode());
        result = prime * result + ((getNoticeUrl() == null) ? 0 : getNoticeUrl().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}