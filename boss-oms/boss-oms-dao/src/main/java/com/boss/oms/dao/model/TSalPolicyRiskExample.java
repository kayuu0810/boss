package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSalPolicyRiskExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TSalPolicyRiskExample() {
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

        public Criteria andRiskCodeIsNull() {
            addCriterion("RISK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRiskCodeIsNotNull() {
            addCriterion("RISK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskCodeEqualTo(String value) {
            addCriterion("RISK_CODE =", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotEqualTo(String value) {
            addCriterion("RISK_CODE <>", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeGreaterThan(String value) {
            addCriterion("RISK_CODE >", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_CODE >=", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeLessThan(String value) {
            addCriterion("RISK_CODE <", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeLessThanOrEqualTo(String value) {
            addCriterion("RISK_CODE <=", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeLike(String value) {
            addCriterion("RISK_CODE like", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotLike(String value) {
            addCriterion("RISK_CODE not like", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeIn(List<String> values) {
            addCriterion("RISK_CODE in", values, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotIn(List<String> values) {
            addCriterion("RISK_CODE not in", values, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeBetween(String value1, String value2) {
            addCriterion("RISK_CODE between", value1, value2, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotBetween(String value1, String value2) {
            addCriterion("RISK_CODE not between", value1, value2, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskNameIsNull() {
            addCriterion("RISK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRiskNameIsNotNull() {
            addCriterion("RISK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRiskNameEqualTo(String value) {
            addCriterion("RISK_NAME =", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotEqualTo(String value) {
            addCriterion("RISK_NAME <>", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameGreaterThan(String value) {
            addCriterion("RISK_NAME >", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_NAME >=", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLessThan(String value) {
            addCriterion("RISK_NAME <", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLessThanOrEqualTo(String value) {
            addCriterion("RISK_NAME <=", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLike(String value) {
            addCriterion("RISK_NAME like", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotLike(String value) {
            addCriterion("RISK_NAME not like", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameIn(List<String> values) {
            addCriterion("RISK_NAME in", values, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotIn(List<String> values) {
            addCriterion("RISK_NAME not in", values, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameBetween(String value1, String value2) {
            addCriterion("RISK_NAME between", value1, value2, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotBetween(String value1, String value2) {
            addCriterion("RISK_NAME not between", value1, value2, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameIsNull() {
            addCriterion("RISK_PLAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameIsNotNull() {
            addCriterion("RISK_PLAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameEqualTo(String value) {
            addCriterion("RISK_PLAN_NAME =", value, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameNotEqualTo(String value) {
            addCriterion("RISK_PLAN_NAME <>", value, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameGreaterThan(String value) {
            addCriterion("RISK_PLAN_NAME >", value, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_PLAN_NAME >=", value, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameLessThan(String value) {
            addCriterion("RISK_PLAN_NAME <", value, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameLessThanOrEqualTo(String value) {
            addCriterion("RISK_PLAN_NAME <=", value, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameLike(String value) {
            addCriterion("RISK_PLAN_NAME like", value, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameNotLike(String value) {
            addCriterion("RISK_PLAN_NAME not like", value, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameIn(List<String> values) {
            addCriterion("RISK_PLAN_NAME in", values, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameNotIn(List<String> values) {
            addCriterion("RISK_PLAN_NAME not in", values, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameBetween(String value1, String value2) {
            addCriterion("RISK_PLAN_NAME between", value1, value2, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskPlanNameNotBetween(String value1, String value2) {
            addCriterion("RISK_PLAN_NAME not between", value1, value2, "riskPlanName");
            return (Criteria) this;
        }

        public Criteria andRiskDescIsNull() {
            addCriterion("RISK_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRiskDescIsNotNull() {
            addCriterion("RISK_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDescEqualTo(String value) {
            addCriterion("RISK_DESC =", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotEqualTo(String value) {
            addCriterion("RISK_DESC <>", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescGreaterThan(String value) {
            addCriterion("RISK_DESC >", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_DESC >=", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLessThan(String value) {
            addCriterion("RISK_DESC <", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLessThanOrEqualTo(String value) {
            addCriterion("RISK_DESC <=", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescLike(String value) {
            addCriterion("RISK_DESC like", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotLike(String value) {
            addCriterion("RISK_DESC not like", value, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescIn(List<String> values) {
            addCriterion("RISK_DESC in", values, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotIn(List<String> values) {
            addCriterion("RISK_DESC not in", values, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescBetween(String value1, String value2) {
            addCriterion("RISK_DESC between", value1, value2, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskDescNotBetween(String value1, String value2) {
            addCriterion("RISK_DESC not between", value1, value2, "riskDesc");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeIsNull() {
            addCriterion("RISK_PLAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeIsNotNull() {
            addCriterion("RISK_PLAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeEqualTo(String value) {
            addCriterion("RISK_PLAN_CODE =", value, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeNotEqualTo(String value) {
            addCriterion("RISK_PLAN_CODE <>", value, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeGreaterThan(String value) {
            addCriterion("RISK_PLAN_CODE >", value, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_PLAN_CODE >=", value, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeLessThan(String value) {
            addCriterion("RISK_PLAN_CODE <", value, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("RISK_PLAN_CODE <=", value, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeLike(String value) {
            addCriterion("RISK_PLAN_CODE like", value, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeNotLike(String value) {
            addCriterion("RISK_PLAN_CODE not like", value, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeIn(List<String> values) {
            addCriterion("RISK_PLAN_CODE in", values, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeNotIn(List<String> values) {
            addCriterion("RISK_PLAN_CODE not in", values, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeBetween(String value1, String value2) {
            addCriterion("RISK_PLAN_CODE between", value1, value2, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andRiskPlanCodeNotBetween(String value1, String value2) {
            addCriterion("RISK_PLAN_CODE not between", value1, value2, "riskPlanCode");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
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

        public Criteria andRebateRatioIsNull() {
            addCriterion("REBATE_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andRebateRatioIsNotNull() {
            addCriterion("REBATE_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andRebateRatioEqualTo(BigDecimal value) {
            addCriterion("REBATE_RATIO =", value, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioNotEqualTo(BigDecimal value) {
            addCriterion("REBATE_RATIO <>", value, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioGreaterThan(BigDecimal value) {
            addCriterion("REBATE_RATIO >", value, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REBATE_RATIO >=", value, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioLessThan(BigDecimal value) {
            addCriterion("REBATE_RATIO <", value, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REBATE_RATIO <=", value, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioIn(List<BigDecimal> values) {
            addCriterion("REBATE_RATIO in", values, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioNotIn(List<BigDecimal> values) {
            addCriterion("REBATE_RATIO not in", values, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REBATE_RATIO between", value1, value2, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebateRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REBATE_RATIO not between", value1, value2, "rebateRatio");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumIsNull() {
            addCriterion("REBATE_PREMIUM is null");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumIsNotNull() {
            addCriterion("REBATE_PREMIUM is not null");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumEqualTo(BigDecimal value) {
            addCriterion("REBATE_PREMIUM =", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumNotEqualTo(BigDecimal value) {
            addCriterion("REBATE_PREMIUM <>", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumGreaterThan(BigDecimal value) {
            addCriterion("REBATE_PREMIUM >", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REBATE_PREMIUM >=", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumLessThan(BigDecimal value) {
            addCriterion("REBATE_PREMIUM <", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REBATE_PREMIUM <=", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumIn(List<BigDecimal> values) {
            addCriterion("REBATE_PREMIUM in", values, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumNotIn(List<BigDecimal> values) {
            addCriterion("REBATE_PREMIUM not in", values, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REBATE_PREMIUM between", value1, value2, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REBATE_PREMIUM not between", value1, value2, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
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

        public Criteria andLastUpdateUserIsNull() {
            addCriterion("LAST_UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNotNull() {
            addCriterion("LAST_UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER =", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER <>", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThan(String value) {
            addCriterion("LAST_UPDATE_USER >", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER >=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThan(String value) {
            addCriterion("LAST_UPDATE_USER <", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER <=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLike(String value) {
            addCriterion("LAST_UPDATE_USER like", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotLike(String value) {
            addCriterion("LAST_UPDATE_USER not like", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIn(List<String> values) {
            addCriterion("LAST_UPDATE_USER in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_USER not in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_USER between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_USER not between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
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