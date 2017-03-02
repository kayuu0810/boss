package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizInviteCode;
import com.boss.oms.dao.model.TBizInviteCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizInviteCodeMapper {
    long countByExample(TBizInviteCodeExample example);

    int deleteByExample(TBizInviteCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBizInviteCode record);

    int insertSelective(TBizInviteCode record);

    List<TBizInviteCode> selectByExample(TBizInviteCodeExample example);

    TBizInviteCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBizInviteCode record, @Param("example") TBizInviteCodeExample example);

    int updateByExample(@Param("record") TBizInviteCode record, @Param("example") TBizInviteCodeExample example);

    int updateByPrimaryKeySelective(TBizInviteCode record);

    int updateByPrimaryKey(TBizInviteCode record);
}