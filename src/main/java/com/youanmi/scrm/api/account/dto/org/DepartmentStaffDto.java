package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;

/**
 * 部门员工dto
 *
 * @author sunxiaolong on 2016/12/21
 */
public class DepartmentStaffDto implements Serializable {
    private Long id;
    private String userName;
    private String name;
    private String mobilePhone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
