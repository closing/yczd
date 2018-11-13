package com.yczd.api.aio.shop.model.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(String value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(String value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(String value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(String value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(String value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(String value) {
            addCriterion("county_id like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(String value) {
            addCriterion("county_id not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<String> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<String> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(String value1, String value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(String value1, String value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNull() {
            addCriterion("county_name is null");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNotNull() {
            addCriterion("county_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountyNameEqualTo(String value) {
            addCriterion("county_name =", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotEqualTo(String value) {
            addCriterion("county_name <>", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThan(String value) {
            addCriterion("county_name >", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThanOrEqualTo(String value) {
            addCriterion("county_name >=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThan(String value) {
            addCriterion("county_name <", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThanOrEqualTo(String value) {
            addCriterion("county_name <=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLike(String value) {
            addCriterion("county_name like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotLike(String value) {
            addCriterion("county_name not like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameIn(List<String> values) {
            addCriterion("county_name in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotIn(List<String> values) {
            addCriterion("county_name not in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameBetween(String value1, String value2) {
            addCriterion("county_name between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotBetween(String value1, String value2) {
            addCriterion("county_name not between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNull() {
            addCriterion("street_id is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNotNull() {
            addCriterion("street_id is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdEqualTo(String value) {
            addCriterion("street_id =", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotEqualTo(String value) {
            addCriterion("street_id <>", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThan(String value) {
            addCriterion("street_id >", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThanOrEqualTo(String value) {
            addCriterion("street_id >=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThan(String value) {
            addCriterion("street_id <", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThanOrEqualTo(String value) {
            addCriterion("street_id <=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLike(String value) {
            addCriterion("street_id like", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotLike(String value) {
            addCriterion("street_id not like", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIn(List<String> values) {
            addCriterion("street_id in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotIn(List<String> values) {
            addCriterion("street_id not in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdBetween(String value1, String value2) {
            addCriterion("street_id between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotBetween(String value1, String value2) {
            addCriterion("street_id not between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNull() {
            addCriterion("street_name is null");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNotNull() {
            addCriterion("street_name is not null");
            return (Criteria) this;
        }

        public Criteria andStreetNameEqualTo(String value) {
            addCriterion("street_name =", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotEqualTo(String value) {
            addCriterion("street_name <>", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThan(String value) {
            addCriterion("street_name >", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThanOrEqualTo(String value) {
            addCriterion("street_name >=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThan(String value) {
            addCriterion("street_name <", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThanOrEqualTo(String value) {
            addCriterion("street_name <=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLike(String value) {
            addCriterion("street_name like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotLike(String value) {
            addCriterion("street_name not like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameIn(List<String> values) {
            addCriterion("street_name in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotIn(List<String> values) {
            addCriterion("street_name not in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameBetween(String value1, String value2) {
            addCriterion("street_name between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotBetween(String value1, String value2) {
            addCriterion("street_name not between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSsIdIsNull() {
            addCriterion("ss_id is null");
            return (Criteria) this;
        }

        public Criteria andSsIdIsNotNull() {
            addCriterion("ss_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsIdEqualTo(String value) {
            addCriterion("ss_id =", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotEqualTo(String value) {
            addCriterion("ss_id <>", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThan(String value) {
            addCriterion("ss_id >", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ss_id >=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThan(String value) {
            addCriterion("ss_id <", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThanOrEqualTo(String value) {
            addCriterion("ss_id <=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLike(String value) {
            addCriterion("ss_id like", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotLike(String value) {
            addCriterion("ss_id not like", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdIn(List<String> values) {
            addCriterion("ss_id in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotIn(List<String> values) {
            addCriterion("ss_id not in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdBetween(String value1, String value2) {
            addCriterion("ss_id between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotBetween(String value1, String value2) {
            addCriterion("ss_id not between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andMapxIsNull() {
            addCriterion("mapx is null");
            return (Criteria) this;
        }

        public Criteria andMapxIsNotNull() {
            addCriterion("mapx is not null");
            return (Criteria) this;
        }

        public Criteria andMapxEqualTo(Double value) {
            addCriterion("mapx =", value, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxNotEqualTo(Double value) {
            addCriterion("mapx <>", value, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxGreaterThan(Double value) {
            addCriterion("mapx >", value, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxGreaterThanOrEqualTo(Double value) {
            addCriterion("mapx >=", value, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxLessThan(Double value) {
            addCriterion("mapx <", value, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxLessThanOrEqualTo(Double value) {
            addCriterion("mapx <=", value, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxIn(List<Double> values) {
            addCriterion("mapx in", values, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxNotIn(List<Double> values) {
            addCriterion("mapx not in", values, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxBetween(Double value1, Double value2) {
            addCriterion("mapx between", value1, value2, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapxNotBetween(Double value1, Double value2) {
            addCriterion("mapx not between", value1, value2, "mapx");
            return (Criteria) this;
        }

        public Criteria andMapyIsNull() {
            addCriterion("mapy is null");
            return (Criteria) this;
        }

        public Criteria andMapyIsNotNull() {
            addCriterion("mapy is not null");
            return (Criteria) this;
        }

        public Criteria andMapyEqualTo(Double value) {
            addCriterion("mapy =", value, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyNotEqualTo(Double value) {
            addCriterion("mapy <>", value, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyGreaterThan(Double value) {
            addCriterion("mapy >", value, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyGreaterThanOrEqualTo(Double value) {
            addCriterion("mapy >=", value, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyLessThan(Double value) {
            addCriterion("mapy <", value, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyLessThanOrEqualTo(Double value) {
            addCriterion("mapy <=", value, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyIn(List<Double> values) {
            addCriterion("mapy in", values, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyNotIn(List<Double> values) {
            addCriterion("mapy not in", values, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyBetween(Double value1, Double value2) {
            addCriterion("mapy between", value1, value2, "mapy");
            return (Criteria) this;
        }

        public Criteria andMapyNotBetween(Double value1, Double value2) {
            addCriterion("mapy not between", value1, value2, "mapy");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameIsNull() {
            addCriterion("shopkeeper_name is null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameIsNotNull() {
            addCriterion("shopkeeper_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameEqualTo(String value) {
            addCriterion("shopkeeper_name =", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameNotEqualTo(String value) {
            addCriterion("shopkeeper_name <>", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameGreaterThan(String value) {
            addCriterion("shopkeeper_name >", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameGreaterThanOrEqualTo(String value) {
            addCriterion("shopkeeper_name >=", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameLessThan(String value) {
            addCriterion("shopkeeper_name <", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameLessThanOrEqualTo(String value) {
            addCriterion("shopkeeper_name <=", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameLike(String value) {
            addCriterion("shopkeeper_name like", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameNotLike(String value) {
            addCriterion("shopkeeper_name not like", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameIn(List<String> values) {
            addCriterion("shopkeeper_name in", values, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameNotIn(List<String> values) {
            addCriterion("shopkeeper_name not in", values, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameBetween(String value1, String value2) {
            addCriterion("shopkeeper_name between", value1, value2, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameNotBetween(String value1, String value2) {
            addCriterion("shopkeeper_name not between", value1, value2, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconIsNull() {
            addCriterion("shopkeeper_icon is null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconIsNotNull() {
            addCriterion("shopkeeper_icon is not null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconEqualTo(String value) {
            addCriterion("shopkeeper_icon =", value, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconNotEqualTo(String value) {
            addCriterion("shopkeeper_icon <>", value, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconGreaterThan(String value) {
            addCriterion("shopkeeper_icon >", value, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconGreaterThanOrEqualTo(String value) {
            addCriterion("shopkeeper_icon >=", value, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconLessThan(String value) {
            addCriterion("shopkeeper_icon <", value, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconLessThanOrEqualTo(String value) {
            addCriterion("shopkeeper_icon <=", value, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconLike(String value) {
            addCriterion("shopkeeper_icon like", value, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconNotLike(String value) {
            addCriterion("shopkeeper_icon not like", value, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconIn(List<String> values) {
            addCriterion("shopkeeper_icon in", values, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconNotIn(List<String> values) {
            addCriterion("shopkeeper_icon not in", values, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconBetween(String value1, String value2) {
            addCriterion("shopkeeper_icon between", value1, value2, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconNotBetween(String value1, String value2) {
            addCriterion("shopkeeper_icon not between", value1, value2, "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveIsNull() {
            addCriterion("business_license_positive is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveIsNotNull() {
            addCriterion("business_license_positive is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveEqualTo(String value) {
            addCriterion("business_license_positive =", value, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveNotEqualTo(String value) {
            addCriterion("business_license_positive <>", value, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveGreaterThan(String value) {
            addCriterion("business_license_positive >", value, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_positive >=", value, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveLessThan(String value) {
            addCriterion("business_license_positive <", value, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveLessThanOrEqualTo(String value) {
            addCriterion("business_license_positive <=", value, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveLike(String value) {
            addCriterion("business_license_positive like", value, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveNotLike(String value) {
            addCriterion("business_license_positive not like", value, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveIn(List<String> values) {
            addCriterion("business_license_positive in", values, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveNotIn(List<String> values) {
            addCriterion("business_license_positive not in", values, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveBetween(String value1, String value2) {
            addCriterion("business_license_positive between", value1, value2, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveNotBetween(String value1, String value2) {
            addCriterion("business_license_positive not between", value1, value2, "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideIsNull() {
            addCriterion("business_license_side is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideIsNotNull() {
            addCriterion("business_license_side is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideEqualTo(String value) {
            addCriterion("business_license_side =", value, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideNotEqualTo(String value) {
            addCriterion("business_license_side <>", value, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideGreaterThan(String value) {
            addCriterion("business_license_side >", value, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_side >=", value, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideLessThan(String value) {
            addCriterion("business_license_side <", value, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideLessThanOrEqualTo(String value) {
            addCriterion("business_license_side <=", value, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideLike(String value) {
            addCriterion("business_license_side like", value, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideNotLike(String value) {
            addCriterion("business_license_side not like", value, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideIn(List<String> values) {
            addCriterion("business_license_side in", values, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideNotIn(List<String> values) {
            addCriterion("business_license_side not in", values, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideBetween(String value1, String value2) {
            addCriterion("business_license_side between", value1, value2, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideNotBetween(String value1, String value2) {
            addCriterion("business_license_side not between", value1, value2, "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNull() {
            addCriterion("users_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(String value) {
            addCriterion("users_id =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(String value) {
            addCriterion("users_id <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(String value) {
            addCriterion("users_id >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(String value) {
            addCriterion("users_id >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(String value) {
            addCriterion("users_id <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(String value) {
            addCriterion("users_id <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLike(String value) {
            addCriterion("users_id like", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotLike(String value) {
            addCriterion("users_id not like", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<String> values) {
            addCriterion("users_id in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<String> values) {
            addCriterion("users_id not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(String value1, String value2) {
            addCriterion("users_id between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(String value1, String value2) {
            addCriterion("users_id not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCusTelIsNull() {
            addCriterion("cus_tel is null");
            return (Criteria) this;
        }

        public Criteria andCusTelIsNotNull() {
            addCriterion("cus_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCusTelEqualTo(String value) {
            addCriterion("cus_tel =", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotEqualTo(String value) {
            addCriterion("cus_tel <>", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelGreaterThan(String value) {
            addCriterion("cus_tel >", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelGreaterThanOrEqualTo(String value) {
            addCriterion("cus_tel >=", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLessThan(String value) {
            addCriterion("cus_tel <", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLessThanOrEqualTo(String value) {
            addCriterion("cus_tel <=", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLike(String value) {
            addCriterion("cus_tel like", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotLike(String value) {
            addCriterion("cus_tel not like", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelIn(List<String> values) {
            addCriterion("cus_tel in", values, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotIn(List<String> values) {
            addCriterion("cus_tel not in", values, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelBetween(String value1, String value2) {
            addCriterion("cus_tel between", value1, value2, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotBetween(String value1, String value2) {
            addCriterion("cus_tel not between", value1, value2, "cusTel");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusIsNull() {
            addCriterion("emergency_status is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusIsNotNull() {
            addCriterion("emergency_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusEqualTo(Integer value) {
            addCriterion("emergency_status =", value, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusNotEqualTo(Integer value) {
            addCriterion("emergency_status <>", value, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusGreaterThan(Integer value) {
            addCriterion("emergency_status >", value, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("emergency_status >=", value, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusLessThan(Integer value) {
            addCriterion("emergency_status <", value, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("emergency_status <=", value, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusIn(List<Integer> values) {
            addCriterion("emergency_status in", values, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusNotIn(List<Integer> values) {
            addCriterion("emergency_status not in", values, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusBetween(Integer value1, Integer value2) {
            addCriterion("emergency_status between", value1, value2, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andEmergencyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("emergency_status not between", value1, value2, "emergencyStatus");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNull() {
            addCriterion("sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNotNull() {
            addCriterion("sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualTo(Double value) {
            addCriterion("sales_volume =", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualTo(Double value) {
            addCriterion("sales_volume <>", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThan(Double value) {
            addCriterion("sales_volume >", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("sales_volume >=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThan(Double value) {
            addCriterion("sales_volume <", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualTo(Double value) {
            addCriterion("sales_volume <=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIn(List<Double> values) {
            addCriterion("sales_volume in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotIn(List<Double> values) {
            addCriterion("sales_volume not in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeBetween(Double value1, Double value2) {
            addCriterion("sales_volume between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotBetween(Double value1, Double value2) {
            addCriterion("sales_volume not between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCardNoFIsNull() {
            addCriterion("card_no_f is null");
            return (Criteria) this;
        }

        public Criteria andCardNoFIsNotNull() {
            addCriterion("card_no_f is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoFEqualTo(String value) {
            addCriterion("card_no_f =", value, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFNotEqualTo(String value) {
            addCriterion("card_no_f <>", value, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFGreaterThan(String value) {
            addCriterion("card_no_f >", value, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFGreaterThanOrEqualTo(String value) {
            addCriterion("card_no_f >=", value, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFLessThan(String value) {
            addCriterion("card_no_f <", value, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFLessThanOrEqualTo(String value) {
            addCriterion("card_no_f <=", value, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFLike(String value) {
            addCriterion("card_no_f like", value, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFNotLike(String value) {
            addCriterion("card_no_f not like", value, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFIn(List<String> values) {
            addCriterion("card_no_f in", values, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFNotIn(List<String> values) {
            addCriterion("card_no_f not in", values, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFBetween(String value1, String value2) {
            addCriterion("card_no_f between", value1, value2, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andCardNoFNotBetween(String value1, String value2) {
            addCriterion("card_no_f not between", value1, value2, "cardNoF");
            return (Criteria) this;
        }

        public Criteria andBankUrlIsNull() {
            addCriterion("bank_url is null");
            return (Criteria) this;
        }

        public Criteria andBankUrlIsNotNull() {
            addCriterion("bank_url is not null");
            return (Criteria) this;
        }

        public Criteria andBankUrlEqualTo(String value) {
            addCriterion("bank_url =", value, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlNotEqualTo(String value) {
            addCriterion("bank_url <>", value, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlGreaterThan(String value) {
            addCriterion("bank_url >", value, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bank_url >=", value, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlLessThan(String value) {
            addCriterion("bank_url <", value, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlLessThanOrEqualTo(String value) {
            addCriterion("bank_url <=", value, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlLike(String value) {
            addCriterion("bank_url like", value, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlNotLike(String value) {
            addCriterion("bank_url not like", value, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlIn(List<String> values) {
            addCriterion("bank_url in", values, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlNotIn(List<String> values) {
            addCriterion("bank_url not in", values, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlBetween(String value1, String value2) {
            addCriterion("bank_url between", value1, value2, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andBankUrlNotBetween(String value1, String value2) {
            addCriterion("bank_url not between", value1, value2, "bankUrl");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationIsNull() {
            addCriterion("taxpayer_qualification is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationIsNotNull() {
            addCriterion("taxpayer_qualification is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationEqualTo(String value) {
            addCriterion("taxpayer_qualification =", value, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationNotEqualTo(String value) {
            addCriterion("taxpayer_qualification <>", value, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationGreaterThan(String value) {
            addCriterion("taxpayer_qualification >", value, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_qualification >=", value, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationLessThan(String value) {
            addCriterion("taxpayer_qualification <", value, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_qualification <=", value, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationLike(String value) {
            addCriterion("taxpayer_qualification like", value, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationNotLike(String value) {
            addCriterion("taxpayer_qualification not like", value, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationIn(List<String> values) {
            addCriterion("taxpayer_qualification in", values, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationNotIn(List<String> values) {
            addCriterion("taxpayer_qualification not in", values, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationBetween(String value1, String value2) {
            addCriterion("taxpayer_qualification between", value1, value2, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationNotBetween(String value1, String value2) {
            addCriterion("taxpayer_qualification not between", value1, value2, "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationIsNull() {
            addCriterion("trademark_registration is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationIsNotNull() {
            addCriterion("trademark_registration is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationEqualTo(String value) {
            addCriterion("trademark_registration =", value, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationNotEqualTo(String value) {
            addCriterion("trademark_registration <>", value, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationGreaterThan(String value) {
            addCriterion("trademark_registration >", value, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("trademark_registration >=", value, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationLessThan(String value) {
            addCriterion("trademark_registration <", value, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationLessThanOrEqualTo(String value) {
            addCriterion("trademark_registration <=", value, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationLike(String value) {
            addCriterion("trademark_registration like", value, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationNotLike(String value) {
            addCriterion("trademark_registration not like", value, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationIn(List<String> values) {
            addCriterion("trademark_registration in", values, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationNotIn(List<String> values) {
            addCriterion("trademark_registration not in", values, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationBetween(String value1, String value2) {
            addCriterion("trademark_registration between", value1, value2, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationNotBetween(String value1, String value2) {
            addCriterion("trademark_registration not between", value1, value2, "trademarkRegistration");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLikeInsensitive(String value) {
            addCriterion("upper(province_id) like", value.toUpperCase(), "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdLikeInsensitive(String value) {
            addCriterion("upper(city_id) like", value.toUpperCase(), "cityId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLikeInsensitive(String value) {
            addCriterion("upper(county_id) like", value.toUpperCase(), "countyId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLikeInsensitive(String value) {
            addCriterion("upper(province_name) like", value.toUpperCase(), "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameLikeInsensitive(String value) {
            addCriterion("upper(city_name) like", value.toUpperCase(), "cityName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLikeInsensitive(String value) {
            addCriterion("upper(county_name) like", value.toUpperCase(), "countyName");
            return (Criteria) this;
        }

        public Criteria andStreetIdLikeInsensitive(String value) {
            addCriterion("upper(street_id) like", value.toUpperCase(), "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetNameLikeInsensitive(String value) {
            addCriterion("upper(street_name) like", value.toUpperCase(), "streetName");
            return (Criteria) this;
        }

        public Criteria andSsIdLikeInsensitive(String value) {
            addCriterion("upper(ss_id) like", value.toUpperCase(), "ssId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameLikeInsensitive(String value) {
            addCriterion("upper(shopkeeper_name) like", value.toUpperCase(), "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIconLikeInsensitive(String value) {
            addCriterion("upper(shopkeeper_icon) like", value.toUpperCase(), "shopkeeperIcon");
            return (Criteria) this;
        }

        public Criteria andShopAddressLikeInsensitive(String value) {
            addCriterion("upper(shop_address) like", value.toUpperCase(), "shopAddress");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andCardNoLikeInsensitive(String value) {
            addCriterion("upper(card_no) like", value.toUpperCase(), "cardNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePositiveLikeInsensitive(String value) {
            addCriterion("upper(business_license_positive) like", value.toUpperCase(), "businessLicensePositive");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseSideLikeInsensitive(String value) {
            addCriterion("upper(business_license_side) like", value.toUpperCase(), "businessLicenseSide");
            return (Criteria) this;
        }

        public Criteria andUsersIdLikeInsensitive(String value) {
            addCriterion("upper(users_id) like", value.toUpperCase(), "usersId");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLikeInsensitive(String value) {
            addCriterion("upper(createtime) like", value.toUpperCase(), "createtime");
            return (Criteria) this;
        }

        public Criteria andCusTelLikeInsensitive(String value) {
            addCriterion("upper(cus_tel) like", value.toUpperCase(), "cusTel");
            return (Criteria) this;
        }

        public Criteria andCardNoFLikeInsensitive(String value) {
            addCriterion("upper(card_no_f) like", value.toUpperCase(), "cardNoF");
            return (Criteria) this;
        }

        public Criteria andBankUrlLikeInsensitive(String value) {
            addCriterion("upper(bank_url) like", value.toUpperCase(), "bankUrl");
            return (Criteria) this;
        }

        public Criteria andTaxpayerQualificationLikeInsensitive(String value) {
            addCriterion("upper(taxpayer_qualification) like", value.toUpperCase(), "taxpayerQualification");
            return (Criteria) this;
        }

        public Criteria andTrademarkRegistrationLikeInsensitive(String value) {
            addCriterion("upper(trademark_registration) like", value.toUpperCase(), "trademarkRegistration");
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
