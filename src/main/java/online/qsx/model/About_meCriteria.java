package online.qsx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class About_meCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public About_meCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMottoIsNull() {
            addCriterion("motto is null");
            return (Criteria) this;
        }

        public Criteria andMottoIsNotNull() {
            addCriterion("motto is not null");
            return (Criteria) this;
        }

        public Criteria andMottoEqualTo(String value) {
            addCriterion("motto =", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotEqualTo(String value) {
            addCriterion("motto <>", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThan(String value) {
            addCriterion("motto >", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThanOrEqualTo(String value) {
            addCriterion("motto >=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThan(String value) {
            addCriterion("motto <", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThanOrEqualTo(String value) {
            addCriterion("motto <=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLike(String value) {
            addCriterion("motto like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotLike(String value) {
            addCriterion("motto not like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoIn(List<String> values) {
            addCriterion("motto in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotIn(List<String> values) {
            addCriterion("motto not in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoBetween(String value1, String value2) {
            addCriterion("motto between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotBetween(String value1, String value2) {
            addCriterion("motto not between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("residence is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("residence is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("residence =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("residence <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("residence >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("residence >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("residence <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("residence <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("residence like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("residence not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("residence in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("residence not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("residence between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("residence not between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsIsNull() {
            addCriterion("workingYears is null");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsIsNotNull() {
            addCriterion("workingYears is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsEqualTo(String value) {
            addCriterion("workingYears =", value, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsNotEqualTo(String value) {
            addCriterion("workingYears <>", value, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsGreaterThan(String value) {
            addCriterion("workingYears >", value, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsGreaterThanOrEqualTo(String value) {
            addCriterion("workingYears >=", value, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsLessThan(String value) {
            addCriterion("workingYears <", value, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsLessThanOrEqualTo(String value) {
            addCriterion("workingYears <=", value, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsLike(String value) {
            addCriterion("workingYears like", value, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsNotLike(String value) {
            addCriterion("workingYears not like", value, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsIn(List<String> values) {
            addCriterion("workingYears in", values, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsNotIn(List<String> values) {
            addCriterion("workingYears not in", values, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsBetween(String value1, String value2) {
            addCriterion("workingYears between", value1, value2, "workingyears");
            return (Criteria) this;
        }

        public Criteria andWorkingyearsNotBetween(String value1, String value2) {
            addCriterion("workingYears not between", value1, value2, "workingyears");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdIsNull() {
            addCriterion("education_degree_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdIsNotNull() {
            addCriterion("education_degree_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdEqualTo(Long value) {
            addCriterion("education_degree_id =", value, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdNotEqualTo(Long value) {
            addCriterion("education_degree_id <>", value, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdGreaterThan(Long value) {
            addCriterion("education_degree_id >", value, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("education_degree_id >=", value, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdLessThan(Long value) {
            addCriterion("education_degree_id <", value, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdLessThanOrEqualTo(Long value) {
            addCriterion("education_degree_id <=", value, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdIn(List<Long> values) {
            addCriterion("education_degree_id in", values, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdNotIn(List<Long> values) {
            addCriterion("education_degree_id not in", values, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdBetween(Long value1, Long value2) {
            addCriterion("education_degree_id between", value1, value2, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIdNotBetween(Long value1, Long value2) {
            addCriterion("education_degree_id not between", value1, value2, "educationDegreeId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdIsNull() {
            addCriterion("working_status_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdIsNotNull() {
            addCriterion("working_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdEqualTo(Long value) {
            addCriterion("working_status_id =", value, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdNotEqualTo(Long value) {
            addCriterion("working_status_id <>", value, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdGreaterThan(Long value) {
            addCriterion("working_status_id >", value, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("working_status_id >=", value, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdLessThan(Long value) {
            addCriterion("working_status_id <", value, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdLessThanOrEqualTo(Long value) {
            addCriterion("working_status_id <=", value, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdIn(List<Long> values) {
            addCriterion("working_status_id in", values, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdNotIn(List<Long> values) {
            addCriterion("working_status_id not in", values, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdBetween(Long value1, Long value2) {
            addCriterion("working_status_id between", value1, value2, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkingStatusIdNotBetween(Long value1, Long value2) {
            addCriterion("working_status_id not between", value1, value2, "workingStatusId");
            return (Criteria) this;
        }

        public Criteria andResumefileIsNull() {
            addCriterion("resumeFile is null");
            return (Criteria) this;
        }

        public Criteria andResumefileIsNotNull() {
            addCriterion("resumeFile is not null");
            return (Criteria) this;
        }

        public Criteria andResumefileEqualTo(String value) {
            addCriterion("resumeFile =", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileNotEqualTo(String value) {
            addCriterion("resumeFile <>", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileGreaterThan(String value) {
            addCriterion("resumeFile >", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileGreaterThanOrEqualTo(String value) {
            addCriterion("resumeFile >=", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileLessThan(String value) {
            addCriterion("resumeFile <", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileLessThanOrEqualTo(String value) {
            addCriterion("resumeFile <=", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileLike(String value) {
            addCriterion("resumeFile like", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileNotLike(String value) {
            addCriterion("resumeFile not like", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileIn(List<String> values) {
            addCriterion("resumeFile in", values, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileNotIn(List<String> values) {
            addCriterion("resumeFile not in", values, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileBetween(String value1, String value2) {
            addCriterion("resumeFile between", value1, value2, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileNotBetween(String value1, String value2) {
            addCriterion("resumeFile not between", value1, value2, "resumefile");
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