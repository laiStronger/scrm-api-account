package com.youanmi.scrm.api.account.dto.org;

import com.youanmi.scrm.api.account.dto.OperatorDto;

/**
 * 编辑个人头像接口
 * @author sunxiaolong on 2017/2/17
 */
public class UpdateCurrentUserHeadUrlDto extends OperatorDto{
    private String headUrl;
    private String thumHeadUrl;

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getThumHeadUrl() {
        return thumHeadUrl;
    }

    public void setThumHeadUrl(String thumHeadUrl) {
        this.thumHeadUrl = thumHeadUrl;
    }
}
