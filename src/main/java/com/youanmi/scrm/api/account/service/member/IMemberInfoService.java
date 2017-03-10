package com.youanmi.scrm.api.account.service.member;


import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.youanmi.commons.base.service.BaseCrudService;
import com.youanmi.commons.base.vo.PageBean;
import com.youanmi.scrm.api.account.dto.member.MemberInfoDto;
import com.youanmi.scrm.api.account.dto.member.OrgMemberInfoDto;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: IMemberService
 * @Description: 会员Service
 * @author li.jinwen
 * @email lijinwen@youanmi.com
 * @date 2017年2月20日 上午10:19:54
 *
 */
public interface IMemberInfoService extends BaseCrudService<MemberInfoDto>{
	
    /**
     * 获取出生日的会员分页
     *
     * @param birthday 生日
     * @param pageIndex 页码
     * @param pageSize 页大小
     * @return 一页数据
     */
    PageBean<OrgMemberInfoDto> getPageByBirthday(Long birthday, Integer pageIndex, Integer pageSize);

    /**
     * 根具用户名查找
     * @param userName 用户名
     * @return
     */
    MemberInfoDto getByUserName(String userName);

    /**
     * 根具微信获取数据
     * @param wxNo  微信
     * @return
     */
    MemberInfoDto getByWxNo(String wxNo);
    /**
     * @description 按要求来获取微信用户信息
     * @author zhangteng
     * @param conditions
     * @return
     */
    List<MemberInfoDto> getMemberInfoByConditions(Map<String, Object> conditions) throws ParseException;

    /**
     * @description 按照id获取一个用户对象
     * @author zhangteng
     * @param memberId
     * @return
     */
    MemberInfoDto getMemberInfoById(Long memberId);
}
