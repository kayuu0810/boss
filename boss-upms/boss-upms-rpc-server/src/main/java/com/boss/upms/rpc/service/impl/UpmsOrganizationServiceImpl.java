package com.boss.upms.rpc.service.impl;

import com.boss.upms.dao.mapper.UpmsOrganizationMapper;
import com.boss.upms.dao.model.UpmsOrganizationExample;
import com.boss.upms.rpc.api.UpmsOrganizationService;
import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.boss.upms.dao.model.UpmsOrganization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 组织service实现
 * Created by shuzheng on 2017/2/6.
 */
@Service
@Transactional
@BaseService
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

    private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper upmsOrganizationMapper;

}