package com.youanmi.scrm.api.account.dto.user;

import java.io.Serializable;


public class UserInfoDto implements Serializable {
    /**
     * 可序列化id
     */
    private static final long serialVersionUID = 2793798071033099129L;

    private Long id;

    private String userName;// 用户名

    private String mobilePhone;// 手机号码

    private String password;// 密码

    private Byte userType;// 用户类型

    private Long createTime;// 创建时间

    private Long updateTime;// 更新时间

    private Byte isDelete;// 1：为删除，2：删除

    private Long postId;// 岗位id

    private Byte queryType;// 查询类型(1:账号，2:手机号码，3:姓名)

    /**
     * 性别 (1.男 2.女)
     */
    private Byte gender;

    /**
     *
     */
    private Long birthday;

    /**
     * 是否禁用(1:未禁用,2:已禁用)
     */
    private Byte isForbid;

    /**
     * 激活状态(1:未激活,2:已激活)(绑定了手机号就是激活状态,解绑了就是未激活)
     */
    private Byte isActive;

    private String name;

    /**
     * 头像
     */
    private String headUrl;

    /**
     * 头像缩略图
     */
    private String thumHeadUrl;

    /**
     * 所属门店
     */
    private String orgName;

    /**
     * 岗位名称
     */
    private String postName;

    // 是否使用(1:未使用,2:已使用)(登录过系统,则为使用过)
    private Byte isUse;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public Byte getIsForbid() {
        return isForbid;
    }

    public void setIsForbid(Byte isForbid) {
        this.isForbid = isForbid;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getThumHeadUrl() {
        return thumHeadUrl;
    }

    public void setThumHeadUrl(String thumHeadUrl) {
        this.thumHeadUrl = thumHeadUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Byte getQueryType() {
        return queryType;
    }

    public void setQueryType(Byte queryType) {
        this.queryType = queryType;
    }

    public Byte getIsUse() {
        return isUse;
    }

    public void setIsUse(Byte isUse) {
        this.isUse = isUse;
    }

    @Override
    public String toString() {
        return "UserInfoDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDelete=" + isDelete +
                ", postId=" + postId +
                ", queryType=" + queryType +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", isForbid=" + isForbid +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", headUrl='" + headUrl + '\'' +
                ", thumHeadUrl='" + thumHeadUrl + '\'' +
                ", orgName='" + orgName + '\'' +
                ", postName='" + postName + '\'' +
                ", isUse=" + isUse +
                '}';
    }
}