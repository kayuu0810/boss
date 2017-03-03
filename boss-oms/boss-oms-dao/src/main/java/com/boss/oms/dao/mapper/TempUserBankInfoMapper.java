package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TempUserBankInfo;
import com.boss.oms.dao.model.TempUserBankInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempUserBankInfoMapper {
    long countByExample(TempUserBankInfoExample example);

    int deleteByExample(TempUserBankInfoExample example);

    int insert(TempUserBankInfo record);

    int insertSelective(TempUserBankInfo record);

    List<TempUserBankInfo> selectByExample(TempUserBankInfoExample example);

    int updateByExampleSelective(@Param("record") TempUserBankInfo record, @Param("example") TempUserBankInfoExample example);

    int updateByExample(@Param("record") TempUserBankInfo record, @Param("example") TempUserBankInfoExample example);
}