package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxUserRelative;
import com.boss.oms.dao.model.TWxUserRelativeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxUserRelativeMapper {
    long countByExample(TWxUserRelativeExample example);

    int deleteByExample(TWxUserRelativeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxUserRelative record);

    int insertSelective(TWxUserRelative record);

    List<TWxUserRelative> selectByExample(TWxUserRelativeExample example);

    TWxUserRelative selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxUserRelative record, @Param("example") TWxUserRelativeExample example);

    int updateByExample(@Param("record") TWxUserRelative record, @Param("example") TWxUserRelativeExample example);

    int updateByPrimaryKeySelective(TWxUserRelative record);

    int updateByPrimaryKey(TWxUserRelative record);
}