package com.enci.base.com.enci.base.user;

import com.boss.oms.dao.model.TBizUserInfo;
import com.boss.oms.dao.model.TBizUserInfoExample;
import com.boss.oms.rpc.api.TBizUserInfoService;
import com.enci.base.BaseCase;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Kayuu on 2017/3/4.
 */
public class AgentManagerTest extends BaseCase {
    @Autowired
    private TBizUserInfoService bizUserInfoService;

    @Test
    public void index() {
        TBizUserInfoExample userInfoExample = new TBizUserInfoExample();
        userInfoExample.setOffset(1);
        userInfoExample.setLimit(10);
        List<TBizUserInfo> rows = bizUserInfoService.findBizUserInfoList(userInfoExample);
    }
}
