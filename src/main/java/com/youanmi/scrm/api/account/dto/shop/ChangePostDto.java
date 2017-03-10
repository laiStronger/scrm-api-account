package com.youanmi.scrm.api.account.dto.shop;

import com.youanmi.scrm.api.account.dto.OperatorDto;

/**
 * 店员调岗dto
 * @author sunxiaolong on 2016/12/22
 */
public class ChangePostDto extends OperatorDto {
    /**
     * 店员id
     */
    private Long staffId;
    /**
     * 新岗位id
     */
    private Long postId;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
