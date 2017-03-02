package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalOrderPaylink;
import com.boss.oms.dao.model.TSalOrderPaylinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalOrderPaylinkMapper {
    long countByExample(TSalOrderPaylinkExample example);

    int deleteByExample(TSalOrderPaylinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalOrderPaylink record);

    int insertSelective(TSalOrderPaylink record);

    List<TSalOrderPaylink> selectByExample(TSalOrderPaylinkExample example);

    TSalOrderPaylink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalOrderPaylink record, @Param("example") TSalOrderPaylinkExample example);

    int updateByExample(@Param("record") TSalOrderPaylink record, @Param("example") TSalOrderPaylinkExample example);

    int updateByPrimaryKeySelective(TSalOrderPaylink record);

    int updateByPrimaryKey(TSalOrderPaylink record);
}