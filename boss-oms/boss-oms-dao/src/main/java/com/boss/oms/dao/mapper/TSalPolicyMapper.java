package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalPolicy;
import com.boss.oms.dao.model.TSalPolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalPolicyMapper {
    long countByExample(TSalPolicyExample example);

    int deleteByExample(TSalPolicyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalPolicy record);

    int insertSelective(TSalPolicy record);

    List<TSalPolicy> selectByExample(TSalPolicyExample example);

    TSalPolicy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalPolicy record, @Param("example") TSalPolicyExample example);

    int updateByExample(@Param("record") TSalPolicy record, @Param("example") TSalPolicyExample example);

    int updateByPrimaryKeySelective(TSalPolicy record);

    int updateByPrimaryKey(TSalPolicy record);



}