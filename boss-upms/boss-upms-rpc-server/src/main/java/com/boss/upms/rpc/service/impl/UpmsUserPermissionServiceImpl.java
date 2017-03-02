package com.boss.upms.rpc.service.impl;

import com.boss.upms.dao.model.UpmsUserPermission;
import com.boss.upms.dao.model.UpmsUserPermissionExample;
import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.boss.upms.dao.mapper.UpmsUserPermissionMapper;
import com.boss.upms.rpc.api.UpmsUserPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户权限service实现
 * Created by shuzheng on 2017/2/26.
 */
@Service
@Transactional
@BaseService
public class UpmsUserPermissionServiceImpl extends BaseServiceImpl<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserPermissionServiceImpl.class);

    @Autowired
    UpmsUserPermissionMapper upmsUserPermissionMapper;

}