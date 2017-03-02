package com.boss.upms.rpc.api;

import com.boss.upms.dao.model.UpmsRolePermissionExample;
import com.boss.common.base.BaseServiceMock;
import com.boss.upms.dao.mapper.UpmsRolePermissionMapper;
import com.boss.upms.dao.model.UpmsRolePermission;

/**
 * 降级实现UpmsRolePermissionService接口
 * Created by Kayuu on 2017/2/26.
 */
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

}
