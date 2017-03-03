package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSalPolicyHolder implements Serializable {
    private Long id;

    /**
     * fk_mb_policy_id 保单ID
     *
     * @mbg.generated
     */
    private Long policyId;

    /**
     * 姓名
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 姓名汉语拼音
     *
     * @mbg.generated
     */
    private String namePinyin;

    /**
     * 英文名称
     *
     * @mbg.generated
     */
    private String englishName;

    /**
     * 性别（1：男 0：女）
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
     * 身高cm
     *
     * @mbg.generated
     */
    private BigDecimal height;

    /**
     * 体重kg
     *
     * @mbg.generated
     */
    private BigDecimal weight;

    /**
     * 职业
     *
     * @mbg.generated
     */
    private String profession;

    /**
     * 行业
     *
     * @mbg.generated
     */
    private String indusiry;

    /**
     * 工种
     *
     * @mbg.generated
     */
    private String workType;

    /**
     * 邮件
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 固定区号
     *
     * @mbg.generated
     */
    private String areaCode;

    /**
     * 固定电话
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * 固定电话分机
     *
     * @mbg.generated
     */
    private String extension;

    /**
     * 是否吸烟
     *
     * @mbg.generated
     */
    private String isSmoke;

    /**
     * 居住国家
     *
     * @mbg.generated
     */
    private String resideCountry;

    /**
     * 国籍
     *
     * @mbg.generated
     */
    private String nationality;

    /**
     * 省
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 市（区）
     *
     * @mbg.generated
     */
    private String city;

    /**
     * 区
     *
     * @mbg.generated
     */
    private String area;

    /**
     * 投保人身份证地址
     *
     * @mbg.generated
     */
    private String certificateAddress;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
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

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getIndusiry() {
        return indusiry;
    }

    public void setIndusiry(String indusiry) {
        this.indusiry = indusiry;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getIsSmoke() {
        return isSmoke;
    }

    public void setIsSmoke(String isSmoke) {
        this.isSmoke = isSmoke;
    }

    public String getResideCountry() {
        return resideCountry;
    }

    public void setResideCountry(String resideCountry) {
        this.resideCountry = resideCountry;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCertificateAddress() {
        return certificateAddress;
    }

    public void setCertificateAddress(String certificateAddress) {
        this.certificateAddress = certificateAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", policyId=").append(policyId);
        sb.append(", name=").append(name);
        sb.append(", namePinyin=").append(namePinyin);
        sb.append(", englishName=").append(englishName);
        sb.append(", sex=").append(sex);
        sb.append(", certificateType=").append(certificateType);
        sb.append(", certificateNo=").append(certificateNo);
        sb.append(", validStartDate=").append(validStartDate);
        sb.append(", validEndDate=").append(validEndDate);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", profession=").append(profession);
        sb.append(", indusiry=").append(indusiry);
        sb.append(", workType=").append(workType);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", telephone=").append(telephone);
        sb.append(", extension=").append(extension);
        sb.append(", isSmoke=").append(isSmoke);
        sb.append(", resideCountry=").append(resideCountry);
        sb.append(", nationality=").append(nationality);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", certificateAddress=").append(certificateAddress);
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
        TSalPolicyHolder other = (TSalPolicyHolder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPolicyId() == null ? other.getPolicyId() == null : this.getPolicyId().equals(other.getPolicyId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNamePinyin() == null ? other.getNamePinyin() == null : this.getNamePinyin().equals(other.getNamePinyin()))
            && (this.getEnglishName() == null ? other.getEnglishName() == null : this.getEnglishName().equals(other.getEnglishName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getCertificateType() == null ? other.getCertificateType() == null : this.getCertificateType().equals(other.getCertificateType()))
            && (this.getCertificateNo() == null ? other.getCertificateNo() == null : this.getCertificateNo().equals(other.getCertificateNo()))
            && (this.getValidStartDate() == null ? other.getValidStartDate() == null : this.getValidStartDate().equals(other.getValidStartDate()))
            && (this.getValidEndDate() == null ? other.getValidEndDate() == null : this.getValidEndDate().equals(other.getValidEndDate()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getProfession() == null ? other.getProfession() == null : this.getProfession().equals(other.getProfession()))
            && (this.getIndusiry() == null ? other.getIndusiry() == null : this.getIndusiry().equals(other.getIndusiry()))
            && (this.getWorkType() == null ? other.getWorkType() == null : this.getWorkType().equals(other.getWorkType()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getExtension() == null ? other.getExtension() == null : this.getExtension().equals(other.getExtension()))
            && (this.getIsSmoke() == null ? other.getIsSmoke() == null : this.getIsSmoke().equals(other.getIsSmoke()))
            && (this.getResideCountry() == null ? other.getResideCountry() == null : this.getResideCountry().equals(other.getResideCountry()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getCertificateAddress() == null ? other.getCertificateAddress() == null : this.getCertificateAddress().equals(other.getCertificateAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNamePinyin() == null) ? 0 : getNamePinyin().hashCode());
        result = prime * result + ((getEnglishName() == null) ? 0 : getEnglishName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCertificateType() == null) ? 0 : getCertificateType().hashCode());
        result = prime * result + ((getCertificateNo() == null) ? 0 : getCertificateNo().hashCode());
        result = prime * result + ((getValidStartDate() == null) ? 0 : getValidStartDate().hashCode());
        result = prime * result + ((getValidEndDate() == null) ? 0 : getValidEndDate().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getProfession() == null) ? 0 : getProfession().hashCode());
        result = prime * result + ((getIndusiry() == null) ? 0 : getIndusiry().hashCode());
        result = prime * result + ((getWorkType() == null) ? 0 : getWorkType().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getExtension() == null) ? 0 : getExtension().hashCode());
        result = prime * result + ((getIsSmoke() == null) ? 0 : getIsSmoke().hashCode());
        result = prime * result + ((getResideCountry() == null) ? 0 : getResideCountry().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getCertificateAddress() == null) ? 0 : getCertificateAddress().hashCode());
        return result;
    }
}