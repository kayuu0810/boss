package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TBizUserInfo implements Serializable {
    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 终端类型（1：微信 2：APP）
     *
     * @mbg.generated
     */
    private Integer terminalType;

    /**
     * 终端信息
     *
     * @mbg.generated
     */
    private String terminalInfo;

    /**
     * 用户openId
     *
     * @mbg.generated
     */
    private String openId;

    /**
     * 是否为团队长
     *
     * @mbg.generated
     */
    private String isCaptain;

    /**
     * 团队长是否有效
     *
     * @mbg.generated
     */
    private String captainAvailable;

    /**
     * 姓名
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 身份证
     *
     * @mbg.generated
     */
    private String idCard;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 是否为新华员工 1：是 0:非
     *
     * @mbg.generated
     */
    private String type;

    /**
     * 新华id
     *
     * @mbg.generated
     */
    private String nciId;

    /**
     * 详细地址
     *
     * @mbg.generated
     */
    private String address;

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
     * 区域
     *
     * @mbg.generated
     */
    private String area;

    /**
     * 用户选择银行代码
     *
     * @mbg.generated
     */
    private String bankCode;

    /**
     * 银行名称
     *
     * @mbg.generated
     */
    private String bankName;

    /**
     * 银行卡号
     *
     * @mbg.generated
     */
    private String bankCardNo;

    /**
     * 来源 319：新华保险微店。320：世纪金融小财迷。321： 新华保险网上商城
     *
     * @mbg.generated
     */
    private String source;

    /**
     * 注册方式 0:直接跳过注册 1:完善信息注册
     *
     * @mbg.generated
     */
    private String registType;

    private String status;

    /**
     * 创建日期
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * 银行支行信息
     *
     * @mbg.generated
     */
    private String bankBranch;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public String getTerminalInfo() {
        return terminalInfo;
    }

    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getIsCaptain() {
        return isCaptain;
    }

    public void setIsCaptain(String isCaptain) {
        this.isCaptain = isCaptain;
    }

    public String getCaptainAvailable() {
        return captainAvailable;
    }

    public void setCaptainAvailable(String captainAvailable) {
        this.captainAvailable = captainAvailable;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNciId() {
        return nciId;
    }

    public void setNciId(String nciId) {
        this.nciId = nciId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRegistType() {
        return registType;
    }

    public void setRegistType(String registType) {
        this.registType = registType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", terminalInfo=").append(terminalInfo);
        sb.append(", openId=").append(openId);
        sb.append(", isCaptain=").append(isCaptain);
        sb.append(", captainAvailable=").append(captainAvailable);
        sb.append(", userName=").append(userName);
        sb.append(", idCard=").append(idCard);
        sb.append(", mobile=").append(mobile);
        sb.append(", type=").append(type);
        sb.append(", nciId=").append(nciId);
        sb.append(", address=").append(address);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankCardNo=").append(bankCardNo);
        sb.append(", source=").append(source);
        sb.append(", registType=").append(registType);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", bankBranch=").append(bankBranch);
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
        TBizUserInfo other = (TBizUserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTerminalType() == null ? other.getTerminalType() == null : this.getTerminalType().equals(other.getTerminalType()))
            && (this.getTerminalInfo() == null ? other.getTerminalInfo() == null : this.getTerminalInfo().equals(other.getTerminalInfo()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getIsCaptain() == null ? other.getIsCaptain() == null : this.getIsCaptain().equals(other.getIsCaptain()))
            && (this.getCaptainAvailable() == null ? other.getCaptainAvailable() == null : this.getCaptainAvailable().equals(other.getCaptainAvailable()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getNciId() == null ? other.getNciId() == null : this.getNciId().equals(other.getNciId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBankCardNo() == null ? other.getBankCardNo() == null : this.getBankCardNo().equals(other.getBankCardNo()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getRegistType() == null ? other.getRegistType() == null : this.getRegistType().equals(other.getRegistType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getBankBranch() == null ? other.getBankBranch() == null : this.getBankBranch().equals(other.getBankBranch()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTerminalType() == null) ? 0 : getTerminalType().hashCode());
        result = prime * result + ((getTerminalInfo() == null) ? 0 : getTerminalInfo().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getIsCaptain() == null) ? 0 : getIsCaptain().hashCode());
        result = prime * result + ((getCaptainAvailable() == null) ? 0 : getCaptainAvailable().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getNciId() == null) ? 0 : getNciId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankCardNo() == null) ? 0 : getBankCardNo().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getRegistType() == null) ? 0 : getRegistType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getBankBranch() == null) ? 0 : getBankBranch().hashCode());
        return result;
    }
}