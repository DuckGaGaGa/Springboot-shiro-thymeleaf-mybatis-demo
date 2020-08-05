package com.duckgagaga.shirodemo.myshirodemo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleExample  implements Serializable {
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

        public Criteria andRole_nameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRole_nameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRole_nameEqualTo(String value) {
            addCriterion("role_name =", value, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameGreaterThan(String value) {
            addCriterion("role_name >", value, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameLessThan(String value) {
            addCriterion("role_name <", value, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameLike(String value) {
            addCriterion("role_name like", value, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameNotLike(String value) {
            addCriterion("role_name not like", value, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameIn(List<String> values) {
            addCriterion("role_name in", values, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_nameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "role_name");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionIsNull() {
            addCriterion("role_description is null");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionIsNotNull() {
            addCriterion("role_description is not null");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionEqualTo(String value) {
            addCriterion("role_description =", value, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionNotEqualTo(String value) {
            addCriterion("role_description <>", value, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionGreaterThan(String value) {
            addCriterion("role_description >", value, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionGreaterThanOrEqualTo(String value) {
            addCriterion("role_description >=", value, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionLessThan(String value) {
            addCriterion("role_description <", value, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionLessThanOrEqualTo(String value) {
            addCriterion("role_description <=", value, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionLike(String value) {
            addCriterion("role_description like", value, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionNotLike(String value) {
            addCriterion("role_description not like", value, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionIn(List<String> values) {
            addCriterion("role_description in", values, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionNotIn(List<String> values) {
            addCriterion("role_description not in", values, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionBetween(String value1, String value2) {
            addCriterion("role_description between", value1, value2, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_descriptionNotBetween(String value1, String value2) {
            addCriterion("role_description not between", value1, value2, "role_description");
            return (Criteria) this;
        }

        public Criteria andRole_statusIsNull() {
            addCriterion("role_status is null");
            return (Criteria) this;
        }

        public Criteria andRole_statusIsNotNull() {
            addCriterion("role_status is not null");
            return (Criteria) this;
        }

        public Criteria andRole_statusEqualTo(Integer value) {
            addCriterion("role_status =", value, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusNotEqualTo(Integer value) {
            addCriterion("role_status <>", value, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusGreaterThan(Integer value) {
            addCriterion("role_status >", value, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_status >=", value, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusLessThan(Integer value) {
            addCriterion("role_status <", value, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusLessThanOrEqualTo(Integer value) {
            addCriterion("role_status <=", value, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusIn(List<Integer> values) {
            addCriterion("role_status in", values, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusNotIn(List<Integer> values) {
            addCriterion("role_status not in", values, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusBetween(Integer value1, Integer value2) {
            addCriterion("role_status between", value1, value2, "role_status");
            return (Criteria) this;
        }

        public Criteria andRole_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("role_status not between", value1, value2, "role_status");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
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