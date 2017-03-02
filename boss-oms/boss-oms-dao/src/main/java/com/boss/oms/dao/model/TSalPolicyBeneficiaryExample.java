package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TSalPolicyBeneficiaryExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TSalPolicyBeneficiaryExample() {
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

        public Criteria andInsuredRelationIsNull() {
            addCriterion("INSURED_RELATION is null");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationIsNotNull() {
            addCriterion("INSURED_RELATION is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationEqualTo(String value) {
            addCriterion("INSURED_RELATION =", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationNotEqualTo(String value) {
            addCriterion("INSURED_RELATION <>", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationGreaterThan(String value) {
            addCriterion("INSURED_RELATION >", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationGreaterThanOrEqualTo(String value) {
            addCriterion("INSURED_RELATION >=", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationLessThan(String value) {
            addCriterion("INSURED_RELATION <", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationLessThanOrEqualTo(String value) {
            addCriterion("INSURED_RELATION <=", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationLike(String value) {
            addCriterion("INSURED_RELATION like", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationNotLike(String value) {
            addCriterion("INSURED_RELATION not like", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationIn(List<String> values) {
            addCriterion("INSURED_RELATION in", values, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationNotIn(List<String> values) {
            addCriterion("INSURED_RELATION not in", values, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationBetween(String value1, String value2) {
            addCriterion("INSURED_RELATION between", value1, value2, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationNotBetween(String value1, String value2) {
            addCriterion("INSURED_RELATION not between", value1, value2, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("CERTIFICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("CERTIFICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("CERTIFICATE_TYPE >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("CERTIFICATE_TYPE <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("CERTIFICATE_TYPE like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("CERTIFICATE_TYPE not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("CERTIFICATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("CERTIFICATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("CERTIFICATE_NO =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("CERTIFICATE_NO <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("CERTIFICATE_NO >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NO >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("CERTIFICATE_NO <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NO <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("CERTIFICATE_NO like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("CERTIFICATE_NO not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("CERTIFICATE_NO in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("CERTIFICATE_NO not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NO between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NO not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("NATIONALITY =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("NATIONALITY <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("NATIONALITY >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONALITY >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("NATIONALITY <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("NATIONALITY <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("NATIONALITY like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("NATIONALITY not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("NATIONALITY in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("NATIONALITY not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("NATIONALITY between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("NATIONALITY not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andValidStartDateIsNull() {
            addCriterion("VALID_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValidStartDateIsNotNull() {
            addCriterion("VALID_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_START_DATE =", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_START_DATE <>", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("VALID_START_DATE >", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_START_DATE >=", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateLessThan(Date value) {
            addCriterionForJDBCDate("VALID_START_DATE <", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_START_DATE <=", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("VALID_START_DATE in", values, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("VALID_START_DATE not in", values, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VALID_START_DATE between", value1, value2, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VALID_START_DATE not between", value1, value2, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateIsNull() {
            addCriterion("VALID_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValidEndDateIsNotNull() {
            addCriterion("VALID_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_END_DATE =", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_END_DATE <>", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("VALID_END_DATE >", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_END_DATE >=", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateLessThan(Date value) {
            addCriterionForJDBCDate("VALID_END_DATE <", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VALID_END_DATE <=", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("VALID_END_DATE in", values, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("VALID_END_DATE not in", values, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VALID_END_DATE between", value1, value2, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VALID_END_DATE not between", value1, value2, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("BIRTHDATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("BIRTHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDATE =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDATE <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDATE >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDATE >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDATE <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDATE <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDATE in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDATE not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDATE between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDATE not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioIsNull() {
            addCriterion("BENEFIT_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioIsNotNull() {
            addCriterion("BENEFIT_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioEqualTo(BigDecimal value) {
            addCriterion("BENEFIT_RATIO =", value, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioNotEqualTo(BigDecimal value) {
            addCriterion("BENEFIT_RATIO <>", value, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioGreaterThan(BigDecimal value) {
            addCriterion("BENEFIT_RATIO >", value, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BENEFIT_RATIO >=", value, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioLessThan(BigDecimal value) {
            addCriterion("BENEFIT_RATIO <", value, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BENEFIT_RATIO <=", value, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioIn(List<BigDecimal> values) {
            addCriterion("BENEFIT_RATIO in", values, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioNotIn(List<BigDecimal> values) {
            addCriterion("BENEFIT_RATIO not in", values, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BENEFIT_RATIO between", value1, value2, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BENEFIT_RATIO not between", value1, value2, "benefitRatio");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderIsNull() {
            addCriterion("BENEFIT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderIsNotNull() {
            addCriterion("BENEFIT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderEqualTo(Integer value) {
            addCriterion("BENEFIT_ORDER =", value, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderNotEqualTo(Integer value) {
            addCriterion("BENEFIT_ORDER <>", value, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderGreaterThan(Integer value) {
            addCriterion("BENEFIT_ORDER >", value, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("BENEFIT_ORDER >=", value, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderLessThan(Integer value) {
            addCriterion("BENEFIT_ORDER <", value, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderLessThanOrEqualTo(Integer value) {
            addCriterion("BENEFIT_ORDER <=", value, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderIn(List<Integer> values) {
            addCriterion("BENEFIT_ORDER in", values, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderNotIn(List<Integer> values) {
            addCriterion("BENEFIT_ORDER not in", values, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderBetween(Integer value1, Integer value2) {
            addCriterion("BENEFIT_ORDER between", value1, value2, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andBenefitOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("BENEFIT_ORDER not between", value1, value2, "benefitOrder");
            return (Criteria) this;
        }

        public Criteria andInsuredIdIsNull() {
            addCriterion("INSURED_ID is null");
            return (Criteria) this;
        }

        public Criteria andInsuredIdIsNotNull() {
            addCriterion("INSURED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredIdEqualTo(String value) {
            addCriterion("INSURED_ID =", value, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdNotEqualTo(String value) {
            addCriterion("INSURED_ID <>", value, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdGreaterThan(String value) {
            addCriterion("INSURED_ID >", value, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSURED_ID >=", value, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdLessThan(String value) {
            addCriterion("INSURED_ID <", value, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdLessThanOrEqualTo(String value) {
            addCriterion("INSURED_ID <=", value, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdLike(String value) {
            addCriterion("INSURED_ID like", value, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdNotLike(String value) {
            addCriterion("INSURED_ID not like", value, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdIn(List<String> values) {
            addCriterion("INSURED_ID in", values, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdNotIn(List<String> values) {
            addCriterion("INSURED_ID not in", values, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdBetween(String value1, String value2) {
            addCriterion("INSURED_ID between", value1, value2, "insuredId");
            return (Criteria) this;
        }

        public Criteria andInsuredIdNotBetween(String value1, String value2) {
            addCriterion("INSURED_ID not between", value1, value2, "insuredId");
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