package com.boss.oms.admin.controller.manage;

import com.boss.common.base.BaseController;
import com.boss.oms.common.constant.OmsResult;
import com.boss.oms.common.constant.OmsResultConstant;
import com.boss.oms.dao.model.TBaseInsuranceCode;
import com.boss.oms.dao.model.TBaseInsuranceCodeExample;
import com.boss.oms.rpc.api.TBaseInsuranceCodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 保险公司Controller
 * Created by Kayuu on 2017/3/5.
 */
@Controller
@RequestMapping("manage/insurance")
@Api(value="保险公司管理",description="保险公司管理")
public class BaseInsuranceCodeController extends BaseController{
    private static final Logger LOG = LoggerFactory.getLogger(BaseInsuranceCodeController.class);

    @Autowired
    private TBaseInsuranceCodeService baseInsuranceCodeService;
    /**
     * 查询保险公司code
     * @return
     */
    @ApiOperation(value = "保险公司列表")
    @RequiresPermissions("oms:insurance:read")
    @RequestMapping(value = "/list")
    @ResponseBody
    public OmsResult list(){
        List<TBaseInsuranceCode> tBaseInsuranceCodes = baseInsuranceCodeService.selectByExample(new TBaseInsuranceCodeExample());
        OmsResult upmsResult = new OmsResult(OmsResultConstant.SUCCESS, tBaseInsuranceCodes);
        return upmsResult;

    }

}
