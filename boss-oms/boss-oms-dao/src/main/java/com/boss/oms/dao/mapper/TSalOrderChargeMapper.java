package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalOrderCharge;
import com.boss.oms.dao.model.TSalOrderChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalOrderChargeMapper {
    long countByExample(TSalOrderChargeExample example);

    int deleteByExample(TSalOrderChargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalOrderCharge record);

    int insertSelective(TSalOrderCharge record);

    List<TSalOrderCharge> selectByExample(TSalOrderChargeExample example);

    TSalOrderCharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalOrderCharge record, @Param("example") TSalOrderChargeExample example);

    int updateByExample(@Param("record") TSalOrderCharge record, @Param("example") TSalOrderChargeExample example);

    int updateByPrimaryKeySelective(TSalOrderCharge record);

    int updateByPrimaryKey(TSalOrderCharge record);
}