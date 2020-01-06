package com.ShanghaiUniversity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacepicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FacepicExample() {
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

        public Criteria andFaceNumberIsNull() {
            addCriterion("face_number is null");
            return (Criteria) this;
        }

        public Criteria andFaceNumberIsNotNull() {
            addCriterion("face_number is not null");
            return (Criteria) this;
        }

        public Criteria andFaceNumberEqualTo(Integer value) {
            addCriterion("face_number =", value, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberNotEqualTo(Integer value) {
            addCriterion("face_number <>", value, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberGreaterThan(Integer value) {
            addCriterion("face_number >", value, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("face_number >=", value, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberLessThan(Integer value) {
            addCriterion("face_number <", value, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberLessThanOrEqualTo(Integer value) {
            addCriterion("face_number <=", value, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberIn(List<Integer> values) {
            addCriterion("face_number in", values, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberNotIn(List<Integer> values) {
            addCriterion("face_number not in", values, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberBetween(Integer value1, Integer value2) {
            addCriterion("face_number between", value1, value2, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFaceNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("face_number not between", value1, value2, "faceNumber");
            return (Criteria) this;
        }

        public Criteria andFacePathIsNull() {
            addCriterion("face_path is null");
            return (Criteria) this;
        }

        public Criteria andFacePathIsNotNull() {
            addCriterion("face_path is not null");
            return (Criteria) this;
        }

        public Criteria andFacePathEqualTo(String value) {
            addCriterion("face_path =", value, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathNotEqualTo(String value) {
            addCriterion("face_path <>", value, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathGreaterThan(String value) {
            addCriterion("face_path >", value, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathGreaterThanOrEqualTo(String value) {
            addCriterion("face_path >=", value, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathLessThan(String value) {
            addCriterion("face_path <", value, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathLessThanOrEqualTo(String value) {
            addCriterion("face_path <=", value, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathLike(String value) {
            addCriterion("face_path like", value, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathNotLike(String value) {
            addCriterion("face_path not like", value, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathIn(List<String> values) {
            addCriterion("face_path in", values, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathNotIn(List<String> values) {
            addCriterion("face_path not in", values, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathBetween(String value1, String value2) {
            addCriterion("face_path between", value1, value2, "facePath");
            return (Criteria) this;
        }

        public Criteria andFacePathNotBetween(String value1, String value2) {
            addCriterion("face_path not between", value1, value2, "facePath");
            return (Criteria) this;
        }

        public Criteria andFaceTimeIsNull() {
            addCriterion("face_time is null");
            return (Criteria) this;
        }

        public Criteria andFaceTimeIsNotNull() {
            addCriterion("face_time is not null");
            return (Criteria) this;
        }

        public Criteria andFaceTimeEqualTo(Date value) {
            addCriterion("face_time =", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeNotEqualTo(Date value) {
            addCriterion("face_time <>", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeGreaterThan(Date value) {
            addCriterion("face_time >", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("face_time >=", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeLessThan(Date value) {
            addCriterion("face_time <", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeLessThanOrEqualTo(Date value) {
            addCriterion("face_time <=", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeIn(List<Date> values) {
            addCriterion("face_time in", values, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeNotIn(List<Date> values) {
            addCriterion("face_time not in", values, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeBetween(Date value1, Date value2) {
            addCriterion("face_time between", value1, value2, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeNotBetween(Date value1, Date value2) {
            addCriterion("face_time not between", value1, value2, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceLocationIsNull() {
            addCriterion("face_location is null");
            return (Criteria) this;
        }

        public Criteria andFaceLocationIsNotNull() {
            addCriterion("face_location is not null");
            return (Criteria) this;
        }

        public Criteria andFaceLocationEqualTo(String value) {
            addCriterion("face_location =", value, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationNotEqualTo(String value) {
            addCriterion("face_location <>", value, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationGreaterThan(String value) {
            addCriterion("face_location >", value, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationGreaterThanOrEqualTo(String value) {
            addCriterion("face_location >=", value, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationLessThan(String value) {
            addCriterion("face_location <", value, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationLessThanOrEqualTo(String value) {
            addCriterion("face_location <=", value, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationLike(String value) {
            addCriterion("face_location like", value, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationNotLike(String value) {
            addCriterion("face_location not like", value, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationIn(List<String> values) {
            addCriterion("face_location in", values, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationNotIn(List<String> values) {
            addCriterion("face_location not in", values, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationBetween(String value1, String value2) {
            addCriterion("face_location between", value1, value2, "faceLocation");
            return (Criteria) this;
        }

        public Criteria andFaceLocationNotBetween(String value1, String value2) {
            addCriterion("face_location not between", value1, value2, "faceLocation");
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