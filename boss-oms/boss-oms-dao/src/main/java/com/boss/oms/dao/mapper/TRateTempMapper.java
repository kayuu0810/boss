package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TRateTemp;
import com.boss.oms.dao.model.TRateTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRateTempMapper {
    long countByExample(TRateTempExample example);

    int deleteByExample(TRateTempExample example);

    int insert(TRateTemp record);

    int insertSelective(TRateTemp record);

    List<TRateTemp> selectByExample(TRateTempExample example);

    int updateByExampleSelective(@Param("record") TRateTemp record, @Param("example") TRateTempExample example);

    int updateByExample(@Param("record") TRateTemp record, @Param("example") TRateTempExample example);
}