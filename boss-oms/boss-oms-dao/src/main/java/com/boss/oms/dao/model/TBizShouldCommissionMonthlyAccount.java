package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TBizShouldCommissionMonthlyAccount implements Serializable {
    private Long id;

    /**
     * 代理人ID
     *
     * @mbg.generated
     */
    private Long agentId;

    /**
     * 应发累计
     *
     * @mbg.generated
     */
    private BigDecimal preTaxAmount;

    /**
     * 上一次扣税额度
     *
     * @mbg.generated
     */
    private BigDecimal lastTimeTaxAmount;

    /**
     * 重复扣税额度
     *
     * @mbg.generated
     */
    private BigDecimal currcentTaxAmount;

    /**
     * 实发累计
     *
     * @mbg.generated
     */
    private BigDecimal paidTotal;

    /**
     * 扣税累计
     *
     * @mbg.generated
     */
    private BigDecimal taxTotal;

    /**
     * 扣税级数
     *
     * @mbg.generated
     */
    private String taxLevel;

    /**
     * 格式 YYYY-MM
     *
     * @mbg.generated
     */
    private String monthDate;

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

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public BigDecimal getPreTaxAmount() {
        return preTaxAmount;
    }

    public void setPreTaxAmount(BigDecimal preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
    }

    public BigDecimal getLastTimeTaxAmount() {
        return lastTimeTaxAmount;
    }

    public void setLastTimeTaxAmount(BigDecimal lastTimeTaxAmount) {
        this.lastTimeTaxAmount = lastTimeTaxAmount;
    }

    public BigDecimal getCurrcentTaxAmount() {
        return currcentTaxAmount;
    }

    public void setCurrcentTaxAmount(BigDecimal currcentTaxAmount) {
        this.currcentTaxAmount = currcentTaxAmount;
    }

    public BigDecimal getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(BigDecimal paidTotal) {
        this.paidTotal = paidTotal;
    }

    public BigDecimal getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(BigDecimal taxTotal) {
        this.taxTotal = taxTotal;
    }

    public String getTaxLevel() {
        return taxLevel;
    }

    public void setTaxLevel(String taxLevel) {
        this.taxLevel = taxLevel;
    }

    public String getMonthDate() {
        return monthDate;
    }

    public void setMonthDate(String monthDate) {
        this.monthDate = monthDate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", agentId=").append(agentId);
        sb.append(", preTaxAmount=").append(preTaxAmount);
        sb.append(", lastTimeTaxAmount=").append(lastTimeTaxAmount);
        sb.append(", currcentTaxAmount=").append(currcentTaxAmount);
        sb.append(", paidTotal=").append(paidTotal);
        sb.append(", taxTotal=").append(taxTotal);
        sb.append(", taxLevel=").append(taxLevel);
        sb.append(", monthDate=").append(monthDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
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
        TBizShouldCommissionMonthlyAccount other = (TBizShouldCommissionMonthlyAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getPreTaxAmount() == null ? other.getPreTaxAmount() == null : this.getPreTaxAmount().equals(other.getPreTaxAmount()))
            && (this.getLastTimeTaxAmount() == null ? other.getLastTimeTaxAmount() == null : this.getLastTimeTaxAmount().equals(other.getLastTimeTaxAmount()))
            && (this.getCurrcentTaxAmount() == null ? other.getCurrcentTaxAmount() == null : this.getCurrcentTaxAmount().equals(other.getCurrcentTaxAmount()))
            && (this.getPaidTotal() == null ? other.getPaidTotal() == null : this.getPaidTotal().equals(other.getPaidTotal()))
            && (this.getTaxTotal() == null ? other.getTaxTotal() == null : this.getTaxTotal().equals(other.getTaxTotal()))
            && (this.getTaxLevel() == null ? other.getTaxLevel() == null : this.getTaxLevel().equals(other.getTaxLevel()))
            && (this.getMonthDate() == null ? other.getMonthDate() == null : this.getMonthDate().equals(other.getMonthDate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getPreTaxAmount() == null) ? 0 : getPreTaxAmount().hashCode());
        result = prime * result + ((getLastTimeTaxAmount() == null) ? 0 : getLastTimeTaxAmount().hashCode());
        result = prime * result + ((getCurrcentTaxAmount() == null) ? 0 : getCurrcentTaxAmount().hashCode());
        result = prime * result + ((getPaidTotal() == null) ? 0 : getPaidTotal().hashCode());
        result = prime * result + ((getTaxTotal() == null) ? 0 : getTaxTotal().hashCode());
        result = prime * result + ((getTaxLevel() == null) ? 0 : getTaxLevel().hashCode());
        result = prime * result + ((getMonthDate() == null) ? 0 : getMonthDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}