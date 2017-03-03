package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizGoldDetail;
import com.boss.oms.dao.model.TBizGoldDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizGoldDetailMapper {
    long countByExample(TBizGoldDetailExample example);

    int deleteByExample(TBizGoldDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBizGoldDetail record);

    int insertSelective(TBizGoldDetail record);

    List<TBizGoldDetail> selectByExample(TBizGoldDetailExample example);

    TBizGoldDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBizGoldDetail record, @Param("example") TBizGoldDetailExample example);

    int updateByExample(@Param("record") TBizGoldDetail record, @Param("example") TBizGoldDetailExample example);

    int updateByPrimaryKeySelective(TBizGoldDetail record);

    int updateByPrimaryKey(TBizGoldDetail record);
}