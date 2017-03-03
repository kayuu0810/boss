package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSysLogInfo;
import com.boss.oms.dao.model.TSysLogInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysLogInfoMapper {
    long countByExample(TSysLogInfoExample example);

    int deleteByExample(TSysLogInfoExample example);

    int insert(TSysLogInfo record);

    int insertSelective(TSysLogInfo record);

    List<TSysLogInfo> selectByExampleWithBLOBs(TSysLogInfoExample example);

    List<TSysLogInfo> selectByExample(TSysLogInfoExample example);

    int updateByExampleSelective(@Param("record") TSysLogInfo record, @Param("example") TSysLogInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TSysLogInfo record, @Param("example") TSysLogInfoExample example);

    int updateByExample(@Param("record") TSysLogInfo record, @Param("example") TSysLogInfoExample example);
}