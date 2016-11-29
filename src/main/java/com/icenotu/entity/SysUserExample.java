package com.icenotu.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUsIdIsNull() {
            addCriterion("us_id is null");
            return (Criteria) this;
        }

        public Criteria andUsIdIsNotNull() {
            addCriterion("us_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdEqualTo(String value) {
            addCriterion("us_id =", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotEqualTo(String value) {
            addCriterion("us_id <>", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThan(String value) {
            addCriterion("us_id >", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThanOrEqualTo(String value) {
            addCriterion("us_id >=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThan(String value) {
            addCriterion("us_id <", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThanOrEqualTo(String value) {
            addCriterion("us_id <=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLike(String value) {
            addCriterion("us_id like", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotLike(String value) {
            addCriterion("us_id not like", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdIn(List<String> values) {
            addCriterion("us_id in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotIn(List<String> values) {
            addCriterion("us_id not in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdBetween(String value1, String value2) {
            addCriterion("us_id between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotBetween(String value1, String value2) {
            addCriterion("us_id not between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsUsernameIsNull() {
            addCriterion("us_username is null");
            return (Criteria) this;
        }

        public Criteria andUsUsernameIsNotNull() {
            addCriterion("us_username is not null");
            return (Criteria) this;
        }

        public Criteria andUsUsernameEqualTo(String value) {
            addCriterion("us_username =", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotEqualTo(String value) {
            addCriterion("us_username <>", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameGreaterThan(String value) {
            addCriterion("us_username >", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("us_username >=", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLessThan(String value) {
            addCriterion("us_username <", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLessThanOrEqualTo(String value) {
            addCriterion("us_username <=", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLike(String value) {
            addCriterion("us_username like", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotLike(String value) {
            addCriterion("us_username not like", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameIn(List<String> values) {
            addCriterion("us_username in", values, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotIn(List<String> values) {
            addCriterion("us_username not in", values, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameBetween(String value1, String value2) {
            addCriterion("us_username between", value1, value2, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotBetween(String value1, String value2) {
            addCriterion("us_username not between", value1, value2, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIsNull() {
            addCriterion("us_password is null");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIsNotNull() {
            addCriterion("us_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsPasswordEqualTo(String value) {
            addCriterion("us_password =", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotEqualTo(String value) {
            addCriterion("us_password <>", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordGreaterThan(String value) {
            addCriterion("us_password >", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("us_password >=", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLessThan(String value) {
            addCriterion("us_password <", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLessThanOrEqualTo(String value) {
            addCriterion("us_password <=", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLike(String value) {
            addCriterion("us_password like", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotLike(String value) {
            addCriterion("us_password not like", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIn(List<String> values) {
            addCriterion("us_password in", values, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotIn(List<String> values) {
            addCriterion("us_password not in", values, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordBetween(String value1, String value2) {
            addCriterion("us_password between", value1, value2, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotBetween(String value1, String value2) {
            addCriterion("us_password not between", value1, value2, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsSaltIsNull() {
            addCriterion("us_salt is null");
            return (Criteria) this;
        }

        public Criteria andUsSaltIsNotNull() {
            addCriterion("us_salt is not null");
            return (Criteria) this;
        }

        public Criteria andUsSaltEqualTo(String value) {
            addCriterion("us_salt =", value, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltNotEqualTo(String value) {
            addCriterion("us_salt <>", value, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltGreaterThan(String value) {
            addCriterion("us_salt >", value, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltGreaterThanOrEqualTo(String value) {
            addCriterion("us_salt >=", value, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltLessThan(String value) {
            addCriterion("us_salt <", value, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltLessThanOrEqualTo(String value) {
            addCriterion("us_salt <=", value, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltLike(String value) {
            addCriterion("us_salt like", value, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltNotLike(String value) {
            addCriterion("us_salt not like", value, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltIn(List<String> values) {
            addCriterion("us_salt in", values, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltNotIn(List<String> values) {
            addCriterion("us_salt not in", values, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltBetween(String value1, String value2) {
            addCriterion("us_salt between", value1, value2, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsSaltNotBetween(String value1, String value2) {
            addCriterion("us_salt not between", value1, value2, "usSalt");
            return (Criteria) this;
        }

        public Criteria andUsLockedIsNull() {
            addCriterion("us_locked is null");
            return (Criteria) this;
        }

        public Criteria andUsLockedIsNotNull() {
            addCriterion("us_locked is not null");
            return (Criteria) this;
        }

        public Criteria andUsLockedEqualTo(Boolean value) {
            addCriterion("us_locked =", value, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedNotEqualTo(Boolean value) {
            addCriterion("us_locked <>", value, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedGreaterThan(Boolean value) {
            addCriterion("us_locked >", value, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("us_locked >=", value, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedLessThan(Boolean value) {
            addCriterion("us_locked <", value, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("us_locked <=", value, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedIn(List<Boolean> values) {
            addCriterion("us_locked in", values, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedNotIn(List<Boolean> values) {
            addCriterion("us_locked not in", values, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("us_locked between", value1, value2, "usLocked");
            return (Criteria) this;
        }

        public Criteria andUsLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("us_locked not between", value1, value2, "usLocked");
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