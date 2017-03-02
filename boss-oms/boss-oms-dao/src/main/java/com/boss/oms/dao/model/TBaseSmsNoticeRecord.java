package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TBaseSmsNoticeRecord implements Serializable {
    private Long id;

    /**
     * 短信内容
     *
     * @mbg.generated
     */
    private String message;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 状态（1：待发送 2：发送成功 3：发送失败）
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 短信类型（1：验证码 2：营销）
     *
     * @mbg.generated
     */
    private String smsType;

    /**
     * 响应信息
     *
     * @mbg.generated
     */
    private String responseMsg;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", message=").append(message);
        sb.append(", mobile=").append(mobile);
        sb.append(", status=").append(status);
        sb.append(", smsType=").append(smsType);
        sb.append(", responseMsg=").append(responseMsg);
        sb.append(", createTime=").append(createTime);
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
        TBaseSmsNoticeRecord other = (TBaseSmsNoticeRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSmsType() == null ? other.getSmsType() == null : this.getSmsType().equals(other.getSmsType()))
            && (this.getResponseMsg() == null ? other.getResponseMsg() == null : this.getResponseMsg().equals(other.getResponseMsg()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSmsType() == null) ? 0 : getSmsType().hashCode());
        result = prime * result + ((getResponseMsg() == null) ? 0 : getResponseMsg().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}