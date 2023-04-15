package com.online.taxi.common.entity;

import java.util.Date;

public class CallRecords {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.pool_key
     *
     * @mbggenerated
     */
    private String poolKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.sub_id
     *
     * @mbggenerated
     */
    private String subId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.call_id
     *
     * @mbggenerated
     */
    private String callId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.phone_no
     *
     * @mbggenerated
     */
    private String phoneNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.secret_no
     *
     * @mbggenerated
     */
    private String secretNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.peer_no
     *
     * @mbggenerated
     */
    private String peerNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.call_type
     *
     * @mbggenerated
     */
    private String callType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.call_time
     *
     * @mbggenerated
     */
    private Date callTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.ring_time
     *
     * @mbggenerated
     */
    private Date ringTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.release_time
     *
     * @mbggenerated
     */
    private Date releaseTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.release_dir
     *
     * @mbggenerated
     */
    private String releaseDir;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.release_cause
     *
     * @mbggenerated
     */
    private Integer releaseCause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_call_records.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.id
     *
     * @return the value of tbl_call_records.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.id
     *
     * @param id the value for tbl_call_records.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.pool_key
     *
     * @return the value of tbl_call_records.pool_key
     *
     * @mbggenerated
     */
    public String getPoolKey() {
        return poolKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.pool_key
     *
     * @param poolKey the value for tbl_call_records.pool_key
     *
     * @mbggenerated
     */
    public void setPoolKey(String poolKey) {
        this.poolKey = poolKey == null ? null : poolKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.sub_id
     *
     * @return the value of tbl_call_records.sub_id
     *
     * @mbggenerated
     */
    public String getSubId() {
        return subId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.sub_id
     *
     * @param subId the value for tbl_call_records.sub_id
     *
     * @mbggenerated
     */
    public void setSubId(String subId) {
        this.subId = subId == null ? null : subId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.call_id
     *
     * @return the value of tbl_call_records.call_id
     *
     * @mbggenerated
     */
    public String getCallId() {
        return callId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.call_id
     *
     * @param callId the value for tbl_call_records.call_id
     *
     * @mbggenerated
     */
    public void setCallId(String callId) {
        this.callId = callId == null ? null : callId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.phone_no
     *
     * @return the value of tbl_call_records.phone_no
     *
     * @mbggenerated
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.phone_no
     *
     * @param phoneNo the value for tbl_call_records.phone_no
     *
     * @mbggenerated
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.secret_no
     *
     * @return the value of tbl_call_records.secret_no
     *
     * @mbggenerated
     */
    public String getSecretNo() {
        return secretNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.secret_no
     *
     * @param secretNo the value for tbl_call_records.secret_no
     *
     * @mbggenerated
     */
    public void setSecretNo(String secretNo) {
        this.secretNo = secretNo == null ? null : secretNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.peer_no
     *
     * @return the value of tbl_call_records.peer_no
     *
     * @mbggenerated
     */
    public String getPeerNo() {
        return peerNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.peer_no
     *
     * @param peerNo the value for tbl_call_records.peer_no
     *
     * @mbggenerated
     */
    public void setPeerNo(String peerNo) {
        this.peerNo = peerNo == null ? null : peerNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.call_type
     *
     * @return the value of tbl_call_records.call_type
     *
     * @mbggenerated
     */
    public String getCallType() {
        return callType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.call_type
     *
     * @param callType the value for tbl_call_records.call_type
     *
     * @mbggenerated
     */
    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.call_time
     *
     * @return the value of tbl_call_records.call_time
     *
     * @mbggenerated
     */
    public Date getCallTime() {
        return callTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.call_time
     *
     * @param callTime the value for tbl_call_records.call_time
     *
     * @mbggenerated
     */
    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.ring_time
     *
     * @return the value of tbl_call_records.ring_time
     *
     * @mbggenerated
     */
    public Date getRingTime() {
        return ringTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.ring_time
     *
     * @param ringTime the value for tbl_call_records.ring_time
     *
     * @mbggenerated
     */
    public void setRingTime(Date ringTime) {
        this.ringTime = ringTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.start_time
     *
     * @return the value of tbl_call_records.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.start_time
     *
     * @param startTime the value for tbl_call_records.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.release_time
     *
     * @return the value of tbl_call_records.release_time
     *
     * @mbggenerated
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.release_time
     *
     * @param releaseTime the value for tbl_call_records.release_time
     *
     * @mbggenerated
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.release_dir
     *
     * @return the value of tbl_call_records.release_dir
     *
     * @mbggenerated
     */
    public String getReleaseDir() {
        return releaseDir;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.release_dir
     *
     * @param releaseDir the value for tbl_call_records.release_dir
     *
     * @mbggenerated
     */
    public void setReleaseDir(String releaseDir) {
        this.releaseDir = releaseDir == null ? null : releaseDir.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.release_cause
     *
     * @return the value of tbl_call_records.release_cause
     *
     * @mbggenerated
     */
    public Integer getReleaseCause() {
        return releaseCause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.release_cause
     *
     * @param releaseCause the value for tbl_call_records.release_cause
     *
     * @mbggenerated
     */
    public void setReleaseCause(Integer releaseCause) {
        this.releaseCause = releaseCause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.create_time
     *
     * @return the value of tbl_call_records.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.create_time
     *
     * @param createTime the value for tbl_call_records.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_call_records.update_time
     *
     * @return the value of tbl_call_records.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_call_records.update_time
     *
     * @param updateTime the value for tbl_call_records.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}