package com.boss.oms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWxMessageExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TWxMessageExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionIsNull() {
            addCriterion("msg_direction is null");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionIsNotNull() {
            addCriterion("msg_direction is not null");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionEqualTo(String value) {
            addCriterion("msg_direction =", value, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionNotEqualTo(String value) {
            addCriterion("msg_direction <>", value, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionGreaterThan(String value) {
            addCriterion("msg_direction >", value, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("msg_direction >=", value, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionLessThan(String value) {
            addCriterion("msg_direction <", value, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionLessThanOrEqualTo(String value) {
            addCriterion("msg_direction <=", value, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionLike(String value) {
            addCriterion("msg_direction like", value, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionNotLike(String value) {
            addCriterion("msg_direction not like", value, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionIn(List<String> values) {
            addCriterion("msg_direction in", values, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionNotIn(List<String> values) {
            addCriterion("msg_direction not in", values, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionBetween(String value1, String value2) {
            addCriterion("msg_direction between", value1, value2, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andMsgDirectionNotBetween(String value1, String value2) {
            addCriterion("msg_direction not between", value1, value2, "msgDirection");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdIsNull() {
            addCriterion("fans_open_id is null");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdIsNotNull() {
            addCriterion("fans_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdEqualTo(String value) {
            addCriterion("fans_open_id =", value, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdNotEqualTo(String value) {
            addCriterion("fans_open_id <>", value, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdGreaterThan(String value) {
            addCriterion("fans_open_id >", value, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("fans_open_id >=", value, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdLessThan(String value) {
            addCriterion("fans_open_id <", value, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdLessThanOrEqualTo(String value) {
            addCriterion("fans_open_id <=", value, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdLike(String value) {
            addCriterion("fans_open_id like", value, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdNotLike(String value) {
            addCriterion("fans_open_id not like", value, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdIn(List<String> values) {
            addCriterion("fans_open_id in", values, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdNotIn(List<String> values) {
            addCriterion("fans_open_id not in", values, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdBetween(String value1, String value2) {
            addCriterion("fans_open_id between", value1, value2, "fansOpenId");
            return (Criteria) this;
        }

        public Criteria andFansOpenIdNotBetween(String value1, String value2) {
            addCriterion("fans_open_id not between", value1, value2, "fansOpenId");
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

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("msg_type like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("msg_type not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeIsNull() {
            addCriterion("mp_created_time is null");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeIsNotNull() {
            addCriterion("mp_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeEqualTo(Date value) {
            addCriterion("mp_created_time =", value, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeNotEqualTo(Date value) {
            addCriterion("mp_created_time <>", value, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeGreaterThan(Date value) {
            addCriterion("mp_created_time >", value, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mp_created_time >=", value, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeLessThan(Date value) {
            addCriterion("mp_created_time <", value, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("mp_created_time <=", value, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeIn(List<Date> values) {
            addCriterion("mp_created_time in", values, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeNotIn(List<Date> values) {
            addCriterion("mp_created_time not in", values, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("mp_created_time between", value1, value2, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("mp_created_time not between", value1, value2, "mpCreatedTime");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdIsNull() {
            addCriterion("mp_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdIsNotNull() {
            addCriterion("mp_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdEqualTo(String value) {
            addCriterion("mp_msg_id =", value, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdNotEqualTo(String value) {
            addCriterion("mp_msg_id <>", value, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdGreaterThan(String value) {
            addCriterion("mp_msg_id >", value, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("mp_msg_id >=", value, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdLessThan(String value) {
            addCriterion("mp_msg_id <", value, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdLessThanOrEqualTo(String value) {
            addCriterion("mp_msg_id <=", value, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdLike(String value) {
            addCriterion("mp_msg_id like", value, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdNotLike(String value) {
            addCriterion("mp_msg_id not like", value, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdIn(List<String> values) {
            addCriterion("mp_msg_id in", values, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdNotIn(List<String> values) {
            addCriterion("mp_msg_id not in", values, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdBetween(String value1, String value2) {
            addCriterion("mp_msg_id between", value1, value2, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andMpMsgIdNotBetween(String value1, String value2) {
            addCriterion("mp_msg_id not between", value1, value2, "mpMsgId");
            return (Criteria) this;
        }

        public Criteria andEventIsNull() {
            addCriterion("event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("event like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("event not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("event not between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventKeyIsNull() {
            addCriterion("event_key is null");
            return (Criteria) this;
        }

        public Criteria andEventKeyIsNotNull() {
            addCriterion("event_key is not null");
            return (Criteria) this;
        }

        public Criteria andEventKeyEqualTo(String value) {
            addCriterion("event_key =", value, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyNotEqualTo(String value) {
            addCriterion("event_key <>", value, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyGreaterThan(String value) {
            addCriterion("event_key >", value, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyGreaterThanOrEqualTo(String value) {
            addCriterion("event_key >=", value, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyLessThan(String value) {
            addCriterion("event_key <", value, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyLessThanOrEqualTo(String value) {
            addCriterion("event_key <=", value, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyLike(String value) {
            addCriterion("event_key like", value, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyNotLike(String value) {
            addCriterion("event_key not like", value, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyIn(List<String> values) {
            addCriterion("event_key in", values, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyNotIn(List<String> values) {
            addCriterion("event_key not in", values, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyBetween(String value1, String value2) {
            addCriterion("event_key between", value1, value2, "eventKey");
            return (Criteria) this;
        }

        public Criteria andEventKeyNotBetween(String value1, String value2) {
            addCriterion("event_key not between", value1, value2, "eventKey");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("media_id like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("media_id not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andFormatIsNull() {
            addCriterion("format is null");
            return (Criteria) this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("format is not null");
            return (Criteria) this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("format =", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("format <>", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("format >", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("format >=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("format <", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("format <=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("format like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("format not like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("format in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("format not in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("format between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("format not between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdIsNull() {
            addCriterion("thumb_media_id is null");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdIsNotNull() {
            addCriterion("thumb_media_id is not null");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdEqualTo(String value) {
            addCriterion("thumb_media_id =", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdNotEqualTo(String value) {
            addCriterion("thumb_media_id <>", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdGreaterThan(String value) {
            addCriterion("thumb_media_id >", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_media_id >=", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdLessThan(String value) {
            addCriterion("thumb_media_id <", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdLessThanOrEqualTo(String value) {
            addCriterion("thumb_media_id <=", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdLike(String value) {
            addCriterion("thumb_media_id like", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdNotLike(String value) {
            addCriterion("thumb_media_id not like", value, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdIn(List<String> values) {
            addCriterion("thumb_media_id in", values, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdNotIn(List<String> values) {
            addCriterion("thumb_media_id not in", values, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdBetween(String value1, String value2) {
            addCriterion("thumb_media_id between", value1, value2, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andThumbMediaIdNotBetween(String value1, String value2) {
            addCriterion("thumb_media_id not between", value1, value2, "thumbMediaId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTicketIsNull() {
            addCriterion("ticket is null");
            return (Criteria) this;
        }

        public Criteria andTicketIsNotNull() {
            addCriterion("ticket is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEqualTo(String value) {
            addCriterion("ticket =", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotEqualTo(String value) {
            addCriterion("ticket <>", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThan(String value) {
            addCriterion("ticket >", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThanOrEqualTo(String value) {
            addCriterion("ticket >=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThan(String value) {
            addCriterion("ticket <", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThanOrEqualTo(String value) {
            addCriterion("ticket <=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLike(String value) {
            addCriterion("ticket like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotLike(String value) {
            addCriterion("ticket not like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketIn(List<String> values) {
            addCriterion("ticket in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotIn(List<String> values) {
            addCriterion("ticket not in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketBetween(String value1, String value2) {
            addCriterion("ticket between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotBetween(String value1, String value2) {
            addCriterion("ticket not between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeIsNull() {
            addCriterion("pos_latitude is null");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeIsNotNull() {
            addCriterion("pos_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeEqualTo(BigDecimal value) {
            addCriterion("pos_latitude =", value, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("pos_latitude <>", value, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeGreaterThan(BigDecimal value) {
            addCriterion("pos_latitude >", value, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_latitude >=", value, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeLessThan(BigDecimal value) {
            addCriterion("pos_latitude <", value, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_latitude <=", value, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeIn(List<BigDecimal> values) {
            addCriterion("pos_latitude in", values, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("pos_latitude not in", values, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_latitude between", value1, value2, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_latitude not between", value1, value2, "posLatitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeIsNull() {
            addCriterion("pos_longitude is null");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeIsNotNull() {
            addCriterion("pos_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeEqualTo(BigDecimal value) {
            addCriterion("pos_longitude =", value, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("pos_longitude <>", value, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeGreaterThan(BigDecimal value) {
            addCriterion("pos_longitude >", value, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_longitude >=", value, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeLessThan(BigDecimal value) {
            addCriterion("pos_longitude <", value, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_longitude <=", value, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeIn(List<BigDecimal> values) {
            addCriterion("pos_longitude in", values, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("pos_longitude not in", values, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_longitude between", value1, value2, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_longitude not between", value1, value2, "posLongitude");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionIsNull() {
            addCriterion("pos_precision is null");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionIsNotNull() {
            addCriterion("pos_precision is not null");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionEqualTo(BigDecimal value) {
            addCriterion("pos_precision =", value, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionNotEqualTo(BigDecimal value) {
            addCriterion("pos_precision <>", value, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionGreaterThan(BigDecimal value) {
            addCriterion("pos_precision >", value, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_precision >=", value, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionLessThan(BigDecimal value) {
            addCriterion("pos_precision <", value, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_precision <=", value, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionIn(List<BigDecimal> values) {
            addCriterion("pos_precision in", values, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionNotIn(List<BigDecimal> values) {
            addCriterion("pos_precision not in", values, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_precision between", value1, value2, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosPrecisionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_precision not between", value1, value2, "posPrecision");
            return (Criteria) this;
        }

        public Criteria andPosScaleIsNull() {
            addCriterion("pos_scale is null");
            return (Criteria) this;
        }

        public Criteria andPosScaleIsNotNull() {
            addCriterion("pos_scale is not null");
            return (Criteria) this;
        }

        public Criteria andPosScaleEqualTo(BigDecimal value) {
            addCriterion("pos_scale =", value, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleNotEqualTo(BigDecimal value) {
            addCriterion("pos_scale <>", value, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleGreaterThan(BigDecimal value) {
            addCriterion("pos_scale >", value, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_scale >=", value, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleLessThan(BigDecimal value) {
            addCriterion("pos_scale <", value, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pos_scale <=", value, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleIn(List<BigDecimal> values) {
            addCriterion("pos_scale in", values, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleNotIn(List<BigDecimal> values) {
            addCriterion("pos_scale not in", values, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_scale between", value1, value2, "posScale");
            return (Criteria) this;
        }

        public Criteria andPosScaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pos_scale not between", value1, value2, "posScale");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andReplyTypeIsNull() {
            addCriterion("reply_type is null");
            return (Criteria) this;
        }

        public Criteria andReplyTypeIsNotNull() {
            addCriterion("reply_type is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTypeEqualTo(String value) {
            addCriterion("reply_type =", value, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeNotEqualTo(String value) {
            addCriterion("reply_type <>", value, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeGreaterThan(String value) {
            addCriterion("reply_type >", value, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reply_type >=", value, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeLessThan(String value) {
            addCriterion("reply_type <", value, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeLessThanOrEqualTo(String value) {
            addCriterion("reply_type <=", value, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeLike(String value) {
            addCriterion("reply_type like", value, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeNotLike(String value) {
            addCriterion("reply_type not like", value, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeIn(List<String> values) {
            addCriterion("reply_type in", values, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeNotIn(List<String> values) {
            addCriterion("reply_type not in", values, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeBetween(String value1, String value2) {
            addCriterion("reply_type between", value1, value2, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyTypeNotBetween(String value1, String value2) {
            addCriterion("reply_type not between", value1, value2, "replyType");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdIsNull() {
            addCriterion("reply_media_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdIsNotNull() {
            addCriterion("reply_media_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdEqualTo(Long value) {
            addCriterion("reply_media_id =", value, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdNotEqualTo(Long value) {
            addCriterion("reply_media_id <>", value, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdGreaterThan(Long value) {
            addCriterion("reply_media_id >", value, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_media_id >=", value, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdLessThan(Long value) {
            addCriterion("reply_media_id <", value, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_media_id <=", value, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdIn(List<Long> values) {
            addCriterion("reply_media_id in", values, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdNotIn(List<Long> values) {
            addCriterion("reply_media_id not in", values, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdBetween(Long value1, Long value2) {
            addCriterion("reply_media_id between", value1, value2, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andReplyMediaIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_media_id not between", value1, value2, "replyMediaId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdIsNull() {
            addCriterion("origin_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdIsNotNull() {
            addCriterion("origin_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdEqualTo(Long value) {
            addCriterion("origin_msg_id =", value, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdNotEqualTo(Long value) {
            addCriterion("origin_msg_id <>", value, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdGreaterThan(Long value) {
            addCriterion("origin_msg_id >", value, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("origin_msg_id >=", value, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdLessThan(Long value) {
            addCriterion("origin_msg_id <", value, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("origin_msg_id <=", value, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdIn(List<Long> values) {
            addCriterion("origin_msg_id in", values, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdNotIn(List<Long> values) {
            addCriterion("origin_msg_id not in", values, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdBetween(Long value1, Long value2) {
            addCriterion("origin_msg_id between", value1, value2, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andOriginMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("origin_msg_id not between", value1, value2, "originMsgId");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
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