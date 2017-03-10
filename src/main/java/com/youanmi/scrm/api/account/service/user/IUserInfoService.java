/*
 * 文件名：IUserInfoService.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：tanguojun
 * 修改时间：2016年12月16日
 * 修改内容：新增
 */
package com.youanmi.scrm.api.account.service.user;

import com.youanmi.commons.base.exception.ViewExternalDisplayException;
import com.youanmi.scrm.api.account.dto.org.ChangePasswordDto;
import com.youanmi.scrm.api.account.dto.user.UserInfoDto;

import java.text.ParseException;
import java.util.List;
import java.util.Map;


/**
 * 用户信息api
 *
 * @author tanguojun 2016年12月16日
 * @version 1.0.0
 */
public interface IUserInfoService {

    /**
     * 根据id获取用户基本信息
     *
     * @param id 用户id
     * @author liubing
     * @date 2016年12月19日
     */
    UserInfoDto getUserById(Long id);

    /**
     * 根据手机号或者账号获取用户
     *
     *
     * @param mobilePhone
     * @param userName
     * @return
     * @author tanguojun on 2016年12月19日
     */
    UserInfoDto findUserByUserNameOrPhone(String mobilePhone, String userName);

    /**
     * 根据手机号获取绑定用户
     *
     * @param phone 手机号
     * @author liubing
     * @date 2016年12月19日
     */
    UserInfoDto getUserByPhone(String phone);

    /**
     * 密码加密
     *
     * @param password 需要加密的密码
     * @return
     * @author tanguojun on 2016年12月19日
     */
    String encryptionPwd(String password);

    /**
     *
     * 插入用户实体
     *
     * @param userInfoDto
     * @return
     */
    Long insertSelective(UserInfoDto userInfoDto);

    /**
     * 修改密码
     */
    void changePassword(ChangePasswordDto param) throws ViewExternalDisplayException;

    /**
     * 修改用户的手机号码、激活状态
     *
     * @param userId
     * @param mobilePhone
     * @author tanguojun on 2016年12月22日
     */
    void updatePhoneAndActiveByUser(Long userId, String mobilePhone) throws ViewExternalDisplayException;

    /**
     * 根据手机号重置用户密码
     *
     * @param mobilePhone
     * @param newPassword
     * @author tanguojun on 2016年12月23日
     */
    void resetUserPassword(String mobilePhone, String newPassword) throws ViewExternalDisplayException;

    /**
     *
     * @Description: 根据分店机构ID获取分店店长
     * @author li.jinwen
     * @email lijinwen@youanmi.com
     * @date 2017年2月14日 下午5:21:29
     * @param OrgId 分店机构ID,如果为连锁机构则没有店长记录，如果为单店，如果存在店长则返回。
     * @return 用户信息
     * @throws ViewExternalDisplayException
     */
    UserInfoDto getShopManagerUserInfoByOrgId(Long OrgId) throws ViewExternalDisplayException;

    /**
     * 更新实体
     */
    public void updateByPrimaryKeySelective(UserInfoDto userInfoDto);

    /**
     * 修改用户激活状态
     *
     * @param userId
     * @author tanguojun on 2017年2月15日
     */
    void updateUserActiveStatus(Long userId) throws ViewExternalDisplayException;

    /**
     * 把一个旧用户的手机号迁移到一个新用户上
     *
     * @param oldUserId
     * @param newUserId
     * @param mobilePhone
     * @throws ViewExternalDisplayException
     * @author tanguojun on 2017年2月21日
     */
    void updateUserPhoneToOtherUser(Long oldUserId, Long newUserId, String mobilePhone)
            throws ViewExternalDisplayException;

    /**
     * 根据条件获取企业用户信息
     * @author zhangteng
     * @date 2017年2月23日16:50:44
     * @param conditions
     * @return
     */
    List<UserInfoDto> getOrgUserListByConditions(Map<String, Object> conditions) throws ParseException;


    /**
     * 解绑手机
     * @author zhangteng
     * @param conditions
     * @return
     */
    void unboundMobile(Map<String, Object> conditions);

    /**
     * 绑定手机
     * @author zhangteng
     * @param conditions
     * @return
     */
    void reboundMobile(Map<String, Object> conditions);
    
    /**
     * 
     * @Description: 根据顶级orgId返回商户编码
     * @author li.jinwen
     * @email lijinwen@youanmi.com
     * @date 2017年3月7日 上午9:29:30
     * @param topOrgId
     * @return 返回商户编码
     * @throws Exception 
     */
    String getCommercialTenantCode(Long topOrgId) throws Exception;

    /**
     * 获取机构用户的总数
     * @param conditions
     * @return
     */
    Integer getOrgUserCount(Map<String, Object> conditions);

}