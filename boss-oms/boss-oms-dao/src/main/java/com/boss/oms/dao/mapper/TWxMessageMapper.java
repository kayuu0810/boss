package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxMessage;
import com.boss.oms.dao.model.TWxMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxMessageMapper {
    long countByExample(TWxMessageExample example);

    int deleteByExample(TWxMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxMessage record);

    int insertSelective(TWxMessage record);

    List<TWxMessage> selectByExampleWithBLOBs(TWxMessageExample example);

    List<TWxMessage> selectByExample(TWxMessageExample example);

    TWxMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxMessage record, @Param("example") TWxMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") TWxMessage record, @Param("example") TWxMessageExample example);

    int updateByExample(@Param("record") TWxMessage record, @Param("example") TWxMessageExample example);

    int updateByPrimaryKeySelective(TWxMessage record);

    int updateByPrimaryKeyWithBLOBs(TWxMessage record);

    int updateByPrimaryKey(TWxMessage record);
}