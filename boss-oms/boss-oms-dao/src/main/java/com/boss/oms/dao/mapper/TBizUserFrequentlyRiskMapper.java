package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizUserFrequentlyRisk;
import com.boss.oms.dao.model.TBizUserFrequentlyRiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizUserFrequentlyRiskMapper {
    long countByExample(TBizUserFrequentlyRiskExample example);

    int deleteByExample(TBizUserFrequentlyRiskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizUserFrequentlyRisk record);

    int insertSelective(TBizUserFrequentlyRisk record);

    List<TBizUserFrequentlyRisk> selectByExample(TBizUserFrequentlyRiskExample example);

    TBizUserFrequentlyRisk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizUserFrequentlyRisk record, @Param("example") TBizUserFrequentlyRiskExample example);

    int updateByExample(@Param("record") TBizUserFrequentlyRisk record, @Param("example") TBizUserFrequentlyRiskExample example);

    int updateByPrimaryKeySelective(TBizUserFrequentlyRisk record);

    int updateByPrimaryKey(TBizUserFrequentlyRisk record);
}