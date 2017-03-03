package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVehicleModeInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TVehicleModeInfoExample() {
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

        public Criteria andVehicleCodeIsNull() {
            addCriterion("VEHICLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeIsNotNull() {
            addCriterion("VEHICLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeEqualTo(String value) {
            addCriterion("VEHICLE_CODE =", value, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeNotEqualTo(String value) {
            addCriterion("VEHICLE_CODE <>", value, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeGreaterThan(String value) {
            addCriterion("VEHICLE_CODE >", value, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_CODE >=", value, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeLessThan(String value) {
            addCriterion("VEHICLE_CODE <", value, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_CODE <=", value, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeLike(String value) {
            addCriterion("VEHICLE_CODE like", value, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeNotLike(String value) {
            addCriterion("VEHICLE_CODE not like", value, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeIn(List<String> values) {
            addCriterion("VEHICLE_CODE in", values, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeNotIn(List<String> values) {
            addCriterion("VEHICLE_CODE not in", values, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeBetween(String value1, String value2) {
            addCriterion("VEHICLE_CODE between", value1, value2, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleCodeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_CODE not between", value1, value2, "vehicleCode");
            return (Criteria) this;
        }

        public Criteria andVehicleNameIsNull() {
            addCriterion("VEHICLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNameIsNotNull() {
            addCriterion("VEHICLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNameEqualTo(String value) {
            addCriterion("VEHICLE_NAME =", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameNotEqualTo(String value) {
            addCriterion("VEHICLE_NAME <>", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameGreaterThan(String value) {
            addCriterion("VEHICLE_NAME >", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_NAME >=", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameLessThan(String value) {
            addCriterion("VEHICLE_NAME <", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_NAME <=", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameLike(String value) {
            addCriterion("VEHICLE_NAME like", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameNotLike(String value) {
            addCriterion("VEHICLE_NAME not like", value, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameIn(List<String> values) {
            addCriterion("VEHICLE_NAME in", values, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameNotIn(List<String> values) {
            addCriterion("VEHICLE_NAME not in", values, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameBetween(String value1, String value2) {
            addCriterion("VEHICLE_NAME between", value1, value2, "vehicleName");
            return (Criteria) this;
        }

        public Criteria andVehicleNameNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_NAME not between", value1, value2, "vehicleName");
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

        public Criteria andEffectDateStartIsNull() {
            addCriterion("EFFECT_DATE_START is null");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartIsNotNull() {
            addCriterion("EFFECT_DATE_START is not null");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartEqualTo(Date value) {
            addCriterion("EFFECT_DATE_START =", value, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartNotEqualTo(Date value) {
            addCriterion("EFFECT_DATE_START <>", value, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartGreaterThan(Date value) {
            addCriterion("EFFECT_DATE_START >", value, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECT_DATE_START >=", value, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartLessThan(Date value) {
            addCriterion("EFFECT_DATE_START <", value, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartLessThanOrEqualTo(Date value) {
            addCriterion("EFFECT_DATE_START <=", value, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartIn(List<Date> values) {
            addCriterion("EFFECT_DATE_START in", values, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartNotIn(List<Date> values) {
            addCriterion("EFFECT_DATE_START not in", values, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartBetween(Date value1, Date value2) {
            addCriterion("EFFECT_DATE_START between", value1, value2, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateStartNotBetween(Date value1, Date value2) {
            addCriterion("EFFECT_DATE_START not between", value1, value2, "effectDateStart");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndIsNull() {
            addCriterion("EFFECT_DATE_END is null");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndIsNotNull() {
            addCriterion("EFFECT_DATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndEqualTo(Date value) {
            addCriterion("EFFECT_DATE_END =", value, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndNotEqualTo(Date value) {
            addCriterion("EFFECT_DATE_END <>", value, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndGreaterThan(Date value) {
            addCriterion("EFFECT_DATE_END >", value, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECT_DATE_END >=", value, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndLessThan(Date value) {
            addCriterion("EFFECT_DATE_END <", value, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndLessThanOrEqualTo(Date value) {
            addCriterion("EFFECT_DATE_END <=", value, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndIn(List<Date> values) {
            addCriterion("EFFECT_DATE_END in", values, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndNotIn(List<Date> values) {
            addCriterion("EFFECT_DATE_END not in", values, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndBetween(Date value1, Date value2) {
            addCriterion("EFFECT_DATE_END between", value1, value2, "effectDateEnd");
            return (Criteria) this;
        }

        public Criteria andEffectDateEndNotBetween(Date value1, Date value2) {
            addCriterion("EFFECT_DATE_END not between", value1, value2, "effectDateEnd");
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

        public Criteria andSeatIsNull() {
            addCriterion("SEAT is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("SEAT is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(String value) {
            addCriterion("SEAT =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(String value) {
            addCriterion("SEAT <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(String value) {
            addCriterion("SEAT >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(String value) {
            addCriterion("SEAT >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(String value) {
            addCriterion("SEAT <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(String value) {
            addCriterion("SEAT <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLike(String value) {
            addCriterion("SEAT like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotLike(String value) {
            addCriterion("SEAT not like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<String> values) {
            addCriterion("SEAT in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<String> values) {
            addCriterion("SEAT not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(String value1, String value2) {
            addCriterion("SEAT between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(String value1, String value2) {
            addCriterion("SEAT not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andExhaustIsNull() {
            addCriterion("EXHAUST is null");
            return (Criteria) this;
        }

        public Criteria andExhaustIsNotNull() {
            addCriterion("EXHAUST is not null");
            return (Criteria) this;
        }

        public Criteria andExhaustEqualTo(String value) {
            addCriterion("EXHAUST =", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustNotEqualTo(String value) {
            addCriterion("EXHAUST <>", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustGreaterThan(String value) {
            addCriterion("EXHAUST >", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustGreaterThanOrEqualTo(String value) {
            addCriterion("EXHAUST >=", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustLessThan(String value) {
            addCriterion("EXHAUST <", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustLessThanOrEqualTo(String value) {
            addCriterion("EXHAUST <=", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustLike(String value) {
            addCriterion("EXHAUST like", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustNotLike(String value) {
            addCriterion("EXHAUST not like", value, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustIn(List<String> values) {
            addCriterion("EXHAUST in", values, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustNotIn(List<String> values) {
            addCriterion("EXHAUST not in", values, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustBetween(String value1, String value2) {
            addCriterion("EXHAUST between", value1, value2, "exhaust");
            return (Criteria) this;
        }

        public Criteria andExhaustNotBetween(String value1, String value2) {
            addCriterion("EXHAUST not between", value1, value2, "exhaust");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNull() {
            addCriterion("FAMILY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("FAMILY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("FAMILY_NAME =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("FAMILY_NAME <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("FAMILY_NAME >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILY_NAME >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("FAMILY_NAME <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("FAMILY_NAME <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("FAMILY_NAME like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("FAMILY_NAME not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("FAMILY_NAME in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("FAMILY_NAME not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("FAMILY_NAME between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("FAMILY_NAME not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIsNull() {
            addCriterion("NEW_VEHICLE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIsNotNull() {
            addCriterion("NEW_VEHICLE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceEqualTo(String value) {
            addCriterion("NEW_VEHICLE_PRICE =", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotEqualTo(String value) {
            addCriterion("NEW_VEHICLE_PRICE <>", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceGreaterThan(String value) {
            addCriterion("NEW_VEHICLE_PRICE >", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_VEHICLE_PRICE >=", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceLessThan(String value) {
            addCriterion("NEW_VEHICLE_PRICE <", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceLessThanOrEqualTo(String value) {
            addCriterion("NEW_VEHICLE_PRICE <=", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceLike(String value) {
            addCriterion("NEW_VEHICLE_PRICE like", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotLike(String value) {
            addCriterion("NEW_VEHICLE_PRICE not like", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIn(List<String> values) {
            addCriterion("NEW_VEHICLE_PRICE in", values, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotIn(List<String> values) {
            addCriterion("NEW_VEHICLE_PRICE not in", values, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceBetween(String value1, String value2) {
            addCriterion("NEW_VEHICLE_PRICE between", value1, value2, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotBetween(String value1, String value2) {
            addCriterion("NEW_VEHICLE_PRICE not between", value1, value2, "newVehiclePrice");
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

        public Criteria andStandardnameIsNull() {
            addCriterion("STANDARDNAME is null");
            return (Criteria) this;
        }

        public Criteria andStandardnameIsNotNull() {
            addCriterion("STANDARDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStandardnameEqualTo(String value) {
            addCriterion("STANDARDNAME =", value, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameNotEqualTo(String value) {
            addCriterion("STANDARDNAME <>", value, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameGreaterThan(String value) {
            addCriterion("STANDARDNAME >", value, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARDNAME >=", value, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameLessThan(String value) {
            addCriterion("STANDARDNAME <", value, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameLessThanOrEqualTo(String value) {
            addCriterion("STANDARDNAME <=", value, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameLike(String value) {
            addCriterion("STANDARDNAME like", value, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameNotLike(String value) {
            addCriterion("STANDARDNAME not like", value, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameIn(List<String> values) {
            addCriterion("STANDARDNAME in", values, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameNotIn(List<String> values) {
            addCriterion("STANDARDNAME not in", values, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameBetween(String value1, String value2) {
            addCriterion("STANDARDNAME between", value1, value2, "standardname");
            return (Criteria) this;
        }

        public Criteria andStandardnameNotBetween(String value1, String value2) {
            addCriterion("STANDARDNAME not between", value1, value2, "standardname");
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