package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;

/**
 * 
 * @ClassName: DeptShopIdsAndCountDto
 * @Description: 部门对应的门店ids和数量dto
 * @author li.jinwen
 * @email lijinwen@youanmi.com
 * @date 2017年2月22日 下午12:13:52
 *
 */
public class DeptShopIdsAndCountDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long deptId;// 部门id

	private String shopIds;// 门店ids

	private Integer shopCount;// 门店数量

	// 扩展属性

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getShopIds() {
		return shopIds;
	}

	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}

	public Integer getShopCount() {
		return shopCount;
	}

	public void setShopCount(Integer shopCount) {
		this.shopCount = shopCount;
	}

}
