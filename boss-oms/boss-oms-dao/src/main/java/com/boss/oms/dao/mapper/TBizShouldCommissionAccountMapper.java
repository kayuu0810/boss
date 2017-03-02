package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizShouldCommissionAccount;
import com.boss.oms.dao.model.TBizShouldCommissionAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizShouldCommissionAccountMapper {
    long countByExample(TBizShouldCommissionAccountExample example);

    int deleteByExample(TBizShouldCommissionAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizShouldCommissionAccount record);

    int insertSelective(TBizShouldCommissionAccount record);

    List<TBizShouldCommissionAccount> selectByExample(TBizShouldCommissionAccountExample example);

    TBizShouldCommissionAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizShouldCommissionAccount record, @Param("example") TBizShouldCommissionAccountExample example);

    int updateByExample(@Param("record") TBizShouldCommissionAccount record, @Param("example") TBizShouldCommissionAccountExample example);

    int updateByPrimaryKeySelective(TBizShouldCommissionAccount record);

    int updateByPrimaryKey(TBizShouldCommissionAccount record);
}