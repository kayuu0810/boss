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

    /**
     * 查询保单VO 列表
     * @param salPolicyVO
     * @return
     */
    List<TSalPolicyVO> selectTSalPolicyVOList(TSalPolicyVO salPolicyVO);

    /**
     * 统计保单数据
     * @param salPolicyVO
     * @return
     */
    long countByTSalPolicyVOExample(TSalPolicyVO salPolicyVO);
}
