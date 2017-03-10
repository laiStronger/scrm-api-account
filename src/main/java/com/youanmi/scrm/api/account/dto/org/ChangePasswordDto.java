package com.youanmi.scrm.api.account.dto.org;

import com.youanmi.scrm.api.account.dto.OperatorDto;

/**
 * 修改密码dto
 * @author sunxiaolong on 2016/12/22
 */
public class ChangePasswordDto extends OperatorDto {

    /**
     * 用户id
     * 这个参数不由前端传递
     */
    private Long userId;
    /**
     * 旧密码
     */
    private String oldPassword;
    /**
     * 新密码
     */
    private String newPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
