/*
 * 文件名：IOrgInfoService.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：tanguojun
 * 修改时间：2016年12月16日
 * 修改内容：新增
 */
package com.youanmi.scrm.api.account.service.org;

import java.util.List;
import java.util.Map;

import com.youanmi.commons.base.exception.ViewExternalDisplayException;
import com.youanmi.commons.base.vo.PageBean;
import com.youanmi.scrm.api.account.dto.IdDto;
import com.youanmi.scrm.api.account.dto.OperatorDto;
import com.youanmi.scrm.api.account.dto.org.*;


/**
 * 机构信息api
 * 
 * @author tanguojun 2016年12月16日
 * @version 1.0.0
 */
public interface IOrgInfoService {

    /**
     * 获取直属部门
     * 
     * @param topOrgId 顶部机构id
     * @author liubing
     * @date 2016年12月19日
     * @return 直属部门信息
     */
    List<OrgInfoDto> getDirectOrg(Long topOrgId);

    /**
     * 获取门店列表
     * 
     * @param pageBean 分页对象
     * @author liubing
     * @date 2016年12月19日
     */
    PageBean<OrgInfoDto> getShopList(PageBean<OrgInfoDto> pageBean);

    /**
     * 
     * 员工id获取机构实体
     * 
     * @param staffId
     * @return
     */
    OrgInfoDto getOrgByStaffId(Long staffId);

    /**
     * 添加层级
     */
    Long addOrg(AddOrgDto dto) throws ViewExternalDisplayException;

    Byte getOrgChildOrgType(Long id);

    /**
     * 修改层级名称
     */
    void updateOrgName(UpdateOrgNameDto dto) throws ViewExternalDisplayException;

    /**
     * 删除层级
     */
    void deleteOrg(IdDto dto) throws ViewExternalDisplayException;

    /**
     * 根据机构id查询机构信息(如果是部门机构,则也会返回顶级机构信息)
     *
     * @param orgId
     * @return
     * @author tanguojun on 2016年12月19日
     */
    OrgInfoDto getOrgAndTopOrgInfoById(Long orgId);

    OrgInfoDto getOrgById(Long id);

    /**
     * 新增分店
     * 
     * @param orgInfoDto 店铺信息
     * @return 分店id
     * @author liubing
     */
    Long addShopOrg(OrgInfoDto orgInfoDto);

    /**
     * 部门组织架构树 author sunxiaolong
     */
    DepartmentTreeDto departmentTree(OperatorDto dto);

    /**
     * 获取当前连锁体系下其他门店
     * 
     * @param topOrgId 顶级机构id
     * @param orgId 当前门店id
     * @return list
     * @author liubing
     */
    List<OrgInfoDto> getOtherOrg(Long topOrgId, Long orgId);

    /**
     * 
     * 根据顶级机构获取整个组织机构
     * 
     * @param topOrgId
     * @return
     */
    List<OrgInfoDto> selectAllChainOrg(Long topOrgId);

    /**
     * 根据顶层机构获取所有门店
     * 
     * @param topOrgId 顶级机构id
     * @return list
     * @author liubing
     */
    List<OrgInfoDto> getAllChainShopByTopOrg(Long topOrgId);

    void updateByPrimaryKeySelective(OrgInfoDto dto);

    /**
     * 查询部门层级
     *
     * @param topOrgId
     * @return
     * @author tanguojun on 2016年12月26日
     */
    List<OrgInfoDto> getDepartmentOrgByTopOrgId(Long topOrgId);

    /**
     * 根据顶级机构id和机构名称查找门店列表
     * 
     * @param topOrgId 顶级机构id
     * @param orgName 门店名称
     * @return
     */
    List<Long> getShopByTopOrgAndName(Long topOrgId, String orgName);

    /**
     * 
     * @Description: 修改机构信息
     * @author li.jinwen
     * @email lijinwen@youanmi.com
     * @date 2017年2月13日 下午1:30:57
     * @param org
     * @param extras 额外的信息，后期如果绑定其他的业务，则可以继续扩展。
     * @throws ViewExternalDisplayException
     */
    void editOrgInfo(OrgInfoDto org, Object... extras) throws ViewExternalDisplayException;

