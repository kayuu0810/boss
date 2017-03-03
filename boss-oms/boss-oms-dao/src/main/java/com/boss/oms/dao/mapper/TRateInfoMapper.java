package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TRateInfo;
import com.boss.oms.dao.model.TRateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRateInfoMapper {
    long countByExample(TRateInfoExample example);

    int deleteByExample(TRateInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TRateInfo record);

    int insertSelective(TRateInfo record);

    List<TRateInfo> selectByExample(TRateInfoExample example);

    TRateInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TRateInfo record, @Param("example") TRateInfoExample example);

    int updateByExample(@Param("record") TRateInfo record, @Param("example") TRateInfoExample example);

    int updateByPrimaryKeySelective(TRateInfo record);

    int updateByPrimaryKey(TRateInfo record);
}