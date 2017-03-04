package com.boss.oms.rpc.api;

import com.boss.common.base.BaseService;
import com.boss.oms.dao.model.TBizUserInfo;
import com.boss.oms.dao.model.TBizUserInfoExample;

import java.util.List;

/**
 * 业务员用户接口
 * Created by Kayuu on 2017/3/4.
 */
public interface TBizUserInfoService extends BaseService<TBizUserInfo,TBizUserInfoExample> {

     List<TBizUserInfo> findBizUserInfoList( TBizUserInfoExample userInfoExample);
}
