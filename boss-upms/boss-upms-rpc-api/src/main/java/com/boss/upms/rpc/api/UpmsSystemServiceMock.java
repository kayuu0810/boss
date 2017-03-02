package com.boss.upms.rpc.api;

import com.boss.upms.dao.model.UpmsSystem;
import com.boss.upms.dao.model.UpmsSystemExample;
import com.boss.common.base.BaseServiceMock;
import com.boss.upms.dao.mapper.UpmsSystemMapper;

/**
 * 降级实现UpmsSystemService接口
 * Created by Kayuu on 2017/2/14.
 */
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}
