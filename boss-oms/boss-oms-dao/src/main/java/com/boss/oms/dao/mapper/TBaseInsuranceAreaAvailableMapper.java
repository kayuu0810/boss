package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBaseInsuranceAreaAvailable;
import com.boss.oms.dao.model.TBaseInsuranceAreaAvailableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseInsuranceAreaAvailableMapper {
    long countByExample(TBaseInsuranceAreaAvailableExample example);

    int deleteByExample(TBaseInsuranceAreaAvailableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBaseInsuranceAreaAvailable record);

    int insertSelective(TBaseInsuranceAreaAvailable record);

    List<TBaseInsuranceAreaAvailable> selectByExample(TBaseInsuranceAreaAvailableExample example);

    TBaseInsuranceAreaAvailable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBaseInsuranceAreaAvailable record, @Param("example") TBaseInsuranceAreaAvailableExample example);

    int updateByExample(@Param("record") TBaseInsuranceAreaAvailable record, @Param("example") TBaseInsuranceAreaAvailableExample example);

    int updateByPrimaryKeySelective(TBaseInsuranceAreaAvailable record);

    int updateByPrimaryKey(TBaseInsuranceAreaAvailable record);
}