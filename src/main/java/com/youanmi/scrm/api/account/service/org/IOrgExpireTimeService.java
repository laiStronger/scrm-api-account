package com.youanmi.scrm.api.account.service.org;

import com.youanmi.commons.base.exception.ViewExternalDisplayException;
import com.youanmi.scrm.api.account.dto.org.OrgExpireTimeDto;

/**
 * 
 * @ClassName: IOrgExpireTimeService
 * @Description: 机构过期时间实体
 * @author li.jinwen
 * @email lijinwen@youanmi.com
 * @date 2017年2月10日 上午11:14:48
 *
 */
public interface IOrgExpireTimeService {

	/**
	 * 
	 * @Description: 根据组织ID返回组织过期信息
	 * @author li.jinwen
	 * @email lijinwen@youanmi.com
	 * @date 2017年2月10日 上午11:25:22
	 * @param orgId
	 * @throws ViewExternalDisplayException
	 */
	OrgExpireTimeDto getOrgExpireTimePoByOrgId(Long topOrgId)throws ViewExternalDisplayException;
}
