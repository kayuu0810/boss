package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizPaidFlow;
import com.boss.oms.dao.model.TBizPaidFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizPaidFlowMapper {
    long countByExample(TBizPaidFlowExample example);

    int deleteByExample(TBizPaidFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizPaidFlow record);

    int insertSelective(TBizPaidFlow record);

    List<TBizPaidFlow> selectByExample(TBizPaidFlowExample example);

    TBizPaidFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizPaidFlow record, @Param("example") TBizPaidFlowExample example);

    int updateByExample(@Param("record") TBizPaidFlow record, @Param("example") TBizPaidFlowExample example);

    int updateByPrimaryKeySelective(TBizPaidFlow record);

    int updateByPrimaryKey(TBizPaidFlow record);
}