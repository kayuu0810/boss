package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizGoldTotal;
import com.boss.oms.dao.model.TBizGoldTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizGoldTotalMapper {
    long countByExample(TBizGoldTotalExample example);

    int deleteByExample(TBizGoldTotalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBizGoldTotal record);

    int insertSelective(TBizGoldTotal record);

    List<TBizGoldTotal> selectByExample(TBizGoldTotalExample example);

    TBizGoldTotal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBizGoldTotal record, @Param("example") TBizGoldTotalExample example);

    int updateByExample(@Param("record") TBizGoldTotal record, @Param("example") TBizGoldTotalExample example);

    int updateByPrimaryKeySelective(TBizGoldTotal record);

    int updateByPrimaryKey(TBizGoldTotal record);
}