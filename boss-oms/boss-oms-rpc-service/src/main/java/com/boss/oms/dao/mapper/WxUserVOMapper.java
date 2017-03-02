package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.WxUserVO;

import java.util.List;

/**
 * Created by Kayuu on 2017/3/2.
 */
public interface WxUserVOMapper {
    /**
     * 获取微信用户集合
     * @return
     */
    List<WxUserVO> selectWxUserList();
}
