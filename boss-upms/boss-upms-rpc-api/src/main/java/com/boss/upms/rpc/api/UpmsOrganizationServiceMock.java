package com.boss.upms.rpc.api;

import com.boss.upms.dao.mapper.UpmsOrganizationMapper;
import com.boss.upms.dao.model.UpmsOrganizationExample;
import com.zheng.common.base.BaseServiceMock;
import com.boss.upms.dao.model.UpmsOrganization;

/**
 * 降级实现UpmsOrganizationService接口
 * Created by shuzheng on 2017/2/14.
 */
public class UpmsOrganizationServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

}
