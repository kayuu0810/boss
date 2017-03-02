package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVehicleTaxInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TVehicleTaxInfoExample() {
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

        public Criteria andTaxPayerNameIsNull() {
            addCriterion("TAX_PAYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameIsNotNull() {
            addCriterion("TAX_PAYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameEqualTo(String value) {
            addCriterion("TAX_PAYER_NAME =", value, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameNotEqualTo(String value) {
            addCriterion("TAX_PAYER_NAME <>", value, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameGreaterThan(String value) {
            addCriterion("TAX_PAYER_NAME >", value, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_PAYER_NAME >=", value, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameLessThan(String value) {
            addCriterion("TAX_PAYER_NAME <", value, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameLessThanOrEqualTo(String value) {
            addCriterion("TAX_PAYER_NAME <=", value, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameLike(String value) {
            addCriterion("TAX_PAYER_NAME like", value, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameNotLike(String value) {
            addCriterion("TAX_PAYER_NAME not like", value, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameIn(List<String> values) {
            addCriterion("TAX_PAYER_NAME in", values, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameNotIn(List<String> values) {
            addCriterion("TAX_PAYER_NAME not in", values, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameBetween(String value1, String value2) {
            addCriterion("TAX_PAYER_NAME between", value1, value2, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNameNotBetween(String value1, String value2) {
            addCriterion("TAX_PAYER_NAME not between", value1, value2, "taxPayerName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoIsNull() {
            addCriterion("TAX_PAYER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoIsNotNull() {
            addCriterion("TAX_PAYER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoEqualTo(String value) {
            addCriterion("TAX_PAYER_NO =", value, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoNotEqualTo(String value) {
            addCriterion("TAX_PAYER_NO <>", value, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoGreaterThan(String value) {
            addCriterion("TAX_PAYER_NO >", value, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_PAYER_NO >=", value, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoLessThan(String value) {
            addCriterion("TAX_PAYER_NO <", value, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoLessThanOrEqualTo(String value) {
            addCriterion("TAX_PAYER_NO <=", value, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoLike(String value) {
            addCriterion("TAX_PAYER_NO like", value, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoNotLike(String value) {
            addCriterion("TAX_PAYER_NO not like", value, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoIn(List<String> values) {
            addCriterion("TAX_PAYER_NO in", values, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoNotIn(List<String> values) {
            addCriterion("TAX_PAYER_NO not in", values, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoBetween(String value1, String value2) {
            addCriterion("TAX_PAYER_NO between", value1, value2, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNoNotBetween(String value1, String value2) {
            addCriterion("TAX_PAYER_NO not between", value1, value2, "taxPayerNo");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeIsNull() {
            addCriterion("TAX_AUTH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeIsNotNull() {
            addCriterion("TAX_AUTH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeEqualTo(String value) {
            addCriterion("TAX_AUTH_CODE =", value, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeNotEqualTo(String value) {
            addCriterion("TAX_AUTH_CODE <>", value, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeGreaterThan(String value) {
            addCriterion("TAX_AUTH_CODE >", value, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_AUTH_CODE >=", value, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeLessThan(String value) {
            addCriterion("TAX_AUTH_CODE <", value, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("TAX_AUTH_CODE <=", value, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeLike(String value) {
            addCriterion("TAX_AUTH_CODE like", value, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeNotLike(String value) {
            addCriterion("TAX_AUTH_CODE not like", value, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeIn(List<String> values) {
            addCriterion("TAX_AUTH_CODE in", values, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeNotIn(List<String> values) {
            addCriterion("TAX_AUTH_CODE not in", values, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeBetween(String value1, String value2) {
            addCriterion("TAX_AUTH_CODE between", value1, value2, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxAuthCodeNotBetween(String value1, String value2) {
            addCriterion("TAX_AUTH_CODE not between", value1, value2, "taxAuthCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeIsNull() {
            addCriterion("TAX_COUNTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeIsNotNull() {
            addCriterion("TAX_COUNTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeEqualTo(String value) {
            addCriterion("TAX_COUNTRY_CODE =", value, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeNotEqualTo(String value) {
            addCriterion("TAX_COUNTRY_CODE <>", value, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeGreaterThan(String value) {
            addCriterion("TAX_COUNTRY_CODE >", value, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_COUNTRY_CODE >=", value, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeLessThan(String value) {
            addCriterion("TAX_COUNTRY_CODE <", value, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("TAX_COUNTRY_CODE <=", value, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeLike(String value) {
            addCriterion("TAX_COUNTRY_CODE like", value, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeNotLike(String value) {
            addCriterion("TAX_COUNTRY_CODE not like", value, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeIn(List<String> values) {
            addCriterion("TAX_COUNTRY_CODE in", values, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeNotIn(List<String> values) {
            addCriterion("TAX_COUNTRY_CODE not in", values, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeBetween(String value1, String value2) {
            addCriterion("TAX_COUNTRY_CODE between", value1, value2, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxCountryCodeNotBetween(String value1, String value2) {
            addCriterion("TAX_COUNTRY_CODE not between", value1, value2, "taxCountryCode");
            return (Criteria) this;
        }

        public Criteria andTaxOrgIsNull() {
            addCriterion("TAX_ORG is null");
            return (Criteria) this;
        }

        public Criteria andTaxOrgIsNotNull() {
            addCriterion("TAX_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andTaxOrgEqualTo(String value) {
            addCriterion("TAX_ORG =", value, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgNotEqualTo(String value) {
            addCriterion("TAX_ORG <>", value, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgGreaterThan(String value) {
            addCriterion("TAX_ORG >", value, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ORG >=", value, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgLessThan(String value) {
            addCriterion("TAX_ORG <", value, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgLessThanOrEqualTo(String value) {
            addCriterion("TAX_ORG <=", value, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgLike(String value) {
            addCriterion("TAX_ORG like", value, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgNotLike(String value) {
            addCriterion("TAX_ORG not like", value, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgIn(List<String> values) {
            addCriterion("TAX_ORG in", values, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgNotIn(List<String> values) {
            addCriterion("TAX_ORG not in", values, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgBetween(String value1, String value2) {
            addCriterion("TAX_ORG between", value1, value2, "taxOrg");
            return (Criteria) this;
        }

        public Criteria andTaxOrgNotBetween(String value1, String value2) {
            addCriterion("TAX_ORG not between", value1, value2, "taxOrg");
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