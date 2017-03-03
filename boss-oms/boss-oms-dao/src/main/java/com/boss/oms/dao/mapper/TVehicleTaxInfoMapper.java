package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TVehicleTaxInfo;
import com.boss.oms.dao.model.TVehicleTaxInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVehicleTaxInfoMapper {
    long countByExample(TVehicleTaxInfoExample example);

    int deleteByExample(TVehicleTaxInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TVehicleTaxInfo record);

    int insertSelective(TVehicleTaxInfo record);

    List<TVehicleTaxInfo> selectByExample(TVehicleTaxInfoExample example);

    TVehicleTaxInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TVehicleTaxInfo record, @Param("example") TVehicleTaxInfoExample example);

    int updateByExample(@Param("record") TVehicleTaxInfo record, @Param("example") TVehicleTaxInfoExample example);

    int updateByPrimaryKeySelective(TVehicleTaxInfo record);

    int updateByPrimaryKey(TVehicleTaxInfo record);
}