package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRateHistoryExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TRateHistoryExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andInsCodeIsNull() {
            addCriterion("ins_code is null");
            return (Criteria) this;
        }

        public Criteria andInsCodeIsNotNull() {
            addCriterion("ins_code is not null");
            return (Criteria) this;
        }

        public Criteria andInsCodeEqualTo(String value) {
            addCriterion("ins_code =", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeNotEqualTo(String value) {
            addCriterion("ins_code <>", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeGreaterThan(String value) {
            addCriterion("ins_code >", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ins_code >=", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeLessThan(String value) {
            addCriterion("ins_code <", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeLessThanOrEqualTo(String value) {
            addCriterion("ins_code <=", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeLike(String value) {
            addCriterion("ins_code like", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeNotLike(String value) {
            addCriterion("ins_code not like", value, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeIn(List<String> values) {
            addCriterion("ins_code in", values, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeNotIn(List<String> values) {
            addCriterion("ins_code not in", values, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeBetween(String value1, String value2) {
            addCriterion("ins_code between", value1, value2, "insCode");
            return (Criteria) this;
        }

        public Criteria andInsCodeNotBetween(String value1, String value2) {
            addCriterion("ins_code not between", value1, value2, "insCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andVciRateIsNull() {
            addCriterion("vci_rate is null");
            return (Criteria) this;
        }

        public Criteria andVciRateIsNotNull() {
            addCriterion("vci_rate is not null");
            return (Criteria) this;
        }

        public Criteria andVciRateEqualTo(BigDecimal value) {
            addCriterion("vci_rate =", value, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateNotEqualTo(BigDecimal value) {
            addCriterion("vci_rate <>", value, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateGreaterThan(BigDecimal value) {
            addCriterion("vci_rate >", value, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vci_rate >=", value, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateLessThan(BigDecimal value) {
            addCriterion("vci_rate <", value, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vci_rate <=", value, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateIn(List<BigDecimal> values) {
            addCriterion("vci_rate in", values, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateNotIn(List<BigDecimal> values) {
            addCriterion("vci_rate not in", values, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vci_rate between", value1, value2, "vciRate");
            return (Criteria) this;
        }

        public Criteria andVciRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vci_rate not between", value1, value2, "vciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateIsNull() {
            addCriterion("tci_rate is null");
            return (Criteria) this;
        }

        public Criteria andTciRateIsNotNull() {
            addCriterion("tci_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTciRateEqualTo(BigDecimal value) {
            addCriterion("tci_rate =", value, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateNotEqualTo(BigDecimal value) {
            addCriterion("tci_rate <>", value, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateGreaterThan(BigDecimal value) {
            addCriterion("tci_rate >", value, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tci_rate >=", value, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateLessThan(BigDecimal value) {
            addCriterion("tci_rate <", value, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tci_rate <=", value, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateIn(List<BigDecimal> values) {
            addCriterion("tci_rate in", values, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateNotIn(List<BigDecimal> values) {
            addCriterion("tci_rate not in", values, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tci_rate between", value1, value2, "tciRate");
            return (Criteria) this;
        }

        public Criteria andTciRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tci_rate not between", value1, value2, "tciRate");
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

        public Criteria andLastUpdateTypeIsNull() {
            addCriterion("LAST_UPDATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeIsNotNull() {
            addCriterion("LAST_UPDATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeEqualTo(String value) {
            addCriterion("LAST_UPDATE_TYPE =", value, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_TYPE <>", value, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeGreaterThan(String value) {
            addCriterion("LAST_UPDATE_TYPE >", value, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_TYPE >=", value, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeLessThan(String value) {
            addCriterion("LAST_UPDATE_TYPE <", value, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_TYPE <=", value, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeLike(String value) {
            addCriterion("LAST_UPDATE_TYPE like", value, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeNotLike(String value) {
            addCriterion("LAST_UPDATE_TYPE not like", value, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeIn(List<String> values) {
            addCriterion("LAST_UPDATE_TYPE in", values, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_TYPE not in", values, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_TYPE between", value1, value2, "lastUpdateType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTypeNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_TYPE not between", value1, value2, "lastUpdateType");
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