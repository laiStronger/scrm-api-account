package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;

public class OrgExpireTimeDto implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long topOrgId;

    private Long expireTime;

    private Long createTime;

    private Long updateTime;

    public Long getTopOrgId() {
        return topOrgId;
    }

    public void setTopOrgId(Long topOrgId) {
        this.topOrgId = topOrgId;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
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
}