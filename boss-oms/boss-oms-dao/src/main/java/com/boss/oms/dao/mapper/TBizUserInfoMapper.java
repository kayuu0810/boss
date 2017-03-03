package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBizUserInfo;
import com.boss.oms.dao.model.TBizUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizUserInfoMapper {
    long countByExample(TBizUserInfoExample example);

    int deleteByExample(TBizUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBizUserInfo record);

    int insertSelective(TBizUserInfo record);

    List<TBizUserInfo> selectByExample(TBizUserInfoExample example);

    TBizUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBizUserInfo record, @Param("example") TBizUserInfoExample example);

    int updateByExample(@Param("record") TBizUserInfo record, @Param("example") TBizUserInfoExample example);

    int updateByPrimaryKeySelective(TBizUserInfo record);

    int updateByPrimaryKey(TBizUserInfo record);
}