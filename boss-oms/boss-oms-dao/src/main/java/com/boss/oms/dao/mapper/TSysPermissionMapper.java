package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TSysPermission;
import com.boss.oms.dao.model.TSysPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysPermissionMapper {
    long countByExample(TSysPermissionExample example);

    int deleteByExample(TSysPermissionExample example);

    int insert(TSysPermission record);

    int insertSelective(TSysPermission record);

    List<TSysPermission> selectByExample(TSysPermissionExample example);

    int updateByExampleSelective(@Param("record") TSysPermission record, @Param("example") TSysPermissionExample example);

    int updateByExample(@Param("record") TSysPermission record, @Param("example") TSysPermissionExample example);
}