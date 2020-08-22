package com.javasm.productManager.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("stype is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("stype is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(String value) {
            addCriterion("stype =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(String value) {
            addCriterion("stype <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(String value) {
            addCriterion("stype >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(String value) {
            addCriterion("stype >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(String value) {
            addCriterion("stype <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(String value) {
            addCriterion("stype <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLike(String value) {
            addCriterion("stype like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotLike(String value) {
            addCriterion("stype not like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<String> values) {
            addCriterion("stype in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<String> values) {
            addCriterion("stype not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(String value1, String value2) {
            addCriterion("stype between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(String value1, String value2) {
            addCriterion("stype not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andSbrandIsNull() {
            addCriterion("sbrand is null");
            return (Criteria) this;
        }

        public Criteria andSbrandIsNotNull() {
            addCriterion("sbrand is not null");
            return (Criteria) this;
        }

        public Criteria andSbrandEqualTo(String value) {
            addCriterion("sbrand =", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotEqualTo(String value) {
            addCriterion("sbrand <>", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandGreaterThan(String value) {
            addCriterion("sbrand >", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandGreaterThanOrEqualTo(String value) {
            addCriterion("sbrand >=", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLessThan(String value) {
            addCriterion("sbrand <", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLessThanOrEqualTo(String value) {
            addCriterion("sbrand <=", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLike(String value) {
            addCriterion("sbrand like", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotLike(String value) {
            addCriterion("sbrand not like", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandIn(List<String> values) {
            addCriterion("sbrand in", values, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotIn(List<String> values) {
            addCriterion("sbrand not in", values, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandBetween(String value1, String value2) {
            addCriterion("sbrand between", value1, value2, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotBetween(String value1, String value2) {
            addCriterion("sbrand not between", value1, value2, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSmodelIsNull() {
            addCriterion("smodel is null");
            return (Criteria) this;
        }

        public Criteria andSmodelIsNotNull() {
            addCriterion("smodel is not null");
            return (Criteria) this;
        }

        public Criteria andSmodelEqualTo(String value) {
            addCriterion("smodel =", value, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelNotEqualTo(String value) {
            addCriterion("smodel <>", value, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelGreaterThan(String value) {
            addCriterion("smodel >", value, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelGreaterThanOrEqualTo(String value) {
            addCriterion("smodel >=", value, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelLessThan(String value) {
            addCriterion("smodel <", value, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelLessThanOrEqualTo(String value) {
            addCriterion("smodel <=", value, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelLike(String value) {
            addCriterion("smodel like", value, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelNotLike(String value) {
            addCriterion("smodel not like", value, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelIn(List<String> values) {
            addCriterion("smodel in", values, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelNotIn(List<String> values) {
            addCriterion("smodel not in", values, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelBetween(String value1, String value2) {
            addCriterion("smodel between", value1, value2, "smodel");
            return (Criteria) this;
        }

        public Criteria andSmodelNotBetween(String value1, String value2) {
            addCriterion("smodel not between", value1, value2, "smodel");
            return (Criteria) this;
        }

        public Criteria andScolorIsNull() {
            addCriterion("scolor is null");
            return (Criteria) this;
        }

        public Criteria andScolorIsNotNull() {
            addCriterion("scolor is not null");
            return (Criteria) this;
        }

        public Criteria andScolorEqualTo(String value) {
            addCriterion("scolor =", value, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorNotEqualTo(String value) {
            addCriterion("scolor <>", value, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorGreaterThan(String value) {
            addCriterion("scolor >", value, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorGreaterThanOrEqualTo(String value) {
            addCriterion("scolor >=", value, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorLessThan(String value) {
            addCriterion("scolor <", value, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorLessThanOrEqualTo(String value) {
            addCriterion("scolor <=", value, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorLike(String value) {
            addCriterion("scolor like", value, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorNotLike(String value) {
            addCriterion("scolor not like", value, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorIn(List<String> values) {
            addCriterion("scolor in", values, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorNotIn(List<String> values) {
            addCriterion("scolor not in", values, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorBetween(String value1, String value2) {
            addCriterion("scolor between", value1, value2, "scolor");
            return (Criteria) this;
        }

        public Criteria andScolorNotBetween(String value1, String value2) {
            addCriterion("scolor not between", value1, value2, "scolor");
            return (Criteria) this;
        }

        public Criteria andSstorecodeIsNull() {
            addCriterion("sstorecode is null");
            return (Criteria) this;
        }

        public Criteria andSstorecodeIsNotNull() {
            addCriterion("sstorecode is not null");
            return (Criteria) this;
        }

        public Criteria andSstorecodeEqualTo(String value) {
            addCriterion("sstorecode =", value, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeNotEqualTo(String value) {
            addCriterion("sstorecode <>", value, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeGreaterThan(String value) {
            addCriterion("sstorecode >", value, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeGreaterThanOrEqualTo(String value) {
            addCriterion("sstorecode >=", value, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeLessThan(String value) {
            addCriterion("sstorecode <", value, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeLessThanOrEqualTo(String value) {
            addCriterion("sstorecode <=", value, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeLike(String value) {
            addCriterion("sstorecode like", value, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeNotLike(String value) {
            addCriterion("sstorecode not like", value, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeIn(List<String> values) {
            addCriterion("sstorecode in", values, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeNotIn(List<String> values) {
            addCriterion("sstorecode not in", values, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeBetween(String value1, String value2) {
            addCriterion("sstorecode between", value1, value2, "sstorecode");
            return (Criteria) this;
        }

        public Criteria andSstorecodeNotBetween(String value1, String value2) {
            addCriterion("sstorecode not between", value1, value2, "sstorecode");
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