package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBizShouldCommissionPoolExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TBizShouldCommissionPoolExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andLicenceIdIsNull() {
            addCriterion("Licence_ID is null");
            return (Criteria) this;
        }

        public Criteria andLicenceIdIsNotNull() {
            addCriterion("Licence_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLicenceIdEqualTo(Long value) {
            addCriterion("Licence_ID =", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdNotEqualTo(Long value) {
            addCriterion("Licence_ID <>", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdGreaterThan(Long value) {
            addCriterion("Licence_ID >", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Licence_ID >=", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdLessThan(Long value) {
            addCriterion("Licence_ID <", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdLessThanOrEqualTo(Long value) {
            addCriterion("Licence_ID <=", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdIn(List<Long> values) {
            addCriterion("Licence_ID in", values, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdNotIn(List<Long> values) {
            addCriterion("Licence_ID not in", values, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdBetween(Long value1, Long value2) {
            addCriterion("Licence_ID between", value1, value2, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdNotBetween(Long value1, Long value2) {
            addCriterion("Licence_ID not between", value1, value2, "licenceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNull() {
            addCriterion("INSURANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNotNull() {
            addCriterion("INSURANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdEqualTo(Long value) {
            addCriterion("INSURANCE_ID =", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotEqualTo(Long value) {
            addCriterion("INSURANCE_ID <>", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThan(Long value) {
            addCriterion("INSURANCE_ID >", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INSURANCE_ID >=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThan(Long value) {
            addCriterion("INSURANCE_ID <", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThanOrEqualTo(Long value) {
            addCriterion("INSURANCE_ID <=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIn(List<Long> values) {
            addCriterion("INSURANCE_ID in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotIn(List<Long> values) {
            addCriterion("INSURANCE_ID not in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdBetween(Long value1, Long value2) {
            addCriterion("INSURANCE_ID between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotBetween(Long value1, Long value2) {
            addCriterion("INSURANCE_ID not between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaIsNull() {
            addCriterion("Accept_Area is null");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaIsNotNull() {
            addCriterion("Accept_Area is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaEqualTo(String value) {
            addCriterion("Accept_Area =", value, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaNotEqualTo(String value) {
            addCriterion("Accept_Area <>", value, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaGreaterThan(String value) {
            addCriterion("Accept_Area >", value, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaGreaterThanOrEqualTo(String value) {
            addCriterion("Accept_Area >=", value, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaLessThan(String value) {
            addCriterion("Accept_Area <", value, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaLessThanOrEqualTo(String value) {
            addCriterion("Accept_Area <=", value, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaLike(String value) {
            addCriterion("Accept_Area like", value, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaNotLike(String value) {
            addCriterion("Accept_Area not like", value, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaIn(List<String> values) {
            addCriterion("Accept_Area in", values, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaNotIn(List<String> values) {
            addCriterion("Accept_Area not in", values, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaBetween(String value1, String value2) {
            addCriterion("Accept_Area between", value1, value2, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andAcceptAreaNotBetween(String value1, String value2) {
            addCriterion("Accept_Area not between", value1, value2, "acceptArea");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNull() {
            addCriterion("Premium is null");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNotNull() {
            addCriterion("Premium is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumEqualTo(BigDecimal value) {
            addCriterion("Premium =", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotEqualTo(BigDecimal value) {
            addCriterion("Premium <>", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThan(BigDecimal value) {
            addCriterion("Premium >", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Premium >=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThan(BigDecimal value) {
            addCriterion("Premium <", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Premium <=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumIn(List<BigDecimal> values) {
            addCriterion("Premium in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotIn(List<BigDecimal> values) {
            addCriterion("Premium not in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Premium between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Premium not between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("Agent_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("Agent_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("Agent_ID =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("Agent_ID <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("Agent_ID >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Agent_ID >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("Agent_ID <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("Agent_ID <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("Agent_ID in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("Agent_ID not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("Agent_ID between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("Agent_ID not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateIsNull() {
            addCriterion("Channel_Commission_Rate is null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateIsNotNull() {
            addCriterion("Channel_Commission_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateEqualTo(BigDecimal value) {
            addCriterion("Channel_Commission_Rate =", value, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateNotEqualTo(BigDecimal value) {
            addCriterion("Channel_Commission_Rate <>", value, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateGreaterThan(BigDecimal value) {
            addCriterion("Channel_Commission_Rate >", value, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Channel_Commission_Rate >=", value, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateLessThan(BigDecimal value) {
            addCriterion("Channel_Commission_Rate <", value, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Channel_Commission_Rate <=", value, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateIn(List<BigDecimal> values) {
            addCriterion("Channel_Commission_Rate in", values, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateNotIn(List<BigDecimal> values) {
            addCriterion("Channel_Commission_Rate not in", values, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Channel_Commission_Rate between", value1, value2, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Channel_Commission_Rate not between", value1, value2, "channelCommissionRate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionIsNull() {
            addCriterion("Channel_Commission is null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionIsNotNull() {
            addCriterion("Channel_Commission is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionEqualTo(BigDecimal value) {
            addCriterion("Channel_Commission =", value, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionNotEqualTo(BigDecimal value) {
            addCriterion("Channel_Commission <>", value, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionGreaterThan(BigDecimal value) {
            addCriterion("Channel_Commission >", value, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Channel_Commission >=", value, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionLessThan(BigDecimal value) {
            addCriterion("Channel_Commission <", value, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Channel_Commission <=", value, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionIn(List<BigDecimal> values) {
            addCriterion("Channel_Commission in", values, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionNotIn(List<BigDecimal> values) {
            addCriterion("Channel_Commission not in", values, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Channel_Commission between", value1, value2, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Channel_Commission not between", value1, value2, "channelCommission");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusIsNull() {
            addCriterion("Channel_Commission_Status is null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusIsNotNull() {
            addCriterion("Channel_Commission_Status is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusEqualTo(String value) {
            addCriterion("Channel_Commission_Status =", value, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusNotEqualTo(String value) {
            addCriterion("Channel_Commission_Status <>", value, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusGreaterThan(String value) {
            addCriterion("Channel_Commission_Status >", value, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Channel_Commission_Status >=", value, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusLessThan(String value) {
            addCriterion("Channel_Commission_Status <", value, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusLessThanOrEqualTo(String value) {
            addCriterion("Channel_Commission_Status <=", value, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusLike(String value) {
            addCriterion("Channel_Commission_Status like", value, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusNotLike(String value) {
            addCriterion("Channel_Commission_Status not like", value, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusIn(List<String> values) {
            addCriterion("Channel_Commission_Status in", values, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusNotIn(List<String> values) {
            addCriterion("Channel_Commission_Status not in", values, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusBetween(String value1, String value2) {
            addCriterion("Channel_Commission_Status between", value1, value2, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionStatusNotBetween(String value1, String value2) {
            addCriterion("Channel_Commission_Status not between", value1, value2, "channelCommissionStatus");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateIsNull() {
            addCriterion("Channel_Commission_SettleDate is null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateIsNotNull() {
            addCriterion("Channel_Commission_SettleDate is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateEqualTo(Date value) {
            addCriterion("Channel_Commission_SettleDate =", value, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateNotEqualTo(Date value) {
            addCriterion("Channel_Commission_SettleDate <>", value, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateGreaterThan(Date value) {
            addCriterion("Channel_Commission_SettleDate >", value, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateGreaterThanOrEqualTo(Date value) {
            addCriterion("Channel_Commission_SettleDate >=", value, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateLessThan(Date value) {
            addCriterion("Channel_Commission_SettleDate <", value, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateLessThanOrEqualTo(Date value) {
            addCriterion("Channel_Commission_SettleDate <=", value, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateIn(List<Date> values) {
            addCriterion("Channel_Commission_SettleDate in", values, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateNotIn(List<Date> values) {
            addCriterion("Channel_Commission_SettleDate not in", values, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateBetween(Date value1, Date value2) {
            addCriterion("Channel_Commission_SettleDate between", value1, value2, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionSettledateNotBetween(Date value1, Date value2) {
            addCriterion("Channel_Commission_SettleDate not between", value1, value2, "channelCommissionSettledate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateIsNull() {
            addCriterion("Channel_Commission_deductDate is null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateIsNotNull() {
            addCriterion("Channel_Commission_deductDate is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateEqualTo(Date value) {
            addCriterion("Channel_Commission_deductDate =", value, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateNotEqualTo(Date value) {
            addCriterion("Channel_Commission_deductDate <>", value, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateGreaterThan(Date value) {
            addCriterion("Channel_Commission_deductDate >", value, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Channel_Commission_deductDate >=", value, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateLessThan(Date value) {
            addCriterion("Channel_Commission_deductDate <", value, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateLessThanOrEqualTo(Date value) {
            addCriterion("Channel_Commission_deductDate <=", value, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateIn(List<Date> values) {
            addCriterion("Channel_Commission_deductDate in", values, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateNotIn(List<Date> values) {
            addCriterion("Channel_Commission_deductDate not in", values, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateBetween(Date value1, Date value2) {
            addCriterion("Channel_Commission_deductDate between", value1, value2, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andChannelCommissionDeductdateNotBetween(Date value1, Date value2) {
            addCriterion("Channel_Commission_deductDate not between", value1, value2, "channelCommissionDeductdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateIsNull() {
            addCriterion("Promotion_rate is null");
            return (Criteria) this;
        }

        public Criteria andPromotionRateIsNotNull() {
            addCriterion("Promotion_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionRateEqualTo(BigDecimal value) {
            addCriterion("Promotion_rate =", value, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateNotEqualTo(BigDecimal value) {
            addCriterion("Promotion_rate <>", value, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateGreaterThan(BigDecimal value) {
            addCriterion("Promotion_rate >", value, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Promotion_rate >=", value, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateLessThan(BigDecimal value) {
            addCriterion("Promotion_rate <", value, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Promotion_rate <=", value, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateIn(List<BigDecimal> values) {
            addCriterion("Promotion_rate in", values, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateNotIn(List<BigDecimal> values) {
            addCriterion("Promotion_rate not in", values, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Promotion_rate between", value1, value2, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Promotion_rate not between", value1, value2, "promotionRate");
            return (Criteria) this;
        }

        public Criteria andPromotionIsNull() {
            addCriterion("Promotion is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIsNotNull() {
            addCriterion("Promotion is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionEqualTo(BigDecimal value) {
            addCriterion("Promotion =", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotEqualTo(BigDecimal value) {
            addCriterion("Promotion <>", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionGreaterThan(BigDecimal value) {
            addCriterion("Promotion >", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Promotion >=", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLessThan(BigDecimal value) {
            addCriterion("Promotion <", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Promotion <=", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionIn(List<BigDecimal> values) {
            addCriterion("Promotion in", values, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotIn(List<BigDecimal> values) {
            addCriterion("Promotion not in", values, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Promotion between", value1, value2, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Promotion not between", value1, value2, "promotion");
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

        public Criteria andPromotionSettledateIsNull() {
            addCriterion("Promotion_SettleDate is null");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateIsNotNull() {
            addCriterion("Promotion_SettleDate is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateEqualTo(Date value) {
            addCriterion("Promotion_SettleDate =", value, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateNotEqualTo(Date value) {
            addCriterion("Promotion_SettleDate <>", value, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateGreaterThan(Date value) {
            addCriterion("Promotion_SettleDate >", value, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateGreaterThanOrEqualTo(Date value) {
            addCriterion("Promotion_SettleDate >=", value, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateLessThan(Date value) {
            addCriterion("Promotion_SettleDate <", value, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateLessThanOrEqualTo(Date value) {
            addCriterion("Promotion_SettleDate <=", value, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateIn(List<Date> values) {
            addCriterion("Promotion_SettleDate in", values, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateNotIn(List<Date> values) {
            addCriterion("Promotion_SettleDate not in", values, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateBetween(Date value1, Date value2) {
            addCriterion("Promotion_SettleDate between", value1, value2, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionSettledateNotBetween(Date value1, Date value2) {
            addCriterion("Promotion_SettleDate not between", value1, value2, "promotionSettledate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateIsNull() {
            addCriterion("Promotion_RepossessDate is null");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateIsNotNull() {
            addCriterion("Promotion_RepossessDate is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateEqualTo(Date value) {
            addCriterion("Promotion_RepossessDate =", value, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateNotEqualTo(Date value) {
            addCriterion("Promotion_RepossessDate <>", value, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateGreaterThan(Date value) {
            addCriterion("Promotion_RepossessDate >", value, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Promotion_RepossessDate >=", value, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateLessThan(Date value) {
            addCriterion("Promotion_RepossessDate <", value, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateLessThanOrEqualTo(Date value) {
            addCriterion("Promotion_RepossessDate <=", value, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateIn(List<Date> values) {
            addCriterion("Promotion_RepossessDate in", values, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateNotIn(List<Date> values) {
            addCriterion("Promotion_RepossessDate not in", values, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateBetween(Date value1, Date value2) {
            addCriterion("Promotion_RepossessDate between", value1, value2, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andPromotionRepossessdateNotBetween(Date value1, Date value2) {
            addCriterion("Promotion_RepossessDate not between", value1, value2, "promotionRepossessdate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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