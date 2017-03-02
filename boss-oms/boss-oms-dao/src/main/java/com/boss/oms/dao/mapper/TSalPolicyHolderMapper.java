package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalPolicyHolder;
import com.boss.oms.dao.model.TSalPolicyHolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalPolicyHolderMapper {
    long countByExample(TSalPolicyHolderExample example);

    int deleteByExample(TSalPolicyHolderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalPolicyHolder record);

    int insertSelective(TSalPolicyHolder record);

    List<TSalPolicyHolder> selectByExample(TSalPolicyHolderExample example);

    TSalPolicyHolder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalPolicyHolder record, @Param("example") TSalPolicyHolderExample example);

    int updateByExample(@Param("record") TSalPolicyHolder record, @Param("example") TSalPolicyHolderExample example);

    int updateByPrimaryKeySelective(TSalPolicyHolder record);

    int updateByPrimaryKey(TSalPolicyHolder record);
}