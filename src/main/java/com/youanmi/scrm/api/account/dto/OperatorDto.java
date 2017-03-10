package com.youanmi.scrm.api.account.dto;

import java.io.Serializable;

/**
 * 增删改操作人的dto
 * 很多操作需要判断当前用户与所操作数据的关系,比如A连锁店内的超级管理员只能删除A连锁店内的数据
 *
 * @author sunxiaolong on 2016/12/20
 */
public class OperatorDto implements Serializable{
    /**
     * 操作人的staffId
     */
    private Long operatorId;
    /**
     * 操作人所属顶级机构id
     */
    private Long operatorTopOrgId;

    /**
     * 操作人的部门/门店 id
     */
    private Long operatorOrgId;

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getOperatorTopOrgId() {
        return operatorTopOrgId;
    }

    public void setOperatorTopOrgId(Long operatorTopOrgId) {
        this.operatorTopOrgId = operatorTopOrgId;
    }

    public Long getOperatorOrgId() {
        return operatorOrgId;
    }

    public void setOperatorOrgId(Long operatorOrgId) {
        this.operatorOrgId = operatorOrgId;
    }

}
