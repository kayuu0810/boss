package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizAddress;
import com.boss.oms.dao.model.TBizAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizAddressMapper {
    long countByExample(TBizAddressExample example);

    int deleteByExample(TBizAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBizAddress record);

    int insertSelective(TBizAddress record);

    List<TBizAddress> selectByExample(TBizAddressExample example);

    TBizAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBizAddress record, @Param("example") TBizAddressExample example);

    int updateByExample(@Param("record") TBizAddress record, @Param("example") TBizAddressExample example);

    int updateByPrimaryKeySelective(TBizAddress record);

    int updateByPrimaryKey(TBizAddress record);
}