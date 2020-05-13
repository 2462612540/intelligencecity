package com.ShanghaiUniversity.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BarrelExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BarrelExample() {
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

        public Criteria andBarrelNumberIsNull() {
            addCriterion("barrel_number is null");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberIsNotNull() {
            addCriterion("barrel_number is not null");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberEqualTo(Integer value) {
            addCriterion("barrel_number =", value, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberNotEqualTo(Integer value) {
            addCriterion("barrel_number <>", value, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberGreaterThan(Integer value) {
            addCriterion("barrel_number >", value, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("barrel_number >=", value, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberLessThan(Integer value) {
            addCriterion("barrel_number <", value, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberLessThanOrEqualTo(Integer value) {
            addCriterion("barrel_number <=", value, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberIn(List<Integer> values) {
            addCriterion("barrel_number in", values, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberNotIn(List<Integer> values) {
            addCriterion("barrel_number not in", values, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberBetween(Integer value1, Integer value2) {
            addCriterion("barrel_number between", value1, value2, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andBarrelNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("barrel_number not between", value1, value2, "barrelNumber");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIsNull() {
            addCriterion("total_weight is null");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIsNotNull() {
            addCriterion("total_weight is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWeightEqualTo(Double value) {
            addCriterion("total_weight =", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotEqualTo(Double value) {
            addCriterion("total_weight <>", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightGreaterThan(Double value) {
            addCriterion("total_weight >", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("total_weight >=", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightLessThan(Double value) {
            addCriterion("total_weight <", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightLessThanOrEqualTo(Double value) {
            addCriterion("total_weight <=", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIn(List<Double> values) {
            addCriterion("total_weight in", values, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotIn(List<Double> values) {
            addCriterion("total_weight not in", values, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightBetween(Double value1, Double value2) {
            addCriterion("total_weight between", value1, value2, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotBetween(Double value1, Double value2) {
            addCriterion("total_weight not between", value1, value2, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightIsNull() {
            addCriterion("current_weight is null");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightIsNotNull() {
            addCriterion("current_weight is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightEqualTo(Double value) {
            addCriterion("current_weight =", value, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightNotEqualTo(Double value) {
            addCriterion("current_weight <>", value, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightGreaterThan(Double value) {
            addCriterion("current_weight >", value, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("current_weight >=", value, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightLessThan(Double value) {
            addCriterion("current_weight <", value, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightLessThanOrEqualTo(Double value) {
            addCriterion("current_weight <=", value, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightIn(List<Double> values) {
            addCriterion("current_weight in", values, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightNotIn(List<Double> values) {
            addCriterion("current_weight not in", values, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightBetween(Double value1, Double value2) {
            addCriterion("current_weight between", value1, value2, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andCurrentWeightNotBetween(Double value1, Double value2) {
            addCriterion("current_weight not between", value1, value2, "currentWeight");
            return (Criteria) this;
        }

        public Criteria andPurityIsNull() {
            addCriterion("purity is null");
            return (Criteria) this;
        }

        public Criteria andPurityIsNotNull() {
            addCriterion("purity is not null");
            return (Criteria) this;
        }

        public Criteria andPurityEqualTo(Double value) {
            addCriterion("purity =", value, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityNotEqualTo(Double value) {
            addCriterion("purity <>", value, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityGreaterThan(Double value) {
            addCriterion("purity >", value, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityGreaterThanOrEqualTo(Double value) {
            addCriterion("purity >=", value, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityLessThan(Double value) {
            addCriterion("purity <", value, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityLessThanOrEqualTo(Double value) {
            addCriterion("purity <=", value, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityIn(List<Double> values) {
            addCriterion("purity in", values, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityNotIn(List<Double> values) {
            addCriterion("purity not in", values, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityBetween(Double value1, Double value2) {
            addCriterion("purity between", value1, value2, "purity");
            return (Criteria) this;
        }

        public Criteria andPurityNotBetween(Double value1, Double value2) {
            addCriterion("purity not between", value1, value2, "purity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityIsNull() {
            addCriterion("rest_capacity is null");
            return (Criteria) this;
        }

        public Criteria andRestCapacityIsNotNull() {
            addCriterion("rest_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andRestCapacityEqualTo(Double value) {
            addCriterion("rest_capacity =", value, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityNotEqualTo(Double value) {
            addCriterion("rest_capacity <>", value, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityGreaterThan(Double value) {
            addCriterion("rest_capacity >", value, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityGreaterThanOrEqualTo(Double value) {
            addCriterion("rest_capacity >=", value, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityLessThan(Double value) {
            addCriterion("rest_capacity <", value, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityLessThanOrEqualTo(Double value) {
            addCriterion("rest_capacity <=", value, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityIn(List<Double> values) {
            addCriterion("rest_capacity in", values, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityNotIn(List<Double> values) {
            addCriterion("rest_capacity not in", values, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityBetween(Double value1, Double value2) {
            addCriterion("rest_capacity between", value1, value2, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andRestCapacityNotBetween(Double value1, Double value2) {
            addCriterion("rest_capacity not between", value1, value2, "restCapacity");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
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