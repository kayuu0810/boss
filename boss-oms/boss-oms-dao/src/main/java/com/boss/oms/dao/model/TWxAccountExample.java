package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWxAccountExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TWxAccountExample() {
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

        public Criteria andAccountOriginidIsNull() {
            addCriterion("account_originid is null");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidIsNotNull() {
            addCriterion("account_originid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidEqualTo(String value) {
            addCriterion("account_originid =", value, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidNotEqualTo(String value) {
            addCriterion("account_originid <>", value, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidGreaterThan(String value) {
            addCriterion("account_originid >", value, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidGreaterThanOrEqualTo(String value) {
            addCriterion("account_originid >=", value, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidLessThan(String value) {
            addCriterion("account_originid <", value, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidLessThanOrEqualTo(String value) {
            addCriterion("account_originid <=", value, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidLike(String value) {
            addCriterion("account_originid like", value, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidNotLike(String value) {
            addCriterion("account_originid not like", value, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidIn(List<String> values) {
            addCriterion("account_originid in", values, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidNotIn(List<String> values) {
            addCriterion("account_originid not in", values, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidBetween(String value1, String value2) {
            addCriterion("account_originid between", value1, value2, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountOriginidNotBetween(String value1, String value2) {
            addCriterion("account_originid not between", value1, value2, "accountOriginid");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountTokenIsNull() {
            addCriterion("account_token is null");
            return (Criteria) this;
        }

        public Criteria andAccountTokenIsNotNull() {
            addCriterion("account_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTokenEqualTo(String value) {
            addCriterion("account_token =", value, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenNotEqualTo(String value) {
            addCriterion("account_token <>", value, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenGreaterThan(String value) {
            addCriterion("account_token >", value, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenGreaterThanOrEqualTo(String value) {
            addCriterion("account_token >=", value, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenLessThan(String value) {
            addCriterion("account_token <", value, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenLessThanOrEqualTo(String value) {
            addCriterion("account_token <=", value, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenLike(String value) {
            addCriterion("account_token like", value, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenNotLike(String value) {
            addCriterion("account_token not like", value, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenIn(List<String> values) {
            addCriterion("account_token in", values, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenNotIn(List<String> values) {
            addCriterion("account_token not in", values, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenBetween(String value1, String value2) {
            addCriterion("account_token between", value1, value2, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountTokenNotBetween(String value1, String value2) {
            addCriterion("account_token not between", value1, value2, "accountToken");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNull() {
            addCriterion("account_number is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNotNull() {
            addCriterion("account_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberEqualTo(String value) {
            addCriterion("account_number =", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotEqualTo(String value) {
            addCriterion("account_number <>", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThan(String value) {
            addCriterion("account_number >", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("account_number >=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThan(String value) {
            addCriterion("account_number <", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("account_number <=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLike(String value) {
            addCriterion("account_number like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotLike(String value) {
            addCriterion("account_number not like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIn(List<String> values) {
            addCriterion("account_number in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotIn(List<String> values) {
            addCriterion("account_number not in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberBetween(String value1, String value2) {
            addCriterion("account_number between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotBetween(String value1, String value2) {
            addCriterion("account_number not between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("account_type like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("account_type not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNull() {
            addCriterion("account_email is null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNotNull() {
            addCriterion("account_email is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailEqualTo(String value) {
            addCriterion("account_email =", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotEqualTo(String value) {
            addCriterion("account_email <>", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThan(String value) {
            addCriterion("account_email >", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThanOrEqualTo(String value) {
            addCriterion("account_email >=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThan(String value) {
            addCriterion("account_email <", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThanOrEqualTo(String value) {
            addCriterion("account_email <=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLike(String value) {
            addCriterion("account_email like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotLike(String value) {
            addCriterion("account_email not like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIn(List<String> values) {
            addCriterion("account_email in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotIn(List<String> values) {
            addCriterion("account_email not in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailBetween(String value1, String value2) {
            addCriterion("account_email between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotBetween(String value1, String value2) {
            addCriterion("account_email not between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountDescIsNull() {
            addCriterion("account_desc is null");
            return (Criteria) this;
        }

        public Criteria andAccountDescIsNotNull() {
            addCriterion("account_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDescEqualTo(String value) {
            addCriterion("account_desc =", value, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescNotEqualTo(String value) {
            addCriterion("account_desc <>", value, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescGreaterThan(String value) {
            addCriterion("account_desc >", value, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescGreaterThanOrEqualTo(String value) {
            addCriterion("account_desc >=", value, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescLessThan(String value) {
            addCriterion("account_desc <", value, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescLessThanOrEqualTo(String value) {
            addCriterion("account_desc <=", value, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescLike(String value) {
            addCriterion("account_desc like", value, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescNotLike(String value) {
            addCriterion("account_desc not like", value, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescIn(List<String> values) {
            addCriterion("account_desc in", values, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescNotIn(List<String> values) {
            addCriterion("account_desc not in", values, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescBetween(String value1, String value2) {
            addCriterion("account_desc between", value1, value2, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountDescNotBetween(String value1, String value2) {
            addCriterion("account_desc not between", value1, value2, "accountDesc");
            return (Criteria) this;
        }

        public Criteria andAccountAppidIsNull() {
            addCriterion("account_appid is null");
            return (Criteria) this;
        }

        public Criteria andAccountAppidIsNotNull() {
            addCriterion("account_appid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAppidEqualTo(String value) {
            addCriterion("account_appid =", value, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidNotEqualTo(String value) {
            addCriterion("account_appid <>", value, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidGreaterThan(String value) {
            addCriterion("account_appid >", value, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidGreaterThanOrEqualTo(String value) {
            addCriterion("account_appid >=", value, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidLessThan(String value) {
            addCriterion("account_appid <", value, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidLessThanOrEqualTo(String value) {
            addCriterion("account_appid <=", value, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidLike(String value) {
            addCriterion("account_appid like", value, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidNotLike(String value) {
            addCriterion("account_appid not like", value, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidIn(List<String> values) {
            addCriterion("account_appid in", values, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidNotIn(List<String> values) {
            addCriterion("account_appid not in", values, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidBetween(String value1, String value2) {
            addCriterion("account_appid between", value1, value2, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppidNotBetween(String value1, String value2) {
            addCriterion("account_appid not between", value1, value2, "accountAppid");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretIsNull() {
            addCriterion("account_appsecret is null");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretIsNotNull() {
            addCriterion("account_appsecret is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretEqualTo(String value) {
            addCriterion("account_appsecret =", value, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretNotEqualTo(String value) {
            addCriterion("account_appsecret <>", value, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretGreaterThan(String value) {
            addCriterion("account_appsecret >", value, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("account_appsecret >=", value, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretLessThan(String value) {
            addCriterion("account_appsecret <", value, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretLessThanOrEqualTo(String value) {
            addCriterion("account_appsecret <=", value, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretLike(String value) {
            addCriterion("account_appsecret like", value, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretNotLike(String value) {
            addCriterion("account_appsecret not like", value, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretIn(List<String> values) {
            addCriterion("account_appsecret in", values, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretNotIn(List<String> values) {
            addCriterion("account_appsecret not in", values, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretBetween(String value1, String value2) {
            addCriterion("account_appsecret between", value1, value2, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andAccountAppsecretNotBetween(String value1, String value2) {
            addCriterion("account_appsecret not between", value1, value2, "accountAppsecret");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNull() {
            addCriterion("head_img_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNotNull() {
            addCriterion("head_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlEqualTo(String value) {
            addCriterion("head_img_url =", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotEqualTo(String value) {
            addCriterion("head_img_url <>", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThan(String value) {
            addCriterion("head_img_url >", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_img_url >=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThan(String value) {
            addCriterion("head_img_url <", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThanOrEqualTo(String value) {
            addCriterion("head_img_url <=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLike(String value) {
            addCriterion("head_img_url like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotLike(String value) {
            addCriterion("head_img_url not like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIn(List<String> values) {
            addCriterion("head_img_url in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotIn(List<String> values) {
            addCriterion("head_img_url not in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlBetween(String value1, String value2) {
            addCriterion("head_img_url between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotBetween(String value1, String value2) {
            addCriterion("head_img_url not between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlIsNull() {
            addCriterion("qrcode_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlIsNotNull() {
            addCriterion("qrcode_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlEqualTo(String value) {
            addCriterion("qrcode_pic_url =", value, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlNotEqualTo(String value) {
            addCriterion("qrcode_pic_url <>", value, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlGreaterThan(String value) {
            addCriterion("qrcode_pic_url >", value, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_pic_url >=", value, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlLessThan(String value) {
            addCriterion("qrcode_pic_url <", value, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlLessThanOrEqualTo(String value) {
            addCriterion("qrcode_pic_url <=", value, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlLike(String value) {
            addCriterion("qrcode_pic_url like", value, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlNotLike(String value) {
            addCriterion("qrcode_pic_url not like", value, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlIn(List<String> values) {
            addCriterion("qrcode_pic_url in", values, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlNotIn(List<String> values) {
            addCriterion("qrcode_pic_url not in", values, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlBetween(String value1, String value2) {
            addCriterion("qrcode_pic_url between", value1, value2, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodePicUrlNotBetween(String value1, String value2) {
            addCriterion("qrcode_pic_url not between", value1, value2, "qrcodePicUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlIsNull() {
            addCriterion("server_url is null");
            return (Criteria) this;
        }

        public Criteria andServerUrlIsNotNull() {
            addCriterion("server_url is not null");
            return (Criteria) this;
        }

        public Criteria andServerUrlEqualTo(String value) {
            addCriterion("server_url =", value, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlNotEqualTo(String value) {
            addCriterion("server_url <>", value, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlGreaterThan(String value) {
            addCriterion("server_url >", value, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("server_url >=", value, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlLessThan(String value) {
            addCriterion("server_url <", value, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlLessThanOrEqualTo(String value) {
            addCriterion("server_url <=", value, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlLike(String value) {
            addCriterion("server_url like", value, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlNotLike(String value) {
            addCriterion("server_url not like", value, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlIn(List<String> values) {
            addCriterion("server_url in", values, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlNotIn(List<String> values) {
            addCriterion("server_url not in", values, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlBetween(String value1, String value2) {
            addCriterion("server_url between", value1, value2, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andServerUrlNotBetween(String value1, String value2) {
            addCriterion("server_url not between", value1, value2, "serverUrl");
            return (Criteria) this;
        }

        public Criteria andAesKeyIsNull() {
            addCriterion("aes_key is null");
            return (Criteria) this;
        }

        public Criteria andAesKeyIsNotNull() {
            addCriterion("aes_key is not null");
            return (Criteria) this;
        }

        public Criteria andAesKeyEqualTo(String value) {
            addCriterion("aes_key =", value, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyNotEqualTo(String value) {
            addCriterion("aes_key <>", value, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyGreaterThan(String value) {
            addCriterion("aes_key >", value, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyGreaterThanOrEqualTo(String value) {
            addCriterion("aes_key >=", value, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyLessThan(String value) {
            addCriterion("aes_key <", value, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyLessThanOrEqualTo(String value) {
            addCriterion("aes_key <=", value, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyLike(String value) {
            addCriterion("aes_key like", value, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyNotLike(String value) {
            addCriterion("aes_key not like", value, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyIn(List<String> values) {
            addCriterion("aes_key in", values, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyNotIn(List<String> values) {
            addCriterion("aes_key not in", values, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyBetween(String value1, String value2) {
            addCriterion("aes_key between", value1, value2, "aesKey");
            return (Criteria) this;
        }

        public Criteria andAesKeyNotBetween(String value1, String value2) {
            addCriterion("aes_key not between", value1, value2, "aesKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeIsNull() {
            addCriterion("encryption_mode is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeIsNotNull() {
            addCriterion("encryption_mode is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeEqualTo(String value) {
            addCriterion("encryption_mode =", value, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeNotEqualTo(String value) {
            addCriterion("encryption_mode <>", value, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeGreaterThan(String value) {
            addCriterion("encryption_mode >", value, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeGreaterThanOrEqualTo(String value) {
            addCriterion("encryption_mode >=", value, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeLessThan(String value) {
            addCriterion("encryption_mode <", value, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeLessThanOrEqualTo(String value) {
            addCriterion("encryption_mode <=", value, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeLike(String value) {
            addCriterion("encryption_mode like", value, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeNotLike(String value) {
            addCriterion("encryption_mode not like", value, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeIn(List<String> values) {
            addCriterion("encryption_mode in", values, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeNotIn(List<String> values) {
            addCriterion("encryption_mode not in", values, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeBetween(String value1, String value2) {
            addCriterion("encryption_mode between", value1, value2, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andEncryptionModeNotBetween(String value1, String value2) {
            addCriterion("encryption_mode not between", value1, value2, "encryptionMode");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslIsNull() {
            addCriterion("http_domain_nonssl is null");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslIsNotNull() {
            addCriterion("http_domain_nonssl is not null");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslEqualTo(String value) {
            addCriterion("http_domain_nonssl =", value, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslNotEqualTo(String value) {
            addCriterion("http_domain_nonssl <>", value, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslGreaterThan(String value) {
            addCriterion("http_domain_nonssl >", value, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslGreaterThanOrEqualTo(String value) {
            addCriterion("http_domain_nonssl >=", value, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslLessThan(String value) {
            addCriterion("http_domain_nonssl <", value, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslLessThanOrEqualTo(String value) {
            addCriterion("http_domain_nonssl <=", value, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslLike(String value) {
            addCriterion("http_domain_nonssl like", value, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslNotLike(String value) {
            addCriterion("http_domain_nonssl not like", value, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslIn(List<String> values) {
            addCriterion("http_domain_nonssl in", values, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslNotIn(List<String> values) {
            addCriterion("http_domain_nonssl not in", values, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslBetween(String value1, String value2) {
            addCriterion("http_domain_nonssl between", value1, value2, "httpDomainNonssl");
            return (Criteria) this;
        }

        public Criteria andHttpDomainNonsslNotBetween(String value1, String value2) {
            addCriterion("http_domain_nonssl not between", value1, value2, "httpDomainNonssl");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("app_key is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("app_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("app_key =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("app_key <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("app_key >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_key >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("app_key <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("app_key <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("app_key like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("app_key not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("app_key in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("app_key not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("app_key between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("app_key not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNull() {
            addCriterion("mch_id is null");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNotNull() {
            addCriterion("mch_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchIdEqualTo(String value) {
            addCriterion("mch_id =", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotEqualTo(String value) {
            addCriterion("mch_id <>", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThan(String value) {
            addCriterion("mch_id >", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThanOrEqualTo(String value) {
            addCriterion("mch_id >=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThan(String value) {
            addCriterion("mch_id <", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThanOrEqualTo(String value) {
            addCriterion("mch_id <=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLike(String value) {
            addCriterion("mch_id like", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotLike(String value) {
            addCriterion("mch_id not like", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdIn(List<String> values) {
            addCriterion("mch_id in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotIn(List<String> values) {
            addCriterion("mch_id not in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdBetween(String value1, String value2) {
            addCriterion("mch_id between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotBetween(String value1, String value2) {
            addCriterion("mch_id not between", value1, value2, "mchId");
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