package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TVehicleDetailInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TVehicleDetailInfoExample() {
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

        public Criteria andLicenseNoIsNull() {
            addCriterion("LICENSE_NO is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNotNull() {
            addCriterion("LICENSE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoEqualTo(String value) {
            addCriterion("LICENSE_NO =", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotEqualTo(String value) {
            addCriterion("LICENSE_NO <>", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThan(String value) {
            addCriterion("LICENSE_NO >", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE_NO >=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThan(String value) {
            addCriterion("LICENSE_NO <", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("LICENSE_NO <=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLike(String value) {
            addCriterion("LICENSE_NO like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotLike(String value) {
            addCriterion("LICENSE_NO not like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIn(List<String> values) {
            addCriterion("LICENSE_NO in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotIn(List<String> values) {
            addCriterion("LICENSE_NO not in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoBetween(String value1, String value2) {
            addCriterion("LICENSE_NO between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotBetween(String value1, String value2) {
            addCriterion("LICENSE_NO not between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNull() {
            addCriterion("ENGINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("ENGINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("ENGINE_NO =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("ENGINE_NO <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("ENGINE_NO >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_NO >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("ENGINE_NO <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_NO <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("ENGINE_NO like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("ENGINE_NO not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("ENGINE_NO in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("ENGINE_NO not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("ENGINE_NO between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("ENGINE_NO not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoIsNull() {
            addCriterion("FRAME_NO is null");
            return (Criteria) this;
        }

        public Criteria andFrameNoIsNotNull() {
            addCriterion("FRAME_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFrameNoEqualTo(String value) {
            addCriterion("FRAME_NO =", value, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoNotEqualTo(String value) {
            addCriterion("FRAME_NO <>", value, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoGreaterThan(String value) {
            addCriterion("FRAME_NO >", value, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoGreaterThanOrEqualTo(String value) {
            addCriterion("FRAME_NO >=", value, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoLessThan(String value) {
            addCriterion("FRAME_NO <", value, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoLessThanOrEqualTo(String value) {
            addCriterion("FRAME_NO <=", value, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoLike(String value) {
            addCriterion("FRAME_NO like", value, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoNotLike(String value) {
            addCriterion("FRAME_NO not like", value, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoIn(List<String> values) {
            addCriterion("FRAME_NO in", values, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoNotIn(List<String> values) {
            addCriterion("FRAME_NO not in", values, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoBetween(String value1, String value2) {
            addCriterion("FRAME_NO between", value1, value2, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFrameNoNotBetween(String value1, String value2) {
            addCriterion("FRAME_NO not between", value1, value2, "frameNo");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateIsNull() {
            addCriterion("FIRST_REGISTER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateIsNotNull() {
            addCriterion("FIRST_REGISTER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE =", value, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE <>", value, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE >", value, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE >=", value, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE <", value, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE <=", value, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE in", values, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE not in", values, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE between", value1, value2, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIRST_REGISTER_DATE not between", value1, value2, "firstRegisterDate");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Long value) {
            addCriterion("OWNER_ID =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Long value) {
            addCriterion("OWNER_ID <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Long value) {
            addCriterion("OWNER_ID >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OWNER_ID >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Long value) {
            addCriterion("OWNER_ID <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("OWNER_ID <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Long> values) {
            addCriterion("OWNER_ID in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Long> values) {
            addCriterion("OWNER_ID not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Long value1, Long value2) {
            addCriterion("OWNER_ID between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("OWNER_ID not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameIsNull() {
            addCriterion("VEHICLE_MODEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameIsNotNull() {
            addCriterion("VEHICLE_MODEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameEqualTo(String value) {
            addCriterion("VEHICLE_MODEL_NAME =", value, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameNotEqualTo(String value) {
            addCriterion("VEHICLE_MODEL_NAME <>", value, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameGreaterThan(String value) {
            addCriterion("VEHICLE_MODEL_NAME >", value, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_MODEL_NAME >=", value, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameLessThan(String value) {
            addCriterion("VEHICLE_MODEL_NAME <", value, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_MODEL_NAME <=", value, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameLike(String value) {
            addCriterion("VEHICLE_MODEL_NAME like", value, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameNotLike(String value) {
            addCriterion("VEHICLE_MODEL_NAME not like", value, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameIn(List<String> values) {
            addCriterion("VEHICLE_MODEL_NAME in", values, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameNotIn(List<String> values) {
            addCriterion("VEHICLE_MODEL_NAME not in", values, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameBetween(String value1, String value2) {
            addCriterion("VEHICLE_MODEL_NAME between", value1, value2, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNameNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_MODEL_NAME not between", value1, value2, "vehicleModelName");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIsNull() {
            addCriterion("VEHICLE_MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIsNotNull() {
            addCriterion("VEHICLE_MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdEqualTo(Long value) {
            addCriterion("VEHICLE_MODEL_ID =", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotEqualTo(Long value) {
            addCriterion("VEHICLE_MODEL_ID <>", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdGreaterThan(Long value) {
            addCriterion("VEHICLE_MODEL_ID >", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_MODEL_ID >=", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdLessThan(Long value) {
            addCriterion("VEHICLE_MODEL_ID <", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdLessThanOrEqualTo(Long value) {
            addCriterion("VEHICLE_MODEL_ID <=", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIn(List<Long> values) {
            addCriterion("VEHICLE_MODEL_ID in", values, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotIn(List<Long> values) {
            addCriterion("VEHICLE_MODEL_ID not in", values, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_MODEL_ID between", value1, value2, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotBetween(Long value1, Long value2) {
            addCriterion("VEHICLE_MODEL_ID not between", value1, value2, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("PURCHASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("PURCHASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("PURCHASE_DATE in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PURCHASE_DATE not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PURCHASE_DATE between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PURCHASE_DATE not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagIsNull() {
            addCriterion("IS_NEW_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagIsNotNull() {
            addCriterion("IS_NEW_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagEqualTo(String value) {
            addCriterion("IS_NEW_FLAG =", value, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagNotEqualTo(String value) {
            addCriterion("IS_NEW_FLAG <>", value, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagGreaterThan(String value) {
            addCriterion("IS_NEW_FLAG >", value, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NEW_FLAG >=", value, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagLessThan(String value) {
            addCriterion("IS_NEW_FLAG <", value, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagLessThanOrEqualTo(String value) {
            addCriterion("IS_NEW_FLAG <=", value, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagLike(String value) {
            addCriterion("IS_NEW_FLAG like", value, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagNotLike(String value) {
            addCriterion("IS_NEW_FLAG not like", value, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagIn(List<String> values) {
            addCriterion("IS_NEW_FLAG in", values, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagNotIn(List<String> values) {
            addCriterion("IS_NEW_FLAG not in", values, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagBetween(String value1, String value2) {
            addCriterion("IS_NEW_FLAG between", value1, value2, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsNewFlagNotBetween(String value1, String value2) {
            addCriterion("IS_NEW_FLAG not between", value1, value2, "isNewFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagIsNull() {
            addCriterion("IS_TRANS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagIsNotNull() {
            addCriterion("IS_TRANS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagEqualTo(String value) {
            addCriterion("IS_TRANS_FLAG =", value, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagNotEqualTo(String value) {
            addCriterion("IS_TRANS_FLAG <>", value, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagGreaterThan(String value) {
            addCriterion("IS_TRANS_FLAG >", value, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TRANS_FLAG >=", value, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagLessThan(String value) {
            addCriterion("IS_TRANS_FLAG <", value, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagLessThanOrEqualTo(String value) {
            addCriterion("IS_TRANS_FLAG <=", value, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagLike(String value) {
            addCriterion("IS_TRANS_FLAG like", value, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagNotLike(String value) {
            addCriterion("IS_TRANS_FLAG not like", value, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagIn(List<String> values) {
            addCriterion("IS_TRANS_FLAG in", values, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagNotIn(List<String> values) {
            addCriterion("IS_TRANS_FLAG not in", values, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagBetween(String value1, String value2) {
            addCriterion("IS_TRANS_FLAG between", value1, value2, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andIsTransFlagNotBetween(String value1, String value2) {
            addCriterion("IS_TRANS_FLAG not between", value1, value2, "isTransFlag");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("TRANS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("TRANS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(Date value) {
            addCriterionForJDBCDate("TRANS_DATE =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRANS_DATE <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(Date value) {
            addCriterionForJDBCDate("TRANS_DATE >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANS_DATE >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(Date value) {
            addCriterionForJDBCDate("TRANS_DATE <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANS_DATE <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<Date> values) {
            addCriterionForJDBCDate("TRANS_DATE in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRANS_DATE not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANS_DATE between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANS_DATE not between", value1, value2, "transDate");
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

        public Criteria andIsLoanFlagIsNull() {
            addCriterion("IS_LOAN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagIsNotNull() {
            addCriterion("IS_LOAN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagEqualTo(String value) {
            addCriterion("IS_LOAN_FLAG =", value, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagNotEqualTo(String value) {
            addCriterion("IS_LOAN_FLAG <>", value, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagGreaterThan(String value) {
            addCriterion("IS_LOAN_FLAG >", value, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOAN_FLAG >=", value, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagLessThan(String value) {
            addCriterion("IS_LOAN_FLAG <", value, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagLessThanOrEqualTo(String value) {
            addCriterion("IS_LOAN_FLAG <=", value, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagLike(String value) {
            addCriterion("IS_LOAN_FLAG like", value, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagNotLike(String value) {
            addCriterion("IS_LOAN_FLAG not like", value, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagIn(List<String> values) {
            addCriterion("IS_LOAN_FLAG in", values, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagNotIn(List<String> values) {
            addCriterion("IS_LOAN_FLAG not in", values, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagBetween(String value1, String value2) {
            addCriterion("IS_LOAN_FLAG between", value1, value2, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoanFlagNotBetween(String value1, String value2) {
            addCriterion("IS_LOAN_FLAG not between", value1, value2, "isLoanFlag");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("FUEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("FUEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("FUEL_TYPE =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("FUEL_TYPE <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("FUEL_TYPE >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUEL_TYPE >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("FUEL_TYPE <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("FUEL_TYPE <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("FUEL_TYPE like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("FUEL_TYPE not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("FUEL_TYPE in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("FUEL_TYPE not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("FUEL_TYPE between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("FUEL_TYPE not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrIsNull() {
            addCriterion("DRIVING_LICENSE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrIsNotNull() {
            addCriterion("DRIVING_LICENSE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_ADDR =", value, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrNotEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_ADDR <>", value, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrGreaterThan(String value) {
            addCriterion("DRIVING_LICENSE_ADDR >", value, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_ADDR >=", value, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrLessThan(String value) {
            addCriterion("DRIVING_LICENSE_ADDR <", value, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrLessThanOrEqualTo(String value) {
            addCriterion("DRIVING_LICENSE_ADDR <=", value, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrLike(String value) {
            addCriterion("DRIVING_LICENSE_ADDR like", value, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrNotLike(String value) {
            addCriterion("DRIVING_LICENSE_ADDR not like", value, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrIn(List<String> values) {
            addCriterion("DRIVING_LICENSE_ADDR in", values, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrNotIn(List<String> values) {
            addCriterion("DRIVING_LICENSE_ADDR not in", values, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrBetween(String value1, String value2) {
            addCriterion("DRIVING_LICENSE_ADDR between", value1, value2, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddrNotBetween(String value1, String value2) {
            addCriterion("DRIVING_LICENSE_ADDR not between", value1, value2, "drivingLicenseAddr");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeIsNull() {
            addCriterion("VEHICLE_VOUCHER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeIsNotNull() {
            addCriterion("VEHICLE_VOUCHER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeEqualTo(String value) {
            addCriterion("VEHICLE_VOUCHER_TYPE =", value, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeNotEqualTo(String value) {
            addCriterion("VEHICLE_VOUCHER_TYPE <>", value, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeGreaterThan(String value) {
            addCriterion("VEHICLE_VOUCHER_TYPE >", value, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_VOUCHER_TYPE >=", value, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeLessThan(String value) {
            addCriterion("VEHICLE_VOUCHER_TYPE <", value, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_VOUCHER_TYPE <=", value, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeLike(String value) {
            addCriterion("VEHICLE_VOUCHER_TYPE like", value, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeNotLike(String value) {
            addCriterion("VEHICLE_VOUCHER_TYPE not like", value, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeIn(List<String> values) {
            addCriterion("VEHICLE_VOUCHER_TYPE in", values, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeNotIn(List<String> values) {
            addCriterion("VEHICLE_VOUCHER_TYPE not in", values, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeBetween(String value1, String value2) {
            addCriterion("VEHICLE_VOUCHER_TYPE between", value1, value2, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherTypeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_VOUCHER_TYPE not between", value1, value2, "vehicleVoucherType");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoIsNull() {
            addCriterion("VEHICLE_VOUCHER_NO is null");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoIsNotNull() {
            addCriterion("VEHICLE_VOUCHER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoEqualTo(String value) {
            addCriterion("VEHICLE_VOUCHER_NO =", value, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoNotEqualTo(String value) {
            addCriterion("VEHICLE_VOUCHER_NO <>", value, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoGreaterThan(String value) {
            addCriterion("VEHICLE_VOUCHER_NO >", value, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_VOUCHER_NO >=", value, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoLessThan(String value) {
            addCriterion("VEHICLE_VOUCHER_NO <", value, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_VOUCHER_NO <=", value, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoLike(String value) {
            addCriterion("VEHICLE_VOUCHER_NO like", value, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoNotLike(String value) {
            addCriterion("VEHICLE_VOUCHER_NO not like", value, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoIn(List<String> values) {
            addCriterion("VEHICLE_VOUCHER_NO in", values, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoNotIn(List<String> values) {
            addCriterion("VEHICLE_VOUCHER_NO not in", values, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoBetween(String value1, String value2) {
            addCriterion("VEHICLE_VOUCHER_NO between", value1, value2, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherNoNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_VOUCHER_NO not between", value1, value2, "vehicleVoucherNo");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateIsNull() {
            addCriterion("VEHICLE_VOUCHER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateIsNotNull() {
            addCriterion("VEHICLE_VOUCHER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateEqualTo(Date value) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE =", value, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE <>", value, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateGreaterThan(Date value) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE >", value, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE >=", value, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateLessThan(Date value) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE <", value, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE <=", value, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateIn(List<Date> values) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE in", values, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE not in", values, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE between", value1, value2, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andVehicleVoucherDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VEHICLE_VOUCHER_DATE not between", value1, value2, "vehicleVoucherDate");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
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