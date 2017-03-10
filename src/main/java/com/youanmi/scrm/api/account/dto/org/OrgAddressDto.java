package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;

/**
 * 机构地址信息
 * <p>
 * 详细描述
 *
 * @author 刘兵 on 2017/2/21
 * @since ${version}
 */
public class OrgAddressDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orgName; //机构名称

    private String provinceName; //省份名

    private String cityName; //城市名

    private String areaName; //区域名

    private String address; //地址

    private OrgAddressDto parentAddress; //连锁机构地址信息

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public OrgAddressDto getParentAddress() {
        return parentAddress;
    }

    public void setParentAddress(OrgAddressDto parentAddress) {
        this.parentAddress = parentAddress;
    }
}
