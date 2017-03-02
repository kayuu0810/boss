package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TVehicleModeInfo implements Serializable {
    /**
     * 车型ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 车型代码
     *
     * @mbg.generated
     */
    private String vehicleCode;

    /**
     * 车型名称
     *
     * @mbg.generated
     */
    private String vehicleName;

    /**
     * 有效标识（1-有效  0-无效）
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 有效期起
     *
     * @mbg.generated
     */
    private Date effectDateStart;

    /**
     * 有效期至
     *
     * @mbg.generated
     */
    private Date effectDateEnd;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * 创建时间
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
     * 修改时间
     *
     * @mbg.generated
     */
    private Date lastUpdateDate;

    /**
     * 座位数
     *
     * @mbg.generated
     */
    private String seat;

    /**
     * 排气量
     *
     * @mbg.generated
     */
    private String exhaust;

    /**
     * 车系种类
     *
     * @mbg.generated
     */
    private String familyName;

    /**
     * 新车购置价
     *
     * @mbg.generated
     */
    private String newVehiclePrice;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    private String standardname;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getExhaust() {
        return exhaust;
    }

    public void setExhaust(String exhaust) {
        this.exhaust = exhaust;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getNewVehiclePrice() {
        return newVehiclePrice;
    }

    public void setNewVehiclePrice(String newVehiclePrice) {
        this.newVehiclePrice = newVehiclePrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStandardname() {
        return standardname;
    }

    public void setStandardname(String standardname) {
        this.standardname = standardname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vehicleCode=").append(vehicleCode);
        sb.append(", vehicleName=").append(vehicleName);
        sb.append(", status=").append(status);
        sb.append(", effectDateStart=").append(effectDateStart);
        sb.append(", effectDateEnd=").append(effectDateEnd);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", seat=").append(seat);
        sb.append(", exhaust=").append(exhaust);
        sb.append(", familyName=").append(familyName);
        sb.append(", newVehiclePrice=").append(newVehiclePrice);
        sb.append(", remark=").append(remark);
        sb.append(", standardname=").append(standardname);
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
        TVehicleModeInfo other = (TVehicleModeInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVehicleCode() == null ? other.getVehicleCode() == null : this.getVehicleCode().equals(other.getVehicleCode()))
            && (this.getVehicleName() == null ? other.getVehicleName() == null : this.getVehicleName().equals(other.getVehicleName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEffectDateStart() == null ? other.getEffectDateStart() == null : this.getEffectDateStart().equals(other.getEffectDateStart()))
            && (this.getEffectDateEnd() == null ? other.getEffectDateEnd() == null : this.getEffectDateEnd().equals(other.getEffectDateEnd()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastUpdateUser() == null ? other.getLastUpdateUser() == null : this.getLastUpdateUser().equals(other.getLastUpdateUser()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getSeat() == null ? other.getSeat() == null : this.getSeat().equals(other.getSeat()))
            && (this.getExhaust() == null ? other.getExhaust() == null : this.getExhaust().equals(other.getExhaust()))
            && (this.getFamilyName() == null ? other.getFamilyName() == null : this.getFamilyName().equals(other.getFamilyName()))
            && (this.getNewVehiclePrice() == null ? other.getNewVehiclePrice() == null : this.getNewVehiclePrice().equals(other.getNewVehiclePrice()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStandardname() == null ? other.getStandardname() == null : this.getStandardname().equals(other.getStandardname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVehicleCode() == null) ? 0 : getVehicleCode().hashCode());
        result = prime * result + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEffectDateStart() == null) ? 0 : getEffectDateStart().hashCode());
        result = prime * result + ((getEffectDateEnd() == null) ? 0 : getEffectDateEnd().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getSeat() == null) ? 0 : getSeat().hashCode());
        result = prime * result + ((getExhaust() == null) ? 0 : getExhaust().hashCode());
        result = prime * result + ((getFamilyName() == null) ? 0 : getFamilyName().hashCode());
        result = prime * result + ((getNewVehiclePrice() == null) ? 0 : getNewVehiclePrice().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStandardname() == null) ? 0 : getStandardname().hashCode());
        return result;
    }
}