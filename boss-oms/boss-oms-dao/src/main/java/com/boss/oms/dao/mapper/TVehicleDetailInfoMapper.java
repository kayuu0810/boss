package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TVehicleDetailInfo;
import com.boss.oms.dao.model.TVehicleDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVehicleDetailInfoMapper {
    long countByExample(TVehicleDetailInfoExample example);

    int deleteByExample(TVehicleDetailInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TVehicleDetailInfo record);

    int insertSelective(TVehicleDetailInfo record);

    List<TVehicleDetailInfo> selectByExample(TVehicleDetailInfoExample example);

    TVehicleDetailInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TVehicleDetailInfo record, @Param("example") TVehicleDetailInfoExample example);

    int updateByExample(@Param("record") TVehicleDetailInfo record, @Param("example") TVehicleDetailInfoExample example);

    int updateByPrimaryKeySelective(TVehicleDetailInfo record);

    int updateByPrimaryKey(TVehicleDetailInfo record);
}