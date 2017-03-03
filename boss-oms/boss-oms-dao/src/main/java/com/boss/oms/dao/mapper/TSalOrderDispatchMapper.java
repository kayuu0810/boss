package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalOrderDispatch;
import com.boss.oms.dao.model.TSalOrderDispatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalOrderDispatchMapper {
    long countByExample(TSalOrderDispatchExample example);

    int deleteByExample(TSalOrderDispatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalOrderDispatch record);

    int insertSelective(TSalOrderDispatch record);

    List<TSalOrderDispatch> selectByExample(TSalOrderDispatchExample example);

    TSalOrderDispatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalOrderDispatch record, @Param("example") TSalOrderDispatchExample example);

    int updateByExample(@Param("record") TSalOrderDispatch record, @Param("example") TSalOrderDispatchExample example);

    int updateByPrimaryKeySelective(TSalOrderDispatch record);

    int updateByPrimaryKey(TSalOrderDispatch record);
}