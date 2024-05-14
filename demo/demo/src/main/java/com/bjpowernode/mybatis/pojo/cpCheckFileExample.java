package com.bjpowernode.mybatis.pojo;

import java.util.ArrayList;
import java.util.List;

public class cpCheckFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cpCheckFileExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNull() {
            addCriterion("check_type is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("check_type is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(String value) {
            addCriterion("check_type =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(String value) {
            addCriterion("check_type <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(String value) {
            addCriterion("check_type >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("check_type >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(String value) {
            addCriterion("check_type <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("check_type <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLike(String value) {
            addCriterion("check_type like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotLike(String value) {
            addCriterion("check_type not like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<String> values) {
            addCriterion("check_type in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<String> values) {
            addCriterion("check_type not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(String value1, String value2) {
            addCriterion("check_type between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(String value1, String value2) {
            addCriterion("check_type not between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andAgentOneIsNull() {
            addCriterion("agent_one is null");
            return (Criteria) this;
        }

        public Criteria andAgentOneIsNotNull() {
            addCriterion("agent_one is not null");
            return (Criteria) this;
        }

        public Criteria andAgentOneEqualTo(String value) {
            addCriterion("agent_one =", value, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneNotEqualTo(String value) {
            addCriterion("agent_one <>", value, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneGreaterThan(String value) {
            addCriterion("agent_one >", value, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneGreaterThanOrEqualTo(String value) {
            addCriterion("agent_one >=", value, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneLessThan(String value) {
            addCriterion("agent_one <", value, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneLessThanOrEqualTo(String value) {
            addCriterion("agent_one <=", value, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneLike(String value) {
            addCriterion("agent_one like", value, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneNotLike(String value) {
            addCriterion("agent_one not like", value, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneIn(List<String> values) {
            addCriterion("agent_one in", values, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneNotIn(List<String> values) {
            addCriterion("agent_one not in", values, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneBetween(String value1, String value2) {
            addCriterion("agent_one between", value1, value2, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentOneNotBetween(String value1, String value2) {
            addCriterion("agent_one not between", value1, value2, "agentOne");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("agent_id like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("agent_id not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andRrnIsNull() {
            addCriterion("rrn is null");
            return (Criteria) this;
        }

        public Criteria andRrnIsNotNull() {
            addCriterion("rrn is not null");
            return (Criteria) this;
        }

        public Criteria andRrnEqualTo(String value) {
            addCriterion("rrn =", value, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnNotEqualTo(String value) {
            addCriterion("rrn <>", value, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnGreaterThan(String value) {
            addCriterion("rrn >", value, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnGreaterThanOrEqualTo(String value) {
            addCriterion("rrn >=", value, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnLessThan(String value) {
            addCriterion("rrn <", value, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnLessThanOrEqualTo(String value) {
            addCriterion("rrn <=", value, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnLike(String value) {
            addCriterion("rrn like", value, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnNotLike(String value) {
            addCriterion("rrn not like", value, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnIn(List<String> values) {
            addCriterion("rrn in", values, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnNotIn(List<String> values) {
            addCriterion("rrn not in", values, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnBetween(String value1, String value2) {
            addCriterion("rrn between", value1, value2, "rrn");
            return (Criteria) this;
        }

        public Criteria andRrnNotBetween(String value1, String value2) {
            addCriterion("rrn not between", value1, value2, "rrn");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNull() {
            addCriterion("trans_code is null");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNotNull() {
            addCriterion("trans_code is not null");
            return (Criteria) this;
        }

        public Criteria andTransCodeEqualTo(String value) {
            addCriterion("trans_code =", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotEqualTo(String value) {
            addCriterion("trans_code <>", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThan(String value) {
            addCriterion("trans_code >", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trans_code >=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThan(String value) {
            addCriterion("trans_code <", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThanOrEqualTo(String value) {
            addCriterion("trans_code <=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLike(String value) {
            addCriterion("trans_code like", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotLike(String value) {
            addCriterion("trans_code not like", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeIn(List<String> values) {
            addCriterion("trans_code in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotIn(List<String> values) {
            addCriterion("trans_code not in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeBetween(String value1, String value2) {
            addCriterion("trans_code between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotBetween(String value1, String value2) {
            addCriterion("trans_code not between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andAcctFlagIsNull() {
            addCriterion("acct_flag is null");
            return (Criteria) this;
        }

        public Criteria andAcctFlagIsNotNull() {
            addCriterion("acct_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAcctFlagEqualTo(String value) {
            addCriterion("acct_flag =", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagNotEqualTo(String value) {
            addCriterion("acct_flag <>", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagGreaterThan(String value) {
            addCriterion("acct_flag >", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagGreaterThanOrEqualTo(String value) {
            addCriterion("acct_flag >=", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagLessThan(String value) {
            addCriterion("acct_flag <", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagLessThanOrEqualTo(String value) {
            addCriterion("acct_flag <=", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagLike(String value) {
            addCriterion("acct_flag like", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagNotLike(String value) {
            addCriterion("acct_flag not like", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagIn(List<String> values) {
            addCriterion("acct_flag in", values, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagNotIn(List<String> values) {
            addCriterion("acct_flag not in", values, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagBetween(String value1, String value2) {
            addCriterion("acct_flag between", value1, value2, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagNotBetween(String value1, String value2) {
            addCriterion("acct_flag not between", value1, value2, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andSysTraceIsNull() {
            addCriterion("sys_trace is null");
            return (Criteria) this;
        }

        public Criteria andSysTraceIsNotNull() {
            addCriterion("sys_trace is not null");
            return (Criteria) this;
        }

        public Criteria andSysTraceEqualTo(String value) {
            addCriterion("sys_trace =", value, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceNotEqualTo(String value) {
            addCriterion("sys_trace <>", value, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceGreaterThan(String value) {
            addCriterion("sys_trace >", value, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceGreaterThanOrEqualTo(String value) {
            addCriterion("sys_trace >=", value, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceLessThan(String value) {
            addCriterion("sys_trace <", value, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceLessThanOrEqualTo(String value) {
            addCriterion("sys_trace <=", value, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceLike(String value) {
            addCriterion("sys_trace like", value, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceNotLike(String value) {
            addCriterion("sys_trace not like", value, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceIn(List<String> values) {
            addCriterion("sys_trace in", values, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceNotIn(List<String> values) {
            addCriterion("sys_trace not in", values, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceBetween(String value1, String value2) {
            addCriterion("sys_trace between", value1, value2, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andSysTraceNotBetween(String value1, String value2) {
            addCriterion("sys_trace not between", value1, value2, "sysTrace");
            return (Criteria) this;
        }

        public Criteria andMerchIdIsNull() {
            addCriterion("merch_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchIdIsNotNull() {
            addCriterion("merch_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchIdEqualTo(String value) {
            addCriterion("merch_id =", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotEqualTo(String value) {
            addCriterion("merch_id <>", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdGreaterThan(String value) {
            addCriterion("merch_id >", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdGreaterThanOrEqualTo(String value) {
            addCriterion("merch_id >=", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdLessThan(String value) {
            addCriterion("merch_id <", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdLessThanOrEqualTo(String value) {
            addCriterion("merch_id <=", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdLike(String value) {
            addCriterion("merch_id like", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotLike(String value) {
            addCriterion("merch_id not like", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdIn(List<String> values) {
            addCriterion("merch_id in", values, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotIn(List<String> values) {
            addCriterion("merch_id not in", values, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdBetween(String value1, String value2) {
            addCriterion("merch_id between", value1, value2, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotBetween(String value1, String value2) {
            addCriterion("merch_id not between", value1, value2, "merchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdIsNull() {
            addCriterion("channel_merch_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdIsNotNull() {
            addCriterion("channel_merch_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdEqualTo(String value) {
            addCriterion("channel_merch_id =", value, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdNotEqualTo(String value) {
            addCriterion("channel_merch_id <>", value, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdGreaterThan(String value) {
            addCriterion("channel_merch_id >", value, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_merch_id >=", value, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdLessThan(String value) {
            addCriterion("channel_merch_id <", value, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdLessThanOrEqualTo(String value) {
            addCriterion("channel_merch_id <=", value, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdLike(String value) {
            addCriterion("channel_merch_id like", value, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdNotLike(String value) {
            addCriterion("channel_merch_id not like", value, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdIn(List<String> values) {
            addCriterion("channel_merch_id in", values, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdNotIn(List<String> values) {
            addCriterion("channel_merch_id not in", values, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdBetween(String value1, String value2) {
            addCriterion("channel_merch_id between", value1, value2, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andChannelMerchIdNotBetween(String value1, String value2) {
            addCriterion("channel_merch_id not between", value1, value2, "channelMerchId");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("trans_date is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("trans_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(String value) {
            addCriterion("trans_date =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(String value) {
            addCriterion("trans_date <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(String value) {
            addCriterion("trans_date >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(String value) {
            addCriterion("trans_date >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(String value) {
            addCriterion("trans_date <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(String value) {
            addCriterion("trans_date <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLike(String value) {
            addCriterion("trans_date like", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotLike(String value) {
            addCriterion("trans_date not like", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<String> values) {
            addCriterion("trans_date in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<String> values) {
            addCriterion("trans_date not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(String value1, String value2) {
            addCriterion("trans_date between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(String value1, String value2) {
            addCriterion("trans_date not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNull() {
            addCriterion("trans_time is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("trans_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(String value) {
            addCriterion("trans_time =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(String value) {
            addCriterion("trans_time <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(String value) {
            addCriterion("trans_time >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(String value) {
            addCriterion("trans_time >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(String value) {
            addCriterion("trans_time <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(String value) {
            addCriterion("trans_time <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLike(String value) {
            addCriterion("trans_time like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotLike(String value) {
            addCriterion("trans_time not like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<String> values) {
            addCriterion("trans_time in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<String> values) {
            addCriterion("trans_time not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(String value1, String value2) {
            addCriterion("trans_time between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(String value1, String value2) {
            addCriterion("trans_time not between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNull() {
            addCriterion("settle_amount is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNotNull() {
            addCriterion("settle_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountEqualTo(String value) {
            addCriterion("settle_amount =", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotEqualTo(String value) {
            addCriterion("settle_amount <>", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThan(String value) {
            addCriterion("settle_amount >", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThanOrEqualTo(String value) {
            addCriterion("settle_amount >=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThan(String value) {
            addCriterion("settle_amount <", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThanOrEqualTo(String value) {
            addCriterion("settle_amount <=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLike(String value) {
            addCriterion("settle_amount like", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotLike(String value) {
            addCriterion("settle_amount not like", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIn(List<String> values) {
            addCriterion("settle_amount in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotIn(List<String> values) {
            addCriterion("settle_amount not in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountBetween(String value1, String value2) {
            addCriterion("settle_amount between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotBetween(String value1, String value2) {
            addCriterion("settle_amount not between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andTransNameIsNull() {
            addCriterion("trans_name is null");
            return (Criteria) this;
        }

        public Criteria andTransNameIsNotNull() {
            addCriterion("trans_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransNameEqualTo(String value) {
            addCriterion("trans_name =", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameNotEqualTo(String value) {
            addCriterion("trans_name <>", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameGreaterThan(String value) {
            addCriterion("trans_name >", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameGreaterThanOrEqualTo(String value) {
            addCriterion("trans_name >=", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameLessThan(String value) {
            addCriterion("trans_name <", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameLessThanOrEqualTo(String value) {
            addCriterion("trans_name <=", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameLike(String value) {
            addCriterion("trans_name like", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameNotLike(String value) {
            addCriterion("trans_name not like", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameIn(List<String> values) {
            addCriterion("trans_name in", values, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameNotIn(List<String> values) {
            addCriterion("trans_name not in", values, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameBetween(String value1, String value2) {
            addCriterion("trans_name between", value1, value2, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameNotBetween(String value1, String value2) {
            addCriterion("trans_name not between", value1, value2, "transName");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNull() {
            addCriterion("check_flag is null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNotNull() {
            addCriterion("check_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagEqualTo(String value) {
            addCriterion("check_flag =", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotEqualTo(String value) {
            addCriterion("check_flag <>", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThan(String value) {
            addCriterion("check_flag >", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThanOrEqualTo(String value) {
            addCriterion("check_flag >=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThan(String value) {
            addCriterion("check_flag <", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThanOrEqualTo(String value) {
            addCriterion("check_flag <=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLike(String value) {
            addCriterion("check_flag like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotLike(String value) {
            addCriterion("check_flag not like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIn(List<String> values) {
            addCriterion("check_flag in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotIn(List<String> values) {
            addCriterion("check_flag not in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagBetween(String value1, String value2) {
            addCriterion("check_flag between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotBetween(String value1, String value2) {
            addCriterion("check_flag not between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoIsNull() {
            addCriterion("merch_order_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoIsNotNull() {
            addCriterion("merch_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoEqualTo(String value) {
            addCriterion("merch_order_no =", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoNotEqualTo(String value) {
            addCriterion("merch_order_no <>", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoGreaterThan(String value) {
            addCriterion("merch_order_no >", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("merch_order_no >=", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoLessThan(String value) {
            addCriterion("merch_order_no <", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoLessThanOrEqualTo(String value) {
            addCriterion("merch_order_no <=", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoLike(String value) {
            addCriterion("merch_order_no like", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoNotLike(String value) {
            addCriterion("merch_order_no not like", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoIn(List<String> values) {
            addCriterion("merch_order_no in", values, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoNotIn(List<String> values) {
            addCriterion("merch_order_no not in", values, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoBetween(String value1, String value2) {
            addCriterion("merch_order_no between", value1, value2, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoNotBetween(String value1, String value2) {
            addCriterion("merch_order_no not between", value1, value2, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNull() {
            addCriterion("function_code is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("function_code is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("function_code =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("function_code <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("function_code >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("function_code >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("function_code <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("function_code <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("function_code like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("function_code not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("function_code in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("function_code not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("function_code between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("function_code not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNull() {
            addCriterion("settle_date is null");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNotNull() {
            addCriterion("settle_date is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDateEqualTo(String value) {
            addCriterion("settle_date =", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotEqualTo(String value) {
            addCriterion("settle_date <>", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThan(String value) {
            addCriterion("settle_date >", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThanOrEqualTo(String value) {
            addCriterion("settle_date >=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThan(String value) {
            addCriterion("settle_date <", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThanOrEqualTo(String value) {
            addCriterion("settle_date <=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLike(String value) {
            addCriterion("settle_date like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotLike(String value) {
            addCriterion("settle_date not like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateIn(List<String> values) {
            addCriterion("settle_date in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotIn(List<String> values) {
            addCriterion("settle_date not in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateBetween(String value1, String value2) {
            addCriterion("settle_date between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotBetween(String value1, String value2) {
            addCriterion("settle_date not between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andConnTypeIsNull() {
            addCriterion("conn_type is null");
            return (Criteria) this;
        }

        public Criteria andConnTypeIsNotNull() {
            addCriterion("conn_type is not null");
            return (Criteria) this;
        }

        public Criteria andConnTypeEqualTo(String value) {
            addCriterion("conn_type =", value, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeNotEqualTo(String value) {
            addCriterion("conn_type <>", value, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeGreaterThan(String value) {
            addCriterion("conn_type >", value, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("conn_type >=", value, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeLessThan(String value) {
            addCriterion("conn_type <", value, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeLessThanOrEqualTo(String value) {
            addCriterion("conn_type <=", value, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeLike(String value) {
            addCriterion("conn_type like", value, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeNotLike(String value) {
            addCriterion("conn_type not like", value, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeIn(List<String> values) {
            addCriterion("conn_type in", values, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeNotIn(List<String> values) {
            addCriterion("conn_type not in", values, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeBetween(String value1, String value2) {
            addCriterion("conn_type between", value1, value2, "connType");
            return (Criteria) this;
        }

        public Criteria andConnTypeNotBetween(String value1, String value2) {
            addCriterion("conn_type not between", value1, value2, "connType");
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