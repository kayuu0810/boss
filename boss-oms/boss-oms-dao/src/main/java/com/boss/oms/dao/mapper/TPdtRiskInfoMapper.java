package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TPdtRiskInfo;
import com.boss.oms.dao.model.TPdtRiskInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPdtRiskInfoMapper {
    long countByExample(TPdtRiskInfoExample example);

    int deleteByExample(TPdtRiskInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPdtRiskInfo record);

    int insertSelective(TPdtRiskInfo record);

    List<TPdtRiskInfo> selectByExample(TPdtRiskInfoExample example);

    TPdtRiskInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPdtRiskInfo record, @Param("example") TPdtRiskInfoExample example);

    int updateByExample(@Param("record") TPdtRiskInfo record, @Param("example") TPdtRiskInfoExample example);

    int updateByPrimaryKeySelective(TPdtRiskInfo record);

    int updateByPrimaryKey(TPdtRiskInfo record);
}