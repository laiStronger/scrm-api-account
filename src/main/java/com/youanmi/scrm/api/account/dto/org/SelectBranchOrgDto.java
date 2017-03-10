/*
 * 文件名：SelectBranchOrgDto.java
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
 * 查询连锁门店dto
 * @author     laishaoqiang
 */
public class SelectBranchOrgDto implements Serializable{
    /**
     * 调测日志记录器。
     */
    private static final Logger LOG = LoggerFactory.getLogger(SelectBranchOrgDto.class);
    
    private Integer accountOrName;
    
    private String key;
    
    private String topOrgName;
    
    //开始时间
    private String startTimeStr;
    
    //结束时间
    private String endTimeStr;
    
    //开始时间
    private Long startTimeStamp;
    
    //结束时间
    private Long endTimeStamp;
    
    private Long firstIndustryId;
    
    private Long secondIndustryId;
    
    private Long provinceId;
    
    private Long cityId;
    
    private Long areaId;

    private Integer startIndex;
    
    private Integer pageSize;
    
    
    public Long getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public Long getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getAccountOrName() {
        return accountOrName;
    }

    public void setAccountOrName(Integer accountOrName) {
        this.accountOrName = accountOrName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTopOrgName() {
        return topOrgName;
    }

    public void setTopOrgName(String topOrgName) {
        this.topOrgName = topOrgName;
    }

    public String getStartTimeStr() {
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    public String getEndTimeStr() {
        return endTimeStr;
    }

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
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

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }
    
    
    
    
}
