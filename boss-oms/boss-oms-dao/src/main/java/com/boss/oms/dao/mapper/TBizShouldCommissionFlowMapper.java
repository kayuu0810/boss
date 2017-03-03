package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizShouldCommissionFlow;
import com.boss.oms.dao.model.TBizShouldCommissionFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizShouldCommissionFlowMapper {
    long countByExample(TBizShouldCommissionFlowExample example);

    int deleteByExample(TBizShouldCommissionFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizShouldCommissionFlow record);

    int insertSelective(TBizShouldCommissionFlow record);

    List<TBizShouldCommissionFlow> selectByExample(TBizShouldCommissionFlowExample example);

    TBizShouldCommissionFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizShouldCommissionFlow record, @Param("example") TBizShouldCommissionFlowExample example);

    int updateByExample(@Param("record") TBizShouldCommissionFlow record, @Param("example") TBizShouldCommissionFlowExample example);

    int updateByPrimaryKeySelective(TBizShouldCommissionFlow record);

    int updateByPrimaryKey(TBizShouldCommissionFlow record);
}