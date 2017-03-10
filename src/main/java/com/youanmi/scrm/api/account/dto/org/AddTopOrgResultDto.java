package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;

/**
 * @author sunxiaolong on 2017/3/8
 */
public class AddTopOrgResultDto implements Serializable{
    /**
     * 超管的postId
     */
    private Long superAdminPostId;

    public Long getSuperAdminPostId() {
        return superAdminPostId;
    }

    public void setSuperAdminPostId(Long superAdminPostId) {
        this.superAdminPostId = superAdminPostId;
    }
}
