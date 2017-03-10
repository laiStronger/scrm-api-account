/*
 * 文件名：IOrgStaffService.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：tanguojun
 * 修改时间：2016年12月16日
 * 修改内容：新增
 */
package com.youanmi.scrm.api.account.service.org;

import java.util.List;

import com.youanmi.commons.base.exception.ViewExternalDisplayException;
import com.youanmi.commons.base.vo.PageBean;
import com.youanmi.scrm.api.account.dto.org.OrgStaffDto;
import com.youanmi.scrm.api.account.dto.user.ShopEmployeeDto;
import com.youanmi.scrm.api.account.dto.user.UserInfoDto;


/**
 * 机构员工api
 * 
 * @author tanguojun 2016年12月16日
 * @version 1.0.0
 */
public interface IOrgStaffService {

    /**
     * 根据用户id查询商户账号
     *
     * @param userId
     * @return
     * @author tanguojun on 2016年12月19日
     */
    OrgStaffDto getStaffByUserId(Long userId);

    void updateByPrimaryKeySelective(OrgStaffDto orgStaffDto);

    /**
     * 修改员工最后登录时间
     *
     * @param id
     * @param lastLoginTime
     * @author tanguojun on 2016年12月21日
     */
    void updateLastLoginTimeById(Long id, Long lastLoginTime);

    /**
     * 
     * 添加一个员工实体
     * 
     * @param orgStaffDto
     */
    Long insertSelective(OrgStaffDto orgStaffDto);

    /**
     * 
     * 根据员工id获取员工实体
     * 
     * @param id
     */
    OrgStaffDto getOrgStaffById(Long id);

    /**
     * 设置店员岗位id为空
     * 
     * @param id 店员id
     */
    void setPostNull(Long id);

    /**
     * 绑定员工和用户关系,删除新账号
     *
     * @param newStaffId
     * @param oldUserId
     * @param newUserId
     * @author tanguojun on 2016年12月22日
     */
    void bindNewStaffAndUserAndDelOldUser(Long newStaffId, Long oldUserId, Long newUserId)
            throws ViewExternalDisplayException;

    /**
     * 绑定新员工信息和旧用户的关系,删除新账号&旧员工
     *
     * @param newStaffId
     * @param oldUserId
     * @param oldStaffId
     * @param newUserId
     * @author tanguojun on 2016年12月22日
     */
    void bindNewStaffAndDelOldStaffAndNewUser(Long newStaffId, Long oldUserId, Long oldStaffId, Long newUserId)
            throws ViewExternalDisplayException;

    /**
     * 绑定新员工信息和旧用户的关系,删除新账号&旧员工&旧岗位
     *
     * @param newStaffId
     * @param oldUserId
     * @param oldStaffId
     * @param newUserId
     * @param oldPostId
     * @throws ViewExternalDisplayException
     * @author tanguojun on 2016年12月22日
     */
    void bindNewStaffAndDelOldStaffAndPostAndNewUser(Long newStaffId, Long oldUserId, Long oldStaffId,
            Long newUserId, Long oldPostId) throws ViewExternalDisplayException;

    /**
     * 分页查询机构员工列表
     *
     * @param topOrgId
     * @param inputValue
     * @param pageIndex
     * @param pageSize
     * @param orgId
     * @return
     * @throws ViewExternalDisplayException
     * @author tanguojun on 2016年12月26日
     */
    PageBean<OrgStaffDto> findOrgStaffList(Long topOrgId, String inputValue, Integer pageIndex,
            Integer pageSize, Long orgId) throws ViewExternalDisplayException;
    
    /**
	 * 查询岗位关联的员工列表
	 * @param postId 岗位id
	 * @return List<OrgStaffDto> 岗位关联的员工列表
	 * @author 张秋平
	 */
	List<OrgStaffDto> getOrgStaffPoListByPostId(Long postId);

    /**
     * 根据员工id获取员工基础信息
     * @param staffId 员工id
     * @return
     */
	UserInfoDto getBasicStaffInfo(Long staffId);

    /**
     * 获取某个门店的店长userid
     * @param orgId 门店id
     * @return
     */
	Long getClerkUserIdByOrg(Long orgId);

	List<ShopEmployeeDto> loadEmployeesByOrgId(Long orgId)throws Exception;

    /**
     * 删除店员
     * @param staffId 店员
     */
	void deleteStaff(Long staffId);

    /**
     * 获取机构员工总数,不包括管理员
     *
     * @param topOrgId
     * @return
     * @author tanguojun on 2017年3月2日
     */
	Long getCountStaffByTopOrg(Long topOrgId);
}
