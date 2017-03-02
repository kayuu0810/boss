package com.boss.oms.dao.model;

import java.io.Serializable;

public class TBaseAddressCode implements Serializable {
    private String code;

    private String name;

    /**
     * 地区
     *
     * @mbg.generated
     */
    private String parentCode;

    /**
     * 是否为直辖市（1：是 0：不是）
     *
     * @mbg.generated
     */
    private String isMunicipality;

    /**
     * 城市级别
     *
     * @mbg.generated
     */
    private Integer cityLevel;

    /**
     * 车牌号前缀
     *
     * @mbg.generated
     */
    private String licenseNoPrefix;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getIsMunicipality() {
        return isMunicipality;
    }

    public void setIsMunicipality(String isMunicipality) {
        this.isMunicipality = isMunicipality;
    }

    public Integer getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(Integer cityLevel) {
        this.cityLevel = cityLevel;
    }

    public String getLicenseNoPrefix() {
        return licenseNoPrefix;
    }

    public void setLicenseNoPrefix(String licenseNoPrefix) {
        this.licenseNoPrefix = licenseNoPrefix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", parentCode=").append(parentCode);
        sb.append(", isMunicipality=").append(isMunicipality);
        sb.append(", cityLevel=").append(cityLevel);
        sb.append(", licenseNoPrefix=").append(licenseNoPrefix);
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
        TBaseAddressCode other = (TBaseAddressCode) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentCode() == null ? other.getParentCode() == null : this.getParentCode().equals(other.getParentCode()))
            && (this.getIsMunicipality() == null ? other.getIsMunicipality() == null : this.getIsMunicipality().equals(other.getIsMunicipality()))
            && (this.getCityLevel() == null ? other.getCityLevel() == null : this.getCityLevel().equals(other.getCityLevel()))
            && (this.getLicenseNoPrefix() == null ? other.getLicenseNoPrefix() == null : this.getLicenseNoPrefix().equals(other.getLicenseNoPrefix()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentCode() == null) ? 0 : getParentCode().hashCode());
        result = prime * result + ((getIsMunicipality() == null) ? 0 : getIsMunicipality().hashCode());
        result = prime * result + ((getCityLevel() == null) ? 0 : getCityLevel().hashCode());
        result = prime * result + ((getLicenseNoPrefix() == null) ? 0 : getLicenseNoPrefix().hashCode());
        return result;
    }
}