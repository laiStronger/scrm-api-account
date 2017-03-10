/*
 * 文件名：TableConstants.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：tanguojun
 * 修改时间：2016年12月14日
 * 修改内容：新增
 */
package com.youanmi.scrm.api.account.constants;

/**
 * 数据库常量
 *
 * @author tanguojun
 * @since 2.2.4
 */
public interface AccountTableConstants {

    Byte NOT_DELETE = 1;
    Byte DELETE = 2;

    /**
     * 用户常量表
     * 
     * @author tanguojun on 2016年12月19日
     *
     */
    interface User {

        /**
         * 用户类型:1:普通
         */
        Byte USER_TYPE_GENERAL = 1;
        /**
         * 用户类型:2:特殊
         */
        Byte USER_TYPE_SPECIAL = 2;

        /**
         * 账号位数
         */
        Integer USER_NAME_LENGTH = 6;

        /**
         * 激活状态,1:未激活
         */
        Byte NO_ACTIVITE = 1;

        /**
         * 激活状态,2:已激活
         */
        Byte ACTIVITE = 2;

        /**
         * 使用状态,1:未使用
         */
        Byte NO_USE= 1;

        /**
         * 使用状态,2:已使用
         */
        Byte USE = 2;
        
        /**
         * 账号最大长度
         */
        Integer USER_NAME_MAX_LENGTH = 18;

        /**
         * 密码最小长度
         */
        Integer PASSWORD_MIN_LENGTH = 6;
        /**
         * 密码最大长度
         */
        Integer PASSWORD_MAX_LENGTH = 14;
        
        /**
         * 手机号最大长度
         */
        Integer MOBILE_MAX_LENGTH = 14;
        
        /**
         * 是否禁用:1:未禁用
         */
        Byte NOT_FORBID = 1;

        /**
         * 是否禁用:2:已禁用
         */
        Byte FORBID = 2;

        String DEFAULT_PASSWORD = "123456";
    }

    /**
     * 机构表常量
     * 
     * @author tanguojun on 2016年12月19日
     *
     */
    interface Org {

        /**
         * 机构类型:1:连锁部门
         */
        Byte ORG_TYPE_CHAIN_DEPART = 1;
        /**
         * 机构类型:2:连锁门店
         */
        Byte ORG_TYPE_CHAIN_SHOP = 2;
        /**
         * 机构类型:3:单门店
         */
        Byte ORG_TYPE_SINGLE_SHOP = 3;

        /**
         * 是否禁用:1:未禁用
         */
        Byte NOT_FORBID = 1;

        /**
         * 是否禁用:2:已禁用
         */
        Byte FORBID = 2;

        /**
         * 分店名称最长为10
         */
        Integer MAX_ORG_NAME_LENGTH = 15;

        /**
         * 营业执照最长为15
         */
        Integer MAX_LICENSE_LENGTH = 20;

        /**
         * 详细街道地址最大长度为50
         */
        Integer MAX_DETAIL_ADDRESS_LENGTH = 50;

        /**
         * 店长姓名最长为10
         */
        Integer MAX_MANAGER_NAME_LENGTH = 10;

        /**
         * 顶级层级
         */
        Byte TOP_LEVEL = 1;

        /**
         * 顶级机构的parentOrgId
         */
        Long TOP_PARENT_ORG_ID = 0L;

        /**
         * 顶级机构的orgPath
         */
        String TOP_ORG_PATH = "";

    }

    /**
     * 岗位常量
     */
    interface Post {
        /**
         * 管理员
         */
        Byte POST_TYPE_ADMIN = 1;
        /**
         * 店长
         */
        Byte POST_TYPE_SHOP_MANAGER = 2;
        /**
         * 普通员工/店员
         */
        Byte POST_TYPE_STAFF = 3;

        /**
         * 管理员名称
         */
        String ADMIN = "管理员";

        String SUPER_ADMIN = "超级管理员";

        /**
         * 店长名称
         */
        String MANAGER = "店长";
    }

    /**
     * 员工表
     */
    interface Staff {

        /**
         * 管理员名称
         */
        String ADMIN = "分店管理员";

        /**
         * 员工姓名最大长度为10位
         */
        Integer MAX_STAFF_NAME_LENGTH = 10;
    }
}
