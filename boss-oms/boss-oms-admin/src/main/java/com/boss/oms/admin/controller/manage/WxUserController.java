package com.boss.oms.admin.controller.manage;

import com.boss.common.base.BaseController;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kayuu on 2017/3/2.
 */
@Controller
@RequestMapping("manage/user")
@Api(value="用户管理",description="用户管理")
public class WxUserController extends BaseController {
    private static final Logger LOG = LoggerFactory.getLogger(WxUserController.class);

}
