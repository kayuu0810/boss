package com.boss.oms.rpc.api;

import com.boss.common.base.BaseServiceMock;
import com.boss.oms.dao.mapper.TSalPolicyMapper;
import com.boss.oms.dao.model.TSalPolicy;
import com.boss.oms.dao.model.TSalPolicyExample;
import com.boss.oms.dao.model.TSalPolicyVO;

import java.util.List;

/**
 * Created by Kayuu on 2017/3/5.
 */
public class TSalPolicyServiceMock extends BaseServiceMock<TSalPolicyMapper,TSalPolicy,TSalPolicyExample> implements TSalPolicyService {
    public List<TSalPolicyVO> selectTSalPolicyVOList() {
        return null;
    }
}
