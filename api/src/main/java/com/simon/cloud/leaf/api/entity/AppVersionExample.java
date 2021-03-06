package com.simon.cloud.leaf.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppVersionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public AppVersionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
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

        public Criteria andVersionKeyIsNull() {
            addCriterion("version_key is null");
            return (Criteria) this;
        }

        public Criteria andVersionKeyIsNotNull() {
            addCriterion("version_key is not null");
            return (Criteria) this;
        }

        public Criteria andVersionKeyEqualTo(String value) {
            addCriterion("version_key =", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyNotEqualTo(String value) {
            addCriterion("version_key <>", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyGreaterThan(String value) {
            addCriterion("version_key >", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("version_key >=", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyLessThan(String value) {
            addCriterion("version_key <", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyLessThanOrEqualTo(String value) {
            addCriterion("version_key <=", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyLike(String value) {
            addCriterion("version_key like", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyNotLike(String value) {
            addCriterion("version_key not like", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyIn(List<String> values) {
            addCriterion("version_key in", values, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyNotIn(List<String> values) {
            addCriterion("version_key not in", values, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyBetween(String value1, String value2) {
            addCriterion("version_key between", value1, value2, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyNotBetween(String value1, String value2) {
            addCriterion("version_key not between", value1, value2, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionValueIsNull() {
            addCriterion("version_value is null");
            return (Criteria) this;
        }

        public Criteria andVersionValueIsNotNull() {
            addCriterion("version_value is not null");
            return (Criteria) this;
        }

        public Criteria andVersionValueEqualTo(String value) {
            addCriterion("version_value =", value, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueNotEqualTo(String value) {
            addCriterion("version_value <>", value, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueGreaterThan(String value) {
            addCriterion("version_value >", value, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueGreaterThanOrEqualTo(String value) {
            addCriterion("version_value >=", value, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueLessThan(String value) {
            addCriterion("version_value <", value, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueLessThanOrEqualTo(String value) {
            addCriterion("version_value <=", value, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueLike(String value) {
            addCriterion("version_value like", value, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueNotLike(String value) {
            addCriterion("version_value not like", value, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueIn(List<String> values) {
            addCriterion("version_value in", values, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueNotIn(List<String> values) {
            addCriterion("version_value not in", values, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueBetween(String value1, String value2) {
            addCriterion("version_value between", value1, value2, "versionValue");
            return (Criteria) this;
        }

        public Criteria andVersionValueNotBetween(String value1, String value2) {
            addCriterion("version_value not between", value1, value2, "versionValue");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNull() {
            addCriterion("key_id is null");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNotNull() {
            addCriterion("key_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeyIdEqualTo(Long value) {
            addCriterion("key_id =", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotEqualTo(Long value) {
            addCriterion("key_id <>", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThan(Long value) {
            addCriterion("key_id >", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("key_id >=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThan(Long value) {
            addCriterion("key_id <", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThanOrEqualTo(Long value) {
            addCriterion("key_id <=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdIn(List<Long> values) {
            addCriterion("key_id in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotIn(List<Long> values) {
            addCriterion("key_id not in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdBetween(Long value1, Long value2) {
            addCriterion("key_id between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotBetween(Long value1, Long value2) {
            addCriterion("key_id not between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyLevelIsNull() {
            addCriterion("key_level is null");
            return (Criteria) this;
        }

        public Criteria andKeyLevelIsNotNull() {
            addCriterion("key_level is not null");
            return (Criteria) this;
        }

        public Criteria andKeyLevelEqualTo(Integer value) {
            addCriterion("key_level =", value, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelNotEqualTo(Integer value) {
            addCriterion("key_level <>", value, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelGreaterThan(Integer value) {
            addCriterion("key_level >", value, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("key_level >=", value, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelLessThan(Integer value) {
            addCriterion("key_level <", value, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelLessThanOrEqualTo(Integer value) {
            addCriterion("key_level <=", value, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelIn(List<Integer> values) {
            addCriterion("key_level in", values, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelNotIn(List<Integer> values) {
            addCriterion("key_level not in", values, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelBetween(Integer value1, Integer value2) {
            addCriterion("key_level between", value1, value2, "keyLevel");
            return (Criteria) this;
        }

        public Criteria andKeyLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("key_level not between", value1, value2, "keyLevel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table app_version
     *
     * @mbg.generated do_not_delete_during_merge Thu Apr 18 10:41:34 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table app_version
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
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