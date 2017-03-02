package com.boss.upms.rpc.api;

import com.boss.upms.dao.mapper.UpmsRoleMapper;
import com.zheng.common.base.BaseServiceMock;
import com.boss.upms.dao.model.UpmsRole;
import com.boss.upms.dao.model.UpmsRoleExample;

/**
 * 降级实现UpmsRoleService接口
 * Created by shuzheng on 2017/2/14.
 */
public class UpmsRoleServiceMock extends BaseServiceMock<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

}
