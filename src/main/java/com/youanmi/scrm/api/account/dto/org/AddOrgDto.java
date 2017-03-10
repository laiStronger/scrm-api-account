package com.youanmi.scrm.api.account.dto.org;

import com.youanmi.scrm.api.account.dto.OperatorDto;

/**
 *
 * 添加部门层级dto
 *
 * @author sunxiaolong on 2016/12/19
 */
public class AddOrgDto extends OperatorDto {

    /**
     * 名称
     */
    private String name;
    /**
     * 所属部门id
     */
    private Long parentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
