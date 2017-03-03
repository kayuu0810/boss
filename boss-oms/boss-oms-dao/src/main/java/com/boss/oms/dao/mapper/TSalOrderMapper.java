package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalOrder;
import com.boss.oms.dao.model.TSalOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalOrderMapper {
    long countByExample(TSalOrderExample example);

    int deleteByExample(TSalOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalOrder record);

    int insertSelective(TSalOrder record);

    List<TSalOrder> selectByExample(TSalOrderExample example);

    TSalOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalOrder record, @Param("example") TSalOrderExample example);

    int updateByExample(@Param("record") TSalOrder record, @Param("example") TSalOrderExample example);

    int updateByPrimaryKeySelective(TSalOrder record);

    int updateByPrimaryKey(TSalOrder record);
}