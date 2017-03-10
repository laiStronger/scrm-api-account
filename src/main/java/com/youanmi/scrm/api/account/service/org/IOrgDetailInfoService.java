/*
 * 文件名：IOrgDetailInfoService.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：tanguojun
 * 修改时间：2016年12月16日
 * 修改内容：新增
 */
package com.youanmi.scrm.api.account.service.org;

import com.youanmi.scrm.api.account.dto.org.OrgAddressDto;
import com.youanmi.scrm.api.account.dto.org.OrgDetailInfoDto;


/**
 * 机构详细信息api
 * 
 * @author tanguojun 2016年12月16日
 * @version 1.0.0
 */
public interface IOrgDetailInfoService {

    /**
     * 新增机构详情
     * 
     * @param dto 机构详情
     */
    void addOrgDetailInfo(OrgDetailInfoDto dto);

    /**
     * 根据机构id查询机构详情
     *
     * @param orgId
     * @return
     * @author tanguojun on 2016年12月21日
     */
    OrgDetailInfoDto getOrgDetailByOrgId(Long orgId);
    
    /**
     * 
     * 编辑门店信息
     * 
     * @param dto
     */
    public void updateByParam(OrgDetailInfoDto dto);

    /**
     *  获取门店地址信息
     *  @param orgId 门店id
     *  @param topOrgId 顶级机构id
     */
    OrgAddressDto getOrgDetail(Long orgId, Long topOrgId);
}
