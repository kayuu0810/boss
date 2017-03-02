package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalPolicyInsured;
import com.boss.oms.dao.model.TSalPolicyInsuredExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalPolicyInsuredMapper {
    long countByExample(TSalPolicyInsuredExample example);

    int deleteByExample(TSalPolicyInsuredExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalPolicyInsured record);

    int insertSelective(TSalPolicyInsured record);

    List<TSalPolicyInsured> selectByExample(TSalPolicyInsuredExample example);

    TSalPolicyInsured selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalPolicyInsured record, @Param("example") TSalPolicyInsuredExample example);

    int updateByExample(@Param("record") TSalPolicyInsured record, @Param("example") TSalPolicyInsuredExample example);

    int updateByPrimaryKeySelective(TSalPolicyInsured record);

    int updateByPrimaryKey(TSalPolicyInsured record);
}