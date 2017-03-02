package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TWxUser implements Serializable {
    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
     *
     * @mbg.generated
     */
    private Integer subscribe;

    /**
     * 用户的唯一标识
     *
     * @mbg.generated
     */
    private String openId;

    /**
     * 用户昵称
     *
     * @mbg.generated
     */
    private String nickName;

    /**
     * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     *
     * @mbg.generated
     */
    private Integer sex;

    /**
     * 用户个人资料填写的省份
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 普通用户个人资料填写的城市
     *
     * @mbg.generated
     */
    private String city;

    /**
     * 国家，如中国为CN
     *
     * @mbg.generated
     */
    private String country;

    /**
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     *
     * @mbg.generated
     */
    private String headImgUrl;

    /**
     * 用户头像宽度
     *
     * @mbg.generated
     */
    private Integer headImgUrlWidth;

    /**
     * 用户头像高度
     *
     * @mbg.generated
     */
    private Integer headImgUrlHeight;

    /**
     * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
     *
     * @mbg.generated
     */
    private String privilege;

    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
     *
     * @mbg.generated
     */
    private String unionid;

    /**
     * 创建时间
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
     * 用户分组ID
     *
     * @mbg.generated
     */
    private Integer groupid;

    /**
     * 原始公众号ID
     *
     * @mbg.generated
     */
    private String accountOriginid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public Integer getHeadImgUrlWidth() {
        return headImgUrlWidth;
    }

    public void setHeadImgUrlWidth(Integer headImgUrlWidth) {
        this.headImgUrlWidth = headImgUrlWidth;
    }

    public Integer getHeadImgUrlHeight() {
        return headImgUrlHeight;
    }

    public void setHeadImgUrlHeight(Integer headImgUrlHeight) {
        this.headImgUrlHeight = headImgUrlHeight;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
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

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getAccountOriginid() {
        return accountOriginid;
    }

    public void setAccountOriginid(String accountOriginid) {
        this.accountOriginid = accountOriginid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subscribe=").append(subscribe);
        sb.append(", openId=").append(openId);
        sb.append(", nickName=").append(nickName);
        sb.append(", sex=").append(sex);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", headImgUrl=").append(headImgUrl);
        sb.append(", headImgUrlWidth=").append(headImgUrlWidth);
        sb.append(", headImgUrlHeight=").append(headImgUrlHeight);
        sb.append(", privilege=").append(privilege);
        sb.append(", unionid=").append(unionid);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", groupid=").append(groupid);
        sb.append(", accountOriginid=").append(accountOriginid);
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
        TWxUser other = (TWxUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSubscribe() == null ? other.getSubscribe() == null : this.getSubscribe().equals(other.getSubscribe()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getHeadImgUrl() == null ? other.getHeadImgUrl() == null : this.getHeadImgUrl().equals(other.getHeadImgUrl()))
            && (this.getHeadImgUrlWidth() == null ? other.getHeadImgUrlWidth() == null : this.getHeadImgUrlWidth().equals(other.getHeadImgUrlWidth()))
            && (this.getHeadImgUrlHeight() == null ? other.getHeadImgUrlHeight() == null : this.getHeadImgUrlHeight().equals(other.getHeadImgUrlHeight()))
            && (this.getPrivilege() == null ? other.getPrivilege() == null : this.getPrivilege().equals(other.getPrivilege()))
            && (this.getUnionid() == null ? other.getUnionid() == null : this.getUnionid().equals(other.getUnionid()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getAccountOriginid() == null ? other.getAccountOriginid() == null : this.getAccountOriginid().equals(other.getAccountOriginid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSubscribe() == null) ? 0 : getSubscribe().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getHeadImgUrl() == null) ? 0 : getHeadImgUrl().hashCode());
        result = prime * result + ((getHeadImgUrlWidth() == null) ? 0 : getHeadImgUrlWidth().hashCode());
        result = prime * result + ((getHeadImgUrlHeight() == null) ? 0 : getHeadImgUrlHeight().hashCode());
        result = prime * result + ((getPrivilege() == null) ? 0 : getPrivilege().hashCode());
        result = prime * result + ((getUnionid() == null) ? 0 : getUnionid().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getAccountOriginid() == null) ? 0 : getAccountOriginid().hashCode());
        return result;
    }
}