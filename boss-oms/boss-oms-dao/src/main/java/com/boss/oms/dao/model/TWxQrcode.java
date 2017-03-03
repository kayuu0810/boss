package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TWxQrcode implements Serializable {
    /**
     * 二维码场景值
     *
     * @mbg.generated
     */
    private Integer sceneId;

    /**
     * 生成二维码时的微信用户OPENID
     *
     * @mbg.generated
     */
    private String openId;

    /**
     * 微信素材上传接口返回的MEDIAID
     *
     * @mbg.generated
     */
    private String mediaId;

    /**
     * 生成MEDIAID的有效时间（由微信返回）
     *
     * @mbg.generated
     */
    private Date expiresinTime;

    /**
     * 生成二维码的请求次数
     *
     * @mbg.generated
     */
    private Integer reqCount;

    /**
     * 记录创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 记录更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 二维码类型 如果为1则为临时二维码 如果为2则为专属二维码
     *
     * @mbg.generated
     */
    private String qrcodeType;

    /**
     * 2为新版名片，其他都为1
     *
     * @mbg.generated
     */
    private String posterType;

    private String qrcodeUrl;

    private static final long serialVersionUID = 1L;

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public Date getExpiresinTime() {
        return expiresinTime;
    }

    public void setExpiresinTime(Date expiresinTime) {
        this.expiresinTime = expiresinTime;
    }

    public Integer getReqCount() {
        return reqCount;
    }

    public void setReqCount(Integer reqCount) {
        this.reqCount = reqCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getQrcodeType() {
        return qrcodeType;
    }

    public void setQrcodeType(String qrcodeType) {
        this.qrcodeType = qrcodeType;
    }

    public String getPosterType() {
        return posterType;
    }

    public void setPosterType(String posterType) {
        this.posterType = posterType;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sceneId=").append(sceneId);
        sb.append(", openId=").append(openId);
        sb.append(", mediaId=").append(mediaId);
        sb.append(", expiresinTime=").append(expiresinTime);
        sb.append(", reqCount=").append(reqCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", qrcodeType=").append(qrcodeType);
        sb.append(", posterType=").append(posterType);
        sb.append(", qrcodeUrl=").append(qrcodeUrl);
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
        TWxQrcode other = (TWxQrcode) that;
        return (this.getSceneId() == null ? other.getSceneId() == null : this.getSceneId().equals(other.getSceneId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getMediaId() == null ? other.getMediaId() == null : this.getMediaId().equals(other.getMediaId()))
            && (this.getExpiresinTime() == null ? other.getExpiresinTime() == null : this.getExpiresinTime().equals(other.getExpiresinTime()))
            && (this.getReqCount() == null ? other.getReqCount() == null : this.getReqCount().equals(other.getReqCount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getQrcodeType() == null ? other.getQrcodeType() == null : this.getQrcodeType().equals(other.getQrcodeType()))
            && (this.getPosterType() == null ? other.getPosterType() == null : this.getPosterType().equals(other.getPosterType()))
            && (this.getQrcodeUrl() == null ? other.getQrcodeUrl() == null : this.getQrcodeUrl().equals(other.getQrcodeUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSceneId() == null) ? 0 : getSceneId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getMediaId() == null) ? 0 : getMediaId().hashCode());
        result = prime * result + ((getExpiresinTime() == null) ? 0 : getExpiresinTime().hashCode());
        result = prime * result + ((getReqCount() == null) ? 0 : getReqCount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getQrcodeType() == null) ? 0 : getQrcodeType().hashCode());
        result = prime * result + ((getPosterType() == null) ? 0 : getPosterType().hashCode());
        result = prime * result + ((getQrcodeUrl() == null) ? 0 : getQrcodeUrl().hashCode());
        return result;
    }
}