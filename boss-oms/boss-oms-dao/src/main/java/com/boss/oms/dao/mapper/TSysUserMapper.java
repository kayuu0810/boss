package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSysUser;
import com.boss.oms.dao.model.TSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysUserMapper {
    long countByExample(TSysUserExample example);

    int deleteByExample(TSysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    List<TSysUser> selectByExample(TSysUserExample example);

    TSysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSysUser record, @Param("example") TSysUserExample example);

    int updateByExample(@Param("record") TSysUser record, @Param("example") TSysUserExample example);

    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);
}