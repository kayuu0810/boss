package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBaseAddressCode;
import com.boss.oms.dao.model.TBaseAddressCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseAddressCodeMapper {
    long countByExample(TBaseAddressCodeExample example);

    int deleteByExample(TBaseAddressCodeExample example);

    int insert(TBaseAddressCode record);

    int insertSelective(TBaseAddressCode record);

    List<TBaseAddressCode> selectByExample(TBaseAddressCodeExample example);

    int updateByExampleSelective(@Param("record") TBaseAddressCode record, @Param("example") TBaseAddressCodeExample example);

    int updateByExample(@Param("record") TBaseAddressCode record, @Param("example") TBaseAddressCodeExample example);
}