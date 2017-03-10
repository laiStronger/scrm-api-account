package com.youanmi.scrm.api.account.service.shop;

import com.youanmi.commons.base.exception.ViewExternalDisplayException;
import com.youanmi.commons.base.vo.PageBean;
import com.youanmi.scrm.api.account.dto.org.OrgStaffDetailDto;
import com.youanmi.scrm.api.account.dto.shop.ChangePostDto;

/**
 * @author sunxiaolong on 2016/12/22
 */
public interface IShopStaffService {
    /**
     * 调岗
     */
    void changePost(ChangePostDto param) throws ViewExternalDisplayException;

    /**
     * 获取店员列表
     * @param pageBean 分页对象
     * @return 分页结果
     */
    PageBean<OrgStaffDetailDto> getStaffList(PageBean<OrgStaffDetailDto> pageBean);
    
    /**
     * @see 获取店员列表-----新分页测试。
     * @param pageBean 分页对象
     * @return 分页结果
     */
    PageBean<OrgStaffDetailDto> getStaffList222(PageBean<OrgStaffDetailDto> pageBean);
    
    /**
     * 分页：查询店员列表
     * @param pageBean  PageBean<OrgStaffDetailDto>分页对象
     * @param user UserInfoDto用户对象
     * @return PageBean<OrgStaffDetailDto>分页对象
     * @author 张秋平 2016-12-23 14:00
     */
    PageBean<OrgStaffDetailDto> getShopClerkList(PageBean<OrgStaffDetailDto> pageBean,OrgStaffDetailDto staff);
    
    
}
