package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizShouldCommissionPool;
import com.boss.oms.dao.model.TBizShouldCommissionPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizShouldCommissionPoolMapper {
    long countByExample(TBizShouldCommissionPoolExample example);

    int deleteByExample(TBizShouldCommissionPoolExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizShouldCommissionPool record);

    int insertSelective(TBizShouldCommissionPool record);

    List<TBizShouldCommissionPool> selectByExample(TBizShouldCommissionPoolExample example);

    TBizShouldCommissionPool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizShouldCommissionPool record, @Param("example") TBizShouldCommissionPoolExample example);

    int updateByExample(@Param("record") TBizShouldCommissionPool record, @Param("example") TBizShouldCommissionPoolExample example);

    int updateByPrimaryKeySelective(TBizShouldCommissionPool record);

    int updateByPrimaryKey(TBizShouldCommissionPool record);
}