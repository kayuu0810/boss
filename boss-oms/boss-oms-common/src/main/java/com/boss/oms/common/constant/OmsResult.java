package com.boss.oms.common.constant;

import com.boss.common.base.BaseResult;

/**
 * cms系统常量枚举类
 * Created by shuzheng on 2017/2/19.
 */
public class OmsResult extends BaseResult {

    public OmsResult(OmsResultConstant cmsResultConstant, Object data) {
        super(cmsResultConstant.getCode(), cmsResultConstant.getMessage(), data);
    }

}
