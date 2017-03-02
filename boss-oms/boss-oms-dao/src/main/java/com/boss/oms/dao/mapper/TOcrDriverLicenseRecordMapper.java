package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TOcrDriverLicenseRecord;
import com.boss.oms.dao.model.TOcrDriverLicenseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOcrDriverLicenseRecordMapper {
    long countByExample(TOcrDriverLicenseRecordExample example);

    int deleteByExample(TOcrDriverLicenseRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TOcrDriverLicenseRecord record);

    int insertSelective(TOcrDriverLicenseRecord record);

    List<TOcrDriverLicenseRecord> selectByExample(TOcrDriverLicenseRecordExample example);

    TOcrDriverLicenseRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TOcrDriverLicenseRecord record, @Param("example") TOcrDriverLicenseRecordExample example);

    int updateByExample(@Param("record") TOcrDriverLicenseRecord record, @Param("example") TOcrDriverLicenseRecordExample example);

    int updateByPrimaryKeySelective(TOcrDriverLicenseRecord record);

    int updateByPrimaryKey(TOcrDriverLicenseRecord record);
}