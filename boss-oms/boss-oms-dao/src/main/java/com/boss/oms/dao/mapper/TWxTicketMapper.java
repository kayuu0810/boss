package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxTicket;
import com.boss.oms.dao.model.TWxTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxTicketMapper {
    long countByExample(TWxTicketExample example);

    int deleteByExample(TWxTicketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxTicket record);

    int insertSelective(TWxTicket record);

    List<TWxTicket> selectByExample(TWxTicketExample example);

    TWxTicket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxTicket record, @Param("example") TWxTicketExample example);

    int updateByExample(@Param("record") TWxTicket record, @Param("example") TWxTicketExample example);

    int updateByPrimaryKeySelective(TWxTicket record);

    int updateByPrimaryKey(TWxTicket record);
}