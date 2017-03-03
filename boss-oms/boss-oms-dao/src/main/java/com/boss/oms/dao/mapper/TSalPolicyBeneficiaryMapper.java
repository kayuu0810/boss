package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalPolicyBeneficiary;
import com.boss.oms.dao.model.TSalPolicyBeneficiaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalPolicyBeneficiaryMapper {
    long countByExample(TSalPolicyBeneficiaryExample example);

    int deleteByExample(TSalPolicyBeneficiaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalPolicyBeneficiary record);

    int insertSelective(TSalPolicyBeneficiary record);

    List<TSalPolicyBeneficiary> selectByExample(TSalPolicyBeneficiaryExample example);

    TSalPolicyBeneficiary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalPolicyBeneficiary record, @Param("example") TSalPolicyBeneficiaryExample example);

    int updateByExample(@Param("record") TSalPolicyBeneficiary record, @Param("example") TSalPolicyBeneficiaryExample example);

    int updateByPrimaryKeySelective(TSalPolicyBeneficiary record);

    int updateByPrimaryKey(TSalPolicyBeneficiary record);
}