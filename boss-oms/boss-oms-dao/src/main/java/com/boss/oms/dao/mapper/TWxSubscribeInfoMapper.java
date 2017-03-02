package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxSubscribeInfo;
import com.boss.oms.dao.model.TWxSubscribeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxSubscribeInfoMapper {
    long countByExample(TWxSubscribeInfoExample example);

    int deleteByExample(TWxSubscribeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxSubscribeInfo record);

    int insertSelective(TWxSubscribeInfo record);

    List<TWxSubscribeInfo> selectByExample(TWxSubscribeInfoExample example);

    TWxSubscribeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxSubscribeInfo record, @Param("example") TWxSubscribeInfoExample example);

    int updateByExample(@Param("record") TWxSubscribeInfo record, @Param("example") TWxSubscribeInfoExample example);

    int updateByPrimaryKeySelective(TWxSubscribeInfo record);

    int updateByPrimaryKey(TWxSubscribeInfo record);
}