package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizSalesmanTeam;
import com.boss.oms.dao.model.TBizSalesmanTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizSalesmanTeamMapper {
    long countByExample(TBizSalesmanTeamExample example);

    int deleteByExample(TBizSalesmanTeamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizSalesmanTeam record);

    int insertSelective(TBizSalesmanTeam record);

    List<TBizSalesmanTeam> selectByExample(TBizSalesmanTeamExample example);

    TBizSalesmanTeam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizSalesmanTeam record, @Param("example") TBizSalesmanTeamExample example);

    int updateByExample(@Param("record") TBizSalesmanTeam record, @Param("example") TBizSalesmanTeamExample example);

    int updateByPrimaryKeySelective(TBizSalesmanTeam record);

    int updateByPrimaryKey(TBizSalesmanTeam record);
}