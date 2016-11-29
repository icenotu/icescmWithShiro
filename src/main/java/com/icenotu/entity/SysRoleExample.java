package com.icenotu.entity;

import java.util.ArrayList;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andRlIdIsNull() {
            addCriterion("rl_id is null");
            return (Criteria) this;
        }

        public Criteria andRlIdIsNotNull() {
            addCriterion("rl_id is not null");
            return (Criteria) this;
        }

        public Criteria andRlIdEqualTo(String value) {
            addCriterion("rl_id =", value, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdNotEqualTo(String value) {
            addCriterion("rl_id <>", value, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdGreaterThan(String value) {
            addCriterion("rl_id >", value, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdGreaterThanOrEqualTo(String value) {
            addCriterion("rl_id >=", value, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdLessThan(String value) {
            addCriterion("rl_id <", value, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdLessThanOrEqualTo(String value) {
            addCriterion("rl_id <=", value, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdLike(String value) {
            addCriterion("rl_id like", value, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdNotLike(String value) {
            addCriterion("rl_id not like", value, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdIn(List<String> values) {
            addCriterion("rl_id in", values, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdNotIn(List<String> values) {
            addCriterion("rl_id not in", values, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdBetween(String value1, String value2) {
            addCriterion("rl_id between", value1, value2, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlIdNotBetween(String value1, String value2) {
            addCriterion("rl_id not between", value1, value2, "rlId");
            return (Criteria) this;
        }

        public Criteria andRlNameIsNull() {
            addCriterion("rl_name is null");
            return (Criteria) this;
        }

        public Criteria andRlNameIsNotNull() {
            addCriterion("rl_name is not null");
            return (Criteria) this;
        }

        public Criteria andRlNameEqualTo(String value) {
            addCriterion("rl_name =", value, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameNotEqualTo(String value) {
            addCriterion("rl_name <>", value, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameGreaterThan(String value) {
            addCriterion("rl_name >", value, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameGreaterThanOrEqualTo(String value) {
            addCriterion("rl_name >=", value, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameLessThan(String value) {
            addCriterion("rl_name <", value, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameLessThanOrEqualTo(String value) {
            addCriterion("rl_name <=", value, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameLike(String value) {
            addCriterion("rl_name like", value, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameNotLike(String value) {
            addCriterion("rl_name not like", value, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameIn(List<String> values) {
            addCriterion("rl_name in", values, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameNotIn(List<String> values) {
            addCriterion("rl_name not in", values, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameBetween(String value1, String value2) {
            addCriterion("rl_name between", value1, value2, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlNameNotBetween(String value1, String value2) {
            addCriterion("rl_name not between", value1, value2, "rlName");
            return (Criteria) this;
        }

        public Criteria andRlStatusIsNull() {
            addCriterion("rl_status is null");
            return (Criteria) this;
        }

        public Criteria andRlStatusIsNotNull() {
            addCriterion("rl_status is not null");
            return (Criteria) this;
        }

        public Criteria andRlStatusEqualTo(Boolean value) {
            addCriterion("rl_status =", value, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusNotEqualTo(Boolean value) {
            addCriterion("rl_status <>", value, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusGreaterThan(Boolean value) {
            addCriterion("rl_status >", value, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rl_status >=", value, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusLessThan(Boolean value) {
            addCriterion("rl_status <", value, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("rl_status <=", value, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusIn(List<Boolean> values) {
            addCriterion("rl_status in", values, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusNotIn(List<Boolean> values) {
            addCriterion("rl_status not in", values, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("rl_status between", value1, value2, "rlStatus");
            return (Criteria) this;
        }

        public Criteria andRlStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rl_status not between", value1, value2, "rlStatus");
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