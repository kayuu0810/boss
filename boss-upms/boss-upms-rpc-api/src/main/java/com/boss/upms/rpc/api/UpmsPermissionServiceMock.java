package com.boss.upms.rpc.api;

import com.boss.common.base.BaseServiceMock;
import com.boss.upms.dao.mapper.UpmsPermissionMapper;
import com.boss.upms.dao.model.UpmsPermission;
import com.boss.upms.dao.model.UpmsPermissionExample;

/**
 * 降级实现UpmsPermissionService接口
 * Created by Kayuu on 2017/2/14.
 */
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

}
