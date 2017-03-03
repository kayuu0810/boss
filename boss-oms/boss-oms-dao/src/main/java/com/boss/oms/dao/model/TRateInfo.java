package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TRateInfo implements Serializable {
    private Long id;

    /**
     * 区域id
     *
     * @mbg.generated
     */
    private Integer areaId;

    /**
     * 保险公司CODE
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

    private String city;

    /**
     * 1 费改；0 未费改
     *
     * @mbg.generated
     */
    private String type;

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
     * 传统商业险费率
     *
     * @mbg.generated
     */
    private String traditionVciRate;

    /**
     * 传统交强险费率
     *
     * @mbg.generated
     */
    private String traditionTciRate;

    /**
     * 网电销商业险费率
     *
     * @mbg.generated
     */
    private String netVciRate;

    /**
     * 网电销传统险费率
     *
     * @mbg.generated
     */
    private String netTciRate;

    /**
     * 创建日期
     *
     * @mbg.generated
     */
    private Date createDate;

    private Date updateDate;

    private String lastUpdateUser;

    private String lastUpdateType;

    private String routeCode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getTraditionVciRate() {
        return traditionVciRate;
    }

    public void setTraditionVciRate(String traditionVciRate) {
        this.traditionVciRate = traditionVciRate;
    }

    public String getTraditionTciRate() {
        return traditionTciRate;
    }

    public void setTraditionTciRate(String traditionTciRate) {
        this.traditionTciRate = traditionTciRate;
    }

    public String getNetVciRate() {
        return netVciRate;
    }

    public void setNetVciRate(String netVciRate) {
        this.netVciRate = netVciRate;
    }

    public String getNetTciRate() {
        return netTciRate;
    }

    public void setNetTciRate(String netTciRate) {
        this.netTciRate = netTciRate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
        sb.append(", areaId=").append(areaId);
        sb.append(", insCode=").append(insCode);
        sb.append(", companyName=").append(companyName);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", type=").append(type);
        sb.append(", vciRate=").append(vciRate);
        sb.append(", tciRate=").append(tciRate);
        sb.append(", traditionVciRate=").append(traditionVciRate);
        sb.append(", traditionTciRate=").append(traditionTciRate);
        sb.append(", netVciRate=").append(netVciRate);
        sb.append(", netTciRate=").append(netTciRate);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateType=").append(lastUpdateType);
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
        TRateInfo other = (TRateInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getInsCode() == null ? other.getInsCode() == null : this.getInsCode().equals(other.getInsCode()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getVciRate() == null ? other.getVciRate() == null : this.getVciRate().equals(other.getVciRate()))
            && (this.getTciRate() == null ? other.getTciRate() == null : this.getTciRate().equals(other.getTciRate()))
            && (this.getTraditionVciRate() == null ? other.getTraditionVciRate() == null : this.getTraditionVciRate().equals(other.getTraditionVciRate()))
            && (this.getTraditionTciRate() == null ? other.getTraditionTciRate() == null : this.getTraditionTciRate().equals(other.getTraditionTciRate()))
            && (this.getNetVciRate() == null ? other.getNetVciRate() == null : this.getNetVciRate().equals(other.getNetVciRate()))
            && (this.getNetTciRate() == null ? other.getNetTciRate() == null : this.getNetTciRate().equals(other.getNetTciRate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getLastUpdateUser() == null ? other.getLastUpdateUser() == null : this.getLastUpdateUser().equals(other.getLastUpdateUser()))
            && (this.getLastUpdateType() == null ? other.getLastUpdateType() == null : this.getLastUpdateType().equals(other.getLastUpdateType()))
            && (this.getRouteCode() == null ? other.getRouteCode() == null : this.getRouteCode().equals(other.getRouteCode()));
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
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getVciRate() == null) ? 0 : getVciRate().hashCode());
        result = prime * result + ((getTciRate() == null) ? 0 : getTciRate().hashCode());
        result = prime * result + ((getTraditionVciRate() == null) ? 0 : getTraditionVciRate().hashCode());
        result = prime * result + ((getTraditionTciRate() == null) ? 0 : getTraditionTciRate().hashCode());
        result = prime * result + ((getNetVciRate() == null) ? 0 : getNetVciRate().hashCode());
        result = prime * result + ((getNetTciRate() == null) ? 0 : getNetTciRate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateType() == null) ? 0 : getLastUpdateType().hashCode());
        result = prime * result + ((getRouteCode() == null) ? 0 : getRouteCode().hashCode());
        return result;
    }
}