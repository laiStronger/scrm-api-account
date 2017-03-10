package com.youanmi.scrm.api.account.dto.user;

import java.io.Serializable;

/**
 * 
 * @ClassName: ShopEmployeeDto
 * @Description: 店铺员工
 * @author li.jinwen
 * @email lijinwen@youanmi.com
 * @date 2017年2月25日 上午9:51:26
 *
 */
public class ShopEmployeeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long userId;//用户ID
	
	private String name;//用户名称
	
	private String postName;//岗位名称

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}
	
	
	
	
}
