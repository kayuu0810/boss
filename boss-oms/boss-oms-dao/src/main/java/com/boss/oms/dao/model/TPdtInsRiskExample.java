package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPdtInsRiskExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TPdtInsRiskExample() {
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

        public Criteria andInsCodeIsNull() {
            addCriterion("INS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInsCodeIsNotNull() {
            addCriterion("INS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsCodeEqualTo(String value) {
            addCriterion("INS_CODE =", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeNotEqualTo(String value) {
            addCriterion("INS_CODE <>", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeGreaterThan(String value) {
            addCriterion("INS_CODE >", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INS_CODE >=", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeLessThan(String value) {
            addCriterion("INS_CODE <", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeLessThanOrEqualTo(String value) {
            addCriterion("INS_CODE <=", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeLike(String value) {
            addCriterion("INS_CODE like", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeNotLike(String value) {
            addCriterion("INS_CODE not like", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeIn(List<String> values) {
            addCriterion("INS_CODE in", values, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeNotIn(List<String> values) {
            addCriterion("INS_CODE not in", values, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeBetween(String value1, String value2) {
            addCriterion("INS_CODE between", value1, value2, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeNotBetween(String value1, String value2) {
            addCriterion("INS_CODE not between", value1, value2, "insCode");
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

        public Criteria andEffectiveTimeStartIsNull() {
            addCriterion("EFFECTIVE_TIME_START is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartIsNotNull() {
            addCriterion("EFFECTIVE_TIME_START is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartEqualTo(Date value) {
            addCriterion("EFFECTIVE_TIME_START =", value, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartNotEqualTo(Date value) {
            addCriterion("EFFECTIVE_TIME_START <>", value, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartGreaterThan(Date value) {
            addCriterion("EFFECTIVE_TIME_START >", value, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_TIME_START >=", value, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartLessThan(Date value) {
            addCriterion("EFFECTIVE_TIME_START <", value, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_TIME_START <=", value, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartIn(List<Date> values) {
            addCriterion("EFFECTIVE_TIME_START in", values, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartNotIn(List<Date> values) {
            addCriterion("EFFECTIVE_TIME_START not in", values, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_TIME_START between", value1, value2, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_TIME_START not between", value1, value2, "effectiveTimeStart");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndIsNull() {
            addCriterion("EFFECTIVE_TIME_END is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndIsNotNull() {
            addCriterion("EFFECTIVE_TIME_END is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndEqualTo(Date value) {
            addCriterion("EFFECTIVE_TIME_END =", value, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndNotEqualTo(Date value) {
            addCriterion("EFFECTIVE_TIME_END <>", value, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndGreaterThan(Date value) {
            addCriterion("EFFECTIVE_TIME_END >", value, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_TIME_END >=", value, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndLessThan(Date value) {
            addCriterion("EFFECTIVE_TIME_END <", value, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_TIME_END <=", value, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndIn(List<Date> values) {
            addCriterion("EFFECTIVE_TIME_END in", values, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndNotIn(List<Date> values) {
            addCriterion("EFFECTIVE_TIME_END not in", values, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_TIME_END between", value1, value2, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_TIME_END not between", value1, value2, "effectiveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("IS_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("IS_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("IS_DEFAULT =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("IS_DEFAULT <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("IS_DEFAULT >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEFAULT >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("IS_DEFAULT <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("IS_DEFAULT <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("IS_DEFAULT like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("IS_DEFAULT not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("IS_DEFAULT in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("IS_DEFAULT not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("IS_DEFAULT between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("IS_DEFAULT not between", value1, value2, "isDefault");
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