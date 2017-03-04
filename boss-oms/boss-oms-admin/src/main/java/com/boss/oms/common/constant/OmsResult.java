package com.boss.oms.common.constant;

import com.boss.common.base.BaseResult;

/**
 * upms系统常量枚举类
 * Created by Kayuu on 2017/2/18.
 */
public class OmsResult extends BaseResult {


    public OmsResult(OmsResultConstant upmsResultConstant, Object data) {
         super(upmsResultConstant.getCode(), upmsResultConstant.getMessage(), data);
    }


}
