package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxUser;
import com.boss.oms.dao.model.TWxUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxUserMapper {
    long countByExample(TWxUserExample example);

    int deleteByExample(TWxUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxUser record);

    int insertSelective(TWxUser record);

    List<TWxUser> selectByExample(TWxUserExample example);

    TWxUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxUser record, @Param("example") TWxUserExample example);

    int updateByExample(@Param("record") TWxUser record, @Param("example") TWxUserExample example);

    int updateByPrimaryKeySelective(TWxUser record);

    int updateByPrimaryKey(TWxUser record);
}