package com.boss.oms.rpc.api;

import com.boss.common.base.BaseService;
import com.boss.oms.dao.model.TSalPolicy;
import com.boss.oms.dao.model.TSalPolicyExample;
import com.boss.oms.dao.model.TSalPolicyVO;
import com.boss.oms.dao.model.WxUserVO;

import java.util.List;

/**
 * 保单管理service
 * Created by Kayuu on 2017/3/5.
 */
public interface TSalPolicyService extends BaseService<TSalPolicy , TSalPolicyExample> {

    List<TSalPolicyVO> selectTSalPolicyVOList();
}
