package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBaseBankInfo;
import com.boss.oms.dao.model.TBaseBankInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseBankInfoMapper {
    long countByExample(TBaseBankInfoExample example);

    int deleteByExample(TBaseBankInfoExample example);

    int deleteByPrimaryKey(String bankCode);

    int insert(TBaseBankInfo record);

    int insertSelective(TBaseBankInfo record);

    List<TBaseBankInfo> selectByExample(TBaseBankInfoExample example);

    TBaseBankInfo selectByPrimaryKey(String bankCode);

    int updateByExampleSelective(@Param("record") TBaseBankInfo record, @Param("example") TBaseBankInfoExample example);

    int updateByExample(@Param("record") TBaseBankInfo record, @Param("example") TBaseBankInfoExample example);

    int updateByPrimaryKeySelective(TBaseBankInfo record);

    int updateByPrimaryKey(TBaseBankInfo record);
}