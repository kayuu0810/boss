package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TVehicleDetailInfo implements Serializable {
    private Long id;

    /**
     * 车牌号
     *
     * @mbg.generated
     */
    private String licenseNo;

    /**
     * 平台城市代码
     *
     * @mbg.generated
     */
    private String cityCode;

    /**
     * 发动机号
     *
     * @mbg.generated
     */
    private String engineNo;

    /**
     * 车架号
     *
     * @mbg.generated
     */
    private String frameNo;

    /**
     * 初始登记日期
     *
     * @mbg.generated
     */
    private Date firstRegisterDate;

    /**
     * 车主信息ID
     *
     * @mbg.generated
     */
    private Long ownerId;

    /**
     * 车型名称
     *
     * @mbg.generated
     */
    private String vehicleModelName;

    /**
     * 车型ID
     *
     * @mbg.generated
     */
    private Long vehicleModelId;

    /**
     * 购买日期
     *
     * @mbg.generated
     */
    private Date purchaseDate;

    /**
     * 是否新车 (1-是   0-否)
     *
     * @mbg.generated
     */
    private String isNewFlag;

    /**
     * 是否过户车 (1-是   0-否)
     *
     * @mbg.generated
     */
    private String isTransFlag;

    /**
     * 过户日期
     *
     * @mbg.generated
     */
    private Date transDate;

    /**
     * 状态（1-有效  0-无效）
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
     * 是否贷款车
     *
     * @mbg.generated
     */
    private String isLoanFlag;

    /**
     * 能源类型
     *
     * @mbg.generated
     */
    private String fuelType;

    /**
     * 行驶证登记地址
     *
     * @mbg.generated
     */
    private String drivingLicenseAddr;

    /**
     * 车辆来历凭证类型
     *
     * @mbg.generated
     */
    private String vehicleVoucherType;

    /**
     * 车辆来历凭证编号
     *
     * @mbg.generated
     */
    private String vehicleVoucherNo;

    /**
     * 凭证开具日期
     *
     * @mbg.generated
     */
    private Date vehicleVoucherDate;

    /**
     * 车辆所属
     *
     * @mbg.generated
     */
    private String orgName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getFrameNo() {
        return frameNo;
    }

    public void setFrameNo(String frameNo) {
        this.frameNo = frameNo;
    }

    public Date getFirstRegisterDate() {
        return firstRegisterDate;
    }

    public void setFirstRegisterDate(Date firstRegisterDate) {
        this.firstRegisterDate = firstRegisterDate;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public Long getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(Long vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getIsNewFlag() {
        return isNewFlag;
    }

    public void setIsNewFlag(String isNewFlag) {
        this.isNewFlag = isNewFlag;
    }

    public String getIsTransFlag() {
        return isTransFlag;
    }

    public void setIsTransFlag(String isTransFlag) {
        this.isTransFlag = isTransFlag;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
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

    public String getIsLoanFlag() {
        return isLoanFlag;
    }

    public void setIsLoanFlag(String isLoanFlag) {
        this.isLoanFlag = isLoanFlag;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getDrivingLicenseAddr() {
        return drivingLicenseAddr;
    }

    public void setDrivingLicenseAddr(String drivingLicenseAddr) {
        this.drivingLicenseAddr = drivingLicenseAddr;
    }

    public String getVehicleVoucherType() {
        return vehicleVoucherType;
    }

    public void setVehicleVoucherType(String vehicleVoucherType) {
        this.vehicleVoucherType = vehicleVoucherType;
    }

    public String getVehicleVoucherNo() {
        return vehicleVoucherNo;
    }

    public void setVehicleVoucherNo(String vehicleVoucherNo) {
        this.vehicleVoucherNo = vehicleVoucherNo;
    }

    public Date getVehicleVoucherDate() {
        return vehicleVoucherDate;
    }

    public void setVehicleVoucherDate(Date vehicleVoucherDate) {
        this.vehicleVoucherDate = vehicleVoucherDate;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", licenseNo=").append(licenseNo);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", engineNo=").append(engineNo);
        sb.append(", frameNo=").append(frameNo);
        sb.append(", firstRegisterDate=").append(firstRegisterDate);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", vehicleModelName=").append(vehicleModelName);
        sb.append(", vehicleModelId=").append(vehicleModelId);
        sb.append(", purchaseDate=").append(purchaseDate);
        sb.append(", isNewFlag=").append(isNewFlag);
        sb.append(", isTransFlag=").append(isTransFlag);
        sb.append(", transDate=").append(transDate);
        sb.append(", status=").append(status);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", isLoanFlag=").append(isLoanFlag);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", drivingLicenseAddr=").append(drivingLicenseAddr);
        sb.append(", vehicleVoucherType=").append(vehicleVoucherType);
        sb.append(", vehicleVoucherNo=").append(vehicleVoucherNo);
        sb.append(", vehicleVoucherDate=").append(vehicleVoucherDate);
        sb.append(", orgName=").append(orgName);
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
        TVehicleDetailInfo other = (TVehicleDetailInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLicenseNo() == null ? other.getLicenseNo() == null : this.getLicenseNo().equals(other.getLicenseNo()))
            && (this.getCityCode() == null ? other.getCityCode() == null : this.getCityCode().equals(other.getCityCode()))
            && (this.getEngineNo() == null ? other.getEngineNo() == null : this.getEngineNo().equals(other.getEngineNo()))
            && (this.getFrameNo() == null ? other.getFrameNo() == null : this.getFrameNo().equals(other.getFrameNo()))
            && (this.getFirstRegisterDate() == null ? other.getFirstRegisterDate() == null : this.getFirstRegisterDate().equals(other.getFirstRegisterDate()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getVehicleModelName() == null ? other.getVehicleModelName() == null : this.getVehicleModelName().equals(other.getVehicleModelName()))
            && (this.getVehicleModelId() == null ? other.getVehicleModelId() == null : this.getVehicleModelId().equals(other.getVehicleModelId()))
            && (this.getPurchaseDate() == null ? other.getPurchaseDate() == null : this.getPurchaseDate().equals(other.getPurchaseDate()))
            && (this.getIsNewFlag() == null ? other.getIsNewFlag() == null : this.getIsNewFlag().equals(other.getIsNewFlag()))
            && (this.getIsTransFlag() == null ? other.getIsTransFlag() == null : this.getIsTransFlag().equals(other.getIsTransFlag()))
            && (this.getTransDate() == null ? other.getTransDate() == null : this.getTransDate().equals(other.getTransDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastUpdateUser() == null ? other.getLastUpdateUser() == null : this.getLastUpdateUser().equals(other.getLastUpdateUser()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getIsLoanFlag() == null ? other.getIsLoanFlag() == null : this.getIsLoanFlag().equals(other.getIsLoanFlag()))
            && (this.getFuelType() == null ? other.getFuelType() == null : this.getFuelType().equals(other.getFuelType()))
            && (this.getDrivingLicenseAddr() == null ? other.getDrivingLicenseAddr() == null : this.getDrivingLicenseAddr().equals(other.getDrivingLicenseAddr()))
            && (this.getVehicleVoucherType() == null ? other.getVehicleVoucherType() == null : this.getVehicleVoucherType().equals(other.getVehicleVoucherType()))
            && (this.getVehicleVoucherNo() == null ? other.getVehicleVoucherNo() == null : this.getVehicleVoucherNo().equals(other.getVehicleVoucherNo()))
            && (this.getVehicleVoucherDate() == null ? other.getVehicleVoucherDate() == null : this.getVehicleVoucherDate().equals(other.getVehicleVoucherDate()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLicenseNo() == null) ? 0 : getLicenseNo().hashCode());
        result = prime * result + ((getCityCode() == null) ? 0 : getCityCode().hashCode());
        result = prime * result + ((getEngineNo() == null) ? 0 : getEngineNo().hashCode());
        result = prime * result + ((getFrameNo() == null) ? 0 : getFrameNo().hashCode());
        result = prime * result + ((getFirstRegisterDate() == null) ? 0 : getFirstRegisterDate().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getVehicleModelName() == null) ? 0 : getVehicleModelName().hashCode());
        result = prime * result + ((getVehicleModelId() == null) ? 0 : getVehicleModelId().hashCode());
        result = prime * result + ((getPurchaseDate() == null) ? 0 : getPurchaseDate().hashCode());
        result = prime * result + ((getIsNewFlag() == null) ? 0 : getIsNewFlag().hashCode());
        result = prime * result + ((getIsTransFlag() == null) ? 0 : getIsTransFlag().hashCode());
        result = prime * result + ((getTransDate() == null) ? 0 : getTransDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getIsLoanFlag() == null) ? 0 : getIsLoanFlag().hashCode());
        result = prime * result + ((getFuelType() == null) ? 0 : getFuelType().hashCode());
        result = prime * result + ((getDrivingLicenseAddr() == null) ? 0 : getDrivingLicenseAddr().hashCode());
        result = prime * result + ((getVehicleVoucherType() == null) ? 0 : getVehicleVoucherType().hashCode());
        result = prime * result + ((getVehicleVoucherNo() == null) ? 0 : getVehicleVoucherNo().hashCode());
        result = prime * result + ((getVehicleVoucherDate() == null) ? 0 : getVehicleVoucherDate().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        return result;
    }
}