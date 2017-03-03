package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TSalOrderDispatch implements Serializable {
    private Long id;

    /**
     * 订单ID
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 配送货物类型(10-纸质保单  15-发票)
     *
     * @mbg.generated
     */
    private String type;

    /**
     * 配送地址 (省)
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 配送地址 (市)
     *
     * @mbg.generated
     */
    private String city;

    /**
     * 配送地址 (区)
     *
     * @mbg.generated
     */
    private String area;

    /**
     * 配送地址 (详细)
     *
     * @mbg.generated
     */
    private String detailAddress;

    /**
     * 收货人
     *
     * @mbg.generated
     */
    private String recevier;

    /**
     * 联系电话
     *
     * @mbg.generated
     */
    private String mobilePhone;

    /**
     * 约定发货时间
     *
     * @mbg.generated
     */
    private Date appointSendTime;

    /**
     * 实际发货时间
     *
     * @mbg.generated
     */
    private Date realitySendTime;

    /**
     * 快递单号
     *
     * @mbg.generated
     */
    private String expressNo;

    /**
     * 快递公司名称
     *
     * @mbg.generated
     */
    private String expressCompanyName;

    /**
     * 配送方式编码，0-自取，1-快递
     *
     * @mbg.generated
     */
    private String deliveryType;

    /**
     * 状态 (10-未发货  15-配送中  20-收货成功  25-收货失败)
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getRecevier() {
        return recevier;
    }

    public void setRecevier(String recevier) {
        this.recevier = recevier;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Date getAppointSendTime() {
        return appointSendTime;
    }

    public void setAppointSendTime(Date appointSendTime) {
        this.appointSendTime = appointSendTime;
    }

    public Date getRealitySendTime() {
        return realitySendTime;
    }

    public void setRealitySendTime(Date realitySendTime) {
        this.realitySendTime = realitySendTime;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", type=").append(type);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", recevier=").append(recevier);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", appointSendTime=").append(appointSendTime);
        sb.append(", realitySendTime=").append(realitySendTime);
        sb.append(", expressNo=").append(expressNo);
        sb.append(", expressCompanyName=").append(expressCompanyName);
        sb.append(", deliveryType=").append(deliveryType);
        sb.append(", status=").append(status);
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
        TSalOrderDispatch other = (TSalOrderDispatch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getDetailAddress() == null ? other.getDetailAddress() == null : this.getDetailAddress().equals(other.getDetailAddress()))
            && (this.getRecevier() == null ? other.getRecevier() == null : this.getRecevier().equals(other.getRecevier()))
            && (this.getMobilePhone() == null ? other.getMobilePhone() == null : this.getMobilePhone().equals(other.getMobilePhone()))
            && (this.getAppointSendTime() == null ? other.getAppointSendTime() == null : this.getAppointSendTime().equals(other.getAppointSendTime()))
            && (this.getRealitySendTime() == null ? other.getRealitySendTime() == null : this.getRealitySendTime().equals(other.getRealitySendTime()))
            && (this.getExpressNo() == null ? other.getExpressNo() == null : this.getExpressNo().equals(other.getExpressNo()))
            && (this.getExpressCompanyName() == null ? other.getExpressCompanyName() == null : this.getExpressCompanyName().equals(other.getExpressCompanyName()))
            && (this.getDeliveryType() == null ? other.getDeliveryType() == null : this.getDeliveryType().equals(other.getDeliveryType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
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
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getDetailAddress() == null) ? 0 : getDetailAddress().hashCode());
        result = prime * result + ((getRecevier() == null) ? 0 : getRecevier().hashCode());
        result = prime * result + ((getMobilePhone() == null) ? 0 : getMobilePhone().hashCode());
        result = prime * result + ((getAppointSendTime() == null) ? 0 : getAppointSendTime().hashCode());
        result = prime * result + ((getRealitySendTime() == null) ? 0 : getRealitySendTime().hashCode());
        result = prime * result + ((getExpressNo() == null) ? 0 : getExpressNo().hashCode());
        result = prime * result + ((getExpressCompanyName() == null) ? 0 : getExpressCompanyName().hashCode());
        result = prime * result + ((getDeliveryType() == null) ? 0 : getDeliveryType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdateUser() == null) ? 0 : getLastUpdateUser().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return result;
    }
}