package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.Barrel;
import com.ShanghaiUniversity.pojo.BarrelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BarrelMapper {
    int countByExample(BarrelExample example);

    int deleteByExample(BarrelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Barrel record);

    int insertSelective(Barrel record);

    List<Barrel> selectByExample(BarrelExample example);

    Barrel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Barrel record, @Param("example") BarrelExample example);

    int updateByExample(@Param("record") Barrel record, @Param("example") BarrelExample example);

    int updateByPrimaryKeySelective(Barrel record);

    int updateByPrimaryKey(Barrel record);
}