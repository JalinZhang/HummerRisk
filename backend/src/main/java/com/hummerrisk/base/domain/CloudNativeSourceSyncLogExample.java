package com.hummerrisk.base.domain;

import java.util.ArrayList;
import java.util.List;

public class CloudNativeSourceSyncLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public CloudNativeSourceSyncLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
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
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
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

        public Criteria andCloudNativeIdIsNull() {
            addCriterion("cloud_native_id is null");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdIsNotNull() {
            addCriterion("cloud_native_id is not null");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdEqualTo(String value) {
            addCriterion("cloud_native_id =", value, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdNotEqualTo(String value) {
            addCriterion("cloud_native_id <>", value, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdGreaterThan(String value) {
            addCriterion("cloud_native_id >", value, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdGreaterThanOrEqualTo(String value) {
            addCriterion("cloud_native_id >=", value, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdLessThan(String value) {
            addCriterion("cloud_native_id <", value, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdLessThanOrEqualTo(String value) {
            addCriterion("cloud_native_id <=", value, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdLike(String value) {
            addCriterion("cloud_native_id like", value, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdNotLike(String value) {
            addCriterion("cloud_native_id not like", value, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdIn(List<String> values) {
            addCriterion("cloud_native_id in", values, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdNotIn(List<String> values) {
            addCriterion("cloud_native_id not in", values, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdBetween(String value1, String value2) {
            addCriterion("cloud_native_id between", value1, value2, "cloudNativeId");
            return (Criteria) this;
        }

        public Criteria andCloudNativeIdNotBetween(String value1, String value2) {
            addCriterion("cloud_native_id not between", value1, value2, "cloudNativeId");
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

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("`operator` is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("`operator` is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("`operator` =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("`operator` <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("`operator` >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("`operator` >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("`operator` <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("`operator` <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("`operator` like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("`operator` not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("`operator` in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("`operator` not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("`operator` between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("`operator` not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("`sum` is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("`sum` is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Long value) {
            addCriterion("`sum` =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Long value) {
            addCriterion("`sum` <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Long value) {
            addCriterion("`sum` >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Long value) {
            addCriterion("`sum` >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Long value) {
            addCriterion("`sum` <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Long value) {
            addCriterion("`sum` <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Long> values) {
            addCriterion("`sum` in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Long> values) {
            addCriterion("`sum` not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Long value1, Long value2) {
            addCriterion("`sum` between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Long value1, Long value2) {
            addCriterion("`sum` not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("`result` is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("`result` is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Boolean value) {
            addCriterion("`result` =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Boolean value) {
            addCriterion("`result` <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Boolean value) {
            addCriterion("`result` >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`result` >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Boolean value) {
            addCriterion("`result` <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Boolean value) {
            addCriterion("`result` <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Boolean> values) {
            addCriterion("`result` in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Boolean> values) {
            addCriterion("`result` not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Boolean value1, Boolean value2) {
            addCriterion("`result` between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`result` not between", value1, value2, "result");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated do_not_delete_during_merge Sun Nov 13 00:23:30 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_native_source_sync_log
     *
     * @mbg.generated Sun Nov 13 00:23:30 CST 2022
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