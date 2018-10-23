package com.yczd.api.aio.good.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodCriteria() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("good_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("good_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(BigDecimal value) {
            addCriterion("good_price =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_price <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(BigDecimal value) {
            addCriterion("good_price >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_price >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(BigDecimal value) {
            addCriterion("good_price <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_price <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<BigDecimal> values) {
            addCriterion("good_price in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_price not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_price between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_price not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlIsNull() {
            addCriterion("good_main_url is null");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlIsNotNull() {
            addCriterion("good_main_url is not null");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlEqualTo(String value) {
            addCriterion("good_main_url =", value, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlNotEqualTo(String value) {
            addCriterion("good_main_url <>", value, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlGreaterThan(String value) {
            addCriterion("good_main_url >", value, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlGreaterThanOrEqualTo(String value) {
            addCriterion("good_main_url >=", value, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlLessThan(String value) {
            addCriterion("good_main_url <", value, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlLessThanOrEqualTo(String value) {
            addCriterion("good_main_url <=", value, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlLike(String value) {
            addCriterion("good_main_url like", value, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlNotLike(String value) {
            addCriterion("good_main_url not like", value, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlIn(List<String> values) {
            addCriterion("good_main_url in", values, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlNotIn(List<String> values) {
            addCriterion("good_main_url not in", values, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlBetween(String value1, String value2) {
            addCriterion("good_main_url between", value1, value2, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlNotBetween(String value1, String value2) {
            addCriterion("good_main_url not between", value1, value2, "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsIsNull() {
            addCriterion("good_detail_urls is null");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsIsNotNull() {
            addCriterion("good_detail_urls is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsEqualTo(String value) {
            addCriterion("good_detail_urls =", value, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsNotEqualTo(String value) {
            addCriterion("good_detail_urls <>", value, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsGreaterThan(String value) {
            addCriterion("good_detail_urls >", value, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("good_detail_urls >=", value, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsLessThan(String value) {
            addCriterion("good_detail_urls <", value, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsLessThanOrEqualTo(String value) {
            addCriterion("good_detail_urls <=", value, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsLike(String value) {
            addCriterion("good_detail_urls like", value, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsNotLike(String value) {
            addCriterion("good_detail_urls not like", value, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsIn(List<String> values) {
            addCriterion("good_detail_urls in", values, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsNotIn(List<String> values) {
            addCriterion("good_detail_urls not in", values, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsBetween(String value1, String value2) {
            addCriterion("good_detail_urls between", value1, value2, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsNotBetween(String value1, String value2) {
            addCriterion("good_detail_urls not between", value1, value2, "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNull() {
            addCriterion("good_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNotNull() {
            addCriterion("good_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeEqualTo(String value) {
            addCriterion("good_type =", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotEqualTo(String value) {
            addCriterion("good_type <>", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThan(String value) {
            addCriterion("good_type >", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("good_type >=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThan(String value) {
            addCriterion("good_type <", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThanOrEqualTo(String value) {
            addCriterion("good_type <=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLike(String value) {
            addCriterion("good_type like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotLike(String value) {
            addCriterion("good_type not like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIn(List<String> values) {
            addCriterion("good_type in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotIn(List<String> values) {
            addCriterion("good_type not in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeBetween(String value1, String value2) {
            addCriterion("good_type between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotBetween(String value1, String value2) {
            addCriterion("good_type not between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodNameLikeInsensitive(String value) {
            addCriterion("upper(good_name) like", value.toUpperCase(), "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodMainUrlLikeInsensitive(String value) {
            addCriterion("upper(good_main_url) like", value.toUpperCase(), "goodMainUrl");
            return (Criteria) this;
        }

        public Criteria andGoodDetailUrlsLikeInsensitive(String value) {
            addCriterion("upper(good_detail_urls) like", value.toUpperCase(), "goodDetailUrls");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLikeInsensitive(String value) {
            addCriterion("upper(good_type) like", value.toUpperCase(), "goodType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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
