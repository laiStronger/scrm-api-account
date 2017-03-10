package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;

import com.youanmi.scrm.api.account.dto.user.UserInfoDto;

/**
 * 添加类的一句话简单描述。
 * <p>
 * 详细描述
 *
 * @author Administrator on 2016/12/22
 * @since ${version}
 */
public class OrgStaffDetailDto implements Serializable{

    /**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	private Long id; //店员id

    private Long orgId; //门店id

    private String mobilePhone; //手机号

    private String orgName; //机构名称

    private String postName; //岗位名称

    private String userName; //账号

    private String staffName; //店员名称

    private Long userId; //用户id
    
    private Long postId;//岗位id
    
    private UserInfoDto user;//用户信息
    
    private OrgPostDto post;//员工岗位信息
    
//    private Byte queryType;//查询类型(1:账号，2:手机号码，3:姓名)
    
    private Integer pageIndex=1; // 分页，默认为第一页
    
    private Integer pageSize=10;// 分页，默认分页大小是10
    
    public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

//	public Byte getQueryType() {
//		return queryType;
//	}
//
//	public void setQueryType(Byte queryType) {
//		this.queryType = queryType;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	/**
     * 获取用户信息
     * @return UserInfoDto 用户对象
     */
    public UserInfoDto getUser() {
		return user;
	}

    /**
     * 设置用户信息
     * @param user UserInfoDto用户信息
     */
	public void setUser(UserInfoDto user) {
		this.user = user;
	}

	/**
	 * 获取岗位
	 * @return OrgPostDto 岗位对象
	 */
	public OrgPostDto getPost() {
		return post;
	}

	/**
	 * 设置岗位
	 * @param post OrgPostDto岗位对象
	 */
	public void setPost(OrgPostDto post) {
		this.post = post;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
