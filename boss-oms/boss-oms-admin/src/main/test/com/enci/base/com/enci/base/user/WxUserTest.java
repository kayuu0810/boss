package com.enci.base.com.enci.base.user;

import com.boss.oms.dao.model.TWxUserExample;
import com.boss.oms.dao.model.WxUserVO;
import com.boss.oms.rpc.api.WxUserService;
import com.enci.base.BaseCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Kayuu on 2017/3/2.
 */
public class WxUserTest extends BaseCase {

    @Autowired
    private WxUserService wxUserService;


    @Test
    public void t1(){
        List<WxUserVO> wxUserVOS = wxUserService.selectWxUserList();
        System.out.println(wxUserVOS.size());
    }


    @Test
    public void index() {
        int count = wxUserService.countByExample(new TWxUserExample());
        System.out.println(count  +": 888");
    }
}
