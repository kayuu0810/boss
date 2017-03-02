package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TWxAccessToken;
import com.boss.oms.dao.model.TWxAccessTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWxAccessTokenMapper {
    long countByExample(TWxAccessTokenExample example);

    int deleteByExample(TWxAccessTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWxAccessToken record);

    int insertSelective(TWxAccessToken record);

    List<TWxAccessToken> selectByExample(TWxAccessTokenExample example);

    TWxAccessToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWxAccessToken record, @Param("example") TWxAccessTokenExample example);

    int updateByExample(@Param("record") TWxAccessToken record, @Param("example") TWxAccessTokenExample example);

    int updateByPrimaryKeySelective(TWxAccessToken record);

    int updateByPrimaryKey(TWxAccessToken record);
}