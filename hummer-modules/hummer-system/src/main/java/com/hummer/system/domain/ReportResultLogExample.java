package com.hummer.system.domain;

import java.util.ArrayList;
import java.util.List;

public class ReportResultLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public ReportResultLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
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
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
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

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(String value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(String value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(String value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(String value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(String value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLike(String value) {
            addCriterion("result_id like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotLike(String value) {
            addCriterion("result_id not like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<String> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<String> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(String value1, String value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(String value1, String value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
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

        public Criteria andDownloadNumberIsNull() {
            addCriterion("download_number is null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberIsNotNull() {
            addCriterion("download_number is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberEqualTo(Long value) {
            addCriterion("download_number =", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberNotEqualTo(Long value) {
            addCriterion("download_number <>", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberGreaterThan(Long value) {
            addCriterion("download_number >", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("download_number >=", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberLessThan(Long value) {
            addCriterion("download_number <", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberLessThanOrEqualTo(Long value) {
            addCriterion("download_number <=", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberIn(List<Long> values) {
            addCriterion("download_number in", values, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberNotIn(List<Long> values) {
            addCriterion("download_number not in", values, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberBetween(Long value1, Long value2) {
            addCriterion("download_number between", value1, value2, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberNotBetween(Long value1, Long value2) {
            addCriterion("download_number not between", value1, value2, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andPdfPathIsNull() {
            addCriterion("pdf_path is null");
            return (Criteria) this;
        }

        public Criteria andPdfPathIsNotNull() {
            addCriterion("pdf_path is not null");
            return (Criteria) this;
        }

        public Criteria andPdfPathEqualTo(String value) {
            addCriterion("pdf_path =", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotEqualTo(String value) {
            addCriterion("pdf_path <>", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathGreaterThan(String value) {
            addCriterion("pdf_path >", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_path >=", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLessThan(String value) {
            addCriterion("pdf_path <", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLessThanOrEqualTo(String value) {
            addCriterion("pdf_path <=", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLike(String value) {
            addCriterion("pdf_path like", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotLike(String value) {
            addCriterion("pdf_path not like", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathIn(List<String> values) {
            addCriterion("pdf_path in", values, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotIn(List<String> values) {
            addCriterion("pdf_path not in", values, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathBetween(String value1, String value2) {
            addCriterion("pdf_path between", value1, value2, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotBetween(String value1, String value2) {
            addCriterion("pdf_path not between", value1, value2, "pdfPath");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report_result_log
     *
     * @mbg.generated do_not_delete_during_merge Mon May 15 07:46:00 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report_result_log
     *
     * @mbg.generated Mon May 15 07:46:00 CST 2023
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