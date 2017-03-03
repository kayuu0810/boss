package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBizShouldCommissionAccountExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TBizShouldCommissionAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("AGENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("AGENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("AGENT_ID =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("AGENT_ID <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("AGENT_ID >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AGENT_ID >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("AGENT_ID <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("AGENT_ID <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("AGENT_ID in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("AGENT_ID not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("AGENT_ID between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("AGENT_ID not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andPaidTotalIsNull() {
            addCriterion("paid_total is null");
            return (Criteria) this;
        }

        public Criteria andPaidTotalIsNotNull() {
            addCriterion("paid_total is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTotalEqualTo(BigDecimal value) {
            addCriterion("paid_total =", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalNotEqualTo(BigDecimal value) {
            addCriterion("paid_total <>", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalGreaterThan(BigDecimal value) {
            addCriterion("paid_total >", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_total >=", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalLessThan(BigDecimal value) {
            addCriterion("paid_total <", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_total <=", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalIn(List<BigDecimal> values) {
            addCriterion("paid_total in", values, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalNotIn(List<BigDecimal> values) {
            addCriterion("paid_total not in", values, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_total between", value1, value2, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_total not between", value1, value2, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalIsNull() {
            addCriterion("tax_total is null");
            return (Criteria) this;
        }

        public Criteria andTaxTotalIsNotNull() {
            addCriterion("tax_total is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTotalEqualTo(BigDecimal value) {
            addCriterion("tax_total =", value, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalNotEqualTo(BigDecimal value) {
            addCriterion("tax_total <>", value, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalGreaterThan(BigDecimal value) {
            addCriterion("tax_total >", value, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_total >=", value, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalLessThan(BigDecimal value) {
            addCriterion("tax_total <", value, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_total <=", value, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalIn(List<BigDecimal> values) {
            addCriterion("tax_total in", values, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalNotIn(List<BigDecimal> values) {
            addCriterion("tax_total not in", values, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_total between", value1, value2, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andTaxTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_total not between", value1, value2, "taxTotal");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountIsNull() {
            addCriterion("PRE_TAX_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountIsNotNull() {
            addCriterion("PRE_TAX_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountEqualTo(BigDecimal value) {
            addCriterion("PRE_TAX_AMOUNT =", value, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("PRE_TAX_AMOUNT <>", value, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountGreaterThan(BigDecimal value) {
            addCriterion("PRE_TAX_AMOUNT >", value, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRE_TAX_AMOUNT >=", value, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountLessThan(BigDecimal value) {
            addCriterion("PRE_TAX_AMOUNT <", value, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRE_TAX_AMOUNT <=", value, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountIn(List<BigDecimal> values) {
            addCriterion("PRE_TAX_AMOUNT in", values, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("PRE_TAX_AMOUNT not in", values, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRE_TAX_AMOUNT between", value1, value2, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPreTaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRE_TAX_AMOUNT not between", value1, value2, "preTaxAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostIsNull() {
            addCriterion("REPEATEDTAX_COST is null");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostIsNotNull() {
            addCriterion("REPEATEDTAX_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostEqualTo(BigDecimal value) {
            addCriterion("REPEATEDTAX_COST =", value, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostNotEqualTo(BigDecimal value) {
            addCriterion("REPEATEDTAX_COST <>", value, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostGreaterThan(BigDecimal value) {
            addCriterion("REPEATEDTAX_COST >", value, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEATEDTAX_COST >=", value, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostLessThan(BigDecimal value) {
            addCriterion("REPEATEDTAX_COST <", value, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEATEDTAX_COST <=", value, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostIn(List<BigDecimal> values) {
            addCriterion("REPEATEDTAX_COST in", values, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostNotIn(List<BigDecimal> values) {
            addCriterion("REPEATEDTAX_COST not in", values, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEATEDTAX_COST between", value1, value2, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRepeatedtaxCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEATEDTAX_COST not between", value1, value2, "repeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}