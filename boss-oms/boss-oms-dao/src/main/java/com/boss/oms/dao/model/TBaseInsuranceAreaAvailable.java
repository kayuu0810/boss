package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TBaseInsuranceAreaAvailable implements Serializable {
    private Long id;

    /**
     * 保险公司CODE
     *
     * @mbg.generated
     */
    private String insuranceCode;

    /**
     * 地区代码
     *
     * @mbg.generated
     */
    private String cityCode;

    /**
     * 状态（1：有效 0：无效）
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 有效期起
     *
     * @mbg.generated
     */
    private Date effectDateStart;

    /**
     * 有效期止
     *
     * @mbg.generated
     */
    private Date effectDateEnd;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 最后更新人
     *
     * @mbg.generated
     */
    private String lastUpdateBy;

    /**
     * 最后更新时间
     *
     * @mbg.generated
     */
    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getEffectDateStart() {
        return effectDateStart;
    }

    public void setEffectDateStart(Date effectDateStart) {
        this.effectDateStart = effectDateStart;
    }

    public Date getEffectDateEnd() {
        return effectDateEnd;
    }

    public void setEffectDateEnd(Date effectDateEnd) {
        this.effectDateEnd = effectDateEnd;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", insuranceCode=").append(insuranceCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", status=").append(status);
        sb.append(", effectDateStart=").append(effectDateStart);
        sb.append(", effectDateEnd=").append(effectDateEnd);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
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
        TBaseInsuranceAreaAvailable other = (TBaseInsuranceAreaAvailable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInsuranceCode() == null ? other.getInsuranceCode() == null : this.getInsuranceCode().equals(other.getInsuranceCode()))
            && (this.getCityCode() == null ? other.getCityCode() == null : this.getCityCode().equals(other.getCityCode()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEffectDateStart() == null ? other.getEffectDateStart() == null : this.getEffectDateStart().equals(other.getEffectDateStart()))
            && (this.getEffectDateEnd() == null ? other.getEffectDateEnd() == null : this.getEffectDateEnd().equals(other.getEffectDateEnd()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInsuranceCode() == null) ? 0 : getInsuranceCode().hashCode());
        result = prime * result + ((getCityCode() == null) ? 0 : getCityCode().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEffectDateStart() == null) ? 0 : getEffectDateStart().hashCode());
        result = prime * result + ((getEffectDateEnd() == null) ? 0 : getEffectDateEnd().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return result;
    }
}