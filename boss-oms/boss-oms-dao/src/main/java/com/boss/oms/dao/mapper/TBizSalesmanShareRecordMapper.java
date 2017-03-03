package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizSalesmanShareRecord;
import com.boss.oms.dao.model.TBizSalesmanShareRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizSalesmanShareRecordMapper {
    long countByExample(TBizSalesmanShareRecordExample example);

    int deleteByExample(TBizSalesmanShareRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizSalesmanShareRecord record);

    int insertSelective(TBizSalesmanShareRecord record);

    List<TBizSalesmanShareRecord> selectByExample(TBizSalesmanShareRecordExample example);

    TBizSalesmanShareRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizSalesmanShareRecord record, @Param("example") TBizSalesmanShareRecordExample example);

    int updateByExample(@Param("record") TBizSalesmanShareRecord record, @Param("example") TBizSalesmanShareRecordExample example);

    int updateByPrimaryKeySelective(TBizSalesmanShareRecord record);

    int updateByPrimaryKey(TBizSalesmanShareRecord record);
}