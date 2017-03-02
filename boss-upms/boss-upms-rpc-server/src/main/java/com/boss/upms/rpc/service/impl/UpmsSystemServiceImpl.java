package com.boss.upms.rpc.service.impl;

import com.boss.upms.dao.model.UpmsSystem;
import com.boss.upms.dao.model.UpmsSystemExample;
import com.boss.upms.rpc.api.UpmsSystemService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.upms.dao.mapper.UpmsSystemMapper;
import com.boss.common.annotation.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统service实现
 * Created by Kayuu on 2016/12/18.
 */
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    private static Logger _log = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper upmsSystemMapper;

}