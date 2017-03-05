package com.boss.oms.rpc.service.impl;

import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.oms.dao.mapper.TBaseInsuranceCodeMapper;
import com.boss.oms.dao.model.TBaseInsuranceCode;
import com.boss.oms.dao.model.TBaseInsuranceCodeExample;
import com.boss.oms.rpc.api.TBaseInsuranceCodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Kayuu on 2017/3/5.
 */
@Service
@Transactional
@BaseService
public class TBaseInsuranceCodeServiceImpl extends BaseServiceImpl<TBaseInsuranceCodeMapper, TBaseInsuranceCode, TBaseInsuranceCodeExample> implements TBaseInsuranceCodeService {
    private static  final Logger LOGGER = LoggerFactory.getLogger(TBizUserInfoServiceImpl.class);

    @Autowired
    private TBaseInsuranceCodeMapper baseInsuranceCodeMapper;



}
