package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TRateHistory implements Serializable {
    private String id;

    /**
     * 区域id
     *
     * @mbg.generated
     */
    private String areaId;

    /**
     * 保险公司code
     *
     * @mbg.generated
     */
    private String insCode;

    /**
     * 投保公司名称
     *
     * @mbg.generated
     */
    private String companyName;

    /**
     * 省份
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 城市
     *
     * @mbg.generated
     */
    private String city;

    /**
     * 商业险费率
     *
     * @mbg.generated
     */
    private BigDecimal vciRate;

    /**
     * 交强险费率
     *
     * @mbg.generated
     */
    private BigDecimal tciRate;

    /**
     * 创建日期
     *
     * @mbg.generated
     */
    private Date createDate;

    private String lastUpdateUser;

    private String lastUpdateType;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getInsCode() {
        return insCode;
    }

    public void setInsCode(String insCode) {
        this.insCode = insCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public BigDecimal getVciRate() {
        return vciRate;
    }

    public void setVciRate(BigDecimal vciRate) {
        this.vciRate = vciRate;
    }

    public BigDecimal getTciRate() {
        return tciRate;
    }

    public void setTciRate(BigDecimal tciRate) {
        this.tciRate = tciRate;
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

    public String getLastUpdateType() {
        return lastUpdateType;
    }

    public void setLastUpdateType(String lastUpdateType) {
        this.lastUpdateType = lastUpdateType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", areaId=").append(areaId);
        sb.append(", insCode=").append(insCode);
        sb.append(", companyName=").append(companyName);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", vciRate=").append(vciRate);
        sb.append(", tciRate=").append(tciRate);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateType=").append(lastUpdateType);
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
        TRateHistory other = (TRateHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getInsCode() == null ? other.getInsCode() == null : this.getInsCode().equals(other.getInsCode()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getVciRate() == null ? other.getVciRate() == null : this.getVciRate().equals(other.getVciRate()))
            && (this.getTciRate() == null ? other.getTciRate() == null : this.getTciRate().equals(other.getTciRate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastUpdateUser() == null ? other.getLastUpdateUser() == null : this.getLastUpdateUser().equals(other.getLastUpdateUser()))
            && (this.getLastUpdateType() == null ? other.getLastUpdateType() == null : this.getLastUpdateType().equals(other.getLastUpdateType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getInsCode() == null) ? 0 : getInsCode().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getVciRate() == null) ? 0 : getVciRate().hashCode());
        result = prime * result + ((getTciRate() == null) ? 0 : getTciRate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateType() == null) ? 0 : getLastUpdateType().hashCode());
        return result;
    }
}