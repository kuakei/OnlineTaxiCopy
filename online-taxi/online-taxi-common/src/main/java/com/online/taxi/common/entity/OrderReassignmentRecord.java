package com.online.taxi.common.entity;

import java.util.Date;

public class OrderReassignmentRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.order_id
     *
     * @mbggenerated
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.driver_id_before
     *
     * @mbggenerated
     */
    private Integer driverIdBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.driver_name_before
     *
     * @mbggenerated
     */
    private String driverNameBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.driver_id_now
     *
     * @mbggenerated
     */
    private Integer driverIdNow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.driver_name_now
     *
     * @mbggenerated
     */
    private String driverNameNow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.operator
     *
     * @mbggenerated
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.reason_type
     *
     * @mbggenerated
     */
    private Integer reasonType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.reason_text
     *
     * @mbggenerated
     */
    private String reasonText;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_reassignment_record.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.id
     *
     * @return the value of tbl_order_reassignment_record.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.id
     *
     * @param id the value for tbl_order_reassignment_record.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.order_id
     *
     * @return the value of tbl_order_reassignment_record.order_id
     *
     * @mbggenerated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.order_id
     *
     * @param orderId the value for tbl_order_reassignment_record.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.driver_id_before
     *
     * @return the value of tbl_order_reassignment_record.driver_id_before
     *
     * @mbggenerated
     */
    public Integer getDriverIdBefore() {
        return driverIdBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.driver_id_before
     *
     * @param driverIdBefore the value for tbl_order_reassignment_record.driver_id_before
     *
     * @mbggenerated
     */
    public void setDriverIdBefore(Integer driverIdBefore) {
        this.driverIdBefore = driverIdBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.driver_name_before
     *
     * @return the value of tbl_order_reassignment_record.driver_name_before
     *
     * @mbggenerated
     */
    public String getDriverNameBefore() {
        return driverNameBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.driver_name_before
     *
     * @param driverNameBefore the value for tbl_order_reassignment_record.driver_name_before
     *
     * @mbggenerated
     */
    public void setDriverNameBefore(String driverNameBefore) {
        this.driverNameBefore = driverNameBefore == null ? null : driverNameBefore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.driver_id_now
     *
     * @return the value of tbl_order_reassignment_record.driver_id_now
     *
     * @mbggenerated
     */
    public Integer getDriverIdNow() {
        return driverIdNow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.driver_id_now
     *
     * @param driverIdNow the value for tbl_order_reassignment_record.driver_id_now
     *
     * @mbggenerated
     */
    public void setDriverIdNow(Integer driverIdNow) {
        this.driverIdNow = driverIdNow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.driver_name_now
     *
     * @return the value of tbl_order_reassignment_record.driver_name_now
     *
     * @mbggenerated
     */
    public String getDriverNameNow() {
        return driverNameNow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.driver_name_now
     *
     * @param driverNameNow the value for tbl_order_reassignment_record.driver_name_now
     *
     * @mbggenerated
     */
    public void setDriverNameNow(String driverNameNow) {
        this.driverNameNow = driverNameNow == null ? null : driverNameNow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.operator
     *
     * @return the value of tbl_order_reassignment_record.operator
     *
     * @mbggenerated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.operator
     *
     * @param operator the value for tbl_order_reassignment_record.operator
     *
     * @mbggenerated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.reason_type
     *
     * @return the value of tbl_order_reassignment_record.reason_type
     *
     * @mbggenerated
     */
    public Integer getReasonType() {
        return reasonType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.reason_type
     *
     * @param reasonType the value for tbl_order_reassignment_record.reason_type
     *
     * @mbggenerated
     */
    public void setReasonType(Integer reasonType) {
        this.reasonType = reasonType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.reason_text
     *
     * @return the value of tbl_order_reassignment_record.reason_text
     *
     * @mbggenerated
     */
    public String getReasonText() {
        return reasonText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.reason_text
     *
     * @param reasonText the value for tbl_order_reassignment_record.reason_text
     *
     * @mbggenerated
     */
    public void setReasonText(String reasonText) {
        this.reasonText = reasonText == null ? null : reasonText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.create_time
     *
     * @return the value of tbl_order_reassignment_record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.create_time
     *
     * @param createTime the value for tbl_order_reassignment_record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_reassignment_record.update_time
     *
     * @return the value of tbl_order_reassignment_record.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_reassignment_record.update_time
     *
     * @param updateTime the value for tbl_order_reassignment_record.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}