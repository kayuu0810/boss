package com.boss.upms.rpc.service.impl;

import com.boss.upms.rpc.api.UpmsRolePermissionService;
import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.upms.dao.mapper.UpmsRolePermissionMapper;
import com.boss.upms.dao.model.UpmsRolePermission;
import com.boss.upms.dao.model.UpmsRolePermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 角色权限service实现
 * Created by Kayuu on 2017/2/26.
 */
@Service
@Transactional
@BaseService
public class UpmsRolePermissionServiceImpl extends BaseServiceImpl<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRolePermissionServiceImpl.class);

    @Autowired
    UpmsRolePermissionMapper upmsRolePermissionMapper;

}