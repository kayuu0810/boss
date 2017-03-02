package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TPdtInsRisk;
import com.boss.oms.dao.model.TPdtInsRiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPdtInsRiskMapper {
    long countByExample(TPdtInsRiskExample example);

    int deleteByExample(TPdtInsRiskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPdtInsRisk record);

    int insertSelective(TPdtInsRisk record);

    List<TPdtInsRisk> selectByExample(TPdtInsRiskExample example);

    TPdtInsRisk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPdtInsRisk record, @Param("example") TPdtInsRiskExample example);

    int updateByExample(@Param("record") TPdtInsRisk record, @Param("example") TPdtInsRiskExample example);

    int updateByPrimaryKeySelective(TPdtInsRisk record);

    int updateByPrimaryKey(TPdtInsRisk record);
}