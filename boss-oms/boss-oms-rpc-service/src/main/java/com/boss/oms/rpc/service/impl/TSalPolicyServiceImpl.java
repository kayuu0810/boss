package com.boss.oms.rpc.service.impl;

import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.oms.dao.mapper.TSalPolicyMapper;
import com.boss.oms.dao.mapper.TSalPolicyVOMapper;
import com.boss.oms.dao.model.TSalPolicy;
import com.boss.oms.dao.model.TSalPolicyExample;
import com.boss.oms.dao.model.TSalPolicyVO;
import com.boss.oms.rpc.api.TSalPolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 保单信息service
 * Created by Kayuu on 2017/3/5.
 */
@Service
@BaseService
@Transactional
public class TSalPolicyServiceImpl extends BaseServiceImpl<TSalPolicyMapper,TSalPolicy,TSalPolicyExample> implements TSalPolicyService {

    @Autowired
    private TSalPolicyVOMapper salPolicyVOMapper;

    public List<TSalPolicyVO> selectTSalPolicyVOList() {
        return salPolicyVOMapper.selectTSalPolicyVOList();
    }
}
