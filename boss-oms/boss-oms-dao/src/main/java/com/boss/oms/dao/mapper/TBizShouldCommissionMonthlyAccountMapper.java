package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizShouldCommissionMonthlyAccount;
import com.boss.oms.dao.model.TBizShouldCommissionMonthlyAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizShouldCommissionMonthlyAccountMapper {
    long countByExample(TBizShouldCommissionMonthlyAccountExample example);

    int deleteByExample(TBizShouldCommissionMonthlyAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizShouldCommissionMonthlyAccount record);

    int insertSelective(TBizShouldCommissionMonthlyAccount record);

    List<TBizShouldCommissionMonthlyAccount> selectByExample(TBizShouldCommissionMonthlyAccountExample example);

    TBizShouldCommissionMonthlyAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizShouldCommissionMonthlyAccount record, @Param("example") TBizShouldCommissionMonthlyAccountExample example);

    int updateByExample(@Param("record") TBizShouldCommissionMonthlyAccount record, @Param("example") TBizShouldCommissionMonthlyAccountExample example);

    int updateByPrimaryKeySelective(TBizShouldCommissionMonthlyAccount record);

    int updateByPrimaryKey(TBizShouldCommissionMonthlyAccount record);
}