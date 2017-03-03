package com.boss.oms.admin.controller.manage;

import com.boss.common.base.BaseController;
import com.boss.oms.dao.model.TWxUser;
import com.boss.oms.dao.model.TWxUserExample;
import com.boss.oms.rpc.api.WxUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kayuu on 2017/3/2.
 */
@Controller
@RequestMapping("manage/wxuser")
@Api(value="用户管理",description="用户管理")
public class WxUserController extends BaseController {

    private static final Logger LOG = LoggerFactory.getLogger(WxUserController.class);
    @Autowired
    private WxUserService wxUserService;

    @ApiOperation(value = "微信用户首页")
    @RequiresPermissions("oms:user:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/wxuser/index";
    }



    @ApiOperation(value = "微信用户列表")
    @RequiresPermissions("oms:user:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        LOG.info("查询微信用户>>>list");
        TWxUserExample wxUserExample = new TWxUserExample();
        wxUserExample.setOffset(offset);
        wxUserExample.setLimit(limit);
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            wxUserExample.setOrderByClause(sort + " " + order);
        }
        List<TWxUser> rows = wxUserService.selectByExample(wxUserExample);
        long total = wxUserService.countByExample(wxUserExample);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

}
