package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSalPolicyBeneficiary implements Serializable {
    private Long id;

    /**
     * 所属保单id fk_mb_policy_id
     *
     * @mbg.generated
     */
    private Long policyId;

    /**
     * 与被保人关系
     *
     * @mbg.generated
     */
    private String insuredRelation;

    /**
     * 姓名
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 性别
     *
     * @mbg.generated
     */
    private String sex;

    /**
     * 证件类型
     *
     * @mbg.generated
     */
    private String certificateType;

    /**
     * 证件号码
     *
     * @mbg.generated
     */
    private String certificateNo;

    /**
     * 国籍
     *
     * @mbg.generated
     */
    private String nationality;

    /**
     * 证件有效起期
     *
     * @mbg.generated
     */
    private Date validStartDate;

    /**
     * 证件有效止期
     *
     * @mbg.generated
     */
    private Date validEndDate;

    /**
     * 出生日期
     *
     * @mbg.generated
     */
    private Date birthdate;

    /**
     * 受益比例
     *
     * @mbg.generated
     */
    private BigDecimal benefitRatio;

    /**
     * 受益顺序
     *
     * @mbg.generated
     */
    private Integer benefitOrder;

    /**
     * 我的保单被保人ID
     *
     * @mbg.generated
     */
    private String insuredId;

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

    public String getInsuredRelation() {
        return insuredRelation;
    }

    public void setInsuredRelation(String insuredRelation) {
        this.insuredRelation = insuredRelation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getValidStartDate() {
        return validStartDate;
    }

    public void setValidStartDate(Date validStartDate) {
        this.validStartDate = validStartDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public BigDecimal getBenefitRatio() {
        return benefitRatio;
    }

    public void setBenefitRatio(BigDecimal benefitRatio) {
        this.benefitRatio = benefitRatio;
    }

    public Integer getBenefitOrder() {
        return benefitOrder;
    }

    public void setBenefitOrder(Integer benefitOrder) {
        this.benefitOrder = benefitOrder;
    }

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", policyId=").append(policyId);
        sb.append(", insuredRelation=").append(insuredRelation);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", certificateType=").append(certificateType);
        sb.append(", certificateNo=").append(certificateNo);
        sb.append(", nationality=").append(nationality);
        sb.append(", validStartDate=").append(validStartDate);
        sb.append(", validEndDate=").append(validEndDate);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", benefitRatio=").append(benefitRatio);
        sb.append(", benefitOrder=").append(benefitOrder);
        sb.append(", insuredId=").append(insuredId);
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
        TSalPolicyBeneficiary other = (TSalPolicyBeneficiary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPolicyId() == null ? other.getPolicyId() == null : this.getPolicyId().equals(other.getPolicyId()))
            && (this.getInsuredRelation() == null ? other.getInsuredRelation() == null : this.getInsuredRelation().equals(other.getInsuredRelation()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getCertificateType() == null ? other.getCertificateType() == null : this.getCertificateType().equals(other.getCertificateType()))
            && (this.getCertificateNo() == null ? other.getCertificateNo() == null : this.getCertificateNo().equals(other.getCertificateNo()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getValidStartDate() == null ? other.getValidStartDate() == null : this.getValidStartDate().equals(other.getValidStartDate()))
            && (this.getValidEndDate() == null ? other.getValidEndDate() == null : this.getValidEndDate().equals(other.getValidEndDate()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getBenefitRatio() == null ? other.getBenefitRatio() == null : this.getBenefitRatio().equals(other.getBenefitRatio()))
            && (this.getBenefitOrder() == null ? other.getBenefitOrder() == null : this.getBenefitOrder().equals(other.getBenefitOrder()))
            && (this.getInsuredId() == null ? other.getInsuredId() == null : this.getInsuredId().equals(other.getInsuredId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        result = prime * result + ((getInsuredRelation() == null) ? 0 : getInsuredRelation().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCertificateType() == null) ? 0 : getCertificateType().hashCode());
        result = prime * result + ((getCertificateNo() == null) ? 0 : getCertificateNo().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getValidStartDate() == null) ? 0 : getValidStartDate().hashCode());
        result = prime * result + ((getValidEndDate() == null) ? 0 : getValidEndDate().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getBenefitRatio() == null) ? 0 : getBenefitRatio().hashCode());
        result = prime * result + ((getBenefitOrder() == null) ? 0 : getBenefitOrder().hashCode());
        result = prime * result + ((getInsuredId() == null) ? 0 : getInsuredId().hashCode());
        return result;
    }
}