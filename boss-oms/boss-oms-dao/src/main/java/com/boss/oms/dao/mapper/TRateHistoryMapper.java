package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TRateHistory;
import com.boss.oms.dao.model.TRateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRateHistoryMapper {
    long countByExample(TRateHistoryExample example);

    int deleteByExample(TRateHistoryExample example);

    int insert(TRateHistory record);

    int insertSelective(TRateHistory record);

    List<TRateHistory> selectByExample(TRateHistoryExample example);

    int updateByExampleSelective(@Param("record") TRateHistory record, @Param("example") TRateHistoryExample example);

    int updateByExample(@Param("record") TRateHistory record, @Param("example") TRateHistoryExample example);
}