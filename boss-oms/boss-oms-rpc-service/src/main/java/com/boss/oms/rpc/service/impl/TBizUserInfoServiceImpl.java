package com.boss.oms.rpc.service.impl;

import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.oms.dao.mapper.TBizUserInfoMapper;
import com.boss.oms.dao.model.TBizUserInfo;
import com.boss.oms.dao.model.TBizUserInfoExample;
import com.boss.oms.rpc.api.TBizUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务员信息service
 * Created by Kayuu on 2017/3/4.
 */
@Service
@Transactional
@BaseService
public class TBizUserInfoServiceImpl extends BaseServiceImpl<TBizUserInfoMapper , TBizUserInfo , TBizUserInfoExample> implements TBizUserInfoService {
    private static  final Logger LOGGER = LoggerFactory.getLogger(TBizUserInfoServiceImpl.class);
    @Autowired
     TBizUserInfoMapper bizUserInfoMapper;
    @Cacheable(value="boss-oms-ehcache")
    public List<TBizUserInfo> findBizUserInfoList(TBizUserInfoExample example){
        LOGGER.info("TBizUserInfoServiceImpl>>>findBizUserInfoList");
       return  bizUserInfoMapper.findBizUserInfoList(example);
    }
}
