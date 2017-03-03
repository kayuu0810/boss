package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSysRole;
import com.boss.oms.dao.model.TSysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysRoleMapper {
    long countByExample(TSysRoleExample example);

    int deleteByExample(TSysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSysRole record);

    int insertSelective(TSysRole record);

    List<TSysRole> selectByExample(TSysRoleExample example);

    TSysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSysRole record, @Param("example") TSysRoleExample example);

    int updateByExample(@Param("record") TSysRole record, @Param("example") TSysRoleExample example);

    int updateByPrimaryKeySelective(TSysRole record);

    int updateByPrimaryKey(TSysRole record);
}