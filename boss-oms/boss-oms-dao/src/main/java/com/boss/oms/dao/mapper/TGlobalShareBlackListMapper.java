package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TGlobalShareBlackList;
import com.boss.oms.dao.model.TGlobalShareBlackListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGlobalShareBlackListMapper {
    long countByExample(TGlobalShareBlackListExample example);

    int deleteByExample(TGlobalShareBlackListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGlobalShareBlackList record);

    int insertSelective(TGlobalShareBlackList record);

    List<TGlobalShareBlackList> selectByExample(TGlobalShareBlackListExample example);

    TGlobalShareBlackList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGlobalShareBlackList record, @Param("example") TGlobalShareBlackListExample example);

    int updateByExample(@Param("record") TGlobalShareBlackList record, @Param("example") TGlobalShareBlackListExample example);

    int updateByPrimaryKeySelective(TGlobalShareBlackList record);

    int updateByPrimaryKey(TGlobalShareBlackList record);
}