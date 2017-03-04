package com.boss.oms.admin.controller.manage;

import com.boss.common.base.BaseController;
import com.boss.oms.dao.model.TBizUserInfo;
import com.boss.oms.dao.model.TBizUserInfoExample;
import com.boss.oms.rpc.api.TBizUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 业务员管理
 * Created by Kayuu on 2017/3/4.
 */
@Controller
@RequestMapping("manage/agent")
@Api(value="业务员管理",description="业务员管理")
public class AgentManagerController extends BaseController{
    private static final Logger LOG = LoggerFactory.getLogger(WxUserManagerController.class);

    @Autowired
    private TBizUserInfoService bizUserInfoService;

    @ApiOperation(value = "业务员首页")
    @RequiresPermissions("oms:agent:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/agent/index";
    }

    @ApiOperation(value = "微信用户列表")
    @RequiresPermissions("oms:agent:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        LOG.info("查询业务员信息>>>list");
        TBizUserInfoExample userInfoExample = new TBizUserInfoExample();
        userInfoExample.setOffset(offset);
        userInfoExample.setLimit(limit);
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            userInfoExample.setOrderByClause(sort + " " + order);
        }
        List<TBizUserInfo> rows = bizUserInfoService.findBizUserInfoList(userInfoExample);
       //List<TBizUserInfo> rows = bizUserInfoService.selectByExample(userInfoExample);
        long total = bizUserInfoService.countByExample(userInfoExample);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

}
