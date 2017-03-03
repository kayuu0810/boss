package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSalOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TSalOrderExample() {
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

        public Criteria andTransNoIsNull() {
            addCriterion("TRANS_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNotNull() {
            addCriterion("TRANS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransNoEqualTo(String value) {
            addCriterion("TRANS_NO =", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotEqualTo(String value) {
            addCriterion("TRANS_NO <>", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThan(String value) {
            addCriterion("TRANS_NO >", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_NO >=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThan(String value) {
            addCriterion("TRANS_NO <", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThanOrEqualTo(String value) {
            addCriterion("TRANS_NO <=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLike(String value) {
            addCriterion("TRANS_NO like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotLike(String value) {
            addCriterion("TRANS_NO not like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoIn(List<String> values) {
            addCriterion("TRANS_NO in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotIn(List<String> values) {
            addCriterion("TRANS_NO not in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoBetween(String value1, String value2) {
            addCriterion("TRANS_NO between", value1, value2, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotBetween(String value1, String value2) {
            addCriterion("TRANS_NO not between", value1, value2, "transNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoIsNull() {
            addCriterion("CORE_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoIsNotNull() {
            addCriterion("CORE_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoEqualTo(String value) {
            addCriterion("CORE_ORDER_NO =", value, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoNotEqualTo(String value) {
            addCriterion("CORE_ORDER_NO <>", value, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoGreaterThan(String value) {
            addCriterion("CORE_ORDER_NO >", value, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("CORE_ORDER_NO >=", value, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoLessThan(String value) {
            addCriterion("CORE_ORDER_NO <", value, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoLessThanOrEqualTo(String value) {
            addCriterion("CORE_ORDER_NO <=", value, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoLike(String value) {
            addCriterion("CORE_ORDER_NO like", value, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoNotLike(String value) {
            addCriterion("CORE_ORDER_NO not like", value, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoIn(List<String> values) {
            addCriterion("CORE_ORDER_NO in", values, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoNotIn(List<String> values) {
            addCriterion("CORE_ORDER_NO not in", values, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoBetween(String value1, String value2) {
            addCriterion("CORE_ORDER_NO between", value1, value2, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andCoreOrderNoNotBetween(String value1, String value2) {
            addCriterion("CORE_ORDER_NO not between", value1, value2, "coreOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoIsNull() {
            addCriterion("INS_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoIsNotNull() {
            addCriterion("INS_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoEqualTo(String value) {
            addCriterion("INS_ORDER_NO =", value, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoNotEqualTo(String value) {
            addCriterion("INS_ORDER_NO <>", value, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoGreaterThan(String value) {
            addCriterion("INS_ORDER_NO >", value, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("INS_ORDER_NO >=", value, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoLessThan(String value) {
            addCriterion("INS_ORDER_NO <", value, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoLessThanOrEqualTo(String value) {
            addCriterion("INS_ORDER_NO <=", value, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoLike(String value) {
            addCriterion("INS_ORDER_NO like", value, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoNotLike(String value) {
            addCriterion("INS_ORDER_NO not like", value, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoIn(List<String> values) {
            addCriterion("INS_ORDER_NO in", values, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoNotIn(List<String> values) {
            addCriterion("INS_ORDER_NO not in", values, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoBetween(String value1, String value2) {
            addCriterion("INS_ORDER_NO between", value1, value2, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andInsOrderNoNotBetween(String value1, String value2) {
            addCriterion("INS_ORDER_NO not between", value1, value2, "insOrderNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdIsNull() {
            addCriterion("CUSTOMER_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdIsNotNull() {
            addCriterion("CUSTOMER_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdEqualTo(String value) {
            addCriterion("CUSTOMER_OPEN_ID =", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_OPEN_ID <>", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdGreaterThan(String value) {
            addCriterion("CUSTOMER_OPEN_ID >", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_OPEN_ID >=", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdLessThan(String value) {
            addCriterion("CUSTOMER_OPEN_ID <", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_OPEN_ID <=", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdLike(String value) {
            addCriterion("CUSTOMER_OPEN_ID like", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdNotLike(String value) {
            addCriterion("CUSTOMER_OPEN_ID not like", value, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdIn(List<String> values) {
            addCriterion("CUSTOMER_OPEN_ID in", values, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_OPEN_ID not in", values, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_OPEN_ID between", value1, value2, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andCustomerOpenIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_OPEN_ID not between", value1, value2, "customerOpenId");
            return (Criteria) this;
        }

        public Criteria andFromCityIsNull() {
            addCriterion("FROM_CITY is null");
            return (Criteria) this;
        }

        public Criteria andFromCityIsNotNull() {
            addCriterion("FROM_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andFromCityEqualTo(String value) {
            addCriterion("FROM_CITY =", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotEqualTo(String value) {
            addCriterion("FROM_CITY <>", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityGreaterThan(String value) {
            addCriterion("FROM_CITY >", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_CITY >=", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLessThan(String value) {
            addCriterion("FROM_CITY <", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLessThanOrEqualTo(String value) {
            addCriterion("FROM_CITY <=", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLike(String value) {
            addCriterion("FROM_CITY like", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotLike(String value) {
            addCriterion("FROM_CITY not like", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityIn(List<String> values) {
            addCriterion("FROM_CITY in", values, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotIn(List<String> values) {
            addCriterion("FROM_CITY not in", values, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityBetween(String value1, String value2) {
            addCriterion("FROM_CITY between", value1, value2, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotBetween(String value1, String value2) {
            addCriterion("FROM_CITY not between", value1, value2, "fromCity");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("PAY_AMOUNT =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("PAY_AMOUNT <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("PAY_AMOUNT >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMOUNT >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("PAY_AMOUNT <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMOUNT <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("PAY_AMOUNT in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("PAY_AMOUNT not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMOUNT between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMOUNT not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagIsNull() {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagIsNotNull() {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagEqualTo(String value) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG =", value, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagNotEqualTo(String value) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG <>", value, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagGreaterThan(String value) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG >", value, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG >=", value, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagLessThan(String value) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG <", value, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagLessThanOrEqualTo(String value) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG <=", value, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagLike(String value) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG like", value, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagNotLike(String value) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG not like", value, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagIn(List<String> values) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG in", values, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagNotIn(List<String> values) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG not in", values, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagBetween(String value1, String value2) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG between", value1, value2, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andPaperPolicyDispatchFlagNotBetween(String value1, String value2) {
            addCriterion("PAPER_POLICY_DISPATCH_FLAG not between", value1, value2, "paperPolicyDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagIsNull() {
            addCriterion("INVOICE_DISPATCH_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagIsNotNull() {
            addCriterion("INVOICE_DISPATCH_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagEqualTo(String value) {
            addCriterion("INVOICE_DISPATCH_FLAG =", value, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagNotEqualTo(String value) {
            addCriterion("INVOICE_DISPATCH_FLAG <>", value, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagGreaterThan(String value) {
            addCriterion("INVOICE_DISPATCH_FLAG >", value, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_DISPATCH_FLAG >=", value, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagLessThan(String value) {
            addCriterion("INVOICE_DISPATCH_FLAG <", value, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_DISPATCH_FLAG <=", value, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagLike(String value) {
            addCriterion("INVOICE_DISPATCH_FLAG like", value, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagNotLike(String value) {
            addCriterion("INVOICE_DISPATCH_FLAG not like", value, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagIn(List<String> values) {
            addCriterion("INVOICE_DISPATCH_FLAG in", values, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagNotIn(List<String> values) {
            addCriterion("INVOICE_DISPATCH_FLAG not in", values, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagBetween(String value1, String value2) {
            addCriterion("INVOICE_DISPATCH_FLAG between", value1, value2, "invoiceDispatchFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceDispatchFlagNotBetween(String value1, String value2) {
            addCriterion("INVOICE_DISPATCH_FLAG not between", value1, value2, "invoiceDispatchFlag");
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

        public Criteria andCancelUserIsNull() {
            addCriterion("CANCEL_USER is null");
            return (Criteria) this;
        }

        public Criteria andCancelUserIsNotNull() {
            addCriterion("CANCEL_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCancelUserEqualTo(String value) {
            addCriterion("CANCEL_USER =", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserNotEqualTo(String value) {
            addCriterion("CANCEL_USER <>", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserGreaterThan(String value) {
            addCriterion("CANCEL_USER >", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_USER >=", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserLessThan(String value) {
            addCriterion("CANCEL_USER <", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_USER <=", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserLike(String value) {
            addCriterion("CANCEL_USER like", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserNotLike(String value) {
            addCriterion("CANCEL_USER not like", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserIn(List<String> values) {
            addCriterion("CANCEL_USER in", values, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserNotIn(List<String> values) {
            addCriterion("CANCEL_USER not in", values, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserBetween(String value1, String value2) {
            addCriterion("CANCEL_USER between", value1, value2, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserNotBetween(String value1, String value2) {
            addCriterion("CANCEL_USER not between", value1, value2, "cancelUser");
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

        public Criteria andCancelReasonIsNull() {
            addCriterion("CANCEL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("CANCEL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("CANCEL_REASON =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("CANCEL_REASON <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("CANCEL_REASON >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_REASON >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("CANCEL_REASON <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_REASON <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("CANCEL_REASON like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("CANCEL_REASON not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("CANCEL_REASON in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("CANCEL_REASON not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("CANCEL_REASON between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("CANCEL_REASON not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andFromChannelIsNull() {
            addCriterion("FROM_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andFromChannelIsNotNull() {
            addCriterion("FROM_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andFromChannelEqualTo(String value) {
            addCriterion("FROM_CHANNEL =", value, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelNotEqualTo(String value) {
            addCriterion("FROM_CHANNEL <>", value, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelGreaterThan(String value) {
            addCriterion("FROM_CHANNEL >", value, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_CHANNEL >=", value, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelLessThan(String value) {
            addCriterion("FROM_CHANNEL <", value, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelLessThanOrEqualTo(String value) {
            addCriterion("FROM_CHANNEL <=", value, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelLike(String value) {
            addCriterion("FROM_CHANNEL like", value, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelNotLike(String value) {
            addCriterion("FROM_CHANNEL not like", value, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelIn(List<String> values) {
            addCriterion("FROM_CHANNEL in", values, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelNotIn(List<String> values) {
            addCriterion("FROM_CHANNEL not in", values, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelBetween(String value1, String value2) {
            addCriterion("FROM_CHANNEL between", value1, value2, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andFromChannelNotBetween(String value1, String value2) {
            addCriterion("FROM_CHANNEL not between", value1, value2, "fromChannel");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIsNull() {
            addCriterion("BALANCE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIsNotNull() {
            addCriterion("BALANCE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceStateEqualTo(String value) {
            addCriterion("BALANCE_STATE =", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotEqualTo(String value) {
            addCriterion("BALANCE_STATE <>", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateGreaterThan(String value) {
            addCriterion("BALANCE_STATE >", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE_STATE >=", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateLessThan(String value) {
            addCriterion("BALANCE_STATE <", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateLessThanOrEqualTo(String value) {
            addCriterion("BALANCE_STATE <=", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateLike(String value) {
            addCriterion("BALANCE_STATE like", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotLike(String value) {
            addCriterion("BALANCE_STATE not like", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIn(List<String> values) {
            addCriterion("BALANCE_STATE in", values, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotIn(List<String> values) {
            addCriterion("BALANCE_STATE not in", values, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateBetween(String value1, String value2) {
            addCriterion("BALANCE_STATE between", value1, value2, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotBetween(String value1, String value2) {
            addCriterion("BALANCE_STATE not between", value1, value2, "balanceState");
            return (Criteria) this;
        }

        public Criteria andRouteCodeIsNull() {
            addCriterion("route_code is null");
            return (Criteria) this;
        }

        public Criteria andRouteCodeIsNotNull() {
            addCriterion("route_code is not null");
            return (Criteria) this;
        }

        public Criteria andRouteCodeEqualTo(String value) {
            addCriterion("route_code =", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeNotEqualTo(String value) {
            addCriterion("route_code <>", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeGreaterThan(String value) {
            addCriterion("route_code >", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("route_code >=", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeLessThan(String value) {
            addCriterion("route_code <", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeLessThanOrEqualTo(String value) {
            addCriterion("route_code <=", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeLike(String value) {
            addCriterion("route_code like", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeNotLike(String value) {
            addCriterion("route_code not like", value, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeIn(List<String> values) {
            addCriterion("route_code in", values, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeNotIn(List<String> values) {
            addCriterion("route_code not in", values, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeBetween(String value1, String value2) {
            addCriterion("route_code between", value1, value2, "routeCode");
            return (Criteria) this;
        }

        public Criteria andRouteCodeNotBetween(String value1, String value2) {
            addCriterion("route_code not between", value1, value2, "routeCode");
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