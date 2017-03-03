package com.boss.oms.rpc.api;

import com.boss.common.base.BaseServiceMock;
import com.boss.oms.dao.mapper.TWxUserMapper;
import com.boss.oms.dao.model.TWxUser;
import com.boss.oms.dao.model.TWxUserExample;
import com.boss.oms.dao.model.WxUserVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户实现
 * Created by Kayuu on 2017/3/2.
 */
public class WxUserServiceMock extends BaseServiceMock<TWxUserMapper,TWxUser,TWxUserExample> implements WxUserService {

    @Autowired
    private WxUserService wxUserService;

    public List<WxUserVO> selectWxUserList() {
        return wxUserService.selectWxUserList();
    }
}
