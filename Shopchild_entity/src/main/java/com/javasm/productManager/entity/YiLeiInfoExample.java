package com.javasm.productManager.entity;

import java.util.ArrayList;
import java.util.List;

public class YiLeiInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YiLeiInfoExample() {
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

        public Criteria andPuhuoIsNull() {
            addCriterion("puhuo is null");
            return (Criteria) this;
        }

        public Criteria andPuhuoIsNotNull() {
            addCriterion("puhuo is not null");
            return (Criteria) this;
        }

        public Criteria andPuhuoEqualTo(Integer value) {
            addCriterion("puhuo =", value, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoNotEqualTo(Integer value) {
            addCriterion("puhuo <>", value, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoGreaterThan(Integer value) {
            addCriterion("puhuo >", value, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoGreaterThanOrEqualTo(Integer value) {
            addCriterion("puhuo >=", value, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoLessThan(Integer value) {
            addCriterion("puhuo <", value, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoLessThanOrEqualTo(Integer value) {
            addCriterion("puhuo <=", value, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoIn(List<Integer> values) {
            addCriterion("puhuo in", values, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoNotIn(List<Integer> values) {
            addCriterion("puhuo not in", values, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoBetween(Integer value1, Integer value2) {
            addCriterion("puhuo between", value1, value2, "puhuo");
            return (Criteria) this;
        }

        public Criteria andPuhuoNotBetween(Integer value1, Integer value2) {
            addCriterion("puhuo not between", value1, value2, "puhuo");
            return (Criteria) this;
        }

        public Criteria andBeijiIsNull() {
            addCriterion("beiji is null");
            return (Criteria) this;
        }

        public Criteria andBeijiIsNotNull() {
            addCriterion("beiji is not null");
            return (Criteria) this;
        }

        public Criteria andBeijiEqualTo(Integer value) {
            addCriterion("beiji =", value, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiNotEqualTo(Integer value) {
            addCriterion("beiji <>", value, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiGreaterThan(Integer value) {
            addCriterion("beiji >", value, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiGreaterThanOrEqualTo(Integer value) {
            addCriterion("beiji >=", value, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiLessThan(Integer value) {
            addCriterion("beiji <", value, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiLessThanOrEqualTo(Integer value) {
            addCriterion("beiji <=", value, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiIn(List<Integer> values) {
            addCriterion("beiji in", values, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiNotIn(List<Integer> values) {
            addCriterion("beiji not in", values, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiBetween(Integer value1, Integer value2) {
            addCriterion("beiji between", value1, value2, "beiji");
            return (Criteria) this;
        }

        public Criteria andBeijiNotBetween(Integer value1, Integer value2) {
            addCriterion("beiji not between", value1, value2, "beiji");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIsNull() {
            addCriterion("orderprice is null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIsNotNull() {
            addCriterion("orderprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceEqualTo(Long value) {
            addCriterion("orderprice =", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotEqualTo(Long value) {
            addCriterion("orderprice <>", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThan(Long value) {
            addCriterion("orderprice >", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("orderprice >=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThan(Long value) {
            addCriterion("orderprice <", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThanOrEqualTo(Long value) {
            addCriterion("orderprice <=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIn(List<Long> values) {
            addCriterion("orderprice in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotIn(List<Long> values) {
            addCriterion("orderprice not in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceBetween(Long value1, Long value2) {
            addCriterion("orderprice between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotBetween(Long value1, Long value2) {
            addCriterion("orderprice not between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("marketprice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("marketprice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(Long value) {
            addCriterion("marketprice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(Long value) {
            addCriterion("marketprice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(Long value) {
            addCriterion("marketprice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("marketprice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(Long value) {
            addCriterion("marketprice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(Long value) {
            addCriterion("marketprice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<Long> values) {
            addCriterion("marketprice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<Long> values) {
            addCriterion("marketprice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(Long value1, Long value2) {
            addCriterion("marketprice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(Long value1, Long value2) {
            addCriterion("marketprice not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceIsNull() {
            addCriterion("shopprice is null");
            return (Criteria) this;
        }

        public Criteria andShoppriceIsNotNull() {
            addCriterion("shopprice is not null");
            return (Criteria) this;
        }

        public Criteria andShoppriceEqualTo(Long value) {
            addCriterion("shopprice =", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotEqualTo(Long value) {
            addCriterion("shopprice <>", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceGreaterThan(Long value) {
            addCriterion("shopprice >", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceGreaterThanOrEqualTo(Long value) {
            addCriterion("shopprice >=", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceLessThan(Long value) {
            addCriterion("shopprice <", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceLessThanOrEqualTo(Long value) {
            addCriterion("shopprice <=", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceIn(List<Long> values) {
            addCriterion("shopprice in", values, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotIn(List<Long> values) {
            addCriterion("shopprice not in", values, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceBetween(Long value1, Long value2) {
            addCriterion("shopprice between", value1, value2, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotBetween(Long value1, Long value2) {
            addCriterion("shopprice not between", value1, value2, "shopprice");
            return (Criteria) this;
        }

        public Criteria andLoweststockIsNull() {
            addCriterion("loweststock is null");
            return (Criteria) this;
        }

        public Criteria andLoweststockIsNotNull() {
            addCriterion("loweststock is not null");
            return (Criteria) this;
        }

        public Criteria andLoweststockEqualTo(Integer value) {
            addCriterion("loweststock =", value, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockNotEqualTo(Integer value) {
            addCriterion("loweststock <>", value, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockGreaterThan(Integer value) {
            addCriterion("loweststock >", value, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockGreaterThanOrEqualTo(Integer value) {
            addCriterion("loweststock >=", value, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockLessThan(Integer value) {
            addCriterion("loweststock <", value, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockLessThanOrEqualTo(Integer value) {
            addCriterion("loweststock <=", value, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockIn(List<Integer> values) {
            addCriterion("loweststock in", values, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockNotIn(List<Integer> values) {
            addCriterion("loweststock not in", values, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockBetween(Integer value1, Integer value2) {
            addCriterion("loweststock between", value1, value2, "loweststock");
            return (Criteria) this;
        }

        public Criteria andLoweststockNotBetween(Integer value1, Integer value2) {
            addCriterion("loweststock not between", value1, value2, "loweststock");
            return (Criteria) this;
        }

        public Criteria andOrderableIsNull() {
            addCriterion("orderable is null");
            return (Criteria) this;
        }

        public Criteria andOrderableIsNotNull() {
            addCriterion("orderable is not null");
            return (Criteria) this;
        }

        public Criteria andOrderableEqualTo(Integer value) {
            addCriterion("orderable =", value, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableNotEqualTo(Integer value) {
            addCriterion("orderable <>", value, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableGreaterThan(Integer value) {
            addCriterion("orderable >", value, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderable >=", value, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableLessThan(Integer value) {
            addCriterion("orderable <", value, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableLessThanOrEqualTo(Integer value) {
            addCriterion("orderable <=", value, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableIn(List<Integer> values) {
            addCriterion("orderable in", values, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableNotIn(List<Integer> values) {
            addCriterion("orderable not in", values, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableBetween(Integer value1, Integer value2) {
            addCriterion("orderable between", value1, value2, "orderable");
            return (Criteria) this;
        }

        public Criteria andOrderableNotBetween(Integer value1, Integer value2) {
            addCriterion("orderable not between", value1, value2, "orderable");
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