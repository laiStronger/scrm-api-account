/*
 * 文件名：BranchOrgDto.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：laishaoqiang
 * 修改时间：2017年2月23日
 * 修改内容：新增
 */
package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 连锁门店详情返回dto
 * @author     laishaoqiang
 * @since      2.2.4
 */
public class BranchOrgDetailDto implements Serializable {
    /**
     * 调测日志记录器。
     */
    private static final Logger LOG = LoggerFactory.getLogger(BranchOrgDetailDto.class);
    
    //组织架构id
    private Long id;
    
    //分店账号
    private String orgAccount;
    
    //分店名称
    private String orgName;
    
    //营业执照
    private String businessLicense;
    
    //省份
    private String provinceName;
    
    //市
    private String cityName;
    
    //区县
    private String areaName;
    
    //地址
    private String address;
    
    //总地址
    private String totalAddress;
    
    //所属机构
    private String topOrgName;
    
    //所属行业
    private String industryStr; 
    
    //一级行业
    private Long firstIndustryId;
    
    //二级行业
    private Long secondIndustryId;
    
    private String parentOrgName;
    
    //加入时间(Long)
    private Long createTime;
    
    //加入时间(String)
    private String createTimeStr;
    
    //机构略缩图
    private String thumLogo;

    public String getThumLogo() {
        return thumLogo;
    }

    public void setThumLogo(String thumLogo) {
        this.thumLogo = thumLogo;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getTotalAddress() {
        return totalAddress;
    }

    public void setTotalAddress(String totalAddress) {
        this.totalAddress = totalAddress;
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

    public String getOrgAccount() {
        return orgAccount;
    }

    public void setOrgAccount(String orgAccount) {
        this.orgAccount = orgAccount;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTopOrgName() {
        return topOrgName;
    }

    public void setTopOrgName(String topOrgName) {
        this.topOrgName = topOrgName;
    }

    public String getIndustryStr() {
        return industryStr;
    }

    public void setIndustryStr(String industryStr) {
        this.industryStr = industryStr;
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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }
    
    
}
