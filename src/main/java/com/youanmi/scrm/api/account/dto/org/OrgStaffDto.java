package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;

import com.youanmi.scrm.api.account.dto.user.UserInfoDto;


public class OrgStaffDto implements Serializable {
    private Long id;

    private String staffName;

    private Long userId;

    private Long orgId;

    private Long topOrgId;

    private Long lastLoginTime;

    private Long postId;

    private Long createrId;

    private Long createTime;

    private Long updateTime;

    private Byte isDelete;

    // 所属机构信息
    private OrgInfoDto orgInfo;

    // 用户信息
    private UserInfoDto userInfo;

    // 顶级机构信息
    private OrgInfoDto topOrgInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getTopOrgId() {
        return topOrgId;
    }

    public void setTopOrgId(Long topOrgId) {
        this.topOrgId = topOrgId;
    }

    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
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

    public OrgInfoDto getOrgInfo() {
        return orgInfo;
    }

    public void setOrgInfo(OrgInfoDto orgInfo) {
        this.orgInfo = orgInfo;
    }

    public UserInfoDto getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoDto userInfo) {
        this.userInfo = userInfo;
    }

    public OrgInfoDto getTopOrgInfo() {
        return topOrgInfo;
    }

    public void setTopOrgInfo(OrgInfoDto topOrgInfo) {
        this.topOrgInfo = topOrgInfo;
    }

}