package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxQrcode;
import com.boss.oms.dao.model.TWxQrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxQrcodeMapper {
    long countByExample(TWxQrcodeExample example);

    int deleteByExample(TWxQrcodeExample example);

    int deleteByPrimaryKey(@Param("sceneId") Integer sceneId, @Param("openId") String openId);

    int insert(TWxQrcode record);

    int insertSelective(TWxQrcode record);

    List<TWxQrcode> selectByExample(TWxQrcodeExample example);

    TWxQrcode selectByPrimaryKey(@Param("sceneId") Integer sceneId, @Param("openId") String openId);

    int updateByExampleSelective(@Param("record") TWxQrcode record, @Param("example") TWxQrcodeExample example);

    int updateByExample(@Param("record") TWxQrcode record, @Param("example") TWxQrcodeExample example);

    int updateByPrimaryKeySelective(TWxQrcode record);

    int updateByPrimaryKey(TWxQrcode record);
}