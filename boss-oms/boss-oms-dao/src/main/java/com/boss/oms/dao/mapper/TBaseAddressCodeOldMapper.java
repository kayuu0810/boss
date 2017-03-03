package com.boss.oms.dao.mapper;

import com.boss.oms.dao.model.TBaseAddressCodeOld;
import com.boss.oms.dao.model.TBaseAddressCodeOldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseAddressCodeOldMapper {
    long countByExample(TBaseAddressCodeOldExample example);

    int deleteByExample(TBaseAddressCodeOldExample example);

    int insert(TBaseAddressCodeOld record);

    int insertSelective(TBaseAddressCodeOld record);

    List<TBaseAddressCodeOld> selectByExample(TBaseAddressCodeOldExample example);

    int updateByExampleSelective(@Param("record") TBaseAddressCodeOld record, @Param("example") TBaseAddressCodeOldExample example);

    int updateByExample(@Param("record") TBaseAddressCodeOld record, @Param("example") TBaseAddressCodeOldExample example);
}