package com.boss.oms.admin.controller.manage;

import com.boss.common.base.BaseController;
import com.boss.oms.common.constant.OmsResult;
import com.boss.oms.common.constant.OmsResultConstant;
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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kayuu on 2017/3/2.
 */
@Controller
@RequestMapping("manage/wxuser")
@Api(value="用户管理",description="用户管理")
public class WxUserManagerController extends BaseController {

    private static final Logger LOG = LoggerFactory.getLogger(WxUserManagerController.class);
    @Autowired
    private WxUserService wxUserService;

    @ApiOperation(value = "微信用户首页")
    @RequiresPermissions("oms:wxuser:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/wxuser/index";
    }



    @ApiOperation(value = "微信用户列表")
    @RequiresPermissions("oms:wxuser:read")
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

    @Deprecated
    @ApiOperation(value = "更新微信用户页")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") int id, ModelMap modelMap) {
        TWxUser user = wxUserService.selectByPrimaryKey(id);
        modelMap.put("user", user);
        return "/manage/wxuser/update";
    }


    @ApiOperation(value = "删除微信用户")
    @RequiresPermissions("upms:role:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = wxUserService.deleteByPrimaryKeys(ids);
        return new OmsResult(OmsResultConstant.SUCCESS, count);
    }
}
