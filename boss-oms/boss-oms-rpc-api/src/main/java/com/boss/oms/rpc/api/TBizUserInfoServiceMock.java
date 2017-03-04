package com.boss.oms.rpc.api;

import com.boss.common.base.BaseServiceMock;
import com.boss.oms.dao.mapper.TBizUserInfoMapper;
import com.boss.oms.dao.model.TBizUserInfo;
import com.boss.oms.dao.model.TBizUserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Kayuu on 2017/3/4.
 */
public class TBizUserInfoServiceMock extends BaseServiceMock<TBizUserInfoMapper,TBizUserInfo,TBizUserInfoExample> implements TBizUserInfoService {
     @Autowired
     private TBizUserInfoService bizTBizUserInfoService;

     public List<TBizUserInfo> findBizUserInfoList(TBizUserInfoExample example) {
          return bizTBizUserInfoService.findBizUserInfoList(example);
     }
}
