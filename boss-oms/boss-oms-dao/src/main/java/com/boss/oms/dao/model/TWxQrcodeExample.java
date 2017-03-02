package com.boss.oms.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWxQrcodeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TWxQrcodeExample() {
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

        public Criteria andSceneIdIsNull() {
            addCriterion("SCENE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("SCENE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(Integer value) {
            addCriterion("SCENE_ID =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(Integer value) {
            addCriterion("SCENE_ID <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(Integer value) {
            addCriterion("SCENE_ID >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCENE_ID >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(Integer value) {
            addCriterion("SCENE_ID <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(Integer value) {
            addCriterion("SCENE_ID <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<Integer> values) {
            addCriterion("SCENE_ID in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<Integer> values) {
            addCriterion("SCENE_ID not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(Integer value1, Integer value2) {
            addCriterion("SCENE_ID between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SCENE_ID not between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("MEDIA_ID is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("MEDIA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("MEDIA_ID =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("MEDIA_ID <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("MEDIA_ID >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIA_ID >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("MEDIA_ID <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("MEDIA_ID <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("MEDIA_ID like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("MEDIA_ID not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("MEDIA_ID in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("MEDIA_ID not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("MEDIA_ID between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("MEDIA_ID not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeIsNull() {
            addCriterion("EXPIRESIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeIsNotNull() {
            addCriterion("EXPIRESIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeEqualTo(Date value) {
            addCriterion("EXPIRESIN_TIME =", value, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeNotEqualTo(Date value) {
            addCriterion("EXPIRESIN_TIME <>", value, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeGreaterThan(Date value) {
            addCriterion("EXPIRESIN_TIME >", value, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRESIN_TIME >=", value, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeLessThan(Date value) {
            addCriterion("EXPIRESIN_TIME <", value, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRESIN_TIME <=", value, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeIn(List<Date> values) {
            addCriterion("EXPIRESIN_TIME in", values, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeNotIn(List<Date> values) {
            addCriterion("EXPIRESIN_TIME not in", values, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeBetween(Date value1, Date value2) {
            addCriterion("EXPIRESIN_TIME between", value1, value2, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andExpiresinTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRESIN_TIME not between", value1, value2, "expiresinTime");
            return (Criteria) this;
        }

        public Criteria andReqCountIsNull() {
            addCriterion("REQ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andReqCountIsNotNull() {
            addCriterion("REQ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReqCountEqualTo(Integer value) {
            addCriterion("REQ_COUNT =", value, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountNotEqualTo(Integer value) {
            addCriterion("REQ_COUNT <>", value, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountGreaterThan(Integer value) {
            addCriterion("REQ_COUNT >", value, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("REQ_COUNT >=", value, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountLessThan(Integer value) {
            addCriterion("REQ_COUNT <", value, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountLessThanOrEqualTo(Integer value) {
            addCriterion("REQ_COUNT <=", value, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountIn(List<Integer> values) {
            addCriterion("REQ_COUNT in", values, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountNotIn(List<Integer> values) {
            addCriterion("REQ_COUNT not in", values, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountBetween(Integer value1, Integer value2) {
            addCriterion("REQ_COUNT between", value1, value2, "reqCount");
            return (Criteria) this;
        }

        public Criteria andReqCountNotBetween(Integer value1, Integer value2) {
            addCriterion("REQ_COUNT not between", value1, value2, "reqCount");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeIsNull() {
            addCriterion("QRCODE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeIsNotNull() {
            addCriterion("QRCODE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeEqualTo(String value) {
            addCriterion("QRCODE_TYPE =", value, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeNotEqualTo(String value) {
            addCriterion("QRCODE_TYPE <>", value, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeGreaterThan(String value) {
            addCriterion("QRCODE_TYPE >", value, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("QRCODE_TYPE >=", value, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeLessThan(String value) {
            addCriterion("QRCODE_TYPE <", value, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeLessThanOrEqualTo(String value) {
            addCriterion("QRCODE_TYPE <=", value, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeLike(String value) {
            addCriterion("QRCODE_TYPE like", value, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeNotLike(String value) {
            addCriterion("QRCODE_TYPE not like", value, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeIn(List<String> values) {
            addCriterion("QRCODE_TYPE in", values, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeNotIn(List<String> values) {
            addCriterion("QRCODE_TYPE not in", values, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeBetween(String value1, String value2) {
            addCriterion("QRCODE_TYPE between", value1, value2, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andQrcodeTypeNotBetween(String value1, String value2) {
            addCriterion("QRCODE_TYPE not between", value1, value2, "qrcodeType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeIsNull() {
            addCriterion("POSTER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPosterTypeIsNotNull() {
            addCriterion("POSTER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPosterTypeEqualTo(String value) {
            addCriterion("POSTER_TYPE =", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeNotEqualTo(String value) {
            addCriterion("POSTER_TYPE <>", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeGreaterThan(String value) {
            addCriterion("POSTER_TYPE >", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTER_TYPE >=", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeLessThan(String value) {
            addCriterion("POSTER_TYPE <", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeLessThanOrEqualTo(String value) {
            addCriterion("POSTER_TYPE <=", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeLike(String value) {
            addCriterion("POSTER_TYPE like", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeNotLike(String value) {
            addCriterion("POSTER_TYPE not like", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeIn(List<String> values) {
            addCriterion("POSTER_TYPE in", values, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeNotIn(List<String> values) {
            addCriterion("POSTER_TYPE not in", values, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeBetween(String value1, String value2) {
            addCriterion("POSTER_TYPE between", value1, value2, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeNotBetween(String value1, String value2) {
            addCriterion("POSTER_TYPE not between", value1, value2, "posterType");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNull() {
            addCriterion("QRCODE_URL is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNotNull() {
            addCriterion("QRCODE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlEqualTo(String value) {
            addCriterion("QRCODE_URL =", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotEqualTo(String value) {
            addCriterion("QRCODE_URL <>", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThan(String value) {
            addCriterion("QRCODE_URL >", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("QRCODE_URL >=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThan(String value) {
            addCriterion("QRCODE_URL <", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("QRCODE_URL <=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLike(String value) {
            addCriterion("QRCODE_URL like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotLike(String value) {
            addCriterion("QRCODE_URL not like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIn(List<String> values) {
            addCriterion("QRCODE_URL in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotIn(List<String> values) {
            addCriterion("QRCODE_URL not in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlBetween(String value1, String value2) {
            addCriterion("QRCODE_URL between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("QRCODE_URL not between", value1, value2, "qrcodeUrl");
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