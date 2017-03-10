package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 部门层级树dto
 *
 * @author sunxiaolong on 2016/12/21
 */
public class DepartmentTreeDto implements Serializable {
    private Long id;
    private String name;
    private List<DepartmentTreeDto> departments = new ArrayList<>();
    private List<DepartmentStaffDto> staffs = new ArrayList<>();

    private Byte orgLevel;

    /**
     * 部门下的门店数,只有最底层的部门下才会有门店,且 有门店的部门不会有子部门 即 shopCount 和 departments这连个字段不会同时有值
     */
    private Integer shopCount;

    //冗余字段
    private Long toRepeatMemberCount;//去重的会员数量
    
    public void setToRepeatMemberCount(Long toRepeatMemberCount) {
		this.toRepeatMemberCount = toRepeatMemberCount;
	}
    public Long getToRepeatMemberCount() {
		return toRepeatMemberCount;
	}
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<DepartmentTreeDto> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DepartmentTreeDto> departments) {
        this.departments = departments;
    }

    public List<DepartmentStaffDto> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<DepartmentStaffDto> staffs) {
        this.staffs = staffs;
    }

    public Integer getShopCount() {
        return shopCount;
    }

    public void setShopCount(Integer shopCount) {
        this.shopCount = shopCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Byte orgLevel) {
        this.orgLevel = orgLevel;
    }
}
