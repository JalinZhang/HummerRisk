package com.hummer.common.core.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CodeExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public CodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
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
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPluginIconIsNull() {
            addCriterion("plugin_icon is null");
            return (Criteria) this;
        }

        public Criteria andPluginIconIsNotNull() {
            addCriterion("plugin_icon is not null");
            return (Criteria) this;
        }

        public Criteria andPluginIconEqualTo(String value) {
            addCriterion("plugin_icon =", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconNotEqualTo(String value) {
            addCriterion("plugin_icon <>", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconGreaterThan(String value) {
            addCriterion("plugin_icon >", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconGreaterThanOrEqualTo(String value) {
            addCriterion("plugin_icon >=", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconLessThan(String value) {
            addCriterion("plugin_icon <", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconLessThanOrEqualTo(String value) {
            addCriterion("plugin_icon <=", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconLike(String value) {
            addCriterion("plugin_icon like", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconNotLike(String value) {
            addCriterion("plugin_icon not like", value, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconIn(List<String> values) {
            addCriterion("plugin_icon in", values, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconNotIn(List<String> values) {
            addCriterion("plugin_icon not in", values, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconBetween(String value1, String value2) {
            addCriterion("plugin_icon between", value1, value2, "pluginIcon");
            return (Criteria) this;
        }

        public Criteria andPluginIconNotBetween(String value1, String value2) {
            addCriterion("plugin_icon not between", value1, value2, "pluginIcon");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andProxyIdIsNull() {
            addCriterion("proxy_id is null");
            return (Criteria) this;
        }

        public Criteria andProxyIdIsNotNull() {
            addCriterion("proxy_id is not null");
            return (Criteria) this;
        }

        public Criteria andProxyIdEqualTo(Integer value) {
            addCriterion("proxy_id =", value, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdNotEqualTo(Integer value) {
            addCriterion("proxy_id <>", value, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdGreaterThan(Integer value) {
            addCriterion("proxy_id >", value, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proxy_id >=", value, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdLessThan(Integer value) {
            addCriterion("proxy_id <", value, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdLessThanOrEqualTo(Integer value) {
            addCriterion("proxy_id <=", value, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdIn(List<Integer> values) {
            addCriterion("proxy_id in", values, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdNotIn(List<Integer> values) {
            addCriterion("proxy_id not in", values, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdBetween(Integer value1, Integer value2) {
            addCriterion("proxy_id between", value1, value2, "proxyId");
            return (Criteria) this;
        }

        public Criteria andProxyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proxy_id not between", value1, value2, "proxyId");
            return (Criteria) this;
        }

        public Criteria andSbomIdIsNull() {
            addCriterion("sbom_id is null");
            return (Criteria) this;
        }

        public Criteria andSbomIdIsNotNull() {
            addCriterion("sbom_id is not null");
            return (Criteria) this;
        }

        public Criteria andSbomIdEqualTo(String value) {
            addCriterion("sbom_id =", value, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdNotEqualTo(String value) {
            addCriterion("sbom_id <>", value, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdGreaterThan(String value) {
            addCriterion("sbom_id >", value, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdGreaterThanOrEqualTo(String value) {
            addCriterion("sbom_id >=", value, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdLessThan(String value) {
            addCriterion("sbom_id <", value, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdLessThanOrEqualTo(String value) {
            addCriterion("sbom_id <=", value, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdLike(String value) {
            addCriterion("sbom_id like", value, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdNotLike(String value) {
            addCriterion("sbom_id not like", value, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdIn(List<String> values) {
            addCriterion("sbom_id in", values, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdNotIn(List<String> values) {
            addCriterion("sbom_id not in", values, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdBetween(String value1, String value2) {
            addCriterion("sbom_id between", value1, value2, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomIdNotBetween(String value1, String value2) {
            addCriterion("sbom_id not between", value1, value2, "sbomId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdIsNull() {
            addCriterion("sbom_version_id is null");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdIsNotNull() {
            addCriterion("sbom_version_id is not null");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdEqualTo(String value) {
            addCriterion("sbom_version_id =", value, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdNotEqualTo(String value) {
            addCriterion("sbom_version_id <>", value, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdGreaterThan(String value) {
            addCriterion("sbom_version_id >", value, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdGreaterThanOrEqualTo(String value) {
            addCriterion("sbom_version_id >=", value, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdLessThan(String value) {
            addCriterion("sbom_version_id <", value, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdLessThanOrEqualTo(String value) {
            addCriterion("sbom_version_id <=", value, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdLike(String value) {
            addCriterion("sbom_version_id like", value, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdNotLike(String value) {
            addCriterion("sbom_version_id not like", value, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdIn(List<String> values) {
            addCriterion("sbom_version_id in", values, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdNotIn(List<String> values) {
            addCriterion("sbom_version_id not in", values, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdBetween(String value1, String value2) {
            addCriterion("sbom_version_id between", value1, value2, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andSbomVersionIdNotBetween(String value1, String value2) {
            addCriterion("sbom_version_id not between", value1, value2, "sbomVersionId");
            return (Criteria) this;
        }

        public Criteria andServertyIsNull() {
            addCriterion("serverty is null");
            return (Criteria) this;
        }

        public Criteria andServertyIsNotNull() {
            addCriterion("serverty is not null");
            return (Criteria) this;
        }

        public Criteria andServertyEqualTo(String value) {
            addCriterion("serverty =", value, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyNotEqualTo(String value) {
            addCriterion("serverty <>", value, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyGreaterThan(String value) {
            addCriterion("serverty >", value, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyGreaterThanOrEqualTo(String value) {
            addCriterion("serverty >=", value, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyLessThan(String value) {
            addCriterion("serverty <", value, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyLessThanOrEqualTo(String value) {
            addCriterion("serverty <=", value, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyLike(String value) {
            addCriterion("serverty like", value, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyNotLike(String value) {
            addCriterion("serverty not like", value, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyIn(List<String> values) {
            addCriterion("serverty in", values, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyNotIn(List<String> values) {
            addCriterion("serverty not in", values, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyBetween(String value1, String value2) {
            addCriterion("serverty between", value1, value2, "serverty");
            return (Criteria) this;
        }

        public Criteria andServertyNotBetween(String value1, String value2) {
            addCriterion("serverty not between", value1, value2, "serverty");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table code
     *
     * @mbg.generated do_not_delete_during_merge Tue Sep 20 14:51:24 CST 2022
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table code
     *
     * @mbg.generated Tue Sep 20 14:51:24 CST 2022
     */
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
