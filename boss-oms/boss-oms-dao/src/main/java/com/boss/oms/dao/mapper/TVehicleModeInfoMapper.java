package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TVehicleModeInfo;
import com.boss.oms.dao.model.TVehicleModeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVehicleModeInfoMapper {
    long countByExample(TVehicleModeInfoExample example);

    int deleteByExample(TVehicleModeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TVehicleModeInfo record);

    int insertSelective(TVehicleModeInfo record);

    List<TVehicleModeInfo> selectByExample(TVehicleModeInfoExample example);

    TVehicleModeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TVehicleModeInfo record, @Param("example") TVehicleModeInfoExample example);

    int updateByExample(@Param("record") TVehicleModeInfo record, @Param("example") TVehicleModeInfoExample example);

    int updateByPrimaryKeySelective(TVehicleModeInfo record);

    int updateByPrimaryKey(TVehicleModeInfo record);
}