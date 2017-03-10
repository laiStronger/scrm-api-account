/*
 * 文件名：IOrgPostService.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：tanguojun
 * 修改时间：2016年12月16日
 * 修改内容：新增
 */
package com.youanmi.scrm.api.account.service.org;

import com.youanmi.commons.base.vo.PageBean;
import com.youanmi.scrm.api.account.dto.org.OrgPostDto;
import com.youanmi.scrm.api.account.dto.org.OrgStaffDto;

import java.util.List;

/**
 * 机构岗位api
 * 
 * @author tanguojun 2016年12月16日
 * @version 1.0.0
 */
public interface IOrgPostService {
	
	/**
	 * 机构岗位分页查询
	 * @param page PageBean<UserInfoDto>分页对象信息
	 * @author 张秋平 2016-12-19
	 */
	PageBean<OrgPostDto> getOrgPostPage(PageBean<OrgPostDto> page);
	
	/**
	 * 增加机构岗位信息 门店内的岗位名称不可重复
	 * @param orgPostDto
	 * @return OrgPostDto 增加的数量
	 * @author 张秋平 2016-12-19
	 */
	OrgPostDto addOrgPost(OrgPostDto orgPostDto);
	
	/**
	 * 编辑机构岗位信息
	 * @param orgPostDto 机构岗位信息
	 * @author 张秋平 2016-12-19
	 */
	void editOrgPost(OrgPostDto orgPostDto);
	
	/**
	 * 删除机构岗位信息
	 * @param id 机构岗位id
	 * @return int 删除的数量
	 * @author 张秋平 2016-12-19
	 */
	int delOrgPost(Long id);
	
	/**
     * 
     * 员工id获取岗位实体
     * 
     * @param staffId
     * @return
     */
    OrgPostDto getStaffPostByStaffId(Long staffId);

    void updateByPrimaryKeySelective(OrgPostDto updateOrgPostDto);

    /**
     * 
     * 插入岗位实体
     * 
     * @param orgPostDto
     * @return
     */
    Long insertSelective(OrgPostDto orgPostDto);

	/**
	 * 查询机构(门店)下的所有岗位，返回集合； 张秋平 2016-12-22
	 *
	 * @param post 机构岗位信息
	 * @return List<OrgPostDto> 门店所有岗位集合
	 */
	List<OrgPostDto> getAllOrgPost(OrgPostDto post);
	
	/**
	 * 查询调岗时的岗位列表(如果店长岗位已关联店员，则不显示)
	 * @param orgId 机构id
	 * @return List<OrgPostDto> 岗位列表
	 * @author 张秋平
	 */
	List<OrgPostDto> getAllOrgPostForAdjustPost(Long orgId);

	OrgPostDto getPost(Long postId);

	/**
	 * 根据岗位id，获取岗位信息
	 * @param id 岗位id
	 * @return OrgPostDto 岗位对象信息
	 * 张秋平 2016-12-22
	 */
	OrgPostDto getOrgPost(Long id);
	
	/**
	 * 根据机构id和岗位名称查询岗位信息（主要用户判断岗位名称是否存在）
	 * @param postName 岗位名称
	 * @param orgId 机构id
	 * @param postId 岗位id
	 * @return OrgPostDto返回岗位对象
	 * 张秋平 2016-12-30
	 */
	List<OrgPostDto> getOrgPostByPost(OrgPostDto org);
	
}
