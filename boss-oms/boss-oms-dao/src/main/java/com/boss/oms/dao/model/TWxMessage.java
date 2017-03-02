package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TWxMessage implements Serializable {
    /**
     * 自增ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 消息方向：1-接收，2-回复
     *
     * @mbg.generated
     */
    private String msgDirection;

    /**
     * 粉丝openid
     *
     * @mbg.generated
     */
    private String fansOpenId;

    /**
     * 原始公众号ID
     *
     * @mbg.generated
     */
    private String accountOriginid;

    /**
     * 消息类型
     *
     * @mbg.generated
     */
    private String msgType;

    /**
     * 创建时间（微信平台）
     *
     * @mbg.generated
     */
    private Date mpCreatedTime;

    /**
     * 信息ID（微信平台）
     *
     * @mbg.generated
     */
    private String mpMsgId;

    /**
     * 事件
     *
     * @mbg.generated
     */
    private String event;

    /**
     * 事件key
     *
     * @mbg.generated
     */
    private String eventKey;

    /**
     * 图片链接
图片链接
     *
     * @mbg.generated
     */
    private String picUrl;

    /**
     * 图片消息媒体id
     *
     * @mbg.generated
     */
    private String mediaId;

    /**
     * 多媒体格式
     *
     * @mbg.generated
     */
    private String format;

    /**
     * 缩略图的媒体id（微信平台）
     *
     * @mbg.generated
     */
    private String thumbMediaId;

    /**
     * 消息标题
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 消息链接
     *
     * @mbg.generated
     */
    private String url;

    /**
     * 二维码的ticket
     *
     * @mbg.generated
     */
    private String ticket;

    /**
     * 地理位置纬度
     *
     * @mbg.generated
     */
    private BigDecimal posLatitude;

    /**
     * 地理位置经度
     *
     * @mbg.generated
     */
    private BigDecimal posLongitude;

    /**
     * 地理位置精度
     *
     * @mbg.generated
     */
    private BigDecimal posPrecision;

    /**
     * 地图缩放大小
     *
     * @mbg.generated
     */
    private BigDecimal posScale;

    /**
     * 地理位置信息
     *
     * @mbg.generated
     */
    private String label;

    /**
     * 消息回复类型
     *
     * @mbg.generated
     */
    private String replyType;

    /**
     * 回复素材ID
     *
     * @mbg.generated
     */
    private Long replyMediaId;

    /**
     * 发送时，消息体的MsgId，回复时关联的发送的消息MsgId
     *
     * @mbg.generated
     */
    private Long originMsgId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     * 文本消息内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 消息描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 语音识别结果
     *
     * @mbg.generated
     */
    private String recognition;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsgDirection() {
        return msgDirection;
    }

    public void setMsgDirection(String msgDirection) {
        this.msgDirection = msgDirection;
    }

    public String getFansOpenId() {
        return fansOpenId;
    }

    public void setFansOpenId(String fansOpenId) {
        this.fansOpenId = fansOpenId;
    }

    public String getAccountOriginid() {
        return accountOriginid;
    }

    public void setAccountOriginid(String accountOriginid) {
        this.accountOriginid = accountOriginid;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Date getMpCreatedTime() {
        return mpCreatedTime;
    }

    public void setMpCreatedTime(Date mpCreatedTime) {
        this.mpCreatedTime = mpCreatedTime;
    }

    public String getMpMsgId() {
        return mpMsgId;
    }

    public void setMpMsgId(String mpMsgId) {
        this.mpMsgId = mpMsgId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public BigDecimal getPosLatitude() {
        return posLatitude;
    }

    public void setPosLatitude(BigDecimal posLatitude) {
        this.posLatitude = posLatitude;
    }

    public BigDecimal getPosLongitude() {
        return posLongitude;
    }

    public void setPosLongitude(BigDecimal posLongitude) {
        this.posLongitude = posLongitude;
    }

    public BigDecimal getPosPrecision() {
        return posPrecision;
    }

    public void setPosPrecision(BigDecimal posPrecision) {
        this.posPrecision = posPrecision;
    }

    public BigDecimal getPosScale() {
        return posScale;
    }

    public void setPosScale(BigDecimal posScale) {
        this.posScale = posScale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getReplyType() {
        return replyType;
    }

    public void setReplyType(String replyType) {
        this.replyType = replyType;
    }

    public Long getReplyMediaId() {
        return replyMediaId;
    }

    public void setReplyMediaId(Long replyMediaId) {
        this.replyMediaId = replyMediaId;
    }

    public Long getOriginMsgId() {
        return originMsgId;
    }

    public void setOriginMsgId(Long originMsgId) {
        this.originMsgId = originMsgId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", msgDirection=").append(msgDirection);
        sb.append(", fansOpenId=").append(fansOpenId);
        sb.append(", accountOriginid=").append(accountOriginid);
        sb.append(", msgType=").append(msgType);
        sb.append(", mpCreatedTime=").append(mpCreatedTime);
        sb.append(", mpMsgId=").append(mpMsgId);
        sb.append(", event=").append(event);
        sb.append(", eventKey=").append(eventKey);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", mediaId=").append(mediaId);
        sb.append(", format=").append(format);
        sb.append(", thumbMediaId=").append(thumbMediaId);
        sb.append(", title=").append(title);
        sb.append(", url=").append(url);
        sb.append(", ticket=").append(ticket);
        sb.append(", posLatitude=").append(posLatitude);
        sb.append(", posLongitude=").append(posLongitude);
        sb.append(", posPrecision=").append(posPrecision);
        sb.append(", posScale=").append(posScale);
        sb.append(", label=").append(label);
        sb.append(", replyType=").append(replyType);
        sb.append(", replyMediaId=").append(replyMediaId);
        sb.append(", originMsgId=").append(originMsgId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", content=").append(content);
        sb.append(", description=").append(description);
        sb.append(", recognition=").append(recognition);
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
        TWxMessage other = (TWxMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMsgDirection() == null ? other.getMsgDirection() == null : this.getMsgDirection().equals(other.getMsgDirection()))
            && (this.getFansOpenId() == null ? other.getFansOpenId() == null : this.getFansOpenId().equals(other.getFansOpenId()))
            && (this.getAccountOriginid() == null ? other.getAccountOriginid() == null : this.getAccountOriginid().equals(other.getAccountOriginid()))
            && (this.getMsgType() == null ? other.getMsgType() == null : this.getMsgType().equals(other.getMsgType()))
            && (this.getMpCreatedTime() == null ? other.getMpCreatedTime() == null : this.getMpCreatedTime().equals(other.getMpCreatedTime()))
            && (this.getMpMsgId() == null ? other.getMpMsgId() == null : this.getMpMsgId().equals(other.getMpMsgId()))
            && (this.getEvent() == null ? other.getEvent() == null : this.getEvent().equals(other.getEvent()))
            && (this.getEventKey() == null ? other.getEventKey() == null : this.getEventKey().equals(other.getEventKey()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getMediaId() == null ? other.getMediaId() == null : this.getMediaId().equals(other.getMediaId()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getThumbMediaId() == null ? other.getThumbMediaId() == null : this.getThumbMediaId().equals(other.getThumbMediaId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getTicket() == null ? other.getTicket() == null : this.getTicket().equals(other.getTicket()))
            && (this.getPosLatitude() == null ? other.getPosLatitude() == null : this.getPosLatitude().equals(other.getPosLatitude()))
            && (this.getPosLongitude() == null ? other.getPosLongitude() == null : this.getPosLongitude().equals(other.getPosLongitude()))
            && (this.getPosPrecision() == null ? other.getPosPrecision() == null : this.getPosPrecision().equals(other.getPosPrecision()))
            && (this.getPosScale() == null ? other.getPosScale() == null : this.getPosScale().equals(other.getPosScale()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
            && (this.getReplyType() == null ? other.getReplyType() == null : this.getReplyType().equals(other.getReplyType()))
            && (this.getReplyMediaId() == null ? other.getReplyMediaId() == null : this.getReplyMediaId().equals(other.getReplyMediaId()))
            && (this.getOriginMsgId() == null ? other.getOriginMsgId() == null : this.getOriginMsgId().equals(other.getOriginMsgId()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getRecognition() == null ? other.getRecognition() == null : this.getRecognition().equals(other.getRecognition()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMsgDirection() == null) ? 0 : getMsgDirection().hashCode());
        result = prime * result + ((getFansOpenId() == null) ? 0 : getFansOpenId().hashCode());
        result = prime * result + ((getAccountOriginid() == null) ? 0 : getAccountOriginid().hashCode());
        result = prime * result + ((getMsgType() == null) ? 0 : getMsgType().hashCode());
        result = prime * result + ((getMpCreatedTime() == null) ? 0 : getMpCreatedTime().hashCode());
        result = prime * result + ((getMpMsgId() == null) ? 0 : getMpMsgId().hashCode());
        result = prime * result + ((getEvent() == null) ? 0 : getEvent().hashCode());
        result = prime * result + ((getEventKey() == null) ? 0 : getEventKey().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getMediaId() == null) ? 0 : getMediaId().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getThumbMediaId() == null) ? 0 : getThumbMediaId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getTicket() == null) ? 0 : getTicket().hashCode());
        result = prime * result + ((getPosLatitude() == null) ? 0 : getPosLatitude().hashCode());
        result = prime * result + ((getPosLongitude() == null) ? 0 : getPosLongitude().hashCode());
        result = prime * result + ((getPosPrecision() == null) ? 0 : getPosPrecision().hashCode());
        result = prime * result + ((getPosScale() == null) ? 0 : getPosScale().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        result = prime * result + ((getReplyType() == null) ? 0 : getReplyType().hashCode());
        result = prime * result + ((getReplyMediaId() == null) ? 0 : getReplyMediaId().hashCode());
        result = prime * result + ((getOriginMsgId() == null) ? 0 : getOriginMsgId().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getRecognition() == null) ? 0 : getRecognition().hashCode());
        return result;
    }
}