package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TVehicleTaxInfo implements Serializable {
    /**
     * id，主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 订单id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 纳税人姓名
     *
     * @mbg.generated
     */
    private String taxPayerName;

    /**
     * 纳税人身份证号
     *
     * @mbg.generated
     */
    private String taxPayerNo;

    /**
     * 行驶证登记地址码
     *
     * @mbg.generated
     */
    private String taxAuthCode;

    /**
     * 街道乡镇代码
     *
     * @mbg.generated
     */
    private String taxCountryCode;

    /**
     * 税务机关代码
     *
     * @mbg.generated
     */
    private String taxOrg;

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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getTaxPayerName() {
        return taxPayerName;
    }

    public void setTaxPayerName(String taxPayerName) {
        this.taxPayerName = taxPayerName;
    }

    public String getTaxPayerNo() {
        return taxPayerNo;
    }

    public void setTaxPayerNo(String taxPayerNo) {
        this.taxPayerNo = taxPayerNo;
    }

    public String getTaxAuthCode() {
        return taxAuthCode;
    }

    public void setTaxAuthCode(String taxAuthCode) {
        this.taxAuthCode = taxAuthCode;
    }

    public String getTaxCountryCode() {
        return taxCountryCode;
    }

    public void setTaxCountryCode(String taxCountryCode) {
        this.taxCountryCode = taxCountryCode;
    }

    public String getTaxOrg() {
        return taxOrg;
    }

    public void setTaxOrg(String taxOrg) {
        this.taxOrg = taxOrg;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", taxPayerName=").append(taxPayerName);
        sb.append(", taxPayerNo=").append(taxPayerNo);
        sb.append(", taxAuthCode=").append(taxAuthCode);
        sb.append(", taxCountryCode=").append(taxCountryCode);
        sb.append(", taxOrg=").append(taxOrg);
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
        TVehicleTaxInfo other = (TVehicleTaxInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getTaxPayerName() == null ? other.getTaxPayerName() == null : this.getTaxPayerName().equals(other.getTaxPayerName()))
            && (this.getTaxPayerNo() == null ? other.getTaxPayerNo() == null : this.getTaxPayerNo().equals(other.getTaxPayerNo()))
            && (this.getTaxAuthCode() == null ? other.getTaxAuthCode() == null : this.getTaxAuthCode().equals(other.getTaxAuthCode()))
            && (this.getTaxCountryCode() == null ? other.getTaxCountryCode() == null : this.getTaxCountryCode().equals(other.getTaxCountryCode()))
            && (this.getTaxOrg() == null ? other.getTaxOrg() == null : this.getTaxOrg().equals(other.getTaxOrg()))
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
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getTaxPayerName() == null) ? 0 : getTaxPayerName().hashCode());
        result = prime * result + ((getTaxPayerNo() == null) ? 0 : getTaxPayerNo().hashCode());
        result = prime * result + ((getTaxAuthCode() == null) ? 0 : getTaxAuthCode().hashCode());
        result = prime * result + ((getTaxCountryCode() == null) ? 0 : getTaxCountryCode().hashCode());
        result = prime * result + ((getTaxOrg() == null) ? 0 : getTaxOrg().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return result;
    }
}