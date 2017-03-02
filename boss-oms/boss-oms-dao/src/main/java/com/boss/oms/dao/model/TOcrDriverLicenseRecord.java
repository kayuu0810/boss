package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TOcrDriverLicenseRecord implements Serializable {
    private Long id;

    /**
     * 请求流水号
     *
     * @mbg.generated
     */
    private String transNo;

    /**
     * 姓名
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 身份证
     *
     * @mbg.generated
     */
    private String idNo;

    /**
     * 性别
     *
     * @mbg.generated
     */
    private String sex;

    /**
     * 国籍
     *
     * @mbg.generated
     */
    private String nationality;

    /**
     * 住址
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 出生日期
     *
     * @mbg.generated
     */
    private String dateOfBirth;

    /**
     * 初次领证日期
     *
     * @mbg.generated
     */
    private String dateOfFirstIssue;

    /**
     * 准驾车型
     *
     * @mbg.generated
     */
    private String clazz;

    /**
     * 有效期限
     *
     * @mbg.generated
     */
    private String validPeriod;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 更新人
     *
     * @mbg.generated
     */
    private String updateBy;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfFirstIssue() {
        return dateOfFirstIssue;
    }

    public void setDateOfFirstIssue(String dateOfFirstIssue) {
        this.dateOfFirstIssue = dateOfFirstIssue;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", transNo=").append(transNo);
        sb.append(", name=").append(name);
        sb.append(", idNo=").append(idNo);
        sb.append(", sex=").append(sex);
        sb.append(", nationality=").append(nationality);
        sb.append(", address=").append(address);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", dateOfFirstIssue=").append(dateOfFirstIssue);
        sb.append(", clazz=").append(clazz);
        sb.append(", validPeriod=").append(validPeriod);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
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
        TOcrDriverLicenseRecord other = (TOcrDriverLicenseRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTransNo() == null ? other.getTransNo() == null : this.getTransNo().equals(other.getTransNo()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdNo() == null ? other.getIdNo() == null : this.getIdNo().equals(other.getIdNo()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDateOfBirth() == null ? other.getDateOfBirth() == null : this.getDateOfBirth().equals(other.getDateOfBirth()))
            && (this.getDateOfFirstIssue() == null ? other.getDateOfFirstIssue() == null : this.getDateOfFirstIssue().equals(other.getDateOfFirstIssue()))
            && (this.getClazz() == null ? other.getClazz() == null : this.getClazz().equals(other.getClazz()))
            && (this.getValidPeriod() == null ? other.getValidPeriod() == null : this.getValidPeriod().equals(other.getValidPeriod()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTransNo() == null) ? 0 : getTransNo().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdNo() == null) ? 0 : getIdNo().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDateOfBirth() == null) ? 0 : getDateOfBirth().hashCode());
        result = prime * result + ((getDateOfFirstIssue() == null) ? 0 : getDateOfFirstIssue().hashCode());
        result = prime * result + ((getClazz() == null) ? 0 : getClazz().hashCode());
        result = prime * result + ((getValidPeriod() == null) ? 0 : getValidPeriod().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        return result;
    }
}