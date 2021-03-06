package com.boss.upms.rpc.service.impl;

import com.boss.upms.dao.model.UpmsUserOrganizationExample;
import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.boss.upms.dao.model.UpmsUserOrganization;
import com.boss.upms.rpc.api.UpmsUserOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户组织service实现
 * Created by Kayuu on 2017/2/6.
 */
@Service
@Transactional
@BaseService
public class UpmsUserOrganizationServiceImpl extends BaseServiceImpl<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserOrganizationServiceImpl.class);

    @Autowired
    UpmsUserOrganizationMapper upmsUserOrganizationMapper;

}