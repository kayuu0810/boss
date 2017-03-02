package com.boss.oms.rpc.api;

import com.boss.common.base.BaseService;
import com.boss.oms.dao.model.TWxUser;
import com.boss.oms.dao.model.TWxUserExample;
import com.boss.oms.dao.model.WxUserVO;

import java.util.List;

/**
 * 微信用户接口
 * Created by Kayuu on 2017/3/2.
 */
public interface WxUserService extends BaseService<TWxUser,TWxUserExample> {
    /**
     * 获取微信用户集合
     * @return
     */
    List<WxUserVO> selectWxUserList();
}
