package com.youanmi.scrm.api.account.dto.org;

import java.io.Serializable;
import java.util.Set;


public class OrgPostDto implements Serializable {
    /**
	 * 序列化id
	 */
	private static final long serialVersionUID = -8693549655282707656L;

    private Long id;

    private Long orgId;

    private Long topOrgId;

    private String postName;

    private Byte postType;

    private Long createTime;

    private Long updateTime;

    private Byte isDelete;
    
    
    private Set<Long> permissionIds;//岗位对应的权限id
    
    private Integer clerkCount;//岗位关联的店员人数
    
    

    public OrgPostDto() {
		super();
	}

	public OrgPostDto(Long orgId, String postName) {
		super();
		this.orgId = orgId;
		this.postName = postName;
	}
	
	public OrgPostDto(Long orgId,Long id, String postName) {
		super();
		this.orgId = orgId;
		this.postName = postName;
		this.id = id;
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

    public Long getTopOrgId() {
        return topOrgId;
    }

    public void setTopOrgId(Long topOrgId) {
        this.topOrgId = topOrgId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public Byte getPostType() {
        return postType;
    }

    public void setPostType(Byte postType) {
        this.postType = postType;
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

    public Byte getIsDelete() {
        return isDelete;
    }
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

	public Set<Long> getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(Set<Long> permissionIds) {
		this.permissionIds = permissionIds;
	}

	public Integer getClerkCount() {
		return clerkCount;
	}

	public void setClerkCount(Integer clerkCount) {
		this.clerkCount = clerkCount;
	}

	@Override
	public String toString() {
		return "OrgPostDto [id=" + id + ", orgId=" + orgId + ", topOrgId="
				+ topOrgId + ", postName=" + postName + ", postType="
				+ postType + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", isDelete=" + isDelete + ", permissionIds="
				+ permissionIds + "]";
	}

    
    
}