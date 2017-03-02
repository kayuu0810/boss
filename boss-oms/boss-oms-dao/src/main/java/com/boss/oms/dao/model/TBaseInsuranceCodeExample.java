package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBaseInsuranceCodeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TBaseInsuranceCodeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIsNull() {
            addCriterion("INSURANCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIsNotNull() {
            addCriterion("INSURANCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeEqualTo(String value) {
            addCriterion("INSURANCE_CODE =", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotEqualTo(String value) {
            addCriterion("INSURANCE_CODE <>", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeGreaterThan(String value) {
            addCriterion("INSURANCE_CODE >", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_CODE >=", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLessThan(String value) {
            addCriterion("INSURANCE_CODE <", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_CODE <=", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLike(String value) {
            addCriterion("INSURANCE_CODE like", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotLike(String value) {
            addCriterion("INSURANCE_CODE not like", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIn(List<String> values) {
            addCriterion("INSURANCE_CODE in", values, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotIn(List<String> values) {
            addCriterion("INSURANCE_CODE not in", values, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeBetween(String value1, String value2) {
            addCriterion("INSURANCE_CODE between", value1, value2, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_CODE not between", value1, value2, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNull() {
            addCriterion("INSURANCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNotNull() {
            addCriterion("INSURANCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameEqualTo(String value) {
            addCriterion("INSURANCE_NAME =", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotEqualTo(String value) {
            addCriterion("INSURANCE_NAME <>", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThan(String value) {
            addCriterion("INSURANCE_NAME >", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_NAME >=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThan(String value) {
            addCriterion("INSURANCE_NAME <", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_NAME <=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLike(String value) {
            addCriterion("INSURANCE_NAME like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotLike(String value) {
            addCriterion("INSURANCE_NAME not like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIn(List<String> values) {
            addCriterion("INSURANCE_NAME in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotIn(List<String> values) {
            addCriterion("INSURANCE_NAME not in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameBetween(String value1, String value2) {
            addCriterion("INSURANCE_NAME between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_NAME not between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyIsNull() {
            addCriterion("INSURANCE_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyIsNotNull() {
            addCriterion("INSURANCE_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyEqualTo(String value) {
            addCriterion("INSURANCE_PROPERTY =", value, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyNotEqualTo(String value) {
            addCriterion("INSURANCE_PROPERTY <>", value, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyGreaterThan(String value) {
            addCriterion("INSURANCE_PROPERTY >", value, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_PROPERTY >=", value, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyLessThan(String value) {
            addCriterion("INSURANCE_PROPERTY <", value, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_PROPERTY <=", value, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyLike(String value) {
            addCriterion("INSURANCE_PROPERTY like", value, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyNotLike(String value) {
            addCriterion("INSURANCE_PROPERTY not like", value, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyIn(List<String> values) {
            addCriterion("INSURANCE_PROPERTY in", values, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyNotIn(List<String> values) {
            addCriterion("INSURANCE_PROPERTY not in", values, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyBetween(String value1, String value2) {
            addCriterion("INSURANCE_PROPERTY between", value1, value2, "insuranceProperty");
            return (Criteria) this;
        }

        public Criteria andInsurancePropertyNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_PROPERTY not between", value1, value2, "insuranceProperty");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LAST_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LAST_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("LAST_UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("LAST_UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("LAST_UPDATE_BY like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("LAST_UPDATE_BY not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY not between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsIsNull() {
            addCriterion("INSURANCE_BUDGETS is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsIsNotNull() {
            addCriterion("INSURANCE_BUDGETS is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsEqualTo(String value) {
            addCriterion("INSURANCE_BUDGETS =", value, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsNotEqualTo(String value) {
            addCriterion("INSURANCE_BUDGETS <>", value, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsGreaterThan(String value) {
            addCriterion("INSURANCE_BUDGETS >", value, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_BUDGETS >=", value, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsLessThan(String value) {
            addCriterion("INSURANCE_BUDGETS <", value, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_BUDGETS <=", value, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsLike(String value) {
            addCriterion("INSURANCE_BUDGETS like", value, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsNotLike(String value) {
            addCriterion("INSURANCE_BUDGETS not like", value, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsIn(List<String> values) {
            addCriterion("INSURANCE_BUDGETS in", values, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsNotIn(List<String> values) {
            addCriterion("INSURANCE_BUDGETS not in", values, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsBetween(String value1, String value2) {
            addCriterion("INSURANCE_BUDGETS between", value1, value2, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetsNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_BUDGETS not between", value1, value2, "insuranceBudgets");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsIsNull() {
            addCriterion("INSURANCE_PROMTIONS is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsIsNotNull() {
            addCriterion("INSURANCE_PROMTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsEqualTo(String value) {
            addCriterion("INSURANCE_PROMTIONS =", value, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsNotEqualTo(String value) {
            addCriterion("INSURANCE_PROMTIONS <>", value, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsGreaterThan(String value) {
            addCriterion("INSURANCE_PROMTIONS >", value, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_PROMTIONS >=", value, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsLessThan(String value) {
            addCriterion("INSURANCE_PROMTIONS <", value, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_PROMTIONS <=", value, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsLike(String value) {
            addCriterion("INSURANCE_PROMTIONS like", value, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsNotLike(String value) {
            addCriterion("INSURANCE_PROMTIONS not like", value, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsIn(List<String> values) {
            addCriterion("INSURANCE_PROMTIONS in", values, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsNotIn(List<String> values) {
            addCriterion("INSURANCE_PROMTIONS not in", values, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsBetween(String value1, String value2) {
            addCriterion("INSURANCE_PROMTIONS between", value1, value2, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsurancePromtionsNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_PROMTIONS not between", value1, value2, "insurancePromtions");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderIsNull() {
            addCriterion("INSURANCE_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderIsNotNull() {
            addCriterion("INSURANCE_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderEqualTo(String value) {
            addCriterion("INSURANCE_ORDER =", value, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderNotEqualTo(String value) {
            addCriterion("INSURANCE_ORDER <>", value, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderGreaterThan(String value) {
            addCriterion("INSURANCE_ORDER >", value, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_ORDER >=", value, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderLessThan(String value) {
            addCriterion("INSURANCE_ORDER <", value, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_ORDER <=", value, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderLike(String value) {
            addCriterion("INSURANCE_ORDER like", value, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderNotLike(String value) {
            addCriterion("INSURANCE_ORDER not like", value, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderIn(List<String> values) {
            addCriterion("INSURANCE_ORDER in", values, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderNotIn(List<String> values) {
            addCriterion("INSURANCE_ORDER not in", values, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderBetween(String value1, String value2) {
            addCriterion("INSURANCE_ORDER between", value1, value2, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceOrderNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_ORDER not between", value1, value2, "insuranceOrder");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailIsNull() {
            addCriterion("INSURANCE_BUDGET_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailIsNotNull() {
            addCriterion("INSURANCE_BUDGET_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailEqualTo(String value) {
            addCriterion("INSURANCE_BUDGET_DETAIL =", value, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailNotEqualTo(String value) {
            addCriterion("INSURANCE_BUDGET_DETAIL <>", value, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailGreaterThan(String value) {
            addCriterion("INSURANCE_BUDGET_DETAIL >", value, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_BUDGET_DETAIL >=", value, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailLessThan(String value) {
            addCriterion("INSURANCE_BUDGET_DETAIL <", value, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_BUDGET_DETAIL <=", value, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailLike(String value) {
            addCriterion("INSURANCE_BUDGET_DETAIL like", value, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailNotLike(String value) {
            addCriterion("INSURANCE_BUDGET_DETAIL not like", value, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailIn(List<String> values) {
            addCriterion("INSURANCE_BUDGET_DETAIL in", values, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailNotIn(List<String> values) {
            addCriterion("INSURANCE_BUDGET_DETAIL not in", values, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailBetween(String value1, String value2) {
            addCriterion("INSURANCE_BUDGET_DETAIL between", value1, value2, "insuranceBudgetDetail");
            return (Criteria) this;
        }

        public Criteria andInsuranceBudgetDetailNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_BUDGET_DETAIL not between", value1, value2, "insuranceBudgetDetail");
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