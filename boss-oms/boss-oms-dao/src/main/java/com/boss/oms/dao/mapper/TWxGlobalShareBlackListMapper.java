package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxGlobalShareBlackList;
import com.boss.oms.dao.model.TWxGlobalShareBlackListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxGlobalShareBlackListMapper {
    long countByExample(TWxGlobalShareBlackListExample example);

    int deleteByExample(TWxGlobalShareBlackListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxGlobalShareBlackList record);

    int insertSelective(TWxGlobalShareBlackList record);

    List<TWxGlobalShareBlackList> selectByExample(TWxGlobalShareBlackListExample example);

    TWxGlobalShareBlackList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxGlobalShareBlackList record, @Param("example") TWxGlobalShareBlackListExample example);

    int updateByExample(@Param("record") TWxGlobalShareBlackList record, @Param("example") TWxGlobalShareBlackListExample example);

    int updateByPrimaryKeySelective(TWxGlobalShareBlackList record);

    int updateByPrimaryKey(TWxGlobalShareBlackList record);
}