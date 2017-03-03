package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBaseSmsNoticeRecord;
import com.boss.oms.dao.model.TBaseSmsNoticeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseSmsNoticeRecordMapper {
    long countByExample(TBaseSmsNoticeRecordExample example);

    int deleteByExample(TBaseSmsNoticeRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBaseSmsNoticeRecord record);

    int insertSelective(TBaseSmsNoticeRecord record);

    List<TBaseSmsNoticeRecord> selectByExample(TBaseSmsNoticeRecordExample example);

    TBaseSmsNoticeRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBaseSmsNoticeRecord record, @Param("example") TBaseSmsNoticeRecordExample example);

    int updateByExample(@Param("record") TBaseSmsNoticeRecord record, @Param("example") TBaseSmsNoticeRecordExample example);

    int updateByPrimaryKeySelective(TBaseSmsNoticeRecord record);

    int updateByPrimaryKey(TBaseSmsNoticeRecord record);
}