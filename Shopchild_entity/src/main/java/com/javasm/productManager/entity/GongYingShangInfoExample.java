package com.javasm.productManager.entity;

import java.util.ArrayList;
import java.util.List;

public class GongYingShangInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GongYingShangInfoExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGlinkmanIsNull() {
            addCriterion("glinkman is null");
            return (Criteria) this;
        }

        public Criteria andGlinkmanIsNotNull() {
            addCriterion("glinkman is not null");
            return (Criteria) this;
        }

        public Criteria andGlinkmanEqualTo(String value) {
            addCriterion("glinkman =", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanNotEqualTo(String value) {
            addCriterion("glinkman <>", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanGreaterThan(String value) {
            addCriterion("glinkman >", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("glinkman >=", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanLessThan(String value) {
            addCriterion("glinkman <", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanLessThanOrEqualTo(String value) {
            addCriterion("glinkman <=", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanLike(String value) {
            addCriterion("glinkman like", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanNotLike(String value) {
            addCriterion("glinkman not like", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanIn(List<String> values) {
            addCriterion("glinkman in", values, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanNotIn(List<String> values) {
            addCriterion("glinkman not in", values, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanBetween(String value1, String value2) {
            addCriterion("glinkman between", value1, value2, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanNotBetween(String value1, String value2) {
            addCriterion("glinkman not between", value1, value2, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGphoneIsNull() {
            addCriterion("gphone is null");
            return (Criteria) this;
        }

        public Criteria andGphoneIsNotNull() {
            addCriterion("gphone is not null");
            return (Criteria) this;
        }

        public Criteria andGphoneEqualTo(String value) {
            addCriterion("gphone =", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotEqualTo(String value) {
            addCriterion("gphone <>", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneGreaterThan(String value) {
            addCriterion("gphone >", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneGreaterThanOrEqualTo(String value) {
            addCriterion("gphone >=", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLessThan(String value) {
            addCriterion("gphone <", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLessThanOrEqualTo(String value) {
            addCriterion("gphone <=", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLike(String value) {
            addCriterion("gphone like", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotLike(String value) {
            addCriterion("gphone not like", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneIn(List<String> values) {
            addCriterion("gphone in", values, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotIn(List<String> values) {
            addCriterion("gphone not in", values, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneBetween(String value1, String value2) {
            addCriterion("gphone between", value1, value2, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotBetween(String value1, String value2) {
            addCriterion("gphone not between", value1, value2, "gphone");
            return (Criteria) this;
        }

        public Criteria andGadressIsNull() {
            addCriterion("gadress is null");
            return (Criteria) this;
        }

        public Criteria andGadressIsNotNull() {
            addCriterion("gadress is not null");
            return (Criteria) this;
        }

        public Criteria andGadressEqualTo(String value) {
            addCriterion("gadress =", value, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressNotEqualTo(String value) {
            addCriterion("gadress <>", value, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressGreaterThan(String value) {
            addCriterion("gadress >", value, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressGreaterThanOrEqualTo(String value) {
            addCriterion("gadress >=", value, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressLessThan(String value) {
            addCriterion("gadress <", value, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressLessThanOrEqualTo(String value) {
            addCriterion("gadress <=", value, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressLike(String value) {
            addCriterion("gadress like", value, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressNotLike(String value) {
            addCriterion("gadress not like", value, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressIn(List<String> values) {
            addCriterion("gadress in", values, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressNotIn(List<String> values) {
            addCriterion("gadress not in", values, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressBetween(String value1, String value2) {
            addCriterion("gadress between", value1, value2, "gadress");
            return (Criteria) this;
        }

        public Criteria andGadressNotBetween(String value1, String value2) {
            addCriterion("gadress not between", value1, value2, "gadress");
            return (Criteria) this;
        }

        public Criteria andGaccountIsNull() {
            addCriterion("gaccount is null");
            return (Criteria) this;
        }

        public Criteria andGaccountIsNotNull() {
            addCriterion("gaccount is not null");
            return (Criteria) this;
        }

        public Criteria andGaccountEqualTo(String value) {
            addCriterion("gaccount =", value, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountNotEqualTo(String value) {
            addCriterion("gaccount <>", value, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountGreaterThan(String value) {
            addCriterion("gaccount >", value, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountGreaterThanOrEqualTo(String value) {
            addCriterion("gaccount >=", value, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountLessThan(String value) {
            addCriterion("gaccount <", value, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountLessThanOrEqualTo(String value) {
            addCriterion("gaccount <=", value, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountLike(String value) {
            addCriterion("gaccount like", value, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountNotLike(String value) {
            addCriterion("gaccount not like", value, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountIn(List<String> values) {
            addCriterion("gaccount in", values, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountNotIn(List<String> values) {
            addCriterion("gaccount not in", values, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountBetween(String value1, String value2) {
            addCriterion("gaccount between", value1, value2, "gaccount");
            return (Criteria) this;
        }

        public Criteria andGaccountNotBetween(String value1, String value2) {
            addCriterion("gaccount not between", value1, value2, "gaccount");
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