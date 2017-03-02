package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TBizShouldCommissionAccount implements Serializable {
    private Long id;

    /**
     * 代理人ID
     *
     * @mbg.generated
     */
    private Long agentId;

    /**
     * 余额
     *
     * @mbg.generated
     */
    private BigDecimal balance;

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
     * 应发累计
     *
     * @mbg.generated
     */
    private BigDecimal preTaxAmount;

    /**
     * 重复扣税额
     *
     * @mbg.generated
     */
    private BigDecimal repeatedtaxCost;

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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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

    public BigDecimal getPreTaxAmount() {
        return preTaxAmount;
    }

    public void setPreTaxAmount(BigDecimal preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
    }

    public BigDecimal getRepeatedtaxCost() {
        return repeatedtaxCost;
    }

    public void setRepeatedtaxCost(BigDecimal repeatedtaxCost) {
        this.repeatedtaxCost = repeatedtaxCost;
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
        sb.append(", balance=").append(balance);
        sb.append(", paidTotal=").append(paidTotal);
        sb.append(", taxTotal=").append(taxTotal);
        sb.append(", preTaxAmount=").append(preTaxAmount);
        sb.append(", repeatedtaxCost=").append(repeatedtaxCost);
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
        TBizShouldCommissionAccount other = (TBizShouldCommissionAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getPaidTotal() == null ? other.getPaidTotal() == null : this.getPaidTotal().equals(other.getPaidTotal()))
            && (this.getTaxTotal() == null ? other.getTaxTotal() == null : this.getTaxTotal().equals(other.getTaxTotal()))
            && (this.getPreTaxAmount() == null ? other.getPreTaxAmount() == null : this.getPreTaxAmount().equals(other.getPreTaxAmount()))
            && (this.getRepeatedtaxCost() == null ? other.getRepeatedtaxCost() == null : this.getRepeatedtaxCost().equals(other.getRepeatedtaxCost()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getPaidTotal() == null) ? 0 : getPaidTotal().hashCode());
        result = prime * result + ((getTaxTotal() == null) ? 0 : getTaxTotal().hashCode());
        result = prime * result + ((getPreTaxAmount() == null) ? 0 : getPreTaxAmount().hashCode());
        result = prime * result + ((getRepeatedtaxCost() == null) ? 0 : getRepeatedtaxCost().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}