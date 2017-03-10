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
 * 连锁门店返回dto
 * @author     laishaoqiang
 * @since      2.2.4
 */
public class BranchOrgDto implements Serializable {
    /**
     * 调测日志记录器。
     */
    private static final Logger LOG = LoggerFactory.getLogger(BranchOrgDto.class);
    
    //组织架构id
    private Long id;
    
    //加入时间(Long)
    private Long createTime;
    
    //加入时间(String)
    private String createTimeStr;
    
    //分店账号
    private String orgAccount;
    
    //分店名称
    private String orgName;
    
    //所属机构
    private String topOrgName;
    
    //所属行业
    private String industryStr; 
    
    //一级行业
    private Long firstIndustryId;
    
    //二级行业
    private Long secondIndustryId;
    
    //员工数
    private Integer staffCount;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
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

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
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

    public Integer getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(Integer staffCount) {
        this.staffCount = staffCount;
    }
    
    
}
