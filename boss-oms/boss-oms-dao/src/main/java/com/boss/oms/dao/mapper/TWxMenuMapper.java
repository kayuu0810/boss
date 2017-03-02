package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxMenu;
import com.boss.oms.dao.model.TWxMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxMenuMapper {
    long countByExample(TWxMenuExample example);

    int deleteByExample(TWxMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxMenu record);

    int insertSelective(TWxMenu record);

    List<TWxMenu> selectByExampleWithBLOBs(TWxMenuExample example);

    List<TWxMenu> selectByExample(TWxMenuExample example);

    TWxMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxMenu record, @Param("example") TWxMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") TWxMenu record, @Param("example") TWxMenuExample example);

    int updateByExample(@Param("record") TWxMenu record, @Param("example") TWxMenuExample example);

    int updateByPrimaryKeySelective(TWxMenu record);

    int updateByPrimaryKeyWithBLOBs(TWxMenu record);

    int updateByPrimaryKey(TWxMenu record);
}