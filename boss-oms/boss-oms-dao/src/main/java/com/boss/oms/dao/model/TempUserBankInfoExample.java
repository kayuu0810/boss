package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TempUserBankInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TempUserBankInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeIsNull() {
            addCriterion("old_user_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeIsNotNull() {
            addCriterion("old_user_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeEqualTo(String value) {
            addCriterion("old_user_bank_code =", value, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeNotEqualTo(String value) {
            addCriterion("old_user_bank_code <>", value, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeGreaterThan(String value) {
            addCriterion("old_user_bank_code >", value, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("old_user_bank_code >=", value, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeLessThan(String value) {
            addCriterion("old_user_bank_code <", value, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeLessThanOrEqualTo(String value) {
            addCriterion("old_user_bank_code <=", value, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeLike(String value) {
            addCriterion("old_user_bank_code like", value, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeNotLike(String value) {
            addCriterion("old_user_bank_code not like", value, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeIn(List<String> values) {
            addCriterion("old_user_bank_code in", values, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeNotIn(List<String> values) {
            addCriterion("old_user_bank_code not in", values, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeBetween(String value1, String value2) {
            addCriterion("old_user_bank_code between", value1, value2, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankCodeNotBetween(String value1, String value2) {
            addCriterion("old_user_bank_code not between", value1, value2, "oldUserBankCode");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameIsNull() {
            addCriterion("old_user_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameIsNotNull() {
            addCriterion("old_user_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameEqualTo(String value) {
            addCriterion("old_user_bank_name =", value, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameNotEqualTo(String value) {
            addCriterion("old_user_bank_name <>", value, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameGreaterThan(String value) {
            addCriterion("old_user_bank_name >", value, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_user_bank_name >=", value, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameLessThan(String value) {
            addCriterion("old_user_bank_name <", value, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameLessThanOrEqualTo(String value) {
            addCriterion("old_user_bank_name <=", value, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameLike(String value) {
            addCriterion("old_user_bank_name like", value, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameNotLike(String value) {
            addCriterion("old_user_bank_name not like", value, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameIn(List<String> values) {
            addCriterion("old_user_bank_name in", values, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameNotIn(List<String> values) {
            addCriterion("old_user_bank_name not in", values, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameBetween(String value1, String value2) {
            addCriterion("old_user_bank_name between", value1, value2, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andOldUserBankNameNotBetween(String value1, String value2) {
            addCriterion("old_user_bank_name not between", value1, value2, "oldUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeIsNull() {
            addCriterion("new_user_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeIsNotNull() {
            addCriterion("new_user_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeEqualTo(String value) {
            addCriterion("new_user_bank_code =", value, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeNotEqualTo(String value) {
            addCriterion("new_user_bank_code <>", value, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeGreaterThan(String value) {
            addCriterion("new_user_bank_code >", value, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("new_user_bank_code >=", value, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeLessThan(String value) {
            addCriterion("new_user_bank_code <", value, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeLessThanOrEqualTo(String value) {
            addCriterion("new_user_bank_code <=", value, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeLike(String value) {
            addCriterion("new_user_bank_code like", value, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeNotLike(String value) {
            addCriterion("new_user_bank_code not like", value, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeIn(List<String> values) {
            addCriterion("new_user_bank_code in", values, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeNotIn(List<String> values) {
            addCriterion("new_user_bank_code not in", values, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeBetween(String value1, String value2) {
            addCriterion("new_user_bank_code between", value1, value2, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankCodeNotBetween(String value1, String value2) {
            addCriterion("new_user_bank_code not between", value1, value2, "newUserBankCode");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameIsNull() {
            addCriterion("new_user_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameIsNotNull() {
            addCriterion("new_user_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameEqualTo(String value) {
            addCriterion("new_user_bank_name =", value, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameNotEqualTo(String value) {
            addCriterion("new_user_bank_name <>", value, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameGreaterThan(String value) {
            addCriterion("new_user_bank_name >", value, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_user_bank_name >=", value, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameLessThan(String value) {
            addCriterion("new_user_bank_name <", value, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameLessThanOrEqualTo(String value) {
            addCriterion("new_user_bank_name <=", value, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameLike(String value) {
            addCriterion("new_user_bank_name like", value, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameNotLike(String value) {
            addCriterion("new_user_bank_name not like", value, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameIn(List<String> values) {
            addCriterion("new_user_bank_name in", values, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameNotIn(List<String> values) {
            addCriterion("new_user_bank_name not in", values, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameBetween(String value1, String value2) {
            addCriterion("new_user_bank_name between", value1, value2, "newUserBankName");
            return (Criteria) this;
        }

        public Criteria andNewUserBankNameNotBetween(String value1, String value2) {
            addCriterion("new_user_bank_name not between", value1, value2, "newUserBankName");
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