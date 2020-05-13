package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.Deviceuser;
import com.ShanghaiUniversity.pojo.DeviceuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceuserMapper {
    int countByExample(DeviceuserExample example);

    int deleteByExample(DeviceuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Deviceuser record);

    int insertSelective(Deviceuser record);

    List<Deviceuser> selectByExample(DeviceuserExample example);

    Deviceuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Deviceuser record, @Param("example") DeviceuserExample example);

    int updateByExample(@Param("record") Deviceuser record, @Param("example") DeviceuserExample example);

    int updateByPrimaryKeySelective(Deviceuser record);

    int updateByPrimaryKey(Deviceuser record);
}