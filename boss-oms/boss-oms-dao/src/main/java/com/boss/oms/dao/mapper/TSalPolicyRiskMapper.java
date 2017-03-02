package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalPolicyRisk;
import com.boss.oms.dao.model.TSalPolicyRiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalPolicyRiskMapper {
    long countByExample(TSalPolicyRiskExample example);

    int deleteByExample(TSalPolicyRiskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalPolicyRisk record);

    int insertSelective(TSalPolicyRisk record);

    List<TSalPolicyRisk> selectByExample(TSalPolicyRiskExample example);

    TSalPolicyRisk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalPolicyRisk record, @Param("example") TSalPolicyRiskExample example);

    int updateByExample(@Param("record") TSalPolicyRisk record, @Param("example") TSalPolicyRiskExample example);

    int updateByPrimaryKeySelective(TSalPolicyRisk record);

    int updateByPrimaryKey(TSalPolicyRisk record);
}