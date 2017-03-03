package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TActivityStatistics;
import com.boss.oms.dao.model.TActivityStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TActivityStatisticsMapper {
    long countByExample(TActivityStatisticsExample example);

    int deleteByExample(TActivityStatisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TActivityStatistics record);

    int insertSelective(TActivityStatistics record);

    List<TActivityStatistics> selectByExample(TActivityStatisticsExample example);

    TActivityStatistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TActivityStatistics record, @Param("example") TActivityStatisticsExample example);

    int updateByExample(@Param("record") TActivityStatistics record, @Param("example") TActivityStatisticsExample example);

    int updateByPrimaryKeySelective(TActivityStatistics record);

    int updateByPrimaryKey(TActivityStatistics record);
}