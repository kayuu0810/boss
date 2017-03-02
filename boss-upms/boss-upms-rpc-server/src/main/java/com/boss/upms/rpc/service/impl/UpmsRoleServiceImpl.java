package com.boss.upms.rpc.service.impl;

import com.boss.upms.dao.mapper.UpmsRoleMapper;
import com.boss.upms.dao.model.UpmsRoleExample;
import com.boss.upms.rpc.api.UpmsRoleService;
import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.upms.dao.model.UpmsRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 角色service实现
 * Created by Kayuu on 2017/2/6.
 */
@Service
@Transactional
@BaseService
public class UpmsRoleServiceImpl extends BaseServiceImpl<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRoleServiceImpl.class);

    @Autowired
    UpmsRoleMapper upmsRoleMapper;

}