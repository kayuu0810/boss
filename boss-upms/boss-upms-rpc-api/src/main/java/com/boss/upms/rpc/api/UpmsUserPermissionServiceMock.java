package com.boss.upms.rpc.api;

import com.boss.common.base.BaseServiceMock;
import com.boss.upms.dao.mapper.UpmsUserPermissionMapper;
import com.boss.upms.dao.model.UpmsUserPermission;
import com.boss.upms.dao.model.UpmsUserPermissionExample;

/**
 * 降级实现UpmsUserPermissionService接口
 * Created by Kayuu on 2017/2/26.
 */
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

}
