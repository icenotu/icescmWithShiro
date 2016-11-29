package com.icenotu.entity;

import java.util.ArrayList;
import java.util.List;

public class SysPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPermissionExample() {
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

        public Criteria andPmIdIsNull() {
            addCriterion("pm_id is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("pm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(Long value) {
            addCriterion("pm_id =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(Long value) {
            addCriterion("pm_id <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(Long value) {
            addCriterion("pm_id >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pm_id >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(Long value) {
            addCriterion("pm_id <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(Long value) {
            addCriterion("pm_id <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<Long> values) {
            addCriterion("pm_id in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<Long> values) {
            addCriterion("pm_id not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(Long value1, Long value2) {
            addCriterion("pm_id between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(Long value1, Long value2) {
            addCriterion("pm_id not between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmNameIsNull() {
            addCriterion("pm_name is null");
            return (Criteria) this;
        }

        public Criteria andPmNameIsNotNull() {
            addCriterion("pm_name is not null");
            return (Criteria) this;
        }

        public Criteria andPmNameEqualTo(String value) {
            addCriterion("pm_name =", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameNotEqualTo(String value) {
            addCriterion("pm_name <>", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameGreaterThan(String value) {
            addCriterion("pm_name >", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameGreaterThanOrEqualTo(String value) {
            addCriterion("pm_name >=", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameLessThan(String value) {
            addCriterion("pm_name <", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameLessThanOrEqualTo(String value) {
            addCriterion("pm_name <=", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameLike(String value) {
            addCriterion("pm_name like", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameNotLike(String value) {
            addCriterion("pm_name not like", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameIn(List<String> values) {
            addCriterion("pm_name in", values, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameNotIn(List<String> values) {
            addCriterion("pm_name not in", values, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameBetween(String value1, String value2) {
            addCriterion("pm_name between", value1, value2, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameNotBetween(String value1, String value2) {
            addCriterion("pm_name not between", value1, value2, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmTypeIsNull() {
            addCriterion("pm_type is null");
            return (Criteria) this;
        }

        public Criteria andPmTypeIsNotNull() {
            addCriterion("pm_type is not null");
            return (Criteria) this;
        }

        public Criteria andPmTypeEqualTo(String value) {
            addCriterion("pm_type =", value, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeNotEqualTo(String value) {
            addCriterion("pm_type <>", value, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeGreaterThan(String value) {
            addCriterion("pm_type >", value, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pm_type >=", value, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeLessThan(String value) {
            addCriterion("pm_type <", value, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeLessThanOrEqualTo(String value) {
            addCriterion("pm_type <=", value, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeLike(String value) {
            addCriterion("pm_type like", value, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeNotLike(String value) {
            addCriterion("pm_type not like", value, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeIn(List<String> values) {
            addCriterion("pm_type in", values, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeNotIn(List<String> values) {
            addCriterion("pm_type not in", values, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeBetween(String value1, String value2) {
            addCriterion("pm_type between", value1, value2, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmTypeNotBetween(String value1, String value2) {
            addCriterion("pm_type not between", value1, value2, "pmType");
            return (Criteria) this;
        }

        public Criteria andPmUrlIsNull() {
            addCriterion("pm_url is null");
            return (Criteria) this;
        }

        public Criteria andPmUrlIsNotNull() {
            addCriterion("pm_url is not null");
            return (Criteria) this;
        }

        public Criteria andPmUrlEqualTo(String value) {
            addCriterion("pm_url =", value, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlNotEqualTo(String value) {
            addCriterion("pm_url <>", value, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlGreaterThan(String value) {
            addCriterion("pm_url >", value, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pm_url >=", value, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlLessThan(String value) {
            addCriterion("pm_url <", value, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlLessThanOrEqualTo(String value) {
            addCriterion("pm_url <=", value, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlLike(String value) {
            addCriterion("pm_url like", value, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlNotLike(String value) {
            addCriterion("pm_url not like", value, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlIn(List<String> values) {
            addCriterion("pm_url in", values, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlNotIn(List<String> values) {
            addCriterion("pm_url not in", values, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlBetween(String value1, String value2) {
            addCriterion("pm_url between", value1, value2, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmUrlNotBetween(String value1, String value2) {
            addCriterion("pm_url not between", value1, value2, "pmUrl");
            return (Criteria) this;
        }

        public Criteria andPmPercodeIsNull() {
            addCriterion("pm_percode is null");
            return (Criteria) this;
        }

        public Criteria andPmPercodeIsNotNull() {
            addCriterion("pm_percode is not null");
            return (Criteria) this;
        }

        public Criteria andPmPercodeEqualTo(String value) {
            addCriterion("pm_percode =", value, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeNotEqualTo(String value) {
            addCriterion("pm_percode <>", value, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeGreaterThan(String value) {
            addCriterion("pm_percode >", value, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeGreaterThanOrEqualTo(String value) {
            addCriterion("pm_percode >=", value, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeLessThan(String value) {
            addCriterion("pm_percode <", value, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeLessThanOrEqualTo(String value) {
            addCriterion("pm_percode <=", value, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeLike(String value) {
            addCriterion("pm_percode like", value, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeNotLike(String value) {
            addCriterion("pm_percode not like", value, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeIn(List<String> values) {
            addCriterion("pm_percode in", values, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeNotIn(List<String> values) {
            addCriterion("pm_percode not in", values, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeBetween(String value1, String value2) {
            addCriterion("pm_percode between", value1, value2, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmPercodeNotBetween(String value1, String value2) {
            addCriterion("pm_percode not between", value1, value2, "pmPercode");
            return (Criteria) this;
        }

        public Criteria andPmParentidIsNull() {
            addCriterion("pm_parentid is null");
            return (Criteria) this;
        }

        public Criteria andPmParentidIsNotNull() {
            addCriterion("pm_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andPmParentidEqualTo(Long value) {
            addCriterion("pm_parentid =", value, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidNotEqualTo(Long value) {
            addCriterion("pm_parentid <>", value, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidGreaterThan(Long value) {
            addCriterion("pm_parentid >", value, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("pm_parentid >=", value, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidLessThan(Long value) {
            addCriterion("pm_parentid <", value, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidLessThanOrEqualTo(Long value) {
            addCriterion("pm_parentid <=", value, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidIn(List<Long> values) {
            addCriterion("pm_parentid in", values, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidNotIn(List<Long> values) {
            addCriterion("pm_parentid not in", values, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidBetween(Long value1, Long value2) {
            addCriterion("pm_parentid between", value1, value2, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidNotBetween(Long value1, Long value2) {
            addCriterion("pm_parentid not between", value1, value2, "pmParentid");
            return (Criteria) this;
        }

        public Criteria andPmParentidsIsNull() {
            addCriterion("pm_parentids is null");
            return (Criteria) this;
        }

        public Criteria andPmParentidsIsNotNull() {
            addCriterion("pm_parentids is not null");
            return (Criteria) this;
        }

        public Criteria andPmParentidsEqualTo(String value) {
            addCriterion("pm_parentids =", value, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsNotEqualTo(String value) {
            addCriterion("pm_parentids <>", value, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsGreaterThan(String value) {
            addCriterion("pm_parentids >", value, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsGreaterThanOrEqualTo(String value) {
            addCriterion("pm_parentids >=", value, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsLessThan(String value) {
            addCriterion("pm_parentids <", value, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsLessThanOrEqualTo(String value) {
            addCriterion("pm_parentids <=", value, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsLike(String value) {
            addCriterion("pm_parentids like", value, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsNotLike(String value) {
            addCriterion("pm_parentids not like", value, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsIn(List<String> values) {
            addCriterion("pm_parentids in", values, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsNotIn(List<String> values) {
            addCriterion("pm_parentids not in", values, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsBetween(String value1, String value2) {
            addCriterion("pm_parentids between", value1, value2, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmParentidsNotBetween(String value1, String value2) {
            addCriterion("pm_parentids not between", value1, value2, "pmParentids");
            return (Criteria) this;
        }

        public Criteria andPmStatusIsNull() {
            addCriterion("pm_status is null");
            return (Criteria) this;
        }

        public Criteria andPmStatusIsNotNull() {
            addCriterion("pm_status is not null");
            return (Criteria) this;
        }

        public Criteria andPmStatusEqualTo(Boolean value) {
            addCriterion("pm_status =", value, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusNotEqualTo(Boolean value) {
            addCriterion("pm_status <>", value, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusGreaterThan(Boolean value) {
            addCriterion("pm_status >", value, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pm_status >=", value, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusLessThan(Boolean value) {
            addCriterion("pm_status <", value, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("pm_status <=", value, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusIn(List<Boolean> values) {
            addCriterion("pm_status in", values, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusNotIn(List<Boolean> values) {
            addCriterion("pm_status not in", values, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("pm_status between", value1, value2, "pmStatus");
            return (Criteria) this;
        }

        public Criteria andPmStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pm_status not between", value1, value2, "pmStatus");
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