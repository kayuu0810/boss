package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TVehicleOwnerInfo;
import com.boss.oms.dao.model.TVehicleOwnerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVehicleOwnerInfoMapper {
    long countByExample(TVehicleOwnerInfoExample example);

    int deleteByExample(TVehicleOwnerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TVehicleOwnerInfo record);

    int insertSelective(TVehicleOwnerInfo record);

    List<TVehicleOwnerInfo> selectByExample(TVehicleOwnerInfoExample example);

    TVehicleOwnerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TVehicleOwnerInfo record, @Param("example") TVehicleOwnerInfoExample example);

    int updateByExample(@Param("record") TVehicleOwnerInfo record, @Param("example") TVehicleOwnerInfoExample example);

    int updateByPrimaryKeySelective(TVehicleOwnerInfo record);

    int updateByPrimaryKey(TVehicleOwnerInfo record);
}