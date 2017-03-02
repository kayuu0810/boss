package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBizShouldCommissionFlowExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TBizShouldCommissionFlowExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdIsNull() {
            addCriterion("POLICY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIdIsNotNull() {
            addCriterion("POLICY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyIdEqualTo(Long value) {
            addCriterion("POLICY_ID =", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotEqualTo(Long value) {
            addCriterion("POLICY_ID <>", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdGreaterThan(Long value) {
            addCriterion("POLICY_ID >", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POLICY_ID >=", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdLessThan(Long value) {
            addCriterion("POLICY_ID <", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdLessThanOrEqualTo(Long value) {
            addCriterion("POLICY_ID <=", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdIn(List<Long> values) {
            addCriterion("POLICY_ID in", values, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotIn(List<Long> values) {
            addCriterion("POLICY_ID not in", values, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdBetween(Long value1, Long value2) {
            addCriterion("POLICY_ID between", value1, value2, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotBetween(Long value1, Long value2) {
            addCriterion("POLICY_ID not between", value1, value2, "policyId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdIsNull() {
            addCriterion("TAX_LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdIsNotNull() {
            addCriterion("TAX_LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdEqualTo(Long value) {
            addCriterion("TAX_LEVEL_ID =", value, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdNotEqualTo(Long value) {
            addCriterion("TAX_LEVEL_ID <>", value, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdGreaterThan(Long value) {
            addCriterion("TAX_LEVEL_ID >", value, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TAX_LEVEL_ID >=", value, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdLessThan(Long value) {
            addCriterion("TAX_LEVEL_ID <", value, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdLessThanOrEqualTo(Long value) {
            addCriterion("TAX_LEVEL_ID <=", value, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdIn(List<Long> values) {
            addCriterion("TAX_LEVEL_ID in", values, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdNotIn(List<Long> values) {
            addCriterion("TAX_LEVEL_ID not in", values, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdBetween(Long value1, Long value2) {
            addCriterion("TAX_LEVEL_ID between", value1, value2, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIdNotBetween(Long value1, Long value2) {
            addCriterion("TAX_LEVEL_ID not between", value1, value2, "taxLevelId");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeIsNull() {
            addCriterion("POLICY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeIsNotNull() {
            addCriterion("POLICY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeEqualTo(String value) {
            addCriterion("POLICY_TYPE =", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeNotEqualTo(String value) {
            addCriterion("POLICY_TYPE <>", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeGreaterThan(String value) {
            addCriterion("POLICY_TYPE >", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY_TYPE >=", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeLessThan(String value) {
            addCriterion("POLICY_TYPE <", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeLessThanOrEqualTo(String value) {
            addCriterion("POLICY_TYPE <=", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeLike(String value) {
            addCriterion("POLICY_TYPE like", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeNotLike(String value) {
            addCriterion("POLICY_TYPE not like", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeIn(List<String> values) {
            addCriterion("POLICY_TYPE in", values, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeNotIn(List<String> values) {
            addCriterion("POLICY_TYPE not in", values, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeBetween(String value1, String value2) {
            addCriterion("POLICY_TYPE between", value1, value2, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeNotBetween(String value1, String value2) {
            addCriterion("POLICY_TYPE not between", value1, value2, "policyType");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNull() {
            addCriterion("ACCEPT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNotNull() {
            addCriterion("ACCEPT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateEqualTo(Date value) {
            addCriterion("ACCEPT_DATE =", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotEqualTo(Date value) {
            addCriterion("ACCEPT_DATE <>", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThan(Date value) {
            addCriterion("ACCEPT_DATE >", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCEPT_DATE >=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThan(Date value) {
            addCriterion("ACCEPT_DATE <", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCEPT_DATE <=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIn(List<Date> values) {
            addCriterion("ACCEPT_DATE in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotIn(List<Date> values) {
            addCriterion("ACCEPT_DATE not in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateBetween(Date value1, Date value2) {
            addCriterion("ACCEPT_DATE between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCEPT_DATE not between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("CANCEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("CANCEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("CANCEL_DATE =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("CANCEL_DATE <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("CANCEL_DATE >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("CANCEL_DATE <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("CANCEL_DATE in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("CANCEL_DATE not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNull() {
            addCriterion("PREMIUM is null");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNotNull() {
            addCriterion("PREMIUM is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumEqualTo(BigDecimal value) {
            addCriterion("PREMIUM =", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotEqualTo(BigDecimal value) {
            addCriterion("PREMIUM <>", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThan(BigDecimal value) {
            addCriterion("PREMIUM >", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PREMIUM >=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThan(BigDecimal value) {
            addCriterion("PREMIUM <", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PREMIUM <=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumIn(List<BigDecimal> values) {
            addCriterion("PREMIUM in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotIn(List<BigDecimal> values) {
            addCriterion("PREMIUM not in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREMIUM between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREMIUM not between", value1, value2, "premium");
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

        public Criteria andPromitionalRateIsNull() {
            addCriterion("PROMITIONAL_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateIsNotNull() {
            addCriterion("PROMITIONAL_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateEqualTo(BigDecimal value) {
            addCriterion("PROMITIONAL_RATE =", value, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateNotEqualTo(BigDecimal value) {
            addCriterion("PROMITIONAL_RATE <>", value, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateGreaterThan(BigDecimal value) {
            addCriterion("PROMITIONAL_RATE >", value, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMITIONAL_RATE >=", value, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateLessThan(BigDecimal value) {
            addCriterion("PROMITIONAL_RATE <", value, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMITIONAL_RATE <=", value, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateIn(List<BigDecimal> values) {
            addCriterion("PROMITIONAL_RATE in", values, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateNotIn(List<BigDecimal> values) {
            addCriterion("PROMITIONAL_RATE not in", values, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMITIONAL_RATE between", value1, value2, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMITIONAL_RATE not between", value1, value2, "promitionalRate");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeIsNull() {
            addCriterion("PROMITIONAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeIsNotNull() {
            addCriterion("PROMITIONAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeEqualTo(String value) {
            addCriterion("PROMITIONAL_TYPE =", value, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeNotEqualTo(String value) {
            addCriterion("PROMITIONAL_TYPE <>", value, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeGreaterThan(String value) {
            addCriterion("PROMITIONAL_TYPE >", value, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROMITIONAL_TYPE >=", value, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeLessThan(String value) {
            addCriterion("PROMITIONAL_TYPE <", value, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeLessThanOrEqualTo(String value) {
            addCriterion("PROMITIONAL_TYPE <=", value, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeLike(String value) {
            addCriterion("PROMITIONAL_TYPE like", value, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeNotLike(String value) {
            addCriterion("PROMITIONAL_TYPE not like", value, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeIn(List<String> values) {
            addCriterion("PROMITIONAL_TYPE in", values, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeNotIn(List<String> values) {
            addCriterion("PROMITIONAL_TYPE not in", values, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeBetween(String value1, String value2) {
            addCriterion("PROMITIONAL_TYPE between", value1, value2, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromitionalTypeNotBetween(String value1, String value2) {
            addCriterion("PROMITIONAL_TYPE not between", value1, value2, "promitionalType");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusIsNull() {
            addCriterion("Promotion_Status is null");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusIsNotNull() {
            addCriterion("Promotion_Status is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusEqualTo(String value) {
            addCriterion("Promotion_Status =", value, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusNotEqualTo(String value) {
            addCriterion("Promotion_Status <>", value, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusGreaterThan(String value) {
            addCriterion("Promotion_Status >", value, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Promotion_Status >=", value, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusLessThan(String value) {
            addCriterion("Promotion_Status <", value, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusLessThanOrEqualTo(String value) {
            addCriterion("Promotion_Status <=", value, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusLike(String value) {
            addCriterion("Promotion_Status like", value, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusNotLike(String value) {
            addCriterion("Promotion_Status not like", value, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusIn(List<String> values) {
            addCriterion("Promotion_Status in", values, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusNotIn(List<String> values) {
            addCriterion("Promotion_Status not in", values, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusBetween(String value1, String value2) {
            addCriterion("Promotion_Status between", value1, value2, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStatusNotBetween(String value1, String value2) {
            addCriterion("Promotion_Status not between", value1, value2, "promotionStatus");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNull() {
            addCriterion("PAYABLE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNotNull() {
            addCriterion("PAYABLE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountEqualTo(BigDecimal value) {
            addCriterion("PAYABLE_AMOUNT =", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotEqualTo(BigDecimal value) {
            addCriterion("PAYABLE_AMOUNT <>", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThan(BigDecimal value) {
            addCriterion("PAYABLE_AMOUNT >", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYABLE_AMOUNT >=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThan(BigDecimal value) {
            addCriterion("PAYABLE_AMOUNT <", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYABLE_AMOUNT <=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIn(List<BigDecimal> values) {
            addCriterion("PAYABLE_AMOUNT in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotIn(List<BigDecimal> values) {
            addCriterion("PAYABLE_AMOUNT not in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYABLE_AMOUNT between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYABLE_AMOUNT not between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIsNull() {
            addCriterion("TAX_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIsNotNull() {
            addCriterion("TAX_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxLevelEqualTo(String value) {
            addCriterion("TAX_LEVEL =", value, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelNotEqualTo(String value) {
            addCriterion("TAX_LEVEL <>", value, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelGreaterThan(String value) {
            addCriterion("TAX_LEVEL >", value, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_LEVEL >=", value, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelLessThan(String value) {
            addCriterion("TAX_LEVEL <", value, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelLessThanOrEqualTo(String value) {
            addCriterion("TAX_LEVEL <=", value, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelLike(String value) {
            addCriterion("TAX_LEVEL like", value, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelNotLike(String value) {
            addCriterion("TAX_LEVEL not like", value, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelIn(List<String> values) {
            addCriterion("TAX_LEVEL in", values, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelNotIn(List<String> values) {
            addCriterion("TAX_LEVEL not in", values, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelBetween(String value1, String value2) {
            addCriterion("TAX_LEVEL between", value1, value2, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andTaxLevelNotBetween(String value1, String value2) {
            addCriterion("TAX_LEVEL not between", value1, value2, "taxLevel");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountIsNull() {
            addCriterion("DEDUCTION_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountIsNotNull() {
            addCriterion("DEDUCTION_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountEqualTo(BigDecimal value) {
            addCriterion("DEDUCTION_AMOUNT =", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountNotEqualTo(BigDecimal value) {
            addCriterion("DEDUCTION_AMOUNT <>", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountGreaterThan(BigDecimal value) {
            addCriterion("DEDUCTION_AMOUNT >", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCTION_AMOUNT >=", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountLessThan(BigDecimal value) {
            addCriterion("DEDUCTION_AMOUNT <", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCTION_AMOUNT <=", value, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountIn(List<BigDecimal> values) {
            addCriterion("DEDUCTION_AMOUNT in", values, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountNotIn(List<BigDecimal> values) {
            addCriterion("DEDUCTION_AMOUNT not in", values, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCTION_AMOUNT between", value1, value2, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andDeductionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCTION_AMOUNT not between", value1, value2, "deductionAmount");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostIsNull() {
            addCriterion("RRPEATEDTAX_COST is null");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostIsNotNull() {
            addCriterion("RRPEATEDTAX_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostEqualTo(BigDecimal value) {
            addCriterion("RRPEATEDTAX_COST =", value, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostNotEqualTo(BigDecimal value) {
            addCriterion("RRPEATEDTAX_COST <>", value, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostGreaterThan(BigDecimal value) {
            addCriterion("RRPEATEDTAX_COST >", value, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RRPEATEDTAX_COST >=", value, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostLessThan(BigDecimal value) {
            addCriterion("RRPEATEDTAX_COST <", value, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RRPEATEDTAX_COST <=", value, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostIn(List<BigDecimal> values) {
            addCriterion("RRPEATEDTAX_COST in", values, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostNotIn(List<BigDecimal> values) {
            addCriterion("RRPEATEDTAX_COST not in", values, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RRPEATEDTAX_COST between", value1, value2, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andRrpeatedtaxCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RRPEATEDTAX_COST not between", value1, value2, "rrpeatedtaxCost");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNull() {
            addCriterion("PAID_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNotNull() {
            addCriterion("PAID_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountEqualTo(BigDecimal value) {
            addCriterion("PAID_AMOUNT =", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotEqualTo(BigDecimal value) {
            addCriterion("PAID_AMOUNT <>", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThan(BigDecimal value) {
            addCriterion("PAID_AMOUNT >", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAID_AMOUNT >=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThan(BigDecimal value) {
            addCriterion("PAID_AMOUNT <", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAID_AMOUNT <=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIn(List<BigDecimal> values) {
            addCriterion("PAID_AMOUNT in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotIn(List<BigDecimal> values) {
            addCriterion("PAID_AMOUNT not in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAID_AMOUNT between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAID_AMOUNT not between", value1, value2, "paidAmount");
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