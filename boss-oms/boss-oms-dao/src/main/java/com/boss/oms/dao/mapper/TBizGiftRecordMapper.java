package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizGiftRecord;
import com.boss.oms.dao.model.TBizGiftRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizGiftRecordMapper {
    long countByExample(TBizGiftRecordExample example);

    int deleteByExample(TBizGiftRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBizGiftRecord record);

    int insertSelective(TBizGiftRecord record);

    List<TBizGiftRecord> selectByExample(TBizGiftRecordExample example);

    TBizGiftRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBizGiftRecord record, @Param("example") TBizGiftRecordExample example);

    int updateByExample(@Param("record") TBizGiftRecord record, @Param("example") TBizGiftRecordExample example);

    int updateByPrimaryKeySelective(TBizGiftRecord record);

    int updateByPrimaryKey(TBizGiftRecord record);
}