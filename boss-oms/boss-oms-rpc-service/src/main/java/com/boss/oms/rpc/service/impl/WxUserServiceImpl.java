package com.boss.oms.rpc.service.impl;

import com.boss.common.annotation.BaseService;
import com.boss.common.base.BaseServiceImpl;
import com.boss.oms.dao.mapper.TWxUserMapper;
import com.boss.oms.dao.mapper.WxUserVOMapper;
import com.boss.oms.dao.model.TWxUser;
import com.boss.oms.dao.model.TWxUserExample;
import com.boss.oms.dao.model.WxUserVO;
import com.boss.oms.rpc.api.WxUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 获取微信用户实现类
 * Created by Kayuu on 2017/3/2.
 */
@Service
@Transactional
@BaseService
public class WxUserServiceImpl extends BaseServiceImpl<TWxUserMapper,TWxUser,TWxUserExample> implements WxUserService {
    private static Logger _log = LoggerFactory.getLogger(WxUserServiceImpl.class);


    @Autowired
    private WxUserVOMapper wxUserMapper;

  @Cacheable(value="boss-oms-ehcache")
    public List<WxUserVO> selectWxUserList() {
        _log.info("selectWxUserList>>>>>");
      return wxUserMapper.selectWxUserList();
    }
}
