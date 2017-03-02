package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBaseInsuranceCode;
import com.boss.oms.dao.model.TBaseInsuranceCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseInsuranceCodeMapper {
    long countByExample(TBaseInsuranceCodeExample example);

    int deleteByExample(TBaseInsuranceCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBaseInsuranceCode record);

    int insertSelective(TBaseInsuranceCode record);

    List<TBaseInsuranceCode> selectByExample(TBaseInsuranceCodeExample example);

    TBaseInsuranceCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBaseInsuranceCode record, @Param("example") TBaseInsuranceCodeExample example);

    int updateByExample(@Param("record") TBaseInsuranceCode record, @Param("example") TBaseInsuranceCodeExample example);

    int updateByPrimaryKeySelective(TBaseInsuranceCode record);

    int updateByPrimaryKey(TBaseInsuranceCode record);
}