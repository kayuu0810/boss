package com.boss.upms.rpc.service.impl;

import com.boss.upms.dao.mapper.UpmsUserRoleMapper;
import com.boss.upms.dao.model.UpmsUserRole;
import com.boss.upms.dao.model.UpmsUserRoleExample;
import com.boss.upms.rpc.api.UpmsUserRoleService;
import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户角色service实现
 * Created by shuzheng on 2017/2/26.
 */
@Service
@Transactional
@BaseService
public class UpmsUserRoleServiceImpl extends BaseServiceImpl<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserRoleServiceImpl.class);

    @Autowired
    UpmsUserRoleMapper upmsUserRoleMapper;

}