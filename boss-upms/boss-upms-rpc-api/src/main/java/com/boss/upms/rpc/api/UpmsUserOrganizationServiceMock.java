package com.boss.upms.rpc.api;

import com.boss.upms.dao.model.UpmsUserOrganizationExample;
import com.boss.common.base.BaseServiceMock;
import com.boss.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.boss.upms.dao.model.UpmsUserOrganization;

/**
 * 降级实现UpmsUserOrganizationService接口
 * Created by Kayuu on 2017/2/14.
 */
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

}
