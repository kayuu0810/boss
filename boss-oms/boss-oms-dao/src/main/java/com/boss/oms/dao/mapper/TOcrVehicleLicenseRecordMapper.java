package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TOcrVehicleLicenseRecord;
import com.boss.oms.dao.model.TOcrVehicleLicenseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOcrVehicleLicenseRecordMapper {
    long countByExample(TOcrVehicleLicenseRecordExample example);

    int deleteByExample(TOcrVehicleLicenseRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TOcrVehicleLicenseRecord record);

    int insertSelective(TOcrVehicleLicenseRecord record);

    List<TOcrVehicleLicenseRecord> selectByExample(TOcrVehicleLicenseRecordExample example);

    TOcrVehicleLicenseRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TOcrVehicleLicenseRecord record, @Param("example") TOcrVehicleLicenseRecordExample example);

    int updateByExample(@Param("record") TOcrVehicleLicenseRecord record, @Param("example") TOcrVehicleLicenseRecordExample example);

    int updateByPrimaryKeySelective(TOcrVehicleLicenseRecord record);

    int updateByPrimaryKey(TOcrVehicleLicenseRecord record);
}