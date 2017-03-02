package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSalOrderErrorMessage;
import com.boss.oms.dao.model.TSalOrderErrorMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSalOrderErrorMessageMapper {
    long countByExample(TSalOrderErrorMessageExample example);

    int deleteByExample(TSalOrderErrorMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSalOrderErrorMessage record);

    int insertSelective(TSalOrderErrorMessage record);

    List<TSalOrderErrorMessage> selectByExample(TSalOrderErrorMessageExample example);

    TSalOrderErrorMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSalOrderErrorMessage record, @Param("example") TSalOrderErrorMessageExample example);

    int updateByExample(@Param("record") TSalOrderErrorMessage record, @Param("example") TSalOrderErrorMessageExample example);

    int updateByPrimaryKeySelective(TSalOrderErrorMessage record);

    int updateByPrimaryKey(TSalOrderErrorMessage record);
}