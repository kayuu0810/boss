package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TSalPolicyExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TSalPolicyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVehicleIdIsNull() {
            addCriterion("VEHICLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("VEHICLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(Long value) {
            addCriterion("VEHICLE_ID =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(Long value) {
            addCriterion("VEHICLE_ID <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(Long value) {
            addCriterion("VEHICLE_ID >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_ID >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(Long value) {
            addCriterion("VEHICLE_ID <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_ID <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<Long> values) {
            addCriterion("VEHICLE_ID in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<Long> values) {
            addCriterion("VEHICLE_ID not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_ID between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_ID not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeIsNull() {
            addCriterion("POLICY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeIsNotNull() {
            addCriterion("POLICY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeEqualTo(String value) {
            addCriterion("POLICY_CODE =", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeNotEqualTo(String value) {
            addCriterion("POLICY_CODE <>", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeGreaterThan(String value) {
            addCriterion("POLICY_CODE >", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY_CODE >=", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeLessThan(String value) {
            addCriterion("POLICY_CODE <", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeLessThanOrEqualTo(String value) {
            addCriterion("POLICY_CODE <=", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeLike(String value) {
            addCriterion("POLICY_CODE like", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeNotLike(String value) {
            addCriterion("POLICY_CODE not like", value, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeIn(List<String> values) {
            addCriterion("POLICY_CODE in", values, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeNotIn(List<String> values) {
            addCriterion("POLICY_CODE not in", values, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeBetween(String value1, String value2) {
            addCriterion("POLICY_CODE between", value1, value2, "policyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyCodeNotBetween(String value1, String value2) {
            addCriterion("POLICY_CODE not between", value1, value2, "policyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNull() {
            addCriterion("APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNotNull() {
            addCriterion("APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeEqualTo(String value) {
            addCriterion("APPLY_CODE =", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotEqualTo(String value) {
            addCriterion("APPLY_CODE <>", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThan(String value) {
            addCriterion("APPLY_CODE >", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE >=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThan(String value) {
            addCriterion("APPLY_CODE <", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE <=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLike(String value) {
            addCriterion("APPLY_CODE like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotLike(String value) {
            addCriterion("APPLY_CODE not like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIn(List<String> values) {
            addCriterion("APPLY_CODE in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotIn(List<String> values) {
            addCriterion("APPLY_CODE not in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeBetween(String value1, String value2) {
            addCriterion("APPLY_CODE between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_CODE not between", value1, value2, "applyCode");
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

        public Criteria andUnderwriteTimeIsNull() {
            addCriterion("UNDERWRITE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeIsNotNull() {
            addCriterion("UNDERWRITE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeEqualTo(Date value) {
            addCriterion("UNDERWRITE_TIME =", value, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeNotEqualTo(Date value) {
            addCriterion("UNDERWRITE_TIME <>", value, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeGreaterThan(Date value) {
            addCriterion("UNDERWRITE_TIME >", value, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UNDERWRITE_TIME >=", value, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeLessThan(Date value) {
            addCriterion("UNDERWRITE_TIME <", value, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeLessThanOrEqualTo(Date value) {
            addCriterion("UNDERWRITE_TIME <=", value, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeIn(List<Date> values) {
            addCriterion("UNDERWRITE_TIME in", values, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeNotIn(List<Date> values) {
            addCriterion("UNDERWRITE_TIME not in", values, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeBetween(Date value1, Date value2) {
            addCriterion("UNDERWRITE_TIME between", value1, value2, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andUnderwriteTimeNotBetween(Date value1, Date value2) {
            addCriterion("UNDERWRITE_TIME not between", value1, value2, "underwriteTime");
            return (Criteria) this;
        }

        public Criteria andPolicySourceIsNull() {
            addCriterion("POLICY_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andPolicySourceIsNotNull() {
            addCriterion("POLICY_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andPolicySourceEqualTo(String value) {
            addCriterion("POLICY_SOURCE =", value, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNotEqualTo(String value) {
            addCriterion("POLICY_SOURCE <>", value, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceGreaterThan(String value) {
            addCriterion("POLICY_SOURCE >", value, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY_SOURCE >=", value, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceLessThan(String value) {
            addCriterion("POLICY_SOURCE <", value, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceLessThanOrEqualTo(String value) {
            addCriterion("POLICY_SOURCE <=", value, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceLike(String value) {
            addCriterion("POLICY_SOURCE like", value, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNotLike(String value) {
            addCriterion("POLICY_SOURCE not like", value, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceIn(List<String> values) {
            addCriterion("POLICY_SOURCE in", values, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNotIn(List<String> values) {
            addCriterion("POLICY_SOURCE not in", values, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceBetween(String value1, String value2) {
            addCriterion("POLICY_SOURCE between", value1, value2, "policySource");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNotBetween(String value1, String value2) {
            addCriterion("POLICY_SOURCE not between", value1, value2, "policySource");
            return (Criteria) this;
        }

        public Criteria andFromInsurerIsNull() {
            addCriterion("FROM_INSURER is null");
            return (Criteria) this;
        }

        public Criteria andFromInsurerIsNotNull() {
            addCriterion("FROM_INSURER is not null");
            return (Criteria) this;
        }

        public Criteria andFromInsurerEqualTo(String value) {
            addCriterion("FROM_INSURER =", value, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerNotEqualTo(String value) {
            addCriterion("FROM_INSURER <>", value, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerGreaterThan(String value) {
            addCriterion("FROM_INSURER >", value, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_INSURER >=", value, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerLessThan(String value) {
            addCriterion("FROM_INSURER <", value, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerLessThanOrEqualTo(String value) {
            addCriterion("FROM_INSURER <=", value, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerLike(String value) {
            addCriterion("FROM_INSURER like", value, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerNotLike(String value) {
            addCriterion("FROM_INSURER not like", value, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerIn(List<String> values) {
            addCriterion("FROM_INSURER in", values, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerNotIn(List<String> values) {
            addCriterion("FROM_INSURER not in", values, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerBetween(String value1, String value2) {
            addCriterion("FROM_INSURER between", value1, value2, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andFromInsurerNotBetween(String value1, String value2) {
            addCriterion("FROM_INSURER not between", value1, value2, "fromInsurer");
            return (Criteria) this;
        }

        public Criteria andServerAgencyIsNull() {
            addCriterion("SERVER_AGENCY is null");
            return (Criteria) this;
        }

        public Criteria andServerAgencyIsNotNull() {
            addCriterion("SERVER_AGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andServerAgencyEqualTo(String value) {
            addCriterion("SERVER_AGENCY =", value, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyNotEqualTo(String value) {
            addCriterion("SERVER_AGENCY <>", value, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyGreaterThan(String value) {
            addCriterion("SERVER_AGENCY >", value, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_AGENCY >=", value, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyLessThan(String value) {
            addCriterion("SERVER_AGENCY <", value, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyLessThanOrEqualTo(String value) {
            addCriterion("SERVER_AGENCY <=", value, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyLike(String value) {
            addCriterion("SERVER_AGENCY like", value, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyNotLike(String value) {
            addCriterion("SERVER_AGENCY not like", value, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyIn(List<String> values) {
            addCriterion("SERVER_AGENCY in", values, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyNotIn(List<String> values) {
            addCriterion("SERVER_AGENCY not in", values, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyBetween(String value1, String value2) {
            addCriterion("SERVER_AGENCY between", value1, value2, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andServerAgencyNotBetween(String value1, String value2) {
            addCriterion("SERVER_AGENCY not between", value1, value2, "serverAgency");
            return (Criteria) this;
        }

        public Criteria andSalesCodeIsNull() {
            addCriterion("SALES_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSalesCodeIsNotNull() {
            addCriterion("SALES_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSalesCodeEqualTo(String value) {
            addCriterion("SALES_CODE =", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeNotEqualTo(String value) {
            addCriterion("SALES_CODE <>", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeGreaterThan(String value) {
            addCriterion("SALES_CODE >", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_CODE >=", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeLessThan(String value) {
            addCriterion("SALES_CODE <", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeLessThanOrEqualTo(String value) {
            addCriterion("SALES_CODE <=", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeLike(String value) {
            addCriterion("SALES_CODE like", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeNotLike(String value) {
            addCriterion("SALES_CODE not like", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeIn(List<String> values) {
            addCriterion("SALES_CODE in", values, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeNotIn(List<String> values) {
            addCriterion("SALES_CODE not in", values, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeBetween(String value1, String value2) {
            addCriterion("SALES_CODE between", value1, value2, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeNotBetween(String value1, String value2) {
            addCriterion("SALES_CODE not between", value1, value2, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesNameIsNull() {
            addCriterion("SALES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSalesNameIsNotNull() {
            addCriterion("SALES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNameEqualTo(String value) {
            addCriterion("SALES_NAME =", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotEqualTo(String value) {
            addCriterion("SALES_NAME <>", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameGreaterThan(String value) {
            addCriterion("SALES_NAME >", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_NAME >=", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLessThan(String value) {
            addCriterion("SALES_NAME <", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLessThanOrEqualTo(String value) {
            addCriterion("SALES_NAME <=", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLike(String value) {
            addCriterion("SALES_NAME like", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotLike(String value) {
            addCriterion("SALES_NAME not like", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameIn(List<String> values) {
            addCriterion("SALES_NAME in", values, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotIn(List<String> values) {
            addCriterion("SALES_NAME not in", values, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameBetween(String value1, String value2) {
            addCriterion("SALES_NAME between", value1, value2, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotBetween(String value1, String value2) {
            addCriterion("SALES_NAME not between", value1, value2, "salesName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("CHARGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("CHARGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(String value) {
            addCriterion("CHARGE_TYPE =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(String value) {
            addCriterion("CHARGE_TYPE <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(String value) {
            addCriterion("CHARGE_TYPE >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_TYPE >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(String value) {
            addCriterion("CHARGE_TYPE <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_TYPE <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLike(String value) {
            addCriterion("CHARGE_TYPE like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotLike(String value) {
            addCriterion("CHARGE_TYPE not like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<String> values) {
            addCriterion("CHARGE_TYPE in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<String> values) {
            addCriterion("CHARGE_TYPE not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(String value1, String value2) {
            addCriterion("CHARGE_TYPE between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(String value1, String value2) {
            addCriterion("CHARGE_TYPE not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargePeriodIsNull() {
            addCriterion("CHARGE_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andChargePeriodIsNotNull() {
            addCriterion("CHARGE_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andChargePeriodEqualTo(Integer value) {
            addCriterion("CHARGE_PERIOD =", value, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodNotEqualTo(Integer value) {
            addCriterion("CHARGE_PERIOD <>", value, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodGreaterThan(Integer value) {
            addCriterion("CHARGE_PERIOD >", value, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHARGE_PERIOD >=", value, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodLessThan(Integer value) {
            addCriterion("CHARGE_PERIOD <", value, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("CHARGE_PERIOD <=", value, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodIn(List<Integer> values) {
            addCriterion("CHARGE_PERIOD in", values, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodNotIn(List<Integer> values) {
            addCriterion("CHARGE_PERIOD not in", values, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE_PERIOD between", value1, value2, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andChargePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE_PERIOD not between", value1, value2, "chargePeriod");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateIsNull() {
            addCriterion("FRIST_CHARGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateIsNotNull() {
            addCriterion("FRIST_CHARGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateEqualTo(Date value) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE =", value, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE <>", value, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE >", value, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE >=", value, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateLessThan(Date value) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE <", value, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE <=", value, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateIn(List<Date> values) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE in", values, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE not in", values, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE between", value1, value2, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andFristChargeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FRIST_CHARGE_DATE not between", value1, value2, "fristChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateIsNull() {
            addCriterion("LAST_CHARGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateIsNotNull() {
            addCriterion("LAST_CHARGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE =", value, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE <>", value, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE >", value, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE >=", value, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateLessThan(Date value) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE <", value, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE <=", value, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE in", values, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE not in", values, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE between", value1, value2, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andLastChargeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_CHARGE_DATE not between", value1, value2, "lastChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateIsNull() {
            addCriterion("NEXT_CHARGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateIsNotNull() {
            addCriterion("NEXT_CHARGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE =", value, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE <>", value, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE >", value, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE >=", value, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateLessThan(Date value) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE <", value, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE <=", value, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateIn(List<Date> values) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE in", values, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE not in", values, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE between", value1, value2, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andNextChargeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEXT_CHARGE_DATE not between", value1, value2, "nextChargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeWayIsNull() {
            addCriterion("CHARGE_WAY is null");
            return (Criteria) this;
        }

        public Criteria andChargeWayIsNotNull() {
            addCriterion("CHARGE_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andChargeWayEqualTo(String value) {
            addCriterion("CHARGE_WAY =", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayNotEqualTo(String value) {
            addCriterion("CHARGE_WAY <>", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayGreaterThan(String value) {
            addCriterion("CHARGE_WAY >", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_WAY >=", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayLessThan(String value) {
            addCriterion("CHARGE_WAY <", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_WAY <=", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayLike(String value) {
            addCriterion("CHARGE_WAY like", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayNotLike(String value) {
            addCriterion("CHARGE_WAY not like", value, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayIn(List<String> values) {
            addCriterion("CHARGE_WAY in", values, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayNotIn(List<String> values) {
            addCriterion("CHARGE_WAY not in", values, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayBetween(String value1, String value2) {
            addCriterion("CHARGE_WAY between", value1, value2, "chargeWay");
            return (Criteria) this;
        }

        public Criteria andChargeWayNotBetween(String value1, String value2) {
            addCriterion("CHARGE_WAY not between", value1, value2, "chargeWay");
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

        public Criteria andOrderDateIsNull() {
            addCriterion("ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_DATE =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_DATE <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ORDER_DATE >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_DATE >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterionForJDBCDate("ORDER_DATE <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_DATE <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterionForJDBCDate("ORDER_DATE in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ORDER_DATE not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ORDER_DATE between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ORDER_DATE not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNull() {
            addCriterion("EFFECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNotNull() {
            addCriterion("EFFECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectDateEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE =", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE <>", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE >", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE >=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThan(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE <", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECT_DATE <=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateIn(List<Date> values) {
            addCriterionForJDBCDate("EFFECT_DATE in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EFFECT_DATE not in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EFFECT_DATE between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EFFECT_DATE not between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeIsNull() {
            addCriterion("COVERAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeIsNotNull() {
            addCriterion("COVERAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeEqualTo(String value) {
            addCriterion("COVERAGE_TYPE =", value, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeNotEqualTo(String value) {
            addCriterion("COVERAGE_TYPE <>", value, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeGreaterThan(String value) {
            addCriterion("COVERAGE_TYPE >", value, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COVERAGE_TYPE >=", value, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeLessThan(String value) {
            addCriterion("COVERAGE_TYPE <", value, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeLessThanOrEqualTo(String value) {
            addCriterion("COVERAGE_TYPE <=", value, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeLike(String value) {
            addCriterion("COVERAGE_TYPE like", value, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeNotLike(String value) {
            addCriterion("COVERAGE_TYPE not like", value, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeIn(List<String> values) {
            addCriterion("COVERAGE_TYPE in", values, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeNotIn(List<String> values) {
            addCriterion("COVERAGE_TYPE not in", values, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeBetween(String value1, String value2) {
            addCriterion("COVERAGE_TYPE between", value1, value2, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoverageTypeNotBetween(String value1, String value2) {
            addCriterion("COVERAGE_TYPE not between", value1, value2, "coverageType");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodIsNull() {
            addCriterion("COVERAGE_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodIsNotNull() {
            addCriterion("COVERAGE_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodEqualTo(Integer value) {
            addCriterion("COVERAGE_PERIOD =", value, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodNotEqualTo(Integer value) {
            addCriterion("COVERAGE_PERIOD <>", value, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodGreaterThan(Integer value) {
            addCriterion("COVERAGE_PERIOD >", value, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("COVERAGE_PERIOD >=", value, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodLessThan(Integer value) {
            addCriterion("COVERAGE_PERIOD <", value, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("COVERAGE_PERIOD <=", value, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodIn(List<Integer> values) {
            addCriterion("COVERAGE_PERIOD in", values, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodNotIn(List<Integer> values) {
            addCriterion("COVERAGE_PERIOD not in", values, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodBetween(Integer value1, Integer value2) {
            addCriterion("COVERAGE_PERIOD between", value1, value2, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andCoveragePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("COVERAGE_PERIOD not between", value1, value2, "coveragePeriod");
            return (Criteria) this;
        }

        public Criteria andIsChargeIsNull() {
            addCriterion("IS_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andIsChargeIsNotNull() {
            addCriterion("IS_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsChargeEqualTo(String value) {
            addCriterion("IS_CHARGE =", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotEqualTo(String value) {
            addCriterion("IS_CHARGE <>", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeGreaterThan(String value) {
            addCriterion("IS_CHARGE >", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHARGE >=", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLessThan(String value) {
            addCriterion("IS_CHARGE <", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLessThanOrEqualTo(String value) {
            addCriterion("IS_CHARGE <=", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLike(String value) {
            addCriterion("IS_CHARGE like", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotLike(String value) {
            addCriterion("IS_CHARGE not like", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeIn(List<String> values) {
            addCriterion("IS_CHARGE in", values, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotIn(List<String> values) {
            addCriterion("IS_CHARGE not in", values, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeBetween(String value1, String value2) {
            addCriterion("IS_CHARGE between", value1, value2, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotBetween(String value1, String value2) {
            addCriterion("IS_CHARGE not between", value1, value2, "isCharge");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxIsNull() {
            addCriterion("VEHICLE_TAX is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxIsNotNull() {
            addCriterion("VEHICLE_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxEqualTo(Double value) {
            addCriterion("VEHICLE_TAX =", value, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxNotEqualTo(Double value) {
            addCriterion("VEHICLE_TAX <>", value, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxGreaterThan(Double value) {
            addCriterion("VEHICLE_TAX >", value, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("VEHICLE_TAX >=", value, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxLessThan(Double value) {
            addCriterion("VEHICLE_TAX <", value, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxLessThanOrEqualTo(Double value) {
            addCriterion("VEHICLE_TAX <=", value, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxIn(List<Double> values) {
            addCriterion("VEHICLE_TAX in", values, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxNotIn(List<Double> values) {
            addCriterion("VEHICLE_TAX not in", values, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxBetween(Double value1, Double value2) {
            addCriterion("VEHICLE_TAX between", value1, value2, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andVehicleTaxNotBetween(Double value1, Double value2) {
            addCriterion("VEHICLE_TAX not between", value1, value2, "vehicleTax");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIsNull() {
            addCriterion("NOTICE_URL is null");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIsNotNull() {
            addCriterion("NOTICE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlEqualTo(String value) {
            addCriterion("NOTICE_URL =", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotEqualTo(String value) {
            addCriterion("NOTICE_URL <>", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlGreaterThan(String value) {
            addCriterion("NOTICE_URL >", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_URL >=", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLessThan(String value) {
            addCriterion("NOTICE_URL <", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_URL <=", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLike(String value) {
            addCriterion("NOTICE_URL like", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotLike(String value) {
            addCriterion("NOTICE_URL not like", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIn(List<String> values) {
            addCriterion("NOTICE_URL in", values, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotIn(List<String> values) {
            addCriterion("NOTICE_URL not in", values, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlBetween(String value1, String value2) {
            addCriterion("NOTICE_URL between", value1, value2, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotBetween(String value1, String value2) {
            addCriterion("NOTICE_URL not between", value1, value2, "noticeUrl");
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