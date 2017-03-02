package com.boss.upms.rpc.service.impl;

import com.boss.upms.dao.mapper.UpmsUserMapper;
import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.upms.dao.model.UpmsUser;
import com.boss.upms.dao.model.UpmsUserExample;
import com.boss.upms.rpc.api.UpmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户service实现
 * Created by Kayuu on 2016/01/19.
 */
@Service
@Transactional
@BaseService
public class UpmsUserServiceImpl extends BaseServiceImpl<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserServiceImpl.class);

    @Autowired
    UpmsUserMapper upmsUserMapper;

}