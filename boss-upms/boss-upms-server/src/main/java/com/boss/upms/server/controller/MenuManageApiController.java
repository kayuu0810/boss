package com.boss.upms.server.controller;

import com.boss.common.base.BaseController;
import com.boss.common.util.JsonUtil;
import com.boss.upms.common.constant.UpmsResult;
import com.boss.upms.common.constant.UpmsResultConstant;
import com.boss.upms.dao.model.UpmsPermission;
import com.boss.upms.dao.model.UpmsSystem;
import com.boss.upms.dao.model.UpmsSystemExample;
import com.boss.upms.dao.model.UpmsUser;
import com.boss.upms.rpc.api.UpmsApiService;
import com.boss.upms.rpc.api.UpmsSystemService;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * <p> Title: </p>
 * <p> Description: </p>
 *
 * @作者 Kayuu
 * @创建时间
 * @版本 1.00
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * ----------------------------------------
 * <p>
 * ----------------------------------------
 * </pre>
 */
@Controller
@RequestMapping("/manage/api")
@Api(value = "菜单管理", description = "为外部提供菜单")
public class MenuManageApiController extends BaseController{


    @Autowired
    private UpmsSystemService upmsSystemService;

    @Autowired
    private UpmsApiService upmsApiService;


    /**
     *
     * @param callback
     * @return
     */
    @ApiOperation(value = "对外提供获取菜单接口")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public Object index(String callback,Integer systemId) {
        HashMap<Object, Object> reslutMap = Maps.newHashMapWithExpectedSize(2);
        HashMap<String, Integer> paramMaps = Maps.newHashMapWithExpectedSize(2);
        // 已注册系统
        UpmsSystemExample upmsSystemExample = new UpmsSystemExample();
        upmsSystemExample.createCriteria().andStatusEqualTo((byte) 1);
        List<UpmsSystem> upmsSystems = upmsSystemService.selectByExample(upmsSystemExample);
        reslutMap.put("upmsSystems", upmsSystems);
        // 当前登录用户权限
        Subject subject = SecurityUtils.getSubject();
        UpmsUser upmsUser = (UpmsUser) subject.getPrincipal();
        paramMaps.put("systemId",Integer.valueOf(systemId));
        paramMaps.put("userId",upmsUser.getUserId());
        List<UpmsPermission> upmsPermissions = upmsApiService.selectUpmsPermissionByUpmsUserIdAndSystemId(paramMaps);
        reslutMap.put("upmsPermissions", upmsPermissions);
        reslutMap.put("upmsUser",upmsUser);
        UpmsResult upmsResult = new UpmsResult(UpmsResultConstant.SUCCESS, reslutMap);
        if(callback !=null && "callback".equals(callback)){
            return callback +"("+ JsonUtil.toJSONString(upmsResult) +")";
        }else{
            return upmsResult;
        }
    }
}
