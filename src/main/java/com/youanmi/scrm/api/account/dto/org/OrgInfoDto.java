package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class OrgInfoDto implements Serializable {
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long parentOrgId;

    private Long topOrgId;

    private String orgFullName;

    private String orgName;

    private Byte orgType;

    private Byte orgLevel;

    private String orgPath;

    private Long createTime;

    private Long updateTime;

    private Byte isForbid;

    private Byte isDelete;

    // 机构详情
    private OrgDetailInfoDto orgDetail;

    // 顶级机构信息
    private OrgInfoDto topOrgInfo;

    // 父机构名称
    private String parentOrgName;

    // 地址
    private String address;

    // 管理员账号
    private String adminAccount;

    // 员工数
    private Integer userCount;

    // logo机构logo
    private String logo;

    // thum_logo机构缩略logo
    private String thumLogo;

    // first_industry_id一级行业id
    private Long firstIndustryId;

    // second_industry_id二级行业id
    private Long secondIndustryId;

    // org_account机构账号
    private String orgAccount;

    // 是否删除,默认为真
    private Boolean isDeleteAllowed = true;

    private List<OrgInfoDto> children = new ArrayList<OrgInfoDto>();

    // 冗余字段
    private Long toRepeatMemberCount;

    // 机构到期时间
    private OrgExpireTimeDto orgExpireTime;

    // 一级行业名称
    private String firstIndustryName;
    // 二级行业名称
    private String secondIndustryName;
    // 员工总数
    private Long staffCount;
    // 分店总数
    private Long shopCount;

    public Long getToRepeatMemberCount() {
        return toRepeatMemberCount;
    }

    public void setToRepeatMemberCount(Long toRepeatMemberCount) {
        this.toRepeatMemberCount = toRepeatMemberCount;
    }

    public OrgInfoDto() {

    }

    /**
     * 
     * 构造函数。
     * 
     * @param id
     * @param orgName
     * @param parentOrgId
     */
    public OrgInfoDto(Long id, String orgName, Long parentOrgId) {
        this.id = id;
        this.orgName = orgName;
        this.parentOrgId = parentOrgId;
    }

    public Boolean getDeleteAllowed() {
        return isDeleteAllowed;
    }

    public void setDeleteAllowed(Boolean deleteAllowed) {
        isDeleteAllowed = deleteAllowed;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentOrgName() {
        return parentOrgName;
    }

    public void setParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(Long parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public Long getTopOrgId() {
        return topOrgId;
    }

    public void setTopOrgId(Long topOrgId) {
        this.topOrgId = topOrgId;
    }

    public String getOrgFullName() {
        return orgFullName;
    }

    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName == null ? null : orgFullName.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Byte getOrgType() {
        return orgType;
    }

    public void setOrgType(Byte orgType) {
        this.orgType = orgType;
    }

    public Byte getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Byte orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getOrgPath() {
        return orgPath;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath == null ? null : orgPath.trim();
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

    public Byte getIsForbid() {
        return isForbid;
    }

    public void setIsForbid(Byte isForbid) {
        this.isForbid = isForbid;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public OrgInfoDto getTopOrgInfo() {
        return topOrgInfo;
    }

    public void setTopOrgInfo(OrgInfoDto topOrgInfo) {
        this.topOrgInfo = topOrgInfo;
    }

    public OrgDetailInfoDto getOrgDetail() {
        return orgDetail;
    }

    public void setOrgDetail(OrgDetailInfoDto orgDetail) {
        this.orgDetail = orgDetail;
    }

    public List<OrgInfoDto> getChildren() {
        return children;
    }

    public void setChildren(List<OrgInfoDto> children) {
        this.children = children;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getThumLogo() {
        return thumLogo;
    }

    public void setThumLogo(String thumLogo) {
        this.thumLogo = thumLogo;
    }

    public Long getFirstIndustryId() {
        return firstIndustryId;
    }

    public void setFirstIndustryId(Long firstIndustryId) {
        this.firstIndustryId = firstIndustryId;
    }

    public Long getSecondIndustryId() {
        return secondIndustryId;
    }

    public void setSecondIndustryId(Long secondIndustryId) {
        this.secondIndustryId = secondIndustryId;
    }

    public String getOrgAccount() {
        return orgAccount;
    }

    public void setOrgAccount(String orgAccount) {
        this.orgAccount = orgAccount;
    }

    public OrgExpireTimeDto getOrgExpireTime() {
        return orgExpireTime;
    }

    public void setOrgExpireTime(OrgExpireTimeDto orgExpireTime) {
        this.orgExpireTime = orgExpireTime;
    }

    public String getFirstIndustryName() {
        return firstIndustryName;
    }

    public void setFirstIndustryName(String firstIndustryName) {
        this.firstIndustryName = firstIndustryName;
    }

    public String getSecondIndustryName() {
        return secondIndustryName;
    }

    public void setSecondIndustryName(String secondIndustryName) {
        this.secondIndustryName = secondIndustryName;
    }

    public Long getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(Long staffCount) {
        this.staffCount = staffCount;
    }

    public Long getShopCount() {
        return shopCount;
    }

    public void setShopCount(Long shopCount) {
        this.shopCount = shopCount;
    }

}