package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxAccount;
import com.boss.oms.dao.model.TWxAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxAccountMapper {
    long countByExample(TWxAccountExample example);

    int deleteByExample(TWxAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxAccount record);

    int insertSelective(TWxAccount record);

    List<TWxAccount> selectByExample(TWxAccountExample example);

    TWxAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxAccount record, @Param("example") TWxAccountExample example);

    int updateByExample(@Param("record") TWxAccount record, @Param("example") TWxAccountExample example);

    int updateByPrimaryKeySelective(TWxAccount record);

    int updateByPrimaryKey(TWxAccount record);
}