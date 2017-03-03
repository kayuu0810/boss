package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TPdtRiskPlan;
import com.boss.oms.dao.model.TPdtRiskPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPdtRiskPlanMapper {
    long countByExample(TPdtRiskPlanExample example);

    int deleteByExample(TPdtRiskPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPdtRiskPlan record);

    int insertSelective(TPdtRiskPlan record);

    List<TPdtRiskPlan> selectByExample(TPdtRiskPlanExample example);

    TPdtRiskPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPdtRiskPlan record, @Param("example") TPdtRiskPlanExample example);

    int updateByExample(@Param("record") TPdtRiskPlan record, @Param("example") TPdtRiskPlanExample example);

    int updateByPrimaryKeySelective(TPdtRiskPlan record);

    int updateByPrimaryKey(TPdtRiskPlan record);
}