    /**
     * 
     * @Description: 查询机构名称是否重名;
     * @author li.jinwen
     * @email lijinwen@youanmi.com
     * @date 2017年2月16日 下午7:26:14
     * @param params
     * @return
     */
    boolean uniqueneOrgParams(Map<String, Object> params);

    /**
     * 
     * @Description: 简单的部门树
     * @author li.jinwen
     * @email lijinwen@youanmi.com
     * @date 2017年2月16日 下午3:38:10
     * @param init
     * @return
     */
    List<OrgInfoDto> getDepts(OperatorDto dto) throws Exception;

    /**
     * 重置门店管理员密码
     *
     * @param orgId
     * @param topOrgId
     * @author tanguojun on 2017年2月20日
     */
    void resetShopManagerPwd(Long orgId, Long topOrgId) throws ViewExternalDisplayException;

    /**
     * 删除分店
     * 
     * @param orgId 分店id
     */
    void deleteShop(Long orgId);

    /**
     * 获取一个org下的所有门店id
     * 
     * @param orgId
     * @return
     */
    List<Long> getChildShopIds(Long orgId);

    /**
     * 
     * @Description: 根据层级Id获取改层级下所有门店的ids和数量
     * @author li.jinwen
     * @email lijinwen@youanmi.com
     * @date 2017年2月22日 下午12:22:37
     * @param topOrgId 必传参数，为空将抛出异常
     * @param orgPath 为null时，默认查询topOrgId下的所有门店
     * @return
     * @throws Exception
     */
    List<DeptShopIdsAndCountDto> getShopIdsAndCountByDeptId(Long topOrgId, String orgPath) throws Exception;

    /**
     * 
     * 连锁分店列表
     * 
     * @return
     */
    List<BranchOrgDto> branchOrgList(SelectBranchOrgDto dto);

    /**
     * 
     * 连锁分店数量
     * 
     * @param dto
     * @return
     */
    Long branchOrgCount(SelectBranchOrgDto dto);

    /**
     * 
     * 连锁分店详情
     * 
     * @return
     */
    BranchOrgDetailDto getBranchOrgDetail(Long orgId);

    /**
     * 分页条件查询机构列表
     *
     * @param pageIndex
     * @param pageSize
     * @param orgType
     * @param orgFullName
     * @param orgAccount
     * @param firstIndustryId
     * @param secondIndustryId
     * @param startExpireTime
     * @param endExpireTime
     * @param startCreateTime
     * @param endCreateTime
     * @param provinceId
     * @param cityId
     * @param areaId
     * @return
     * @throws ViewExternalDisplayException
     * @author tanguojun on 2017年3月1日
     */
    PageBean<OrgInfoDto> selectOrgListByCondition(int pageIndex, int pageSize, Byte orgType,
            String orgFullName, String orgAccount, Long firstIndustryId, Long secondIndustryId,
            Long startExpireTime, Long endExpireTime, Long startCreateTime, Long endCreateTime,
            Long provinceId, Long cityId, Long areaId) throws ViewExternalDisplayException;

    /**
     * 获取机构分店总数
     *
     * @param topOrgId
     * @return
     * @author tanguojun on 2017年3月2日
     */
    Long getCountShopByTopOrg(Long topOrgId);

    /**
     * 删除机构
     *
     * @param topOrgId
     * @throws ViewExternalDisplayException
     * @author tanguojun on 2017年3月6日
     */
    boolean deleteOrgsByTopOrgId(Long topOrgId) throws ViewExternalDisplayException;

    /**
     * 重置机构账号密码
     *
     * @param orgId
     * @throws ViewExternalDisplayException
     * @author tanguojun on 2017年3月6日
     */
    void resetOrgManagerPwd(Long orgId, Byte orgType) throws ViewExternalDisplayException;

    /**
     * 新增顶级机构/单店
     */
    AddTopOrgResultDto addTopOrg(AddTopOrgDto dto);
}
