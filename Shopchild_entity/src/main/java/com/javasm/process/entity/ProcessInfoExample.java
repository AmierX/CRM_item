package com.javasm.process.entity;

import java.util.ArrayList;
import java.util.List;

public class ProcessInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessInfoExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPlevelIsNull() {
            addCriterion("plevel is null");
            return (Criteria) this;
        }

        public Criteria andPlevelIsNotNull() {
            addCriterion("plevel is not null");
            return (Criteria) this;
        }

        public Criteria andPlevelEqualTo(Integer value) {
            addCriterion("plevel =", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelNotEqualTo(Integer value) {
            addCriterion("plevel <>", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelGreaterThan(Integer value) {
            addCriterion("plevel >", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("plevel >=", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelLessThan(Integer value) {
            addCriterion("plevel <", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelLessThanOrEqualTo(Integer value) {
            addCriterion("plevel <=", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelIn(List<Integer> values) {
            addCriterion("plevel in", values, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelNotIn(List<Integer> values) {
            addCriterion("plevel not in", values, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelBetween(Integer value1, Integer value2) {
            addCriterion("plevel between", value1, value2, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("plevel not between", value1, value2, "plevel");
            return (Criteria) this;
        }

        public Criteria andProleIsNull() {
            addCriterion("prole is null");
            return (Criteria) this;
        }

        public Criteria andProleIsNotNull() {
            addCriterion("prole is not null");
            return (Criteria) this;
        }

        public Criteria andProleEqualTo(String value) {
            addCriterion("prole =", value, "prole");
            return (Criteria) this;
        }

        public Criteria andProleNotEqualTo(String value) {
            addCriterion("prole <>", value, "prole");
            return (Criteria) this;
        }

        public Criteria andProleGreaterThan(String value) {
            addCriterion("prole >", value, "prole");
            return (Criteria) this;
        }

        public Criteria andProleGreaterThanOrEqualTo(String value) {
            addCriterion("prole >=", value, "prole");
            return (Criteria) this;
        }

        public Criteria andProleLessThan(String value) {
            addCriterion("prole <", value, "prole");
            return (Criteria) this;
        }

        public Criteria andProleLessThanOrEqualTo(String value) {
            addCriterion("prole <=", value, "prole");
            return (Criteria) this;
        }

        public Criteria andProleLike(String value) {
            addCriterion("prole like", value, "prole");
            return (Criteria) this;
        }

        public Criteria andProleNotLike(String value) {
            addCriterion("prole not like", value, "prole");
            return (Criteria) this;
        }

        public Criteria andProleIn(List<String> values) {
            addCriterion("prole in", values, "prole");
            return (Criteria) this;
        }

        public Criteria andProleNotIn(List<String> values) {
            addCriterion("prole not in", values, "prole");
            return (Criteria) this;
        }

        public Criteria andProleBetween(String value1, String value2) {
            addCriterion("prole between", value1, value2, "prole");
            return (Criteria) this;
        }

        public Criteria andProleNotBetween(String value1, String value2) {
            addCriterion("prole not between", value1, value2, "prole");
            return (Criteria) this;
        }

        public Criteria andPcreatedateIsNull() {
            addCriterion("pcreatedate is null");
            return (Criteria) this;
        }

        public Criteria andPcreatedateIsNotNull() {
            addCriterion("pcreatedate is not null");
            return (Criteria) this;
        }

        public Criteria andPcreatedateEqualTo(String value) {
            addCriterion("pcreatedate =", value, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateNotEqualTo(String value) {
            addCriterion("pcreatedate <>", value, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateGreaterThan(String value) {
            addCriterion("pcreatedate >", value, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("pcreatedate >=", value, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateLessThan(String value) {
            addCriterion("pcreatedate <", value, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateLessThanOrEqualTo(String value) {
            addCriterion("pcreatedate <=", value, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateLike(String value) {
            addCriterion("pcreatedate like", value, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateNotLike(String value) {
            addCriterion("pcreatedate not like", value, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateIn(List<String> values) {
            addCriterion("pcreatedate in", values, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateNotIn(List<String> values) {
            addCriterion("pcreatedate not in", values, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateBetween(String value1, String value2) {
            addCriterion("pcreatedate between", value1, value2, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPcreatedateNotBetween(String value1, String value2) {
            addCriterion("pcreatedate not between", value1, value2, "pcreatedate");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNull() {
            addCriterion("pstatus is null");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNotNull() {
            addCriterion("pstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPstatusEqualTo(Integer value) {
            addCriterion("pstatus =", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotEqualTo(Integer value) {
            addCriterion("pstatus <>", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThan(Integer value) {
            addCriterion("pstatus >", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pstatus >=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThan(Integer value) {
            addCriterion("pstatus <", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThanOrEqualTo(Integer value) {
            addCriterion("pstatus <=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusIn(List<Integer> values) {
            addCriterion("pstatus in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotIn(List<Integer> values) {
            addCriterion("pstatus not in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusBetween(Integer value1, Integer value2) {
            addCriterion("pstatus between", value1, value2, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pstatus not between", value1, value2, "pstatus");
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