package com.ShanghaiUniversity.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RubbishpicExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RubbishpicExample() {
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

        public Criteria andRubbishNumberIsNull() {
            addCriterion("rubbish_number is null");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberIsNotNull() {
            addCriterion("rubbish_number is not null");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberEqualTo(Integer value) {
            addCriterion("rubbish_number =", value, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberNotEqualTo(Integer value) {
            addCriterion("rubbish_number <>", value, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberGreaterThan(Integer value) {
            addCriterion("rubbish_number >", value, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("rubbish_number >=", value, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberLessThan(Integer value) {
            addCriterion("rubbish_number <", value, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberLessThanOrEqualTo(Integer value) {
            addCriterion("rubbish_number <=", value, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberIn(List<Integer> values) {
            addCriterion("rubbish_number in", values, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberNotIn(List<Integer> values) {
            addCriterion("rubbish_number not in", values, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberBetween(Integer value1, Integer value2) {
            addCriterion("rubbish_number between", value1, value2, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("rubbish_number not between", value1, value2, "rubbishNumber");
            return (Criteria) this;
        }

        public Criteria andRubbishPathIsNull() {
            addCriterion("rubbish_path is null");
            return (Criteria) this;
        }

        public Criteria andRubbishPathIsNotNull() {
            addCriterion("rubbish_path is not null");
            return (Criteria) this;
        }

        public Criteria andRubbishPathEqualTo(String value) {
            addCriterion("rubbish_path =", value, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathNotEqualTo(String value) {
            addCriterion("rubbish_path <>", value, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathGreaterThan(String value) {
            addCriterion("rubbish_path >", value, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathGreaterThanOrEqualTo(String value) {
            addCriterion("rubbish_path >=", value, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathLessThan(String value) {
            addCriterion("rubbish_path <", value, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathLessThanOrEqualTo(String value) {
            addCriterion("rubbish_path <=", value, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathLike(String value) {
            addCriterion("rubbish_path like", value, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathNotLike(String value) {
            addCriterion("rubbish_path not like", value, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathIn(List<String> values) {
            addCriterion("rubbish_path in", values, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathNotIn(List<String> values) {
            addCriterion("rubbish_path not in", values, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathBetween(String value1, String value2) {
            addCriterion("rubbish_path between", value1, value2, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishPathNotBetween(String value1, String value2) {
            addCriterion("rubbish_path not between", value1, value2, "rubbishPath");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeIsNull() {
            addCriterion("rubbish_time is null");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeIsNotNull() {
            addCriterion("rubbish_time is not null");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeEqualTo(Date value) {
            addCriterion("rubbish_time =", value, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeNotEqualTo(Date value) {
            addCriterion("rubbish_time <>", value, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeGreaterThan(Date value) {
            addCriterion("rubbish_time >", value, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rubbish_time >=", value, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeLessThan(Date value) {
            addCriterion("rubbish_time <", value, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeLessThanOrEqualTo(Date value) {
            addCriterion("rubbish_time <=", value, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeIn(List<Date> values) {
            addCriterion("rubbish_time in", values, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeNotIn(List<Date> values) {
            addCriterion("rubbish_time not in", values, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeBetween(Date value1, Date value2) {
            addCriterion("rubbish_time between", value1, value2, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishTimeNotBetween(Date value1, Date value2) {
            addCriterion("rubbish_time not between", value1, value2, "rubbishTime");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationIsNull() {
            addCriterion("rubbish_location is null");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationIsNotNull() {
            addCriterion("rubbish_location is not null");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationEqualTo(String value) {
            addCriterion("rubbish_location =", value, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationNotEqualTo(String value) {
            addCriterion("rubbish_location <>", value, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationGreaterThan(String value) {
            addCriterion("rubbish_location >", value, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationGreaterThanOrEqualTo(String value) {
            addCriterion("rubbish_location >=", value, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationLessThan(String value) {
            addCriterion("rubbish_location <", value, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationLessThanOrEqualTo(String value) {
            addCriterion("rubbish_location <=", value, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationLike(String value) {
            addCriterion("rubbish_location like", value, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationNotLike(String value) {
            addCriterion("rubbish_location not like", value, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationIn(List<String> values) {
            addCriterion("rubbish_location in", values, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationNotIn(List<String> values) {
            addCriterion("rubbish_location not in", values, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationBetween(String value1, String value2) {
            addCriterion("rubbish_location between", value1, value2, "rubbishLocation");
            return (Criteria) this;
        }

        public Criteria andRubbishLocationNotBetween(String value1, String value2) {
            addCriterion("rubbish_location not between", value1, value2, "rubbishLocation");
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