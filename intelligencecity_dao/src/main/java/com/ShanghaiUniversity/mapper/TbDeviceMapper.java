package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.TbDevice;
import com.ShanghaiUniversity.pojo.TbDeviceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbDeviceMapper {
    int countByExample(TbDeviceExample example);

    int deleteByExample(TbDeviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbDevice record);

    int insertSelective(TbDevice record);

    List<TbDevice> selectByExample(TbDeviceExample example);

    TbDevice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbDevice record, @Param("example") TbDeviceExample example);

    int updateByExample(@Param("record") TbDevice record, @Param("example") TbDeviceExample example);

    int updateByPrimaryKeySelective(TbDevice record);

    int updateByPrimaryKey(TbDevice record);
}