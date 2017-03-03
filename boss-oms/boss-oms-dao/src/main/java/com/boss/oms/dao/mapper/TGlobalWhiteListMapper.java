package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TGlobalWhiteList;
import com.boss.oms.dao.model.TGlobalWhiteListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGlobalWhiteListMapper {
    long countByExample(TGlobalWhiteListExample example);

    int deleteByExample(TGlobalWhiteListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGlobalWhiteList record);

    int insertSelective(TGlobalWhiteList record);

    List<TGlobalWhiteList> selectByExample(TGlobalWhiteListExample example);

    TGlobalWhiteList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGlobalWhiteList record, @Param("example") TGlobalWhiteListExample example);

    int updateByExample(@Param("record") TGlobalWhiteList record, @Param("example") TGlobalWhiteListExample example);

    int updateByPrimaryKeySelective(TGlobalWhiteList record);

    int updateByPrimaryKey(TGlobalWhiteList record);
}