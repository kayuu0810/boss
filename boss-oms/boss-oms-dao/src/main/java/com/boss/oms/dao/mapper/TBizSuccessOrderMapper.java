package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizSuccessOrder;
import com.boss.oms.dao.model.TBizSuccessOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizSuccessOrderMapper {
    long countByExample(TBizSuccessOrderExample example);

    int deleteByExample(TBizSuccessOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBizSuccessOrder record);

    int insertSelective(TBizSuccessOrder record);

    List<TBizSuccessOrder> selectByExample(TBizSuccessOrderExample example);

    TBizSuccessOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBizSuccessOrder record, @Param("example") TBizSuccessOrderExample example);

    int updateByExample(@Param("record") TBizSuccessOrder record, @Param("example") TBizSuccessOrderExample example);

    int updateByPrimaryKeySelective(TBizSuccessOrder record);

    int updateByPrimaryKey(TBizSuccessOrder record);
}