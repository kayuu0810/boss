package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TBaseAddressCodeOldExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TBaseAddressCodeOldExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
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

        public Criteria andParentCodeIsNull() {
            addCriterion("PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("PARENT_CODE =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("PARENT_CODE <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("PARENT_CODE >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("PARENT_CODE <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("PARENT_CODE like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("PARENT_CODE not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("PARENT_CODE in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("PARENT_CODE not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("PARENT_CODE between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_CODE not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityIsNull() {
            addCriterion("IS_MUNICIPALITY is null");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityIsNotNull() {
            addCriterion("IS_MUNICIPALITY is not null");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityEqualTo(String value) {
            addCriterion("IS_MUNICIPALITY =", value, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityNotEqualTo(String value) {
            addCriterion("IS_MUNICIPALITY <>", value, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityGreaterThan(String value) {
            addCriterion("IS_MUNICIPALITY >", value, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MUNICIPALITY >=", value, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityLessThan(String value) {
            addCriterion("IS_MUNICIPALITY <", value, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityLessThanOrEqualTo(String value) {
            addCriterion("IS_MUNICIPALITY <=", value, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityLike(String value) {
            addCriterion("IS_MUNICIPALITY like", value, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityNotLike(String value) {
            addCriterion("IS_MUNICIPALITY not like", value, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityIn(List<String> values) {
            addCriterion("IS_MUNICIPALITY in", values, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityNotIn(List<String> values) {
            addCriterion("IS_MUNICIPALITY not in", values, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityBetween(String value1, String value2) {
            addCriterion("IS_MUNICIPALITY between", value1, value2, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andIsMunicipalityNotBetween(String value1, String value2) {
            addCriterion("IS_MUNICIPALITY not between", value1, value2, "isMunicipality");
            return (Criteria) this;
        }

        public Criteria andCityLevelIsNull() {
            addCriterion("CITY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCityLevelIsNotNull() {
            addCriterion("CITY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCityLevelEqualTo(Integer value) {
            addCriterion("CITY_LEVEL =", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelNotEqualTo(Integer value) {
            addCriterion("CITY_LEVEL <>", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelGreaterThan(Integer value) {
            addCriterion("CITY_LEVEL >", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CITY_LEVEL >=", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelLessThan(Integer value) {
            addCriterion("CITY_LEVEL <", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CITY_LEVEL <=", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelIn(List<Integer> values) {
            addCriterion("CITY_LEVEL in", values, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelNotIn(List<Integer> values) {
            addCriterion("CITY_LEVEL not in", values, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelBetween(Integer value1, Integer value2) {
            addCriterion("CITY_LEVEL between", value1, value2, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CITY_LEVEL not between", value1, value2, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixIsNull() {
            addCriterion("LICENSE_NO_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixIsNotNull() {
            addCriterion("LICENSE_NO_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixEqualTo(String value) {
            addCriterion("LICENSE_NO_PREFIX =", value, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixNotEqualTo(String value) {
            addCriterion("LICENSE_NO_PREFIX <>", value, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixGreaterThan(String value) {
            addCriterion("LICENSE_NO_PREFIX >", value, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE_NO_PREFIX >=", value, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixLessThan(String value) {
            addCriterion("LICENSE_NO_PREFIX <", value, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixLessThanOrEqualTo(String value) {
            addCriterion("LICENSE_NO_PREFIX <=", value, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixLike(String value) {
            addCriterion("LICENSE_NO_PREFIX like", value, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixNotLike(String value) {
            addCriterion("LICENSE_NO_PREFIX not like", value, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixIn(List<String> values) {
            addCriterion("LICENSE_NO_PREFIX in", values, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixNotIn(List<String> values) {
            addCriterion("LICENSE_NO_PREFIX not in", values, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixBetween(String value1, String value2) {
            addCriterion("LICENSE_NO_PREFIX between", value1, value2, "licenseNoPrefix");
            return (Criteria) this;
        }

        public Criteria andLicenseNoPrefixNotBetween(String value1, String value2) {
            addCriterion("LICENSE_NO_PREFIX not between", value1, value2, "licenseNoPrefix");
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