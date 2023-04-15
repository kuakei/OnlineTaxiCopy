package com.online.taxi.common.entity;

import java.util.Date;

public class Channel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_channel.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_channel.channel_name
     *
     * @mbggenerated
     */
    private String channelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_channel.channel_status
     *
     * @mbggenerated
     */
    private Integer channelStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_channel.operator_id
     *
     * @mbggenerated
     */
    private Integer operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_channel.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_channel.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_channel.id
     *
     * @return the value of tbl_channel.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_channel.id
     *
     * @param id the value for tbl_channel.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_channel.channel_name
     *
     * @return the value of tbl_channel.channel_name
     *
     * @mbggenerated
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_channel.channel_name
     *
     * @param channelName the value for tbl_channel.channel_name
     *
     * @mbggenerated
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_channel.channel_status
     *
     * @return the value of tbl_channel.channel_status
     *
     * @mbggenerated
     */
    public Integer getChannelStatus() {
        return channelStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_channel.channel_status
     *
     * @param channelStatus the value for tbl_channel.channel_status
     *
     * @mbggenerated
     */
    public void setChannelStatus(Integer channelStatus) {
        this.channelStatus = channelStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_channel.operator_id
     *
     * @return the value of tbl_channel.operator_id
     *
     * @mbggenerated
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_channel.operator_id
     *
     * @param operatorId the value for tbl_channel.operator_id
     *
     * @mbggenerated
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_channel.create_time
     *
     * @return the value of tbl_channel.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_channel.create_time
     *
     * @param createTime the value for tbl_channel.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_channel.update_time
     *
     * @return the value of tbl_channel.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_channel.update_time
     *
     * @param updateTime the value for tbl_channel.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}