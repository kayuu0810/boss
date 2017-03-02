package com.boss.upms.rpc.api;

import com.boss.common.base.BaseServiceMock;
import com.boss.upms.dao.mapper.UpmsUserMapper;
import com.boss.upms.dao.model.UpmsUser;
import com.boss.upms.dao.model.UpmsUserExample;

/**
 * 降级实现UpmsUserService接口
 * Created by Kayuu on 2017/2/14.
 */
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

}
