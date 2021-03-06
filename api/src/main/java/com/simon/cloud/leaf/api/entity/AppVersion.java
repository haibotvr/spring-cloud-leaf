package com.simon.cloud.leaf.api.entity;

import java.util.Date;

public class AppVersion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.id
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.version_key
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    private String versionKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.version_value
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    private String versionValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.create_time
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.update_time
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.key_id
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    private Long keyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.key_level
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    private Integer keyLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.id
     *
     * @return the value of app_version.id
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.id
     *
     * @param id the value for app_version.id
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.version_key
     *
     * @return the value of app_version.version_key
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public String getVersionKey() {
        return versionKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.version_key
     *
     * @param versionKey the value for app_version.version_key
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setVersionKey(String versionKey) {
        this.versionKey = versionKey == null ? null : versionKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.version_value
     *
     * @return the value of app_version.version_value
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public String getVersionValue() {
        return versionValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.version_value
     *
     * @param versionValue the value for app_version.version_value
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setVersionValue(String versionValue) {
        this.versionValue = versionValue == null ? null : versionValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.create_time
     *
     * @return the value of app_version.create_time
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.create_time
     *
     * @param createTime the value for app_version.create_time
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.update_time
     *
     * @return the value of app_version.update_time
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.update_time
     *
     * @param updateTime the value for app_version.update_time
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.key_id
     *
     * @return the value of app_version.key_id
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public Long getKeyId() {
        return keyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.key_id
     *
     * @param keyId the value for app_version.key_id
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setKeyId(Long keyId) {
        this.keyId = keyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.key_level
     *
     * @return the value of app_version.key_level
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public Integer getKeyLevel() {
        return keyLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.key_level
     *
     * @param keyLevel the value for app_version.key_level
     *
     * @mbg.generated Thu Apr 18 10:41:34 CST 2019
     */
    public void setKeyLevel(Integer keyLevel) {
        this.keyLevel = keyLevel;
    }
}