package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxGlobalWhiteList;
import com.boss.oms.dao.model.TWxGlobalWhiteListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxGlobalWhiteListMapper {
    long countByExample(TWxGlobalWhiteListExample example);

    int deleteByExample(TWxGlobalWhiteListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxGlobalWhiteList record);

    int insertSelective(TWxGlobalWhiteList record);

    List<TWxGlobalWhiteList> selectByExample(TWxGlobalWhiteListExample example);

    TWxGlobalWhiteList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxGlobalWhiteList record, @Param("example") TWxGlobalWhiteListExample example);

    int updateByExample(@Param("record") TWxGlobalWhiteList record, @Param("example") TWxGlobalWhiteListExample example);

    int updateByPrimaryKeySelective(TWxGlobalWhiteList record);

    int updateByPrimaryKey(TWxGlobalWhiteList record);
}