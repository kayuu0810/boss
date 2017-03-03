package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizUserCommissionFlow;
import com.boss.oms.dao.model.TBizUserCommissionFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizUserCommissionFlowMapper {
    long countByExample(TBizUserCommissionFlowExample example);

    int deleteByExample(TBizUserCommissionFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizUserCommissionFlow record);

    int insertSelective(TBizUserCommissionFlow record);

    List<TBizUserCommissionFlow> selectByExample(TBizUserCommissionFlowExample example);

    TBizUserCommissionFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizUserCommissionFlow record, @Param("example") TBizUserCommissionFlowExample example);

    int updateByExample(@Param("record") TBizUserCommissionFlow record, @Param("example") TBizUserCommissionFlowExample example);

    int updateByPrimaryKeySelective(TBizUserCommissionFlow record);

    int updateByPrimaryKey(TBizUserCommissionFlow record);
}