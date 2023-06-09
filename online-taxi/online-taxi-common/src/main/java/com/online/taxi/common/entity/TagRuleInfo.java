package com.online.taxi.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TagRuleInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.city_code
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.service_type_id
     *
     * @mbggenerated
     */
    private Integer serviceTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.tag_name
     *
     * @mbggenerated
     */
    private String tagName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.tag_price
     *
     * @mbggenerated
     */
    private BigDecimal tagPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.tag_desc
     *
     * @mbggenerated
     */
    private String tagDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_rule_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.id
     *
     * @return the value of tbl_tag_rule_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.id
     *
     * @param id the value for tbl_tag_rule_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.city_code
     *
     * @return the value of tbl_tag_rule_info.city_code
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.city_code
     *
     * @param cityCode the value for tbl_tag_rule_info.city_code
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.service_type_id
     *
     * @return the value of tbl_tag_rule_info.service_type_id
     *
     * @mbggenerated
     */
    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.service_type_id
     *
     * @param serviceTypeId the value for tbl_tag_rule_info.service_type_id
     *
     * @mbggenerated
     */
    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.tag_name
     *
     * @return the value of tbl_tag_rule_info.tag_name
     *
     * @mbggenerated
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.tag_name
     *
     * @param tagName the value for tbl_tag_rule_info.tag_name
     *
     * @mbggenerated
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.tag_price
     *
     * @return the value of tbl_tag_rule_info.tag_price
     *
     * @mbggenerated
     */
    public BigDecimal getTagPrice() {
        return tagPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.tag_price
     *
     * @param tagPrice the value for tbl_tag_rule_info.tag_price
     *
     * @mbggenerated
     */
    public void setTagPrice(BigDecimal tagPrice) {
        this.tagPrice = tagPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.tag_desc
     *
     * @return the value of tbl_tag_rule_info.tag_desc
     *
     * @mbggenerated
     */
    public String getTagDesc() {
        return tagDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.tag_desc
     *
     * @param tagDesc the value for tbl_tag_rule_info.tag_desc
     *
     * @mbggenerated
     */
    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc == null ? null : tagDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.status
     *
     * @return the value of tbl_tag_rule_info.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.status
     *
     * @param status the value for tbl_tag_rule_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.create_time
     *
     * @return the value of tbl_tag_rule_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.create_time
     *
     * @param createTime the value for tbl_tag_rule_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_rule_info.update_time
     *
     * @return the value of tbl_tag_rule_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_rule_info.update_time
     *
     * @param updateTime the value for tbl_tag_rule_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}