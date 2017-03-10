package com.youanmi.scrm.api.account.dto.org;

import com.youanmi.scrm.api.account.dto.OperatorDto;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 编辑基本信息dto
 * @author sunxiaolong on 2017/2/9
 */
public class UpdateCurrentUserInfoDto extends OperatorDto{

    private String staffName;

    private Byte gender;

    private Date birthday;

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
