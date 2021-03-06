package com.boss.upms.rpc.service.impl;

import com.boss.upms.dao.mapper.UpmsPermissionMapper;
import com.boss.upms.dao.model.UpmsPermission;
import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.upms.dao.model.UpmsPermissionExample;
import com.boss.upms.rpc.api.UpmsPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 权限service实现
 * Created by Kayuu on 2017/2/6.
 */
@Service
@Transactional
@BaseService
public class UpmsPermissionServiceImpl extends BaseServiceImpl<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsPermissionServiceImpl.class);

    @Autowired
    UpmsPermissionMapper upmsPermissionMapper;

}