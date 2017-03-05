package com.boss.oms.admin.controller.manage;

import com.boss.common.base.BaseController;
import com.boss.common.util.JsonUtil;
import com.boss.oms.dao.model.TSalPolicy;
import com.boss.oms.dao.model.TSalPolicyExample;
import com.boss.oms.dao.model.TSalPolicyVO;
import com.boss.oms.rpc.api.TSalPolicyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kayuu on 2017/3/5.
 */
@Controller
@RequestMapping("manage/policy")
@Api(value="保单管理",description="保单管理")
public class PolicyManagerController extends BaseController{
    private static final Logger LOG = LoggerFactory.getLogger(PolicyManagerController.class);


    @Autowired
    private TSalPolicyService salPolicyService;

    @ApiOperation(value = "保单管理首页")
    @RequiresPermissions("oms:policy:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/policy/index";
    }






    @ApiOperation(value = "保单列表")
    @RequiresPermissions("oms:policy:read")
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order,
            TSalPolicyVO salPolicyVO
            ) {
        LOG.info("查询保单信息>>>list>>{}", JsonUtil.toJSONString(salPolicyVO));
        TSalPolicyExample salPolicyExample = new TSalPolicyExample();
        salPolicyExample.setOffset(offset);
        salPolicyExample.setLimit(limit);
        TSalPolicyExample.Criteria criteria = salPolicyExample.createCriteria();
       /* if(salPolicyVO.getOrderNo() !=null){
            criteria.andOrderIdEqualTo()
        }*/
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            salPolicyExample.setOrderByClause(sort + " " + order);
        }
        List<TSalPolicy> rows = salPolicyService.selectByExample(salPolicyExample);
        long total = salPolicyService.countByExample(salPolicyExample);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }
}